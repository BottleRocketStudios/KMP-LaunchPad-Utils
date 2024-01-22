# LaunchPad Quick Start for Kotlin Multiplatform
LaunchPad is an open-source, free-to-use project designed to empower you to bring your Kotlin Multiplatform projects to market faster. It provides a collection of tools and utilities to streamline your development process and eliminate the need for
reinventing the wheel.

## LaunchPad Utils
With LaunchPad Utils, you can:

- Optimize your code with helpful utilities for logging, Coroutines, SharedPreferences, and more.
- Leverage platform-specific extensions for Android and iOS, simplifying native functionality access.
- Boost your productivity with convenient functions for working with dates, strings, and other data types.
- Enhance your app's reliability with robust error handling and testing utilities.

## Key Features
- Comprehensive Utilities: LaunchPad Utils offers a diverse range of utilities, including:
    - Logging: Streamline logging with customizable logging levels and structured messages.
    - Coroutines: Simplify asynchronous tasks and manage threads effortlessly.
    - SharedPreferences: Access and manage app preferences easily.
    - Currency: Format and manipulate dates and times with ease.
    - Strings: Validate and manipulate strings with dedicated functions.
- Platform-Independent: LaunchPad Utils works seamlessly across various platforms, including Android, and iOS.

## Contributing
We encourage contributions from all developers! Refer to the  [`CONTRIBUTING.md`](./CONTRIBUTING.md) for details.

## Usage
Add the following dependency to your build.gradle.kts:
```kotlin
commonMain.dependencies {
...
implementation("com.github.bottlerocketstudios:kmp-launchpad-compose:<version>")
}
```

### Creating Personal Access Token (PAT)
A personal access token is required to import additional libraries.
- It has to be a classic token (new fine grained tokens may not work).
- These permissions must be granted to PAT: **read:packages** and **read:project**
- Here are more details:
-  https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry
- Save the token in a safe place, i.e. 1Password.
- NOTE: This PAT is associated with your account.

### Specify user name and token as Shell Environment Variables
- In your shell file like .bash_profile, .zshrc, OR .zlogin, add these two statements:
```
export REPO_READ_USER=<<Your Email Adress (preferabbly Bottle Rocket Email>>
export REPO_READ_TOKEN=<<Your PAT>>
```
