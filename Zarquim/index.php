<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="Cadastramento">
        <form method="post">
            <label>Digite o CPF</label>
            <input type="text" name="CPF" minlength="11" maxlength="11" require placeholder="11 dígitos">
            <button type="submit">Cadastrar</button>
        </form>
    </div>

    <div class="info">
    <?php
        
        $conn = new mysqli("localhost", "root", "aluno", "sistemas", "3307");

        if($conn->connect_error){
                die("<p>Não Conectou :(  $conn->connect_error</p>");
        }

        if($_SERVER["REQUEST_METHOD"] == "POST") {

            $CPF = $_POST["CPF"];



            if(!ctype_digit($CPF) || strlen($CPF) != 11){
                die("<p>O CPF tem que conter 11 digitos</p>");
            }

            $sql = "INSERT INTO cliente (cpf) values ('$CPF');";

            if($conn->query($sql) === TRUE){

                echo "Deu mengão";

            }else {

                echo "Ja tem o burro";

            }





            
        }


        echo "<table>
        <tr>
            <thead>  
                <th>CPF</th>
                <th>Data</th>
            </thead>
        </tr>
        <tbody>";

        $sql2 = "SELECT * FROM cliente";
        $resultado = $conn->query($sql2);

        if ($resultado->num_rows > 0) {
            while ($linha = $resultado->fetch_assoc()) {
                echo "<tr>";
                echo "<td>" . $linha["cpf"] . "</td>";
                echo "<td>" . $linha["data_envio"] . "</td>";
                echo "</tr>";
            }
        } else {
            echo "<tr><td colspan='4'>Nenhum usuário cadastrado.</td></tr>";
        }
            
        echo "</tbody>
    </table>";


    $conn->close();
    ?>
    </div>

</body>
</html>