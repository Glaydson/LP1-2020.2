var cateto1 = prompt("Entre com o valor do cateto 1");
var cateto2 = prompt("Entre com o valor do cateto 2");

if (!isNaN(cateto1) && !isNaN(cateto2)) {
    var hipotenusa = calcularHipotenusa(cateto1, cateto2);
    alert(" A hipotenusa é " + hipotenusa);
} else {
    alert("Entre com números somente.")
}


function calcularHipotenusa(cateto1, cateto2) {
    return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
}

