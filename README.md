<!-- Variables -->
[home]: https://airplane.gg
[blog]: https://blog.airplane.gg
[downloads]: https://dl.airplane.gg
[about]: https://blog.airplane.gg/about/
[discord]: https://discord.gg/63dDSReB7j
[purity]: https://www.purityvanilla.com
[patreon]: https://www.patreon.com/airplane
[fork]: https://github.com/TECHNOVE/MyAirplaneFork
[wiki]: https://github.com/TECHNOVE/Airplane/wiki

# Airplane
A stable, optimized, well supported 1.16.5 Paper fork.

[Homepage][home] - [Downloads][downloads] - [Blog][blog] - [Discord][discord] - [airplane.air][wiki]

## Features

- **30% faster hoppers** over both Tuinity & Paper
- **Improved entity performance** from a reduction in ticking entity behavior based on how far away they are from the player.
- **Reduced GC times & frequency** from removing useless allocations, which also improves CPU performance.
- **Fast raytracing** which improves performance of any entity which utilizes line of sight, mainly Villagers.
- Faster crafting, reduction in uselessly loaded chunks, faster entity ticking, faster block ticking, faster bat spawning, and more!
- Plugin compatibility with Paper & Tuinity plugins.
- [Read more about our features.][about]

## Downloads
The latest JAR file can be downloaded from [the downloads page][downloads]. You can also clone this repository and build it yourself.

If you are interested in making a fork of Airplane, check out this template [here][fork]!

## Patreon

Thanks to all our Patrons! It is your help that keeps this project running. Check out our Private Quarters & First Class Patrons:

[![Purity Vanilla](https://i.imgur.com/SC88aEg.png)][purity]

## Building

```bash
./gradlew build
```

Or building a Paperclip JAR for distribution:

```bash
./gradlew paperclip
```

## License
Patches are licensed under GPL-3.0.  
All other files are licensed under MIT.

