<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Procesar Datos del Formulario</title>
</head>
<body>
    <?php 
       //Recibir los datos por POST
       $nombre = $_POST["txtNombre"];

       echo "Tu nombre es $nombre";

    ?>
</body>
</html>l