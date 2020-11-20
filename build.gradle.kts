group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

plugins {
    java
    kotlin("jvm") version "1.3.71"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
}
