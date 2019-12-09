package com.company.kotlin

import com.company.Algoritmo

abstract class Avion {
    private var miAlgoritmo: Algoritmo? = null

    fun setAlgoritmo(a: Algoritmo) {
        this.miAlgoritmo = a
    }

    fun mover() {
        this.miAlgoritmo!!.moverse()
    }
}
