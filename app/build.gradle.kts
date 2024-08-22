plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.rbk.ish_tops"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rbk.ish_tops"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        dataBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Retrofit and Gson Converter dependencies
    //initially we were writing libraries as string but standards
    // to add dependency into lib recommended
    // old approach =  implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation(libs.retrofit)
    implementation(libs.retrofit.gsonConverter)

    //swipe refresh
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))

}