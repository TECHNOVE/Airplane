<!-- Variables -->
[home]: https://www.nftworlds.com/
[about]: https://docs.nftworlds.com
[discord]: https://discord.gg/nft-worlds

# NFT Worlds Server
The open-sourced server for NFT Worlds developed as a fork of Airplane, which is a fork of Paper. 

This repo is a work in progress, official release coming soon.

[Homepage][home] - [Discord][discord] - [About NFT Worlds][about]

## Getting Started For Builders
You can now begin developing experiences on top of the NFT Worlds Server as a world owner or verified builder. To start, fork this repository to develop you world experiences on top of. As more updates and blockchain compatibility are released by the NFT Worlds team to the `main` branch of this repository, you'll be able to easily merge those changes into your forked copy of this repo.

Extensive documentation on the NFT Worlds server will be released soon.

## Roadmap

As of January 20th, 2021 the NFT Worlds server is a baseline, heavily optimized server implementation that the blockchain APIs and more for NFT Worlds will be built into. We will have a development roadmap released that can be tracked alongside this repository before the end of the month.

## Building

```bash
./gradlew build
```

Or building a Paperclip JAR for distribution:

```bash
./gradlew paperclip
```

## License
NFT Worlds server patches are licensed under a GNU GPL License.
Upstream patches are licensed under GPL-3.0.
All other files are licensed under an GNU  License.

## Credits
The NFT Worlds Server builds on extensive, foundational server optimization work done by Jacob and his team from [StellarDev](https://nfts.stellardev.org/). This work includes significant improvements over Airplane to stabilize TPS and handle more concurrent players in a reliable manner while still being fully compatible with the spigot ecosystem. These improvements act as the basis the NFT Worlds server is being built from to maximize player concurrency and give a clean slate for everything planned in our roadmap.
