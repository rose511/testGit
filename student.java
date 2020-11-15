package Day29;

public class student {

	String name;
	int age;
	String sex;

	public void play() {
		System.out.println(name + "在打球");
	}

	public void show(String name,String sex) {
		System.out.println(name + "的性别是：" + sex);
	}

	public static void main(String[] args) {
		student s1 = new student();
		//s1.name = "rose";
		s1.play();

		s1.show("rose","男");

	}

	private void sex(String string) {
		// TODO Auto-generated method stub

	}
}
