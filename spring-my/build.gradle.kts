plugins {
	id("java")
}

group = "org.springframework"
version = "5.1.1.BUILD-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(platform("org.junit:junit-bom:5.10.0"))
	testImplementation("org.junit.jupiter:junit-jupiter")
	compile(project(":spring-context"))
}

tasks.test {
	useJUnitPlatform()
}