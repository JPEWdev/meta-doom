SUMMARY = "GZDoom Music Library"
HOMEPAGE = "https://github.com/coelckers/ZMusic"
SECTION = "games"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://licenses/gplv3.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "alsa-lib zlib"

SRC_URI = "git://github.com/coelckers/ZMusic.git;protocol=http;branch=${BRANCH}"
SRCREV = "bff02053bea30bd789e45f60b90db3ffc69c8cc8"
BRANCH = "master"

STAGING_NATIVE_BUILDDIR = "${TMPDIR}/work-shared/native/${BPN}"

B:class-native = "${STAGING_NATIVE_BUILDDIR}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE:append:class-target = " -DIMPORT_EXECUTABLES=${STAGING_NATIVE_BUILDDIR}/ImportExecutables.cmake"

CONFIGURE_DEPS = "${BPN}-native:do_compile"
CONFIGURE_DEPS:class-native = ""
do_configure[depends] = "${CONFIGURE_DEPS}"

BBCLASSEXTEND += "native"
