package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int i = dividend / divider;
            System.out.println(i * divider == dividend ? "can be divided completely" : "cannot be divided completely");
        }catch (ArithmeticException e){
            System.out.println( "division by zero");
        }
    }
}
