# Math Library
![Math Library Banner](./images/banner_dark.png)

<div align="center">
  <img alt="Latest Release" src="https://img.shields.io/github/v/release/gabriel-aplok/math-library-android?color=black&label=Latest%20Release&style=for-the-badge"><br>
  <img alt="Downloads" src="https://img.shields.io/github/downloads/gabriel-aplok/math-library-android/total?color=black&style=for-the-badge"><br>
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/gabriel-aplok/math-library-android?color=black&style=for-the-badge"><br>
  <img alt="License" src="https://img.shields.io/github/license/gabriel-aplok/math-library-android?color=black&style=for-the-badge"><br>
  <img alt="Commit Activity" src="https://img.shields.io/github/commit-activity/m/gabriel-aplok/math-library-android?color=black&style=for-the-badge"><br />
  <img alt="Part of Kolpa Engine" src="https://img.shields.io/badge/Part%20of-Kolpa%20Engine-black?style=for-the-badge">
</div>

A **Math Library** é uma biblioteca de matemática baseada em Java, mas é muito básica.

## Definição
A biblioteca suporta entidades usadas com mais frequência no desenvolvimento de jogos 3D, ou seja, `vetores`, `matrizes` e `quatérnios`.

## Como usar
1. Add the JitPack repository to project build file, i.e. add it in the root `build.gradle` at the end of repositories
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
2. Add the dependency
```groovy
dependencies {
    implementation 'com.github.gabriel-aplok:math-library-android:v1.0'
}
```

3. Synchronize Gradle files in Android Studio, i.e. click `File` > `Sync Project with Gradle Files`
