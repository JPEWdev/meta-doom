# meta-doom

Yocto layer for running Doom

## Description

Provides recipes to build several variants of [ZDoom](https://zdoom.org/).

## Selecting a ZDoom variant

You will need to select which variant of ZDoom you want to use for your
platform. In most cases, you should select `gzdoom`, however for older hardware
or 32-bit systems, `lzdoom` is a better option. To select a variant, add the
following to local.conf:

    PREFERRED_PROVIDER_virtual/zdoom = "gzdoom"

Then, in your image recipe add:

    IMAGE_INSTALL += "zdoom"

## Autolaunching ZDoom

The `zdoom-autolaunch` recipe can be used to make ZDoom start up automatically on boot.
In order to use this recipe, you must be using `systemd` as your init system,
and run `weston` as your UI (running weston in kiosk mode is recommended if you
just want to boot and run ZDoom).

This recipe also provides a configuration files that gets installed to
`/etc/zdoom/zdoom.ini`. You can override this file in your own layer to easily
change the ZDoom startup behavior

## Contributing

You can send patches via a GitHub pull request process.

## Maintainers

* Joshua Watt <JPEWhacker@gmail.com>
