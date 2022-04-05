import com.linkedin.collections.Room;
import org.jetbrains.annotations.NotNull;

import java.util.*;

class Student  {
  private int rollno;
  private String name;
  private String address;

  public static Comparator<Student> CUSTOM_COMPARATOR = Comparator.comparing(Student::getRollno)
		                                               .thenComparing(Student::getName)
		                                                .thenComparing(Student::getAddress);

  public Student(int rollno, String name, String address) {
	this.rollno = rollno;
	this.name = name;
	this.address = address;
  }

  public int getRollno() {
	return rollno;
  }

  public void setRollno(int rollno) {
	this.rollno = rollno;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  @Override
  public String toString() {
	return "Student{" +
			"rollno=" + rollno +
			", name='" + name + '\'' +
			", address='" + address + '\'' +
			'}';
  }

  public String getAddress() {
	return address;
  }

  public void setAddress(String address) {
	this.address = address;
  }

  /**
   * Compares this object with the specified object for order.  Returns a
   * negative integer, zero, or a positive integer as this object is less
   * than, equal to, or greater than the specified object.
   *
   * <p>The implementor must ensure
   * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
   * for all {@code x} and {@code y}.  (This
   * implies that {@code x.compareTo(y)} must throw an exception iff
   * {@code y.compareTo(x)} throws an exception.)
   *
   * <p>The implementor must also ensure that the relation is transitive:
   * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
   * {@code x.compareTo(z) > 0}.
   *
   * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
   * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
   * all {@code z}.
   *
   * <p>It is strongly recommended, but <i>not</i> strictly required that
   * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
   * class that implements the {@code Comparable} interface and violates
   * this condition should clearly indicate this fact.  The recommended
   * language is "Note: this class has a natural ordering that is
   * inconsistent with equals."
   *
   * <p>In the foregoing description, the notation
   * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
   * <i>signum</i> function, which is defined to return one of {@code -1},
   * {@code 0}, or {@code 1} according to whether the value of
   * <i>expression</i> is negative, zero, or positive, respectively.
   *
   * @param o the object to be compared.
   * @return a negative integer, zero, or a positive integer as this object
   * is less than, equal to, or greater than the specified object.
   * @throws NullPointerException if the specified object is null
   * @throws ClassCastException   if the specified object's type prevents it
   *                              from being compared to this object.
   */

//
//  /**
//   * Compares this object with the specified object for order.  Returns a
//   * negative integer, zero, or a positive integer as this object is less
//   * than, equal to, or greater than the specified object.
//   *
//   * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
//   * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
//   * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
//   * <tt>y.compareTo(x)</tt> throws an exception.)
//   *
//   * <p>The implementor must also ensure that the relation is transitive:
//   * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
//   * <tt>x.compareTo(z)&gt;0</tt>.
//   *
//   * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
//   * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
//   * all <tt>z</tt>.
//   *
//   * <p>It is strongly recommended, but <i>not</i> strictly required that
//   * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
//   * class that implements the <tt>Comparable</tt> interface and violates
//   * this condition should clearly indicate this fact.  The recommended
//   * language is "Note: this class has a natural ordering that is
//   * inconsistent with equals."
//   *
//   * <p>In the foregoing description, the notation
//   * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
//   * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
//   * <tt>0</tt>, or <tt>1</tt> according to whether the value of
//   * <i>expression</i> is negative, zero or positive.
//   *
//   * @param o the object to be compared.
//   * @return a negative integer, zero, or a positive integer as this object
//   * is less than, equal to, or greater than the specified object.
//   * @throws NullPointerException if the specified object is null
//   * @throws ClassCastException   if the specified object's type prevents it
//   *                              from being compared to this object.
//   */
//  @Override
//  public int compareTo(@NotNull Student o) {
//    return this.getName().compareTo(o.getName());
//  }
}
public class CompDemo {
  public static void main(String[] args) {
	List<Student> students = new ArrayList<>();
	students.add(new Student(1,"varsha","kolkata"));
	students.add(new Student(1,"Rakesh","ahmedabad"));

	students.add(new Student(3,"harsha","dehradun"));
	students.add(new Student(3,"binny","faridabad"));
	students.add(new Student(3,"alisha","kolkata"));

	students.add(new Student(9,"tim","coimbatore"));
	students.add(new Student(9,"john","chennai"));
	students.add(new Student(5,"maya","pune"));
	students.add(new Student(5,"tina","bangalore"));


	Comparator comparator = new Comparator<Student>(){

//	  /**
//	   * Compares its two arguments for order.  Returns a negative integer,
//	   * zero, or a positive integer as the first argument is less than, equal
//	   * to, or greater than the second.<p>
//	   * <p>
//	   * In the foregoing description, the notation
//	   * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
//	   * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
//	   * <tt>0</tt>, or <tt>1</tt> according to whether the value of
//	   * <i>expression</i> is negative, zero or positive.<p>
//	   * <p>
//	   * The implementor must ensure that <tt>sgn(compare(x, y)) ==
//	   * -sgn(compare(y, x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
//	   * implies that <tt>compare(x, y)</tt> must throw an exception if and only
//	   * if <tt>compare(y, x)</tt> throws an exception.)<p>
//	   * <p>
//	   * The implementor must also ensure that the relation is transitive:
//	   * <tt>((compare(x, y)&gt;0) &amp;&amp; (compare(y, z)&gt;0))</tt> implies
//	   * <tt>compare(x, z)&gt;0</tt>.<p>
//	   * <p>
//	   * Finally, the implementor must ensure that <tt>compare(x, y)==0</tt>
//	   * implies that <tt>sgn(compare(x, z))==sgn(compare(y, z))</tt> for all
//	   * <tt>z</tt>.<p>
//	   * <p>
//	   * It is generally the case, but <i>not</i> strictly required that
//	   * <tt>(compare(x, y)==0) == (x.equals(y))</tt>.  Generally speaking,
//	   * any comparator that violates this condition should clearly indicate
//	   * this fact.  The recommended language is "Note: this comparator
//	   * imposes orderings that are inconsistent with equals."
//	   *
//	   * @param o1 the first object to be compared.
//	   * @param o2 the second object to be compared.
//	   * @return a negative integer, zero, or a positive integer as the
//	   * first argument is less than, equal to, or greater than the
//	   * second.
//	   * @throws NullPointerException if an argument is null and this
//	   *                              comparator does not permit null arguments
//	   * @throws ClassCastException   if the arguments' types prevent them from
//	   *                              being compared by this comparator.
//	   */
	  @Override
	  public int compare(Student o1, Student o2) {
//	    if(o1.getRollno() - o2.getRollno() == 0){
//	      return o1.getName().compareTo(o2.getName());
//		}
//		return o1.getRollno() - o2.getRollno();
//	  }

		//a better way to write above
		// in this we are trying to do numeric sorting based on roll number
		//tp break the tie i.e. when eq to 0, we are comapring with name
		int result = o1.getRollno() - o2.getRollno();
		return result != 0 ? result : o1.getName().compareTo(o2.getName());

	  }
	};

	//either u pass the comparator here
	//Collections.sort(students,comparator);

	//or u implement comparable interfcae & override the compare To method
	//Collections.sort(students);

	//or u declare static comparator
	students.sort(Student.CUSTOM_COMPARATOR);

	for(Student student : students) {
	  System.out.println(student);
	}


  }
}
