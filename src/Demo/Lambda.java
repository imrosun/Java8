package Demo;

public class Lambda {
    interface MyInterface {
        void abstract_fun(int x, int y);
        default void default_fun() {
            System.out.println("This is default method ");
        }
    }
    public static void main(String[] args) {
        {
            //lambda expression
            MyInterface obj = (int x, int y) -> System.out.println(x + y);
            System.out.print("The result = ");
            obj.abstract_fun(5, 5);
            obj.default_fun();
        }
    }
}
