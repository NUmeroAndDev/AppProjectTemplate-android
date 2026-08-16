package jp.numero.template.buildlogic.primitive

import com.google.devtools.ksp.gradle.KspExtension
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
            }
            android {
                sourceSets {
                    getByName("test").assets.directories += "$projectDir/schemas"
                }
            }
            extensions.configure<KspExtension> {
                arg("room.schemaLocation", "$projectDir/schemas")
                arg("room.generateKotlin", "true")
            }
            dependencies {
                implementation(libs.findLibrary("androidxRoom"))
                ksp(libs.findLibrary("androidxRoomCompiler"))
            }
        }
    }
}