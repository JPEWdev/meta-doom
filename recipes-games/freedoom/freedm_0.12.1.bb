SUMMARY = "Free content first person shooter game (Multiplayer levels)"
HOMEPAGE = "https://freedoom.github.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=038918b78710d44563f923bd8119f814"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "https://github.com/freedoom/freedoom/releases/download/v${PV}/${BPN}-${PV}.zip"
SRC_URI[sha256sum] = "e1318704f8440b6b83dcb523b769f02a4de214336713cffed830514c6f294514"

WADS = "freedm.wad"

inherit zdoom-wad

PACKAGES = "${PN}"
