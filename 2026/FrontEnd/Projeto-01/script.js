let indice =0;
const imagem = document.querySelectorAll(".carrossel img");

function verimg(tela)
{
    imagem.forEach(img => img.classList.remove("ativa"));
    imagem[tela].classList.add("ativa");
}

function proximo()
{
    indice = (indice+1) % imagem.length;
    verimg(indice);
    console.log(indice);
}

function anterior()
{
    indice = (indice-1+imagem.length) % imagem.length;
    verimg(indice);
    console.log(indice);
}