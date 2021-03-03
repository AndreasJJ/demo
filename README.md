# Repo for micronaut issue
- **Operating System**: Docker gradle:6.8.3-jdk11
- **Micronaut Version:** 2.3.4
- **JDK Version:** 11
```
backend_1           | 19:02:39.332 [main] ERROR io.micronaut.runtime.Micronaut - Error starting Micronaut server: Bean definition [io.micronaut.data.jdbc.config.SchemaGenerator] could not be loaded: Error instantiating bean of type [io.micronaut.data.jdbc.config.SchemaGenerator]: Unable to create table column for property [roundId] of entity [com.andreasjj.entity.Round] with unknown data type: ENTITY
backend_1           | io.micronaut.context.exceptions.BeanInstantiationException: Bean definition [io.micronaut.data.jdbc.config.SchemaGenerator] could not be loaded: Error instantiating bean of type [io.micronaut.data.jdbc.config.SchemaGenerator]: Unable to create table column for property [roundId] of entity [com.andreasjj.entity.Round] with unknown data type: ENTITY
backend_1           |   at io.micronaut.context.DefaultBeanContext.initializeContext(DefaultBeanContext.java:1549)
backend_1           |   at io.micronaut.context.DefaultApplicationContext.initializeContext(DefaultApplicationContext.java:220)
backend_1           |   at io.micronaut.context.DefaultBeanContext.readAllBeanDefinitionClasses(DefaultBeanContext.java:2838)
backend_1           |   at io.micronaut.context.DefaultBeanContext.start(DefaultBeanContext.java:233)
backend_1           |   at io.micronaut.context.DefaultApplicationContext.start(DefaultApplicationContext.java:166)
backend_1           |   at io.micronaut.runtime.Micronaut.start(Micronaut.java:71)
backend_1           |   at com.andreasjj.ApplicationKt.main(Application.kt:8)
backend_1           | Caused by: io.micronaut.context.exceptions.BeanInstantiationException: Error instantiating bean of type [io.micronaut.data.jdbc.config.SchemaGenerator]: Unable to create table column for property [roundId] of entity [com.andreasjj.entity.Round] with unknown data type: ENTITY
backend_1           |   at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1953)
backend_1           |   at io.micronaut.context.DefaultBeanContext.createAndRegisterSingletonInternal(DefaultBeanContext.java:2705)
backend_1           |   at io.micronaut.context.DefaultBeanContext.loadContextScopeBean(DefaultBeanContext.java:2241)
backend_1           |   at io.micronaut.context.DefaultBeanContext.initializeContext(DefaultBeanContext.java:1543)
backend_1           |   ... 6 common frames omitted
backend_1           | Caused by: io.micronaut.data.exceptions.MappingException: Unable to create table column for property [roundId] of entity [com.andreasjj.entity.Round] with unknown data type: ENTITY
backend_1           |   at io.micronaut.data.model.query.builder.sql.SqlQueryBuilder.addTypeToColumn(SqlQueryBuilder.java:1548)
backend_1           |   at io.micronaut.data.model.query.builder.sql.SqlQueryBuilder.buildCreateTableStatements(SqlQueryBuilder.java:309)
backend_1           |   at io.micronaut.data.jdbc.config.SchemaGenerator.createSchema(SchemaGenerator.java:142)
backend_1           |   at io.micronaut.data.jdbc.config.$SchemaGeneratorDefinition.initialize(Unknown Source)
backend_1           |   at io.micronaut.data.jdbc.config.$SchemaGeneratorDefinition.build(Unknown Source)
backend_1           |   at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1924)
backend_1           |   ... 9 common frames omitted
```

## Micronaut 2.3.4 Documentation

- [User Guide](https://docs.micronaut.io/2.3.4/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.3.4/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.3.4/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

## Feature testcontainers documentation

- [https://www.testcontainers.org/](https://www.testcontainers.org/)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature data-jdbc documentation

- [Micronaut Data JDBC documentation](https://micronaut-projects.github.io/micronaut-data/latest/guide/index.html#jdbc)

