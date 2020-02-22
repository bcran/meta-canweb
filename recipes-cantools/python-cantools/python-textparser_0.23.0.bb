
SUMMARY = "Text parser."
HOMEPAGE = "https://github.com/eerimoq/textparser"
AUTHOR = "Erik Moqvist <erik.moqvist@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe9942a8bba5458a9dbd11277bc347ad"

SRC_URI = "https://files.pythonhosted.org/packages/31/0c/ea93850bd5cb56a9e6ef3e30385c367d994568101cc638316a2861e6b43c/textparser-0.23.0.tar.gz"
SRC_URI[md5sum] = "d5378eac93406156e9029114aaa1b515"
SRC_URI[sha256sum] = "f009d0f6f78aa7c1e648dca4e3961f6d67495f7f520f1a705245ffad33f4b470"

S = "${WORKDIR}/textparser-0.23.0"

RDEPENDS_${PN} = ""

inherit setuptools3
