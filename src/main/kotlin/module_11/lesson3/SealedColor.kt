package module_11.lesson3

sealed class SealedColor(val nex: String) {
//    ������ ���������� ������ ���� ����������� � ���� �����-������, ������� enum,
//    ������ � ������� ����� ������ ����� ��� ��� �� �����������, �� ������ ��� ��� ����������.
//    ������� � ������ kotlin 1.5 ����������� ����� ����������� � ���� �� ����� ��� � ������.
//    ������������ �������������� ������ ����� ��������� object ������� ��� ������ ������.
//    �������� ���������� �������������� ������.
//    TODO ���� ������ sealed ������ ������ c ������� object, �� ��� ������ �������� ������������
//     � ����� ������� ����� ������������ � ������������ ����������. ���� ������ � ������� ������ -
//     �� ����� �������� ����� ���� ��������� � � ���� ������������ �������� sealed �������.
//     � ������� �� ������������, �������� sealed ������ ����� ������� ���������
    object While : SealedColor("FFF")
    object Black : SealedColor("000")
    object Red : SealedColor("F00")
    object Green : SealedColor("0F0")
    object Blue : SealedColor("00F")

//    �������� ������� � ���� ������
    class CustomColor(nex: String) : SealedColor(nex)
}
