# java-spring-template

Template for a Java project with Spring, built via Gradle

## ToC

- [Repository structure](#repository-structure)
- [Submodules](#submodules)

## Repository structure

```
.
├── LICENSE
├── README.md
├── buildSrc // shared build logic
│   ├── ... // source code for shared build logic
├── foo // example of a REST API microservice, backed by Spring Boot
│   ├── ... // source code for the foo microservice
├── gradle
│   └── wrapper
├── gradlew
├── gradlew.bat
└── settings.gradle
```

## Submodules

- [buildSrc](./buildSrc/README.md)
- [foo](./foo/README.md)