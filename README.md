# Quarkus Getting Started

Quarkus with Kotlin using Gradle

## Description
### code.quarkus.io
- [https://code.quarkus.io/](https://code.quarkus.io/)

![](https://user-images.githubusercontent.com/3072734/95756502-d45cef00-0ce0-11eb-9f6a-412529f5d941.png)

|Configuration|Value|
|-------------|-----|
|Group|com.google.shinyay|
|Artifact|getting-started|
|Build Tool|Gradle with Kotlin DSL|

### 

`mvn io.quarkus:quarkus-maven-plugin:1.5.1.Final:create`

Create command attributes:
|Attribute|Description|
|---------|-----------|
|projectGroupId|The group id of the created project|
|projectArtifactId|The artifact id of the created project. Not passing it triggers the interactive mode.|
|projectVersion|The version of the created project|
|className|The fully qualified name of the generated resource|
|path|The resource path, only relevant if className is set.|
|extensions|The list of extensions to add to the project (comma-separated)|


## Demo

## Features

- List Queakus Extensions: `./gradlew listExtensions`
- Enable Queakus Extensions: `./gradlew addExtension --extensions="hibernate-validator"`
- Development Mode: `./gradlew quarkusDev`
    - You can then update the application sources, resources and configurations. The changes are automatically reflected in your running application.
- Building a native executable: `./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true`
    - Make sure to have GRAALVM_HOME configured and pointing to GraalVM version 19.3.1.
- Building Uber-Jars: `./gradlew quarkusBuild --uber-jar`
- Building: `./gradlew build`
    - This command will not build the native image.

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
