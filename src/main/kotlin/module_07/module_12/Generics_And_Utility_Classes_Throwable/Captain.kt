package module_07.module_12.Generics_And_Utility_Classes_Throwable

//  Классы для воинов, наследуемых от AbstractWarrior
class Captain (
    override val title: String = "Капитан",
    override val maxHealth: Int = 15000,
    override val weapon: AbstractWeapon = Weapons.createRifle(),
    override var currentHealth: Int = 10000,
    override val isKilled: Int = 60,
    override val evasion: Int = 60
): module_07.module_12.Generics_And_Utility_Classes_Throwable.AbstractWarrior()