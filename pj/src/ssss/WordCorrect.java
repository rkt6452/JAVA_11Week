package ssss;

public class WordCorrect {

	public static void main(String[] args) {

		String inputString = "aadddd";
		if (isUniqueChars(inputString)) {
			System.out.println("���� ���ڰ� �����ϴ�.");
		} else {
			System.out.println("���� ���ڰ� �����մϴ�.");
		}
	}

	static boolean isUniqueChars(String str) {
		// �ڵ� �ۼ�
		// �Ű��������� �迭�� �ް� ����
		// �ݺ������� �迭�� ���̸�ŭ �ݺ��ؼ� ���� ����
		for (int i = 0; i < str.length(); i++) {
			if (i >= str.length() - 1) {
				break;
			}
			// System.out.println("i "+i);
			for (int j = i; j < str.length(); j++) {

				if (j >= str.length() - 1) {
					break;
				}
				String I = str.substring(i, i+1);
				String J = str.substring(j+1, j+2);
				System.out.println("j "+J);
				if (str.substring(i, i+1).equals(J)) {
					System.out.println("i "+I);
				}
				break;
			}
		}
		return true;
	}
}