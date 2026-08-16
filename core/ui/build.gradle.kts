plugins {
    id("buildlogic.primitive.androidlibrary")
    id("buildlogic.primitive.kotlin")
    id("buildlogic.primitive.compose")
    id("buildlogic.primitive.test")
}

android {
    namespace = "jp.numero.template.core.ui"
}

dependencies {
    implementation(projects.core.common)
    implementation(projects.data)
}