
SUMMARY = "Wrappers for the Cocoa frameworks on macOS"
HOMEPAGE = "https://bitbucket.org/ronaldoussoren/pyobjc"
AUTHOR = "Ronald Oussoren <pyobjc-dev@lists.sourceforge.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f2c4867ac440c594dd85d5c53eee6a05"

SRC_URI = "https://files.pythonhosted.org/packages/7a/99/bfac679ee346f344bca72ee315249e56f4f34bc974345f66d7810380ce7a/pyobjc-framework-Cocoa-6.1.tar.gz"
SRC_URI[md5sum] = "6f4d85eb0e6f133f0e4d22dd02a732b1"
SRC_URI[sha256sum] = "c4077d2e6f96e4f3fd9780d66778cf51d27f414822498b24410e9df7a6a4d531"

S = "${WORKDIR}/pyobjc-framework-Cocoa-6.1"

RDEPENDS_${PN} = "python-pyobjc-core"

inherit setuptools3
