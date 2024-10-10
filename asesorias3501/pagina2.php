<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP</title>
    <link rel="stylesheet" href="style2.css">
</head>
<body>
    <section>
        <h1>Formularios con PHP</h1>
        <form action="procesar-form.php" method="post">
            <input type="text" placeholder="Nombre" name="txtNombre">
            <input type="number" placeholder="Edad" name="txtEdad">
            <select size="1" name="selectCarrera">
                <option>--Seleccione Carrera--</option>
                <option value="sistemas">Ing.Sistemas Computacionales</option>
                <option value="meca">Ing.Mecatronica</option>
                <option value="logistica">Ing.Logistica</option>
                <option value="industrial">Ing.Industrial</option>
                <option value="civil">Ing.Civil</option>
            </select>
            <button>Registrar</button>
            <button>Nuevo</button>
        </form>    
    </section>
</body>
</html>