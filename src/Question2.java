
public class Question2 {
	public void studentID(int id) {
		System.out.println(id);
		}
	public void studentName(String Name, int mark1, int mark2,int mark3, int mark4, int mark5) {
		System.out.println(Name);
		System.out.println(mark1);
		System.out.println(mark2);
		System.out.println(mark3);
		System.out.println(mark4);
		System.out.println(mark5);
	
	}

	public static void main(String[] args) {
		Question2 q =new Question2();
		q.studentID(123);
		q.studentName("Swe", 45, 56, 64, 75, 57);
	}
}
