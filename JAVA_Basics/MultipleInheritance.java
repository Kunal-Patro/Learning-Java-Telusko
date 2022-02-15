/*
 * As multiple inheritance is not directly allowed, but through interface we can achieve it.
 * As using "default" keyword we can define methods in interface, so there may be chances of ambiguity.
 * Ambiguity in this can can be solved by:
 * 1. Overriding the ambigous methods in child class.
 * 2. Using <ParentInterfaceName>.super.<AmbigousMethod>() to specify which to use in child as overriding it. 
 */
interface A
{
        default void show()
        {
                System.out.println("in A show");
        }
}
interface B
{
        default void show()
        {
                System.out.println("in B show");
        }
}
class Z implements A, B // Multiple Inheritance
{
        public void show()
        {
                B.super.show(); // Ambiguity Resolution
        }
}
public class MultipleInheritance
{
        public static void main(String[] ags)
        {
                B obj = new Z();
                obj.show();
        }
}

