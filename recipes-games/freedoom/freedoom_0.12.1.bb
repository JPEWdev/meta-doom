SUMMARY = "Free content first person shooter game"
HOMEPAGE = "https://freedoom.github.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=038918b78710d44563f923bd8119f814"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "https://github.com/freedoom/freedoom/releases/download/v${PV}/${BPN}-${PV}.zip"
SRC_URI[sha256sum] = "f42c6810fc89b0282de1466c2c9c7c9818031a8d556256a6db1b69f6a77b5806"

WADS = "freedoom1.wad freedoom2.wad"

inherit zdoom-wad

PACKAGES = "${PN}-1 ${PN}-2"

FILES:${PN}-1 = "${WAD_DIR}/freedoom1.wad"
FILES:${PN}-2 = "${WAD_DIR}/freedoom2.wad"

RDEPENDS:${PN}-1 = "zdoom"
RDEPENDS:${PN}-2 = "zdoom"
