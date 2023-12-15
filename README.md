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

#### Step 1: Creating a Personal Access Token on GitHub

1. ###### Log in to GitHub:
   Open your web browser and navigate to GitHub. Log in with your GitHub credentials.

2. ###### Access Token Settings:

- Click on your profile picture in the top-right corner.
- Select "Settings" from the dropdown menu.
- In the left sidebar, click on "Developer settings."

3. ###### Generate Token:

- In the "Access tokens" section, click on "Generate token."
- Provide a suitable name for your token.
- Select the scopes (permissions) needed for your use case. For general use, "repo" and "read:user" are often sufficient.
- Click "Generate token."

4. ###### Copy Token:

- After generating the token, copy it to your clipboard immediately.
- Note: This token is displayed only once. Ensure you securely store it.

#### Step 2: Configuring the Token Locally

Now that you have generated your PAT, you'll need to configure it on your local machine.

1. ###### Open your terminal:

- Open the terminal or command prompt on your computer.

2. ###### Set Environment Variables:

- Run the following commands, replacing YOUR_TOKEN_HERE with the actual token you copied:

```bash
export LOCAL_GITHUB_TOKEN=YOUR_TOKEN_HERE
export LOCAL_GITHUB_USERNAME=your-github-email@example.com
```

Alternatively, you can add these lines to your shell profile file (e.g., .bashrc, .zshrc, or .bash_profile) to make them persistent.

3. ###### Verify Configuration:

- To verify that your environment variables are set correctly, you can echo them in the terminal:

```bash
echo $LOCAL_GITHUB_TOKEN
echo $LOCAL_GITHUB_USERNAME
```

You should see the values you set.