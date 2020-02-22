
SUMMARY = "Bluetooth Python extension module"
HOMEPAGE = "http://pybluez.github.io/"
AUTHOR = "Albert Huang <ashuang@alum.mit.edu>"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=8a71d0475d08eee76d8b6d0c6dbec543"

SRC_URI = "https://files.pythonhosted.org/packages/08/9f/e9d93b266d2d1ea988780a52a696073ba0a65df65a532165fdf6ff90d0ed/PyBluez-0.23.tar.gz"
SRC_URI[md5sum] = "afbe8429bb82d2c46a3d0f5f4f898f9d"
SRC_URI[sha256sum] = "c8f04d2e78951eaa9de486b4d49381704e8943d0a6e6e58f55fcd7b8582e90de"

S = "${WORKDIR}/PyBluez-0.23"

DEPENDS = "bluez5"

inherit setuptools3
