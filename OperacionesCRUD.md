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
```sql 
INSERT INTO usuarios (email, password) VALUES ('usuario@example.com', 'password123');
-- Este comando genera un error si 'usuario@example.com' ya existe en la tabla.
INSERT INTO usuarios (email, password) VALUES ('usuario@dominio', 'password123');
-- Este comando generará un error porque el email no cumple con el formato requerido.
INSERT INTO usuarios (email, password) VALUES ('nuevo@ejemplo.com', 'pass');
-- Este comando generará un error porque la contraseña tiene menos de 8 caracteres.
INSERT INTO usuarios (id_usuario, email, password) VALUES ('string_invalido', 'usuario@ejemplo.com', 'password123');
-- Este comando generará un error porque 'id_usuario' debe ser un entero.
INSERT INTO usuarios (email, password) VALUES (NULL, 'password123');
-- Este comando generará un error porque el campo 'email' no puede ser nulo.
```
- Inserta 4 registros nuevos en un solo INSERT.
```sql
INSERT INTO usuarios (email, password) VALUES 
('usuario1@example.com', 'password123'),
('usuario2@example.com', 'password456'),
('usuario3@example.com', 'password789'),
('usuario4@example.com', 'passwordABC');
```


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
```sql
-- consulta que muestre solo el email, pero que coincida con una contraseña de mas de 8 caracteres
SELECT email 
FROM usuarios 
WHERE LENGTH(password) > 8;
-- consulta a los id pares.
SELECT id_usuario 
FROM usuarios 
WHERE id_usuario % 2 = 0;
```

## Update
La operacion *actualizar* se utiliza para modificar recursos existentes en la base de datos. Esto se hace con la sentencia `UPDATE`.
```sql
-- Ejemplo para actualizar la contraseña por su id
UPDATE usuarios SET password="a1b2c3d4e5"WHERE id_usuario=1;
-- Ejemplo para actualizar el email y password de un usuario en especifico
UPDATE usuarios SET password="a1b2c3d4e5",email="luciohdz3012@gmail.com"WHERE id_usuario=1;
```
 
### Ejercicios
- Intenta actualizar registros con valores que violen las restricciones. (minimo 3)
```sql
UPDATE usuarios 
SET email = 'usuario1@example.com' 
WHERE id_usuario = 2; 
-- Supone que 'usuario1@example.com' ya existe en la tabla.
UPDATE usuarios 
SET email = 'usuario@dominio' 
WHERE id_usuario = 3; 
-- Este comando generará un error porque el email no cumple con el formato requerido.
UPDATE usuarios 
SET password = 'short' 
WHERE id_usuario = 1; 
-- Este comando generará un error porque la contraseña tiene menos de 8 caracteres.
```

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
```sql
DELETE FROM usuarios 
WHERE email LIKE '%5%';
```
- Eliminar usuarios que tengan una contrasena que contenga letras mayusculas, usando expresiones regualres (cadena de texto) con la funcion REGEXP
```sql
DELETE FROM usuarios 
WHERE password REGEXP '[A-Z]';
```
- Eliminar usuarios con contrasenas que contengan solo numeros(Con expresion regular)
```sql
DELETE FROM usuarios 
WHERE password REGEXP '^[0-9]+$';
```
- Eliminar usuarios con correos que no tengan el dominio email.
```sql
DELETE FROM usuarios 
WHERE email NOT LIKE '%@email%';
```
          