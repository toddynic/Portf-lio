const email = document.getElementById("email");
const senha = document.getElementById("senha");

function login()
{
    
    let demail = email.value;

    let dsenha = senha.value;


    if ((demail == "admin" && dsenha == "1234") ||
    (demail == "Isac" && dsenha == "JoJo") ||
    (demail == "Ana" && dsenha == "Justin") ||
    (demail == "Julia" && dsenha == "Acotar") ||
    (demail == "Laiany" && dsenha == "Moto"))
    {
        window.location.replace("login.html?id="+demail+"&senha="+dsenha);
    }else
    {
        alert("Usuário ou senha incorretos! Tente novamente.");
    }
}