
SUMMARY = "Controller Area Network interface module for Python"
HOMEPAGE = "https://github.com/hardbyte/python-can"
AUTHOR = "Brian Thorne <brian@thorne.link>"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://files.pythonhosted.org/packages/c6/8d/874897a50f6a2ec34a3c2fa6960e8a3c640672913e6808d55bf4836f9709/python-can-3.3.2.tar.gz"
SRC_URI[md5sum] = "b724553a330478270267380b4888a18e"
SRC_URI[sha256sum] = "5fefb5c1e7e7f07faefc02c6eac79f9b58376f007048a04d8e7f325d48ec6b2e"

S = "${WORKDIR}/python-can-3.3.2"

RDEPENDS_${PN} = ""

inherit setuptools3
