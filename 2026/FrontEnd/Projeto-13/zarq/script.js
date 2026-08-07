function login()
{
    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;
    const senha = document.getElementById("senha").value;

    if (nome == 'admin' && email == 'admin@' && senha == 'adm')
    {
        alert(";-;");
    }
}