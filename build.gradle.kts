plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

sourceSets {
    main {
        java {
            srcDirs("src/main/java", "src/test/java")
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}