package jp.numero.template.buildlogic.primitive

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

fun Project.application(action: ApplicationExtension.() -> Unit) {
    extensions.configure(action)
}

fun Project.library(action: LibraryExtension.() -> Unit) {
    extensions.configure(action)
}

fun Project.android(action: CommonExtension.() -> Unit) {
    extensions.configure(action)
}

fun Project.commonConfiguration() {
    android {
        namespace?.let {
            this.namespace = it
        }
        compileSdk = 37

        defaultConfig.apply {
            minSdk = 24

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        sourceSets.apply {
            getByName("main").kotlin.directories += "src/main/kotlin"
            getByName("test").kotlin.directories += "src/test/kotlin"
            getByName("androidTest").kotlin.directories += "src/androidTest/kotlin"
        }

        compileOptions.apply {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }

        dependencies {
        }

        testOptions.apply {
            unitTests {
                isIncludeAndroidResources = true
            }
        }
    }
}
