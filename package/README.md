# Subproject: `package`

### Optional Dependency: `imagemagick`

Used to generate installer icons.

```bash
brew install imagemagick
```

### Generate Installer Icons

Generates icon files for each operating system.

Windows:

```bash
./gradlew :package:recreateWinIcons
```

Mac:

```bash
./gradlew :package:recreateMacIcons
```

### Create Installer Package

Creates OS-specific installers, using the **context operating system** (that is -- mac installers must be generated on a
mac operating system, windows must be generated on windows, etc.).

```bash
./gradlew :package:create
```

To purge packages:

```bash
./gradlew :package:clean
```

#### Using VirtualBox to Generate Windows Installers from a Mac Host

1. Install VirtualBox (https://www.virtualbox.org/)
2. Download a Windows .iso (https://www.microsoft.com/en-us/software-download/windows10ISO)
3. Create a Windows machine
    * Specify at least 16GB of storage!
4. Install the "Guest Additions" "CD Image"
    1. Devices > Insert Guest Additions CD Image...
    2. (From the Windows machine) navigate to *File Explorer*, open *CD Drive (D:) VirtualBox Guest Additions*
    3. Run *VBoxWindowsAdditions*
5. Create a new Shared Folder
    1. Machine > Settings, navigate to Shared Folders
    2. Create a new Shared Folder (navigate to the hello-jpackage directory on the host machine)
    3. Specify a Mount point (e.g.: Z)
    4. Check 'Auto-mount'
    5. Check 'Make Permanent'
6. In the Windows machine, install dependencies:
    1. JDK (https://adoptium.net)
    2. WiX (https://wixtoolset.org) (>= v3.14)
6. In the Windows machine, run *Windows PowerShell*
    1. Navigate to the shared folder (e.g. `cd Z:\`)
    2. Generate the Windows package (e.g. `.\gradlew.bat :package:create`)
