package jp.numero.template.buildlogic.primitive

import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class KotlinPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.android")
            }
            extensions.configure<KotlinAndroidProjectExtension> {
                compilerOptions {
                    jvmTarget.set(
                        JvmTarget.fromTarget(JavaVersion.VERSION_17.toString()),
                    )
                    freeCompilerArgs.addAll(
                        listOf(
                            "-Xcontext-parameters",
                        ),
                    )
                }
            }
            dependencies {
                implementation(libs.findLibrary("kotlinxCoroutines"))
            }
        }
    }
}