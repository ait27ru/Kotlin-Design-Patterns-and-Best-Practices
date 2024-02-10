plugins {
    kotlin("jvm") version "1.9.21"
    application
}

group = "me.soshin"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}
