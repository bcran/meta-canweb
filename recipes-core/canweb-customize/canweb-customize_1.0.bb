SUMMARY = "CANweb recipe"
DESCRIPTION = "Recipe for i.MX6 Sololite EVK board for running CAN UIs"
LICENSE = "MIT"

inherit update-rc.d

SRC_URI = " \
    file://LICENSE \
    file://canweb.site \
    file://bsdio.com-2019.chained.crt \
    file://bsdio.com-2019.key \
    file://qmi-network.conf \
    file://qmi-network \
    file://qmi_setup.sh \
    file://ca.crt \
    file://client.crt \
    file://client.key \
    file://bsdio-vpn.conf \
    file://ta.key \
    file://test.html \
    file://myapp.wsgi \
    file://canweb.ini \
"

LIC_FILES_CHKSUM = " \
    file://${WORKDIR}/LICENSE;md5=9f91fa6444cf8fb8bf0272b5bd1fc719 \
"

RDEPENDS_${PN} = "bash"

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_PARAMS_${PN} = "start 08 2 3 4 5 . stop 01 0 1 6 ."
INITSCRIPT_NAME_${PN} = "qmi-network"

do_install() {
	install -Dm 0644 ${WORKDIR}/bsdio.com-2019.chained.crt ${D}${sysconfdir}/apache2/bsdio.com-2019.chained.crt
	install -Dm 0600 ${WORKDIR}/bsdio.com-2019.key ${D}${sysconfdir}/apache2/bsdio.com-2019.key

	install -Dm 0644 ${WORKDIR}/canweb.site ${D}${sysconfdir}/apache2/conf.d/canweb.conf

	install -Dm 0644 ${WORKDIR}/qmi-network.conf ${D}${sysconfdir}/qmi-network.conf
	install -Dm 0755 ${WORKDIR}/qmi-network ${D}/${sysconfdir}/init.d/qmi-network
	install -Dm 0755 ${WORKDIR}/qmi_setup.sh ${D}/usr/bin/qmi_setup.sh

	install -Dm 0600 ${WORKDIR}/ca.crt ${D}${sysconfdir}/openvpn/ca.crt
	install -Dm 0600 ${WORKDIR}/client.crt ${D}${sysconfdir}/openvpn/client.crt
	install -Dm 0600 ${WORKDIR}/client.key ${D}${sysconfdir}/openvpn/client.key
	install -Dm 0600 ${WORKDIR}/bsdio-vpn.conf ${D}${sysconfdir}/openvpn/bsdio-vpn.conf
	install -Dm 0600 ${WORKDIR}/ta.key ${D}${sysconfdir}/openvpn/ta.key

	install -Dm 0644 ${WORKDIR}/test.html ${D}/var/www/tesla.bsdio.com/htdocs/test.html
	install -Dm 0755 ${WORKDIR}/myapp.wsgi ${D}/var/www/wsgi-scripts/myapp.wsgi
	install -Dm 0644 ${WORKDIR}/canweb.ini ${D}/var/www/tesla.bsdio.com/app/canweb.ini
}

CONFFILES_${PN} += "${sysconfdir}/init.d/qmi-network ${sysconfdir}qmi-network.conf"

PR = "r0"
