buildscript {
    dependencies {
        classpath(libs.kotlinGradlePlugin)
        classpath(libs.kspPlugin)
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.composeCompiler) apply false
}