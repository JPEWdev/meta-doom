SUMMARY = "Open Source Doom Engine"
HOMEPAGE = "http://zdoom.org"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"
SECTION = "games"

DEPENDS = "\
    libsdl2 \
    libvpx \
    zmusic \
    bzip2-replacement-native \
    "

SRC_URI = "git://github.com/ZDoom/gzdoom.git;protocol=http;nobranch=1 \
    file://0001-GLES-Fix-first-wipe.patch \
    file://0002-Fixing-GLES-mode-to-work-on-real-GLES-hardware-and-O.patch \
    "
SRCREV = "75da94aecd9b1c4c2e16b449dea1b9f9838c1af2"

S = "${WORKDIR}/git"

inherit features_check

REQUIRED_DISTRO_FEATURES = "opengl"

PACKAGECONFIG ??= "${@bb.utils.filter("DISTRO_FEATURES", "vulkan", d)} \
    gles2 \
    "

PACKAGECONFIG[vulkan] = "-DHAVE_VULKAN=ON,-DHAVE_VULKAN=OFF,vulkan-loader vulkan-headers"
PACKAGECONFIG[gles2] = "-DHAVE_GLES2=ON,-DHAVE_GLES2=OFF"

require zdoom.inc
