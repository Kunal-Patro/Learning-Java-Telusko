/*
 * Before creating object of class, class is to be loaded into a special memory in JVM called Class Loader Memory.
 * Object is then assigned space into Heap memory leads to creation of object. All non-static members of class is given space under particular object.
 * Static members are given space under Class Loader Memory, hence static members are class specific not object specific. 
 * All the object will have same value for static members.
 * Static members can be accesed through object as well as class name(preferable) itself.
 * To initialize non-static members with default values we can use constructors, but to initialize static members we should use static blocks instead (for performance).
 * We cannot use non-static members in static block, but vice-versa is possible.	
 */
class Emp
{
	int empid;
	double salary;
	static String ceo;
	static				// Static Block, called once when loaded.
	{
		ceo = "Devi Prasad";
	}
	public Emp()			// Called each time when object is created.
	{
		empid = 10000;
	        salary = 25000.0;	
	}

	public void show()
	{
		System.out .println("Emp_ID = " + empid + " : Salary = " + salary + " : CEO is " + ceo);
	}
}
public class Static
{
	public static void main(String[] args) // Main is static here, it doesn't require an object to be called.
	{
		Emp kunal = new Emp();
		Emp moomal = new Emp();
		kunal.empid = 10002;
		kunal.salary = 30000.0;
		moomal.empid = 10001;
		moomal.salary = 40000.0;
		Emp.ceo = "Baba";

		kunal.show();
		moomal.show();
	}

}
