let tim;

function clicou() {

    let feito = false;
    const nome = document.getElementById("Nome");
    const senha = document.getElementById("Senha");
    
    const resul = document.getElementById("resul");
    
    const padr = resul.textContent;
    


    const login = [
        ["Julia","Isac","Ana"],
        ["erika_hilton","bolsonaro","lula"]
    ];

    for (let i = 0;i < login[0].length;i++) {

        if(login[0][i] == nome.value && login[1][i] == senha.value) {
            
            mudar("✅Usuário conectado","#00FF00FF");
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
        
    },3000);
}


function mudar(arg,colo) {

    resul.innerHTML = arg;
    resul.style.color = colo;

    apagar();
}

