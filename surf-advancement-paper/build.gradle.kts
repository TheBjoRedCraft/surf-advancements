plugins {
    id("dev.slne.surf.surfapi.gradle.paper-plugin")
}

surfPaperPluginApi {
    mainClass("dev.slne.surf.advancement.bukkit.SurfAdvancementBukkit")
    authors.add("SLNE Development")

    generateLibraryLoader(false)
}