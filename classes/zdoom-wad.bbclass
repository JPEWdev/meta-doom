SECTION = "games"

# WADs are architecture independent
PACKAGE_ARCH ?= "all"

inherit allarch

WADS ??= ""

do_install() {
    install -d ${D}/usr/share/games/doom/

    for wad in ${WADS}; do
        install -m 644 $wad ${D}/usr/share/games/doom/
    done
}

WAD_DIR = "/usr/share/games/doom"

FILES:${PN} += "${WAD_DIR}/"
RDEPENDS:${PN} += "zdoom"
