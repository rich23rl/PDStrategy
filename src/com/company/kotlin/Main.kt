package com.company.kotlin

import com.company.AvionComercial
import com.company.AvionRapido
import com.company.EnAire
import com.company.EnAireVeloz
import com.company.EnTierra

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val avionComercial = AvionComercial()
        val avionRapido = AvionRapido()

        println("Primero el avion comercial...")
        avionComercial.setAlgoritmo(EnTierra())
        avionComercial.mover()
        avionComercial.setAlgoritmo(EnAire())
        avionComercial.mover()
        println()

        println("Ahora el avion rapido...")
        avionRapido.setAlgoritmo(EnTierra())
        avionRapido.mover()
        avionRapido.setAlgoritmo(EnAireVeloz())
        avionRapido.mover()
        println()

        println("El avion comercial veloz...")
        avionComercial.setAlgoritmo(EnAireVeloz())
        avionComercial.mover()
    }
}

