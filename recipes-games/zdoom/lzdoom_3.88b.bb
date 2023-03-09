SUMMARY = "Open Source Doom Engine"
HOMEPAGE = "http://zdoom.org"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://README.md;md5=32179865376f9d266618eba4507d5416"
SECTION = "games"

DEPENDS = "\
    libsdl2 \
    bzip2-replacement-native \
    "

PROVIDES = "virtual/zdoom"

SRC_URI = "\
    https://zdoom.org/files/lzdoom/src/3.88b.zip \
    file://0001-posix-sdl-Stop-reading-STDIN-on-EOF.patch  \
    "
SRC_URI[sha256sum] = "fc2b6657ff19fb4df58308966bb92f50cb1fe0d5876142dc17770c6f4a99a006"

S = "${WORKDIR}/gzdoom-${PV}"

inherit features_check

REQUIRED_DISTRO_FEATURES = "opengl"

require zdoom.inc
