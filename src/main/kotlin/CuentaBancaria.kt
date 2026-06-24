class CuentaBancaria (val titular: String, var saldo: Double, )   {
    fun depositar(monto: Double) {
        saldo += monto
    }

    fun retirar(monto: Double): Boolean {
        if (monto < 0) {
          return false
        }
        if (monto > saldo) {
          return false
        }
        return if (monto <= saldo) {
            saldo -= monto
            true
        } else {
            false
        }
    }
}


