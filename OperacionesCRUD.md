# Operaciones CRUD
Las operaciones **CRUD** son un conjunto de 4 operaciones fundamentales en el manejo de bases de datos y aplicaciones web. CRUD es un acronimo que represneta las siguientes operaciones.

- **C**reate (Crear)
- **R**ead (Leer)
- **U**pdate (Actualizar)
- **D**elete (Eliminar)

**Primero creamos una Tabla:** 
```sql
CREATE TABLE usuarios(
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) UNIQUE NOT NULL CHECK(email LIKE     "%_@_%._%"),
    password VARCHAR(15) NOT NULL CHECK(LENGTH(password)>=8)
);
```
## Create
La operacion *Crear* es responsable de insertar nuevos datos en la base de datos el lenguaje sql en sql se usa para crear `INSERT INTO` y en el caso de mysq `INSERT` tambien funciona. El proposito de la operacion es añadir el nuevo registro a una tabla.

```sql
-- Ejemplo de una insercion valida usando todos los campos
INSERT INTO usuarios VALUES(1,"ejemplo@mail.com","12345678");

-- Ejemplo de una insercion valida uando el comando default
INSERT INTO usuarios VALUES(DEFAULT,"ejemplo2@gmail.com","abcdefgh");

-- Ejemplo de una insercion sin incluir el id Usuario
INSERT usuarios(email,password)VALUES("email3@hotmail.com","12345678");
```

### Ejercicios
- Identifica los tipos de errores que pueden salir en esta tabla (minimo 4 errores)
- Inserta 4 registros nuevos en un solo INSERT.

## Read
La operacion *Leer* es utilizada para consultar o recuperar datos de la base de datos. Esto no modifica los datos, simplemente los extrae. En mysq esta operacion se realiza con la sentencia `SELECT`.

```sql
-- Ejemplo de una consulta para todos los datos de una tabla
SELECT*FROM usuarios; 
-- Ejemplo de consulta para un registro en especifico a travez del ID. 
SELECT*FROM usuarios WHERE id_usuario=1;
-- Ejemplo de consulta para un registro con un email en especifico
SELECT*FROM usuarios WHERE email="ejemplo@mail.com";
-- Ejemplo de consulta con solo los campos de email y password
SELECT email,password FROM usuarios;
-- Ejemplo de consulta con un condicional logico
SELECT*FROM usuarios WHERE LENGTH(password)>=9;
```
### Ejercicios
- Realiza una consulta que muestre solo el email, pero que coincida con una contraseña de mas de 8 caracteres, y otra que realice una consulta a los id pares.


## Update
La operacion *actualizar* se utiliza para modificar recursos existentes en la base de datos. Esto se hace con la sentencia `UPDATE`.
```sql
-- Ejemplo para actualizar la contraseña por su id
UPDATE usuario SET password="a1b2c3d4e5"WHERE id_usuario=1;
-- Ejemplo para actualizar el email y password de un usuario en especifico
UPDATE usuario SET password="a1b2c3d4e5",email="luciohdz3012@gmail.com"WHERE id_usuario=1;
```
 
### Ejercicios
- Intenta actualizar registros con valores que violen las restricciones. (minimo 3)

## Delete
La operacion *eliminar* se usa para borrar registros de la base de datos. Esto se realiza con la sentencia `DELETE`. **Debemos ser muy cuidados con esta operacion, ya que una vez que los datos son eliminados, no pueden ser recuperados**.
```sql
-- Eliminar el usuario por el ID
DELETE FROM usuarios WHERE id_usuario=4;
-- Eliminar los usuarios con el email especifico
DELETE FROM usuarios WHERE email="luciohdz3012@gmail.com";
```

### Ejercicios
- Eliminar usuarios cuyo email contenga uno o mas "5"
- Eliminar usuarios que tengan una contrasena que contenga letras mayusculas, usando expresiones regualres (cadena de texto) con la funcion REGEXP
- Eliminar usuarios con contrasenas que contengan colo numeros(Con expresion regular)
- Eliminar usuarios con correos que no tengan el dominio email.
          