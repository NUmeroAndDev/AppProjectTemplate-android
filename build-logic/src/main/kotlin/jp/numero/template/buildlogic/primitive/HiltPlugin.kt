package jp.numero.template.buildlogic.primitive

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.devtools.ksp")
                apply("dagger.hilt.android.plugin")
            }
            dependencies {
                implementation(libs.findLibrary("hilt.android"))
                ksp(libs.findLibrary("hilt.compiler"))
            }
        }
    }
}