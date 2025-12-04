spotless {
    java {
        target '**/*.java'
        googleJavaFormat().aosp()
        removeUnusedImports()
        trimTrailingWhitespace()
        indentWithSpaces()
        licenseHeaderFile(rootProject.file("spotless/LICENSE.txt"))
        endWithNewline()
    }
    kotlin {
        target "**/*.kt"
        trimTrailingWhitespace()
        //ktlint()
        indentWithSpaces()
        licenseHeaderFile(rootProject.file("spotless/LICENSE.txt"))
        endWithNewline()
    }

    format 'misc', {
        target '**/*.gradle', '**/*.md', '**/.gitignore'
        indentWithSpaces()
        trimTrailingWhitespace()
        endWithNewline()
    }
    format 'xml', {
        target '**/*.xml'
        indentWithSpaces()
        trimTrailingWhitespace()
        endWithNewline()
    }
}