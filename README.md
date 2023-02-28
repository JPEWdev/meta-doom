# meta-doom

Yocto layer for running Doom

## Description

Provides recipes to build several variants of [ZDoom](https://zdoom.org/).

## Selecting a ZDoom variant

The layers sets a default `PREFERRED_PROVIDER` for `virtual/zdoom` to try an
guess which ZDoom variant you should use. In most cases, `gzdoom` is preferred,
but this variant doesn't support 32-bit devices, in which case the default will
be `lzdoom`. If you want to override the automatic selection, add the following
to local.conf:

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
