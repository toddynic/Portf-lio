async function Carregar(peca) {
    const plani = {
        "cpu" : "O cérebro poderoso que garante performance sem travar.",
        "gpu" : "A placa gráfica que transforma seus jogos e vídeos em pura arte visual.",
        "monitor" : "A tela que traz cores vivas e detalhes impressionantes para seus olhos.",
        "ram" : "A memória rápida que mantém tudo rodando liso, sem engasgos.",
        "mae" : "A base sólida que conecta todos os componentes com eficiência.",
        "fan" : "O sistema de ventilação que mantém tudo fresquinho, mesmo nas tarefas mais pesadas."
    };
    
    mudardiv("Processando...");

    await new Promise(resolve => setTimeout(resolve,1000));

    mudardiv(plani[peca]);

}

function mudardiv(str) {
    const det = document.getElementById("detalhe");

    det.innerHTML = str;
}