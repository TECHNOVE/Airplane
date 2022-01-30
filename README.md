<!-- Variables -->
[home]: https://www.nftworlds.com/
[about]: https://docs.nftworlds.com
[discord]: https://discord.gg/nft-worlds
[twitter]: https://twitter.com/nftworldsNFT
[releases]: https://github.com/NFT-Worlds/Server/releases/
[contributing]: https://github.com/NFT-Worlds/Server/blob/main/CONTRIBUTING.md

# NFT Worlds Server
The open-sourced server for NFT Worlds developed as a fork of Airplane/Pufferfish, which is a fork of Paper. 

This repo is a work in progress, official release coming soon.

**[Download Latest Release][releases]**

[nftworlds.com][home] - [Discord][discord] - [Twitter][twitter] - [About NFT Worlds][about]

## Getting Started For Builders
You can now begin developing experiences on top of the NFT Worlds Server as a world owner or verified builder. To start, fork this repository to develop you world experiences on top of. As more updates are released by the NFT Worlds team to the `main` branch of this repository, you'll be able to easily merge those changes into your forked copy of this repo.

The NFT Worlds blockchain compatibility layer, $WRLD transaction support and related functionality will release as a server plugin sometime in February 2022.

## Contributing

The NFT Worlds Server welcomes contributions from the community. 

We will be releasing a development and bug bounties soon. Developers will be able to earn compensation by resolving known bugs and helping develop core features.

### [Get Started Developing & Contributing Here][contributing]

## Building

To get quickstarted with developing & creating server .jar builds to test, use the following commands.

```bash
./gradlew build
```

Or building a Paperclip JAR for distribution:

```bash
./gradlew applyPatches
./gradlew paperclip
```

## Running Locally

You can run a release NFT Worlds Server .jar, or compiled .jar with the following.

```bash
java -Xms2G -Xmx2G -jar NFT-Worlds-1.17.1-R0.1-SNAPSHOT
```

Upon running the first time, You'll receive a server.properties error. You need to agree to the Minecraft server EULA terms by editing the generated eula.txt file in the server .jar directory and setting `eula=true`. Rerun the command above and the server will successfully launch.

Once running, you can quickly connect to the server running locally by launching Minecraft, going to "Multiplayer", selecting "Direct Connection" and entering `localhost`. If this server is not running on your local machine, you would connect to that machine's IP.

## License
NFT Worlds server patches are licensed under a GNU GPL License.
Upstream patches are licensed under GPL-3.0.
All other files are licensed under an GNU  License.

## Credits
The NFT Worlds Server builds on extensive, foundational server optimization work done by Jacob and his team from [StellarDev](https://nfts.stellardev.org/). This work includes significant improvements over Airplane to stabilize TPS and handle more concurrent players in a reliable manner while still being fully compatible with the spigot ecosystem. These improvements act as the basis the NFT Worlds server is being built from to maximize player concurrency and give a clean slate for everything planned in our roadmap.
