package Day29;

public class student {

	String name;
	int age;
	String sex;

	public void play() {
		System.out.println(name + "�ڴ���");
	}

	public void show(String name,String sex) {
		System.out.println(name + "���Ա��ǣ�" + sex);
	}

	public static void main(String[] args) {
		student s1 = new student();
		//s1.name = "rose";
		s1.play();

		s1.show("rose","��");

	}

	private void sex(String string) {
		// TODO Auto-generated method stub

	}
}
