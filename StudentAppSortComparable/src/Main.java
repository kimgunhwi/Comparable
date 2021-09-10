import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		
		//append student
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1);
		Student s2 = new Student(102, "Choi", 21);
		al.add(s2);
		al.add(new Student(103, "Park", 25));
		
		//additional
		al.add(new Student(104, "Bin", 20));
		al.add(new Student(105, "You", 20));
		al.add(new Student(106, "Cha", 20));
		al.add(new Student(107, "Ha", 22));
		al.add(new Student(108, "Ahn", 25));
		al.add(new Student(109, "Lee", 20));
		al.add(new Student(110, "Seo", 21));
		al.add(new Student(111, "Oh", 22));
		al.add(new Student(112, "Jo", 23));
		
		
		Collections.sort(al);
		System.out.println("Student List (ordered by name)");
		for(Student s : al) {System.out.println(s.toString());}
		System.out.println();
		
		
		System.out.println("Student List (reverse ordered by name)");
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}