/*
 * int, float, double etc. are primitive data type but according to OOP all the things should be an object or classes.
 * Java provides some Wrapper classes for primitive data types which work same as the datatypes but are classes.
 * Integer, Float, Double, Boolean etc. are some of wrapper classes. These classes include some functions also to have greater power.
 * The process of mapping primitive datatype variable to their respective wapper class object is called boxing or wrapping and vice-versa is called unboxing or unwrapping.
 * If the boxing or unboxing process is done automatically without using constructor externally then this process is called autoboxing or auto-unboxing.
 */
public class Wrapper
{
        public static void main(String[] args)
        {
                int i = 30;
                Integer ii = new Integer(5); // deprecated
                Integer iii = new Integer(i); // deprecated
                Integer iiii = i;

                int j = iii.intValue();
                int k = iii;

                String str = "123";
                int value = Integer.parseInt(str); // static method, used to parse as int       
		System.out.println(value);
        }
}

