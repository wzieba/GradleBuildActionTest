plugins {
    application
    id("io.gitlab.arturbosch.detekt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("javax.inject:javax.inject:1")
}
