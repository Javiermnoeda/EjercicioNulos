fun main(){

    var numero1: Int? = 5
    var numero2 = 5
    var numero3 : Int = 5

    /*
      Entre la variable numero2 y numero3 no hay diferencia más allá de que se han declarado de forma diferente, pero a efectos prácticos ambas funcionan igual.
      La variable numero1 si que se diferencia de las otras dos. ¿Por que?, pues por que la variable numero1 puede tomar valor como int o como nulo. Ejemplo:
     */

    println(numero1)
    numero1 = null
    println(numero1)
    numero1 = 5

    // Como se ve en el ejemplo, si hacemos un println de numero1 con dos valores diferentes, el programa funciona.

    // Los riesgos que podemos tener es que si queremos sumar numero1 y numero2 no nos deje, por que para kotlin no son el mismo tipo de dato. Ejemplo:

   /*
    Esto no deberia funcionar, pero el programa compila y en el print me sale null5??
    var numero4 = numero1 + numero2
    println(numero4)
    */

    //Como nos protegemos de los nulos?. Fácil, así:

    if (numero1 != null) { //si numero1 no es null, ejecuta el siguiente codigo
        var numero4 = numero1 + numero2
        println(numero4)
    } else {
        println("Asegurate de que numero1 no sea null!!!")
    }



}