<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $nome = $_POST["nome"];
        $categoria = $_POST["categoria"];
        $preco = $_POST["preco"];
        $estoque = $_POST["estoque"];

        echo "Nome:$nome<br>";
        echo "Categoria:$categoria<br>";
        echo "Preço:$preco<br>";
        echo "Estoque:$estoque";

         
    }
    
    
    
    
    
    ?>
</body>
</html>