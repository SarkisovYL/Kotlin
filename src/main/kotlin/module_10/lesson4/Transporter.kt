package module_10.lesson4

abstract class Transporter(
    val maxWeight: Int              // ����������������
) {
    abstract val capacity: Int      // ���������������
    abstract fun move()
}