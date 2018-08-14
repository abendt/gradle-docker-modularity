
buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("com.bmuschko:gradle-docker-plugin:3.6.0")
    }
}

repositories {
    jcenter()
}


apply {
    from("../docker-kotlin.gradle.kts")
}

