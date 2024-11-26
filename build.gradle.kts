var compileTestJava: Any

var compileJava: Any



plugins {
    id("java")
}

group = "ru.netology.javaqa"
version = "1.0-SNAPSHOT"

var sourceCompatibility = 11
compileJava.javaClass.encoding = "UTF-8"

        compileTestJava.javaClass.encoding = "UTF-8"
        
repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:unit-jupiter:5.11.3")

}

tasks.test {
    useJUnitPlatform()
}