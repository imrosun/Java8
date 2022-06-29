package LambdaExpressions;

public interface MyInterface {
        void abstract_func(int x, int y);
        default void default_Fun() {
            System.out.println("This is default method");
        }
}
