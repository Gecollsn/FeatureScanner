package com.gcc.feature.build_src.config;

interface ClassPaths {
    String gradle_build_tool = "com.android.tools.build:gradle:3.6.4"
    String kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Deps.versions.kotlin_version}"

    String navigation_safe_args = "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.0-alpha01"

}
