/* In Java 8, a new notion called functional interfaces was introduced.
A Functional Interface is an interface that has exactly one abstract method.
To designate an interface as a Functional Interface,
we don’t need to use the @FunctionalInterface annotation.
The @FunctionalInterface annotation prevents abstract methods from being accidentally
added to functional interfaces. It’s similar to a @Override annotation,
and it’s recommended that you use it. java.lang. Runnable is a fantastic example of
a functional interface since it has one abstract method, run ().
One of the most appealing features of the functional interface is
creating objects using lambda expressions. We can create an interface using an anonymous class
 */
package Functionalinterface;

public class Main {
    public static void main(String[] args) {

    }
    @FunctionalInterface
    public interface FunctionalInterface_one
    {
        public void firstInt_method();
        @Override
        public String toString(); //Overridden from Object class
        @Override
        public boolean equals(Object obj); //Overridden from Object class
    }
}
