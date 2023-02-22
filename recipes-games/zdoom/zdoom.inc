PROVIDES = "virtual/zdoom"

STAGING_NATIVE_BUILDDIR = "${TMPDIR}/work-shared/native/${BPN}"

B:class-native = "${STAGING_NATIVE_BUILDDIR}"

inherit cmake

EXTRA_OECMAKE:append:class-target = " -DIMPORT_EXECUTABLES=${STAGING_NATIVE_BUILDDIR}/ImportExecutables.cmake"

CONFIGURE_DEPS = "${BPN}-native:do_compile"
CONFIGURE_DEPS:class-native = ""
do_configure[depends] = "${CONFIGURE_DEPS}"

do_compile:prepend:class-target() {
    # This is pretty gross, but the -native recipe's executable will have the
    # RPATH hard coded to it's original build location, which won't work exist
    # if the recipe is restored from sstate
    export LD_LIBRARY_PATH="${STAGING_LIBDIR_NATIVE}:${STAGING_BASE_LIBDIR_NATIVE}:$LD_LIBRARY_PATH"
}

do_install:append() {
    ln -s ${BPN} ${D}${bindir}/zdoom
}

BBCLASSEXTEND += "native"

# Don't clean the native recipe so it can share with the target recipe
RM_WORK_EXCLUDE += "${BPN}-native"

FILES:${PN} += "/usr/share/games"
RPROVIDES:${PN}:class-target = "zdoom"
