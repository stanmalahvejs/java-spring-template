# buildSrc

Shared build logic, organized into convention plugins. See [Sharing build logic between subprojects Sample](https://docs.gradle.org/current/samples/sample_convention_plugins.html).

## Important source files

- [com.github.stanmavs.java.spring.template.java-common-conventions.gradle](./src/main/groovy/com.github.stanmavs.java.spring.template.java-common-conventions.gradle) - contains the common build logic for all Java submodules
- [com.github.stanmavs.java.spring.template.java-api-application-conventions.gradle](./src/main/groovy/com.github.stanmavs.java.spring.template.java-api-application-conventions.gradle) - contains the build logic for an API application