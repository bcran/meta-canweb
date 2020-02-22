
SUMMARY = "This module performs conversions between Python values and C bit field structs represented as Python byte strings."
HOMEPAGE = "https://github.com/eerimoq/bitstruct"
AUTHOR = "Erik Moqvist, Ilya Petukhov <erik.moqvist@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9aa4ec07de78abae21c490c9ffe61bd"

SRC_URI = "https://files.pythonhosted.org/packages/4d/7b/b0c9874595b7272bf605f2aadf77a94f1d013b38177a3f7185681217ea04/bitstruct-8.9.0.tar.gz"
SRC_URI[md5sum] = "51cd072e94205a1f6e04969b5b8fc11c"
SRC_URI[sha256sum] = "7d97fcbaf1ea409f2f0654b2b72fc1a03a00c49570f724ae2a40eb1d200eecba"

S = "${WORKDIR}/bitstruct-8.9.0"

RDEPENDS_${PN} = ""

inherit setuptools3
