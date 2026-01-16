plugins {
    id("buildlogic.primitive.androidlibrary")
    id("buildlogic.primitive.kotlin")
    id("buildlogic.primitive.hilt")
    id("buildlogic.primitive.test")
}

android {
    namespace = "jp.numero.template.data.impl"
}

dependencies {
    implementation(projects.data)
    implementation(libs.okhttp3)
}