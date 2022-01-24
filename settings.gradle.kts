pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "NFT-Worlds"

include("NFT-Worlds-API", "NFT-Worlds-Server")