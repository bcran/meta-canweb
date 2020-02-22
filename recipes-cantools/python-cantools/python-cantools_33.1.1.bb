
SUMMARY = "CAN BUS tools."
HOMEPAGE = "https://github.com/eerimoq/cantools"
AUTHOR = "Erik Moqvist <erik.moqvist@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9aa4ec07de78abae21c490c9ffe61bd"

SRC_URI = "https://files.pythonhosted.org/packages/a4/a7/ba19b27d3be925a64ab45cde35ddd6982811cef58f3e42e050a028906902/cantools-33.1.1.tar.gz"
SRC_URI[md5sum] = "0ecb6ff20934f79934d594b872a73813"
SRC_URI[sha256sum] = "678154835cf8ee113cfe54f77a6748c8827ce5aa610354ff7f1e045afd92501a"

S = "${WORKDIR}/cantools-33.1.1"

RDEPENDS_${PN} = "python-bitstruct python-diskcache python-python-can python-textparser"

inherit setuptools3
