<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>venda</title>
<style>
  body {
     background-color:red;
     text-align: center;
    }
</style>
</head>
<body>
    <h3>Dados</h3>

    <form action="resultado.php?campanha=blackfriday" method="post">
        
        <label>Nome do Produto</label><br>
        <input type="text" name="nome" require><br><br>

        <label>Categoria</label><br>
        <input type="text" name="categoria" require><br><br>

        <label>Preço</label><br>
        <input type="number" step="0.01" name="preco" require><br><br>

        <label>Quantidade em estoque</label><br>
        <input type="number" name="estoque" require><br><br>

        <button type="submit">Enviar</button>
    </form>
</body>
</html>