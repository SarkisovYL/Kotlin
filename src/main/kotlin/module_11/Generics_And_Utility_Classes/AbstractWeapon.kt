package module_11.Generics_And_Utility_Classes

//  Абстрактный класс оружия
abstract class AbstractWeapon {
    abstract val maxRounds : Int                // Максимальное количество патронов в магазине
    abstract val fireType: FireType             // Вид стрельбы (FireType)
    abstract val ammoMagazine: Stack<Ammo>      // Магазин патронов. При создании оружия магазин пуст
    abstract var roundsInMagazine : Boolean     // Факт наличия патронов в магазине
    abstract var name : String                  // Наименование оружия

    abstract fun createAmmo(): Ammo             // Создание патрона необходимого типа

    // Перезарядка — создаётся новый магазин и заполняется патронами с помощью функции создания патрона
    open fun reloading(): Stack<Ammo> {
        println("ПЕРЕЗАРЯДКА")
        repeat(maxRounds) {ammoMagazine.push(createAmmo())}
        roundsInMagazine = true
        println("Патронов в магазине ${ammoMagazine.count()}")
        return ammoMagazine
    }
    // Получение патронов для выстрела одиночным или очередью.
    fun getCartridge(ft: FireType) = when (ft) {
//      Если патроны закончились, перезарядить и продолжить стрельбу.
        is FireType.SingleShot -> ammoMagazine.pop() ?: reloading()
        is FireType.FiringBursts -> repeat(ft.sizeQueue) { ammoMagazine.pop() ?: reloading()}
    }
}