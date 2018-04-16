buildscript {
  repositories {
    jcenter()
  }
}

repositories {
  jcenter()
}

apply {
  from("../docker-kotlin.gradle.kts")
}

