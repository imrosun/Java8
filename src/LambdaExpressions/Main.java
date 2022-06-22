/*An anonymous function may be defined as a Lambda Expression (or function)
(a function with no name and an identifier). Lambda Expressions are defined precisely
where they are required, often as a parameter to another function.
*/  /* Lambda expression is an anonymous function(a function without a name)
that helps in writing code in a certain functional style.
Single Abstract Method (SAM) can be implemented in a clear and concise way by using an expression.
Since data can be iterated, filtered and extracted, it is very helpful,
especially in the collection library. Lambda expression also helps in reducing the complexity of code.
 */

package LambdaExpressions;

public class Main {
        public static void main(String[] args) {
            MyInterface obj = (int x, int y) -> System.out.println(x + y);
            System.out.print("The result = ");
            obj.abstract_func(5, 5);
            obj.default_Fun();

            subMain1 list1 = (int a,int b, int c) -> System.out.println(a+b+c);
            list1.abstract_fun(10,20,30);
        }

    interface subMain1{
            void abstract_fun (int a,int b,int c);
    }
}

