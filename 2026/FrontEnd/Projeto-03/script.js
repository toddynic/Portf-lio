const imagens = document.querySelectorAll("#carrossel img");

let idimg = 1;

function trocarimg(id)
{
    imagens.forEach(imagem => imagem.classList.remove("ativa"));
    imagens[id].classList.add("ativa");
}

function avançar()
{

}

function retroceder()
{
    
}