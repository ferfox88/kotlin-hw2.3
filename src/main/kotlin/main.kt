fun main() {
    // для ввода
    val lastPrice = 10010
    val newPrice = 156
    val meloman = true

    val discountStart1 = 100000 // в копейках
    val discountStart2 = 1000000 // в копейках
    val lastPrice1 = lastPrice * 100 //перевод в копейки
    val newPrice1 = newPrice * 100 //перевод в копейки
    val discount1 = 10000 // в копейках
    val discount2 = 5 // в %
    val discount3 = 1 // в %
    val totalPrice1 = newPrice1 - discount1
    val totalPrice2 = newPrice1 - (newPrice1 * discount2 / 100)
    val totalPrice3 = totalPrice2 - (totalPrice2 * discount3 / 100)
    println("Покупка - $newPrice руб.")
    if (lastPrice1 > discountStart1 && lastPrice1 <= discountStart2 && newPrice1 >= discount1) {
        println("После применения скидки ($discount1 руб.) - ${totalPrice1/100} руб.")
    } else if (lastPrice1 > discountStart2) {
        println("после применения $discount2% скидки - ${totalPrice2/100} руб. ${totalPrice2%100} коп.")
        if (meloman) {
            println("после применения $discount3% скидки - ${totalPrice3/100} руб. ${totalPrice3%100} коп.")
        }
    }
}