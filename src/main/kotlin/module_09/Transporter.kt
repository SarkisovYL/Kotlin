package module_09

abstract class Transporter(
    val maxWeight: Int              // ����������������
) {
    abstract val capacity: Int      // ���������������
    abstract fun move()
}