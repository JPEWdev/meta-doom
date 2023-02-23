SUMMARY = "ChexQuest Galactic Conflict"
HOMEPAGE = "https://zdoom.org/wiki/Chex_Quest:_Galactic_Conflict"
LICENSE = "CLOSED"

# Free as in beer, not as in speech
LICENSE_FLAGS = "nonfree"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "http://ipfsnet.com/tifosi92/chexquest/Chex_Quest_GC_v1.2.zip"
SRC_URI[sha256sum] = "c6f6de5b62630a1f2de5daa4226f00de2d3048d050566523551d509cec5b7498"

S = "${WORKDIR}/Chex_Quest_GC_v${PV}"

inherit zdoom-wad

WADS = "${S}/chexgc.wad"

RDEPENDS:${PN} += "chexquest3"
