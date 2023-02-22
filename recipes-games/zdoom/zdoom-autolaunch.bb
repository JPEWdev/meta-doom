SUMMARY = "ZDoom"
LICENSE = "MIT"
SECTION = "games"
LIC_FILES_CHKSUM := "file://${THISDIR}/../../LICENSE;md5=ca1afe7e49b8188eae3446b0898b6834"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "\
    file://zdoom.service \
    file://zdoom.ini \
    "

inherit systemd features_check

REQUIRED_DISTRO_FEATURES = "systemd wayland"

do_install() {
    install -d ${D}${systemd_system_unitdir}
    install -m 644 ${WORKDIR}/zdoom.service ${D}${systemd_system_unitdir}/

    install -d ${D}${sysconfdir}/zdoom/
    install -m 644 ${WORKDIR}/zdoom.ini ${D}${sysconfdir}/zdoom/
}

RDEPENDS:${PN} = "weston-init zdoom"
SYSTEMD_SERVICE:${PN} = "zdoom.service"
FILES:${PN} += "${sysconfdir}/zdoom/zdoom.ini"
