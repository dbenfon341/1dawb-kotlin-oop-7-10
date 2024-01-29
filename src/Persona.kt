/*
Crear también una clase Persona, que se caracteriza por un DNI y una
lista de cuentas bancarias.

La Persona puede tener asociada hasta 3 cuentas bancarias,
y debe tener un método que permita añadir cuentas (hasta 3 el máximo permitido).
Las cuentas se almacenarán en un array/vector. No usar una lista.
*/

class Persona (private var dni: String) {
    val cuentas = arrayOfNulls<Cuenta>(3)

    private var numeroDeCuentas = 0
}