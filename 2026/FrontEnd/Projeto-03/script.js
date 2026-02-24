const imagens = document.querySelectorAll("#carrossel img");

let idimg = 0;

function trocarimg(id)
{
    imagens.forEach(imagem => imagem.classList.remove("ativa"));
    imagens[id].classList.add("ativa");
}

function avancar()
{
    idimg = (idimg+1) % imagens.length;
    trocarimg(idimg);
}

function retroceder()
{
    idimg = (idimg-1+imagens.length) % imagens.length;
    trocarimg(idimg);
}

let crono = setInterval(avancar,5000);