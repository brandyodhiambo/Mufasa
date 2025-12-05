spotless {
    java {
        target '**/*.java'
        googleJavaFormat().aosp()
        removeUnusedImports()
        trimTrailingWhitespace()
        leadingTabsToSpaces()
        licenseHeaderFile(rootProject.file("spotless/LICENSE.txt"))
        endWithNewline()
    }
    kotlin {
        target "**/*.kt"
        trimTrailingWhitespace()
        ktlint()
        leadingTabsToSpaces()
        licenseHeaderFile(rootProject.file("spotless/LICENSE.txt"))
        endWithNewline()
    }

    format 'misc', {
        target '**/*.gradle', '**/*.md', '**/.gitignore'
        leadingTabsToSpaces()
        trimTrailingWhitespace()
        endWithNewline()
    }
    format 'xml', {
        target '**/*.xml'
        leadingTabsToSpaces()
        trimTrailingWhitespace()
        endWithNewline()
    }
}