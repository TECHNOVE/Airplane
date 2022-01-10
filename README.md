<!-- Variables -->
[home]: https://aeroplane.gg
[blog]: https://blog.aeroplane.gg
[downloads]: https://dl.aeroplane.gg
[about]: https://blog.aeroplane.gg/about/
[discord]: https://discord.gg/63dDSReB7j
[purity]: https://www.purityvanilla.com
[patreon]: https://www.patreon.com/aeroplane
[fork]: https://github.com/TECHNOVE/MyAeroplaneFork
[wiki]: https://github.com/TECHNOVE/Aeroplane/wiki

# Aeroplane
A stable, optimized, well supported 1.17 Paper fork.

[Homepage][home] - [Downloads][downloads] - [Blog][blog] - [Discord][discord] - [aeroplane.yml][wiki]

## Features

- **30% faster hoppers** over both Tuinity & Paper
- **Improved entity performance** from a reduction in ticking entity behavior based on how far away they are from the player.
- **Reduced GC times & frequency** from removing useless allocations, which also improves CPU performance.
- **Fast raytracing** which improves performance of any entity which utilizes line of sight, mainly Villagers.
- **Built-in profiler** which has 0 performance hit and easy to read metrics for both server owners and developers.
- Faster crafting, reduction in uselessly loaded chunks, faster entity ticking, faster block ticking, faster bat spawning, and more!
- Plugin compatibility with Paper & Tuinity plugins.
- [Read more about our features.][about]

## Downloads
The latest JAR file can be downloaded from [the downloads page][downloads]. You can also clone this repository and build it yourself.

If you are interested in making a fork of Aeroplane, check out this template [here][fork]!

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
