SUMMARY = "Harmony is a 3D Shooter based on Doom"
HOMEPAGE = "http://heroestospare.com/rabotik/harmony.php"
LICENSE = "CLOSED"

# Free as in beer, not as in speech
LICENSE_FLAGS = "nonfree"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "http://heroestospare.com/rabotik/${BPN}v${PV}.zip"
SRC_URI[sha256sum] = "efe0f2914858abb3b8131b7479a5d0c3f97a7895c51be21859ed5f4eeaba0823"

fix_extract_path() {
    # The upstream zip file has a space, which we do not like
    rm -rf ${S}
    mv "${WORKDIR}/${BPN} v${PV}" ${S}
}
do_unpack[postfuncs] += "fix_extract_path"

inherit zdoom-wad

WADS = "${S}/harm1.wad"
