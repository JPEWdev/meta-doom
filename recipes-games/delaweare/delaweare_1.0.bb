SUMMARY = "A first person shooter in which the emphasis is put on visual and audio experiences"
HOMEPAGE = "http://spaceisgreen.nl/delaweare.htm"
LICENSE = "CLOSED"

# Free as in beer, not as in speech
LICENSE_FLAGS = "nonfree"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "http://goo.gl/cNT6qB;downloadfilename=${BPN}-${PV}.zip"
SRC_URI[sha256sum] = "4f721795bd219b6870db2f2b67051e0695f6385f02f93a371be50c9cb4cda807"

# URL doesn't end with .zip, so the dependency on unzip isn't picked up automatically
do_unpack[depends] = "unzip-native:do_populate_sysroot"

S = "${WORKDIR}/Delaweare"

inherit zdoom-wad

WADS = "${S}/Data/delaweare.wad"
