plugins {
    id("buildlogic.primitive.androidlibrary")
    id("buildlogic.primitive.kotlin")
    id("buildlogic.primitive.test")
}

android {
    namespace = "jp.numero.template.core"
}

dependencies {
    implementation(projects.data)
}