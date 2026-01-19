package jp.numero.template.buildlogic.conventions

import jp.numero.template.buildlogic.primitive.implementation
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.project

class AppModulePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("buildlogic.primitive.androidapplication")
                apply("buildlogic.primitive.compose")
                apply("buildlogic.primitive.kotlin")
                apply("buildlogic.primitive.hilt")
                apply("buildlogic.primitive.test")
            }
            dependencies {
                implementation(project(":core"))
            }
        }
    }
}