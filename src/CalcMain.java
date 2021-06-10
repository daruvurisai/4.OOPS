public class CalcMain {
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(4.0);
        calculator.setSecondNumber(3.0);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(3);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());
    }
}
