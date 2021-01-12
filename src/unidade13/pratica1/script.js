function digaAlo(nome1, nome2) {
    console.log(document.getElementById('resultado'))
    document.getElementById('resultado1').innerHTML = 'Alô ' + nome1;
    document.getElementById('resultado2').innerHTML = nome2;
}

function inserirDivAntesDe(idPai, idElemento, texto) {
    var novaDiv = document.createElement("div");
    novaDiv.innerHTML = texto;
    var elementoPai = document.getElementById(idPai);
    var elementoPosterior = document.getElementById(idElemento);
    elementoPai.insertBefore(novaDiv, elementoPosterior);

}