SECTION = "games"

WADS ??= ""

do_install() {
    install -d ${D}/usr/share/games/doom/

    for wad in ${WADS}; do
        install -m 644 $wad ${D}/usr/share/games/doom/
    done
}

FILES:${PN} += "/usr/share/games/doom/"
RDEPENDS:${PN} += "zdoom"