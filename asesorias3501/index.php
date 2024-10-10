<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi primera aplicacion con PHP</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Soy un encabezado de HTML</h1>
        <?php
            $nombre = "TESJI";
            $mensaje = "Mi primera aplicacion en PHP";
            echo "<h2>Hola mundo desde PHP</h2>";
            echo "<h3>Bienvenido $nombre</h3><h4>$mensaje</h4>";
        ?>
        <ul>
            <a href="pagina2.php"><li>Formularios</li></a>
        </ul>
    </div>
</body>
</html>
