package module_07.module_12.Generics_And_Utility_Classes_Throwable

//  интерфейс воин (Warrior)
interface Warrior {
    val isKilled: Int           // Точность, вероятность попадания максимально 100
    val evasion: Int            // Уклонение, шанс избежать попадания максимально 100
    fun attack(enemy: Warrior)  // Атаковать — на вход принимает противника (Warrior)
    fun setLoss(loss: Int)      // Получить урон — на вход принимает количество урона
}