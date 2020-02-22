
SUMMARY = "Disk Cache -- Disk and file backed persistent cache."
HOMEPAGE = "http://www.grantjenks.com/docs/diskcache/"
AUTHOR = "Grant Jenks <contact@grantjenks.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9e046ce8fae71087134866418f646ec3"

SRC_URI = "https://files.pythonhosted.org/packages/1a/01/ddcd4e21a9320ea7393332625b680aab67d29aa34e6f7f46c9b81fe52546/diskcache-4.1.0.tar.gz"
SRC_URI[md5sum] = "21c9945e7707799e1c64956f8a54d4c3"
SRC_URI[sha256sum] = "bcee5a59f9c264e2809e58d01be6569a3bbb1e36a1e0fb83f7ef9b2075f95ce0"

S = "${WORKDIR}/diskcache-4.1.0"

RDEPENDS_${PN} = ""

inherit setuptools3
