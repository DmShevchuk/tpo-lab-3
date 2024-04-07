package ru.kalin.dmmitrii.util

val SystemOSValue = getOS()

fun getOS(): SystemOS {
    return when (val system: String = System.getProperty("os.name").toString().lowercase()) {
        system.contains("Mac").toString() -> SystemOS.MAC_OS
        system.contains("Windows").toString() -> SystemOS.WINDOWS
        system.contains("Linux").toString() -> SystemOS.LINUX
        else -> {
            throw IllegalArgumentException("Ты че, на ShipOS???")
        }
    }
}

fun updateConfigForSystem() {

}

enum class SystemOS(val systemName: String) {
    MAC_OS("Mac"),
    WINDOWS("Windows"),
    LINUX("Linux");
}