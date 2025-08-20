function clicou() {

    let feito = false;
    const nome = document.getElementById("Nome").value;
    const senha = document.getElementById("Senha").value;

    const login = [
        ["Julia","Isac","Ana"],
        ["erika_hilton","bolsonaro","lula"]
    ];

    for (let i = 0;i < login[0].length;i++) {

        if(login[0][i] == nome) {
            if (login[1][i] == senha) {
                mudar("✅Usuário conectado","#00ff00ff");
                feito = true;
            }
        }
    }

    if (feito == false) {
        mudar("❌falha de login",'#FF0000');
    }

}

function mudar(arg,colo) {
    const resul = document.getElementById("resul");

    resul.innerHTML = arg
    resul.style.color = colo

}
