plugins {
    application
    java
    kotlin("jvm") version "1.3.61"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("io.reactivex.rxjava2:rxjava:2.2.8")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.61")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.1")
}

repositories {
    jcenter()
    mavenCentral()
}