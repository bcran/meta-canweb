SUMMARY = "CANweb production image"

#IMAGE_FEATURES += "dev-pkgs ssh-server-openssh tools-debug debug-tweaks tools-sdk"
IMAGE_FEATURES += "ssh-server-openssh dev-pkgs tools-sdk"

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL = " \
	ncurses bluez5 libqmi libmbim openvpn kernel-modules \
	i2c-tools fbset evtest apache2 mod-wsgi canweb-customize python3-pip vim \
"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit extrausers
EXTRA_USERS_PARAMS = "usermod -P canweb123 root;"

cleanup_rootfs() {
#	rm ${IMAGE_ROOTFS}/etc/nginx/sites-enabled/default_server
	install -d ${IMAGE_ROOTFS}/usr/lib/apache2/modules
#	cp ${IMAGE_ROOTFS}/usr/libexec/apache2/modules/mod_wsgi.so ${IMAGE_ROOTFS}/usr/lib/apache2/modules/mod_wsgi.so
}

ROOTFS_POSTPROCESS_COMMAND += "cleanup_rootfs;"
