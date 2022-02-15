/*
 * Now we can define methods in interface but to call them we require object, as object of interface is not allowed so it need to be implemented by a concrete class and the object of that class can call that method.
 * As static methods are property of class itself and they doesn't require any objects to be called.
 * Interfaces can have static methods also.
 * Interfaces can have variables(final) also but they will constants. 
 */
interface A
{
        int a = 10;
        static void show()
        {
                System.out.println("in static show");
        }
        void display();
}
class AImpl implements A
{
        public void display()
        {
                System.out.println("Variable from parent " + a);
        }
}
public class StaticInterface
{
        public static void main(String[] args)
        {
                A obj = new AImpl();
                obj.display();
                A.show();
        }
}

