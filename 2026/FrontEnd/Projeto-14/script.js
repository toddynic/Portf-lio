const forma = document.getElementById("formLogin");
forma.addEventListener("submit",login);

function login(event)
{
    event.preventDefault();
    const nome = document.getElementById("nome").value.trim();
    const email = document.getElementById("email").value.trim();
    const senha = document.getElementById("senha").value.trim();

    if (nome === "" || nome.split(" ").length < 2)
    {
        alert("Digite seu nome completo doidao");
        return;
    }

    let emailvalido = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if(!emailvalido.test(email))
    {
        alert("Digite um email valido");
        return;
    }

    if(senha.length < 6)
    {
        alert("A senha deve possuir pelo menos 6 caracteres");
        return;
    }


    alert("login realizado com sucesso");
    window.location.href = "./pag2.html";
    return;
}