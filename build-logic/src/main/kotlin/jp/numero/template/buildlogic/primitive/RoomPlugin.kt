package jp.numero.template.buildlogic.primitive

import androidx.room3.gradle.RoomExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.invoke

class RoomPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.devtools.ksp")
                apply("androidx.room3")
            }
            android {
                sourceSets {
                    getByName("test").assets.directories += "$projectDir/schemas"
                }
            }
            extensions.configure<RoomExtension> {
                schemaDirectory("$projectDir/schemas")
            }
            dependencies {
                implementation(libs.findLibrary("androidxRoom"))
                ksp(libs.findLibrary("androidxRoomCompiler"))
            }
        }
    }
}