SUMMARY = "Open Source Doom Engine (Legacy Version)"
HOMEPAGE = "http://zdoom.org"
# TODO Figure this out!
#LICENSE = ""

DEPENDS = "\
    libsdl2 \
    bzip2-replacement-native \
    "

SRC_URI = "https://zdoom.org/files/zdoom/2.8/${BP}-src.7z;subdir=${BP} \
           file://0001-qemu-music-emu-Remove-check-for-old-GCC.patch \
           file://0002-cmake-Install-files.patch \
           file://0003-d_main-Don-t-change-FPU-on-ARM.patch \
           file://0004-p_spec-Use-signed-char-for-array.patch \
           file://0005-Add-rudimentary-OpenGL-ES-Support.patch \
           "
SRC_URI[sha256sum] = "782179d4667d2e56e26e21d7a0872523f8e4262ed176072fef00d0043376a310"

do_fetch[depends] += "p7zip-native:do_populate_sysroot"

require zdoom.inc
