plugins {
    id("dev.slne.surf.surfapi.gradle.paper-plugin")
}

surfPaperPluginApi {
    mainClass("dev.slne.surf.cloud.bukkit.BukkitMain")
    authors.add("SLNE Development")
    generateLibraryLoader(false)
}