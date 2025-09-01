let tim;

const login = [
        ["Julia","Isac","Ana"],
        ["erika_hilton","bolsonaro","lula"]
    ];

function clicou() {
    
    const resul = document.getElementById("resul");

    resul.innerHTML = "Redirecionando...";
    setTimeout(verificacao,1500);
    
}

function verificacao() {

    const nome = document.getElementById("Nome");
    const senha = document.getElementById("Senha");

    let feito = false;
    
    for (let i = 0;i < login[0].length;i++) {

        if(login[0][i] == nome.value && login[1][i] == senha.value) {
            
            mudar("✅Usuário conectado","#00FF00FF");
            window.location.href = "final.html"
            feito = true;

        }
    }

    if (feito == false) {
        mudar("❌falha de login",'#FF0000');
    }
}


function apagar() {
    clearTimeout(tim);

    const nome = document.getElementById("Nome");
    const senha = document.getElementById("Senha");

    nome.value = "";
    senha.value = "";

    tim = setTimeout(() => {
        const resul = document.getElementById("resul");
        resul.innerHTML = "Será que você esta cadastrado?";
        resul.style = "#00000000"
        
    },1500);
}


function mudar(arg,colo) {

    resul.innerHTML = arg;
    resul.style.color = colo;

    apagar();
}

