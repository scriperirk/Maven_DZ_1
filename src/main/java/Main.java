public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        //подготовка данных
        long amount = 1000_68;
        boolean registered = true;
        long expected = 30;

        //вызов целевого метода
        long actual = service.calculate(amount,registered);

        boolean passed = expected == actual;

        //вывод результата
        System.out.println(passed);
    }



}
