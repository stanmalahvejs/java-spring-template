# java-spring-template

Template for a Java project with Spring, built via Gradle

![build status](https://github.com/stanmavs/java-spring-template/actions/workflows/push.yml/badge.svg)

## ToC

- [Repository structure](#repository-structure)
- [Submodules](#submodules)

## Repository structure

```
.
├── .github
│   └── workflows // CI/CD workflows for GitHub Actions
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