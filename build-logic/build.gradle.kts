import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "jp.numero.template.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    compileOnly(libs.androidGradlePlugin)
    compileOnly(libs.kotlinGradlePlugin)
    compileOnly(libs.kspPlugin)
    implementation(libs.hiltPlugin)
}

gradlePlugin {
    plugins {
        // primitives
        register("androidApplication") {
            id = "buildlogic.primitive.androidapplication"
            implementationClass =
                "jp.numero.template.buildlogic.primitive.AndroidApplicationPlugin"
        }
        register("androidLibrary") {
            id = "buildlogic.primitive.androidlibrary"
            implementationClass =
                "jp.numero.template.buildlogic.primitive.AndroidLibraryPlugin"
        }
        register("compose") {
            id = "buildlogic.primitive.compose"
            implementationClass = "jp.numero.template.buildlogic.primitive.ComposePlugin"
        }
        register("kotlin") {
            id = "buildlogic.primitive.kotlin"
            implementationClass = "jp.numero.template.buildlogic.primitive.KotlinPlugin"
        }
        register("hilt") {
            id = "buildlogic.primitive.hilt"
            implementationClass = "jp.numero.template.buildlogic.primitive.HiltPlugin"
        }

        // conventions
        register("appModule") {
            id = "buildlogic.conventions.appmodule"
            implementationClass = "jp.numero.template.buildlogic.conventions.AppModulePlugin"
        }
        register("featureModule") {
            id = "buildlogic.conventions.featuremodule"
            implementationClass = "jp.numero.template.buildlogic.conventions.FeatureModulePlugin"
        }
    }
}
