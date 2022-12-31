# Hello `jpackage`

Simple hello-world-style demonstration of the use of `jpackage`.

Create an artifact for the context operating system:

```bash
./gradlew :package:create
```

Package artifacts will be located at: `package/build/<operating system>`.

Delete artifacts with:

```bash
./gradlew :package:clean
```

### Apple Code Signing

TODO! Need to look into self-signed certs, but this may not be possible.
