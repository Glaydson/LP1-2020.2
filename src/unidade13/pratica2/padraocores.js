function exibePadrao() {
    var posicaotopo = 25, posicaoesquerda = 25;
    var largura = 500, altura = 500;
    var listacores = ["red", "orange", "yellow", "green", "blue", "indigo", "violet"];
    var corpo = document.getElementById("corpo");

    while(largura > 50) {
        var div = document.createElement("div");                  
        var coraleatoria = Math.random() * 7;
        coraleatoria = Math.floor(coraleatoria);
        div.style.top = posicaotopo + "px";
        div.style.left = posicaoesquerda + "px";
        div.style.width = largura + "px";
        div.style.height = altura + "px";
        div.style.background = listacores[coraleatoria];
        corpo.appendChild(div);
        posicaotopo += 10; posicaoesquerda += 10;
        largura -= 20; altura -= 20;
}

}