
SUMMARY = "Server-Sent Events protocol implemetation."
HOMEPAGE = "https://github.com/niwibe/sse"
AUTHOR = "Andrei Antoukh <niwi@niwi.be>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=ad1a10b8a90bcc199740b9775bb28d27"

SRC_URI = "https://files.pythonhosted.org/packages/15/11/2b5102d7085add2b0056615ee2f9ee3627c30b702c61bed9e985c4a643a5/sse-1.2.tar.gz"
SRC_URI[md5sum] = "715ae4af5fb9614e66cabff3a5caee70"
SRC_URI[sha256sum] = "57179e84f7d3b4b37531d3bfed3f5e68eb3db6f185ecf22b729627fc8d4b902f"

S = "${WORKDIR}/sse-1.2"

RDEPENDS_${PN} = ""

inherit setuptools3
