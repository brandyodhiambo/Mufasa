# Mufasa Design System 🚀

A reusable, themeable Jetpack Compose design system for Android built to power your apps with a consistent UI, theming, and components.

Mufasa provides:
- A flexible theming setup (colors, shapes, typography, spacing)
- A rich set of reusable components (buttons, FABs, dialogs, navigation bars, drawers, etc.)
- Light and dark mode support, dynamic overrides, and design-system-wide consistency

## Features

- Theme-first architecture: colors, typography, shapes, and spacing tokens.
- Reusable Compose components: Buttons, FABs, Alerts, Snackbars, Banners, Navigation Bars, Tabs, Drawers, etc.
- Light & Dark theme support, with ability to override per-app or per-screen.
- Easy integration via JitPack  no manual copying or asset duplication.
- Sample app included  demonstrates all components and theming in action.


## Installation

Add Mufasa to your project via JitPack.

In your **root** `settings.gradle.kts` (or `settings.gradle`) add:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

In app module or wherever you want to use mufasa add

```kotlin
    dependencies { implementation("com.github.brandyodhiambo:Mufasa:1.0.0") }
```

## Quick Start

```kotlin
@Composable
fun MyApp() {
    MufasaAppTheme {
        Column {
            MufasaButton(onClick = { TODO() }) {
                Text("Continue")
            }

            Spacer(modifier = Modifier.height(16.dp))

            MufasaFab(
                onClick = { TODO() }
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    }
}
```

### Theme Customization

```kotlin
val customLightColors = MufasaDefaults.LightColorScheme.copy(
    primary = Color(0xFF009688),
    onPrimary = Color.White
)

val customDarkColors = MufasaDefaults.DarkColorScheme.copy(
    primary = Color(0xFF009688),
    onPrimary = Color.White
)

val customShapes = MufasaShapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(24.dp)
)

MufasaAppTheme(
    lightColors = customLightColors,
    darkColors = customDarkColors,
    shapes = customShapes
) {
    // Your UI here
}
```

## 🚧 WORK IN PROGRESS 🚧

This library is still in **active development**.  
Features may be incomplete, unstable, or subject to breaking changes without notice.  
If you use it, expect frequent updates and API changes.