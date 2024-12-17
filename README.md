### Importante

pegar estas variables de entorno a su configuracion **aplication.properties** en la seccion de recursos

cambiar las propiedades de conexión a la base de datos personal, es decir:

- base de datos creada
- usuario y contrseña

```properties
spring.application.name=practicas
server.port=8080
spring.datasource.url=jdbc:postgresql://localhost:5432/practicas_herramientas
spring.datasource.username=postgres
spring.datasource.password=contrasenia_personal
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

Estando dentro de la carpeta, ejecutar el proyecto con el comando

```shell
 mvn spring-boot:run
```

o utilizar la ayuda visual de la extencion **Spring Boot Dashboard** instalada en clase

En el navegador ingresar a la siguiente url

```
http://localhost:8080/api/v1/producto
```

el resultado será similar a esto

```
[
    {
        "id": 1,
        "nombre": "Galleta 1",
        "precio": 10
    },
    {
        "id": 2,
        "nombre": "Pan",
        "precio": 20
    },
    {
        "id": 3,
        "nombre": "Cola",
        "precio": 30
    }
]
```

### NOTA

Van a notar que nuestra clase producto se ha cambiado para generar propiedades con lombok, usando esta biblioteca, vamos a generar:

- @Data: genera getters and setters
- @NoArgsConstructor: genera el constructor si parametros
- @AllArgsConstructor: genera el construcctor con parametros

```java
package ec.edu.ucacue.practicas.practicas.models;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "producto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "precio", nullable = false)
    private double precio;
}
```

### Vamos a usar javata en lugar de javax

El uso de jakarta.persistence en lugar de javax.persistence se debe a un cambio en la especificación de Java EE a Jakarta EE. A partir de Jakarta EE 9, todos los paquetes de la especificación se han movido de javax._ a jakarta._. Si estás utilizando una versión reciente de Spring Boot y las dependencias correspondientes, es posible que tu proyecto esté configurado para usar Jakarta EE en lugar de Java EE.

Ademas les dejo la dependencia

```xml
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
```
