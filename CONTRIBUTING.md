Contributing
============

If you would like to contribute code to this project you can do so through GitHub by
forking the repository and sending a pull request.

When submitting code follow the existing conventions and code style. Ensure that your code changes build and unit tests pass.

### Creating Personal Access Token (PAT)
To publish this library to github, you need to create a Personal Access Token (PAT) on GitHub. Please follow the instructions below:
 - On github, create a Token (classic), for information on this please see https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token
 - Grant the following permissions to your PAT: **read:packages**, **write:packages**, and **repo**
 - Save the token in a safe place, i.e. 1Password.
 - Finally, authorize BottleRocketStudios to use your PAT.

### Specify user name and token as Shell Environment Variables
- In your shell file like .bash_profile, .zshrc, OR .zlogin, add these two statements:
```
export REPO_READ_WRITE_USER=<<Your Github Username or Email Address>>
export REPO_READ_WRITE_TOKEN=<<Your PAT>>
```
