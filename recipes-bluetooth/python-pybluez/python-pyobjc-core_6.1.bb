
SUMMARY = "Python<->ObjC Interoperability Module"
HOMEPAGE = "https://bitbucket.org/ronaldoussoren/pyobjc"
AUTHOR = "Ronald Oussoren, bbum, SteveM, LeleG, many others stretching back through the reaches of time... <RonaldOussoren@mac.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=f2c4867ac440c594dd85d5c53eee6a05"

SRC_URI = "https://files.pythonhosted.org/packages/3a/80/0cdb2130b86a984e4765beb93135aa9c2120fd64be1a27e1c7cb31c719bc/pyobjc-core-6.1.tar.gz"
SRC_URI[md5sum] = "71b9bf50b99ef96484c524a1557b4cf5"
SRC_URI[sha256sum] = "1a0fbf012fb575e0adf8c18cfd4453e657cc2c0deb2660c529bf524ba4c9149a"

S = "${WORKDIR}/pyobjc-core-6.1"

RDEPENDS_${PN} = ""

inherit setuptools3
