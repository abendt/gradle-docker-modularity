import com.bmuschko.gradle.docker.tasks.container.*
import com.bmuschko.gradle.docker.tasks.*

buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("com.bmuschko:gradle-docker-plugin:3.2.0")
    }
}


apply {
    plugin("com.bmuschko.docker-remote-api")
}

createTask("dockerInfo", DockerInfo::class) {
}

createTask("dockerVersion", DockerVersion::class) {
}
