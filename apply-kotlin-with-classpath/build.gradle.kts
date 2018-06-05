
buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("com.bmuschko:gradle-docker-plugin:3.3.2")
    }
}

repositories {
    jcenter()
}


apply {
    from("../docker-kotlin.gradle.kts")
}

