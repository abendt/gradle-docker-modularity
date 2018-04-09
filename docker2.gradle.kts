import com.bmuschko.gradle.docker.tasks.container.*
import com.bmuschko.gradle.docker.tasks.*

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath("com.bmuschko:gradle-docker-plugin:3.2.6")
    }
}

apply<com.bmuschko.gradle.docker.DockerRemoteApiPlugin>()

createTask("dockerInfo", DockerInfo::class) {
}

createTask("dockerVersion", DockerVersion::class) {
}
