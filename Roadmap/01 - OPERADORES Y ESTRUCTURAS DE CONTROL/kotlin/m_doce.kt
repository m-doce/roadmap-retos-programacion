package com.mdoce.androidtutorial.mouredevretos

fun main() {
    operadoresAritmeticos()
    println()
    operadoresLogicos()
    println()
    operadoresDeComparacion()
    println()
    operadorDeAsignacion()
    println()
    operadoresDeIdentidad()
    println()
    operadorDePertenencia()
    println()
    estructurasDeControl()

    println()
    println("Ejercicio extra")
    dificultadExtra()
}

fun operadoresAritmeticos() {
    println("Operadores Aritméticos")
    println("Suma: +")
    println(5+7)
    println("Resta: -")
    println(19-7)
    println("Multiplicación: *")
    println(3*4)
    println("División: /")
    println(24/2)
    println("Módulo: %")
    println(25%13)
}

fun operadoresLogicos() {
    println("Operadores Lógicos")
    println("Conjunción: and, &&")
    println(false and true)
    println(false && true)
    println("Disyunción: or, ||")
    println(false or true)
    println(false || true)
    println("Negación: !")
    println(!false)
}

fun operadoresDeComparacion() {
    println("Operadores de Comparación")
    if(7 > 5) {
        println("Mayor que: >")
    }

    if(5 < 7) {
        println("Menor que: <")
    }

    if(7 == 7) {
        println("Igual que: ==")
    }

    if(7 != 5) {
        println("Distinto que: !=")
    }

    if(7 >= 5) {
        println("Mayor o igual que: >=")
    }

    if(5 <= 7) {
        println("Menor o igual que: <=")
    }
}

fun operadorDeAsignacion() {
    println("Operador de Asignación: =")
    var numero = 12
    var number: Int = 12
}

fun operadoresDeIdentidad() {
    class Persona(val nombre: String, val edad: Int)
    println("Operadores de Identidad")

    val persona1 = Persona("m", 12)
    val persona2 = Persona("m", 12)
    val persona3 = persona1

    println("Apuntan a la misma posición de memoria: ===")
    println(persona1 === persona2)
    println(persona1 === persona3)
    println("No apuntan a la misma posición de memoria: !==")
    println(persona1 !== persona2)
    println(persona1 !== persona3)
}

fun operadorDePertenencia() {
    println("Operador de Pertenencia = in")
    val pertenece: Boolean = 5 in 1..10
    println(pertenece)
}

fun estructurasDeControl() {
    println("Estructuras de Control")

    println("Verificar una condición: if")
    if(10 > 5) {
        println("La condición se cumple")
    } else {
        println("La condición no se cumple")
    }

    println("Realizar una acción entre varias según el valor de una variable: when")
    val user: String = "m_doce"

    when(user) {
        !is String -> println("La variable 'user' no es de tipo String")
        "github" -> println("La variable 'user' almacena la cadena 'github'")
        "m_doce" -> println("La variable 'user' almacena la cadena '$user'")
    }

    println("Repetir instrucciones en bucle una cantidad de veces determinada, o recorrer un array: for")
    for(i in 1..10) {
        println(i)
    }

    val animales = listOf("Gato", "Perro", "Loro", "Tortuga")
    for(animal in animales.indices) {
        println("${animales[animal]} se encuentra en la posición $animal del array")
    }

    println("Repetir instrucciones en bucle una cantidad de veces indeterminada (generalmente indicada por el usuario, o hasta que se cumpla una condición): while")
    var index = 1
    var check = true
    while(index < 10 && check) {
        println(index)
        index++
        if(5 % index == 0) {
            check = false
        }
    }
}

fun dificultadExtra() {
    for(i in 10..55) {
        if(i % 2 == 0) {
            if(i % 3 != 0) {
                if(i != 16) {
                    println(i)
                }
            }
        }
    }
}