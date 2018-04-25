import java.util.Scanner;

/**
 * Access Levels
 * Modifier     Class      Package  SubClass    World
 *
 * public         Y          Y          Y           Y
 * protected      Y          Y          Y           N
 * no modifier    Y          Y          N           N
 * private        Y          N          N           N
 *
 */


/**
 * Final keyword has a numerous way to use:
 *      A final class cannot be subclasses.
 *      A final mehtod cannot be overriden by subclasses.
 *      A final variable can only be intialized once.
 */

public class Main {


    public static void main(String[] args) {


        String myString = "Hello World";
        int myStringLength = myString.length();
        String myStringinLowerCase = myString.toLowerCase();

        sayHello("John");

       int sum = Add(100,201,99);
       int result = sum * 10;
        System.out.println(result);
        System.out.println(sum);

        System.out.println(myString);
        System.out.println(myStringinLowerCase);
        System.out.println(myStringLength);
        System.out.println(myString.replace('l', 'm' ));
        System.out.println(myString.indexOf('o'));

        myStudent Mark = new myStudent();  //Mark -> Object or Instance
        Mark.setId(1);
        Mark.setName("Mark");
        Mark.setAge(20);
        System.out.println(Mark.getName() + " is " + Mark.getAge() + " years old");

        cube cube1 = new cube();
        System.out.println(cube1.getCubeVolume());

        cube cube2 = new cube(20,20,20);
        System.out.println(cube2.getCubeVolume());

        myStudent Tom = new myStudent();
        myStudent Sarah = new myStudent();

        System.out.println(myStudent.getnumberOfStudents());




    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static int Add(int a, int b, int c) {
        return (a + b + c);
    }



}
