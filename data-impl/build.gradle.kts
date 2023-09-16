plugins {
    id("buildlogic.primitive.androidlibrary")
    id("buildlogic.primitive.kotlin")
    id("buildlogic.primitive.hilt")
}

android {
    namespace = "jp.numero.template.data"
}

dependencies {
    implementation(projects.data)
    implementation(libs.okhttp3)
}