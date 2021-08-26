plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.0.0" apply false
    id("io.papermc.paperweight.patcher") version "1.1.12-SNAPSHOT"
}

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/") {
        content { onlyForConfigurations("paperclip") }
    }
    maven("https://maven.fabricmc.net/net/fabricmc/tiny-remapper/") {
        content { onlyForConfigurations("remapper") }
    }
}

dependencies {
    remapper("net.fabricmc:tiny-remapper:0.5.0")
    paperclip("io.papermc:paperclip:2.1.0-SNAPSHOT")
}

subprojects {
    apply(plugin = "java")

    java { toolchain { languageVersion.set(JavaLanguageVersion.of(16)) } }

    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release.set(16)
    }

    repositories {
        mavenCentral()
        maven("https://oss.sonatype.org/content/groups/public/")
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://ci.emc.gs/nexus/content/groups/aikar/")
        maven("https://repo.aikar.co/content/groups/aikar")
        maven("https://repo.md-5.net/content/repositories/releases/")
        maven("https://hub.spigotmc.org/nexus/content/groups/public/")
        maven("https://jitpack.io")
    }
}

paperweight {
    serverProject.set(project(":Airplane-Server"))

    useStandardUpstream("tuinity") {
        url.set(github("Tuinity", "Tuinity"))
        ref.set(providers.gradleProperty("tuinityRef"))

        withStandardPatcher {
            baseName("Tuinity")

            apiOutputDir.set(layout.projectDirectory.dir("Airplane-API"))
            serverOutputDir.set(layout.projectDirectory.dir("Airplane-Server"))
        }
    }
}
