SUMMARY = "ChexQuest3"
HOMEPAGE = "http://www.chucktropolis.com/gamers.htm"
LICENSE = "CLOSED"

# Free as in beer, not as in speech
LICENSE_FLAGS = "nonfree"

INHIBIT_DEFAULT_DEPS = "1"

SRC_URI = "http://www.chucktropolis.com/downloads/ChexQuest3.zip;subdir=${BPN}-${PV}"
SRC_URI[sha256sum] = "29abab521cf9de4cc561afb84cf804793d90f1cf40f6384e19b34f72923dd446"

inherit zdoom-wad

WADS = "${S}/chex3.wad"
