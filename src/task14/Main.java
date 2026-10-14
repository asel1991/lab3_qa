package task14;

public class Main {
    public static void main(String[] args) {
        Display d = new Display();

        System.out.print("show(5)    -> ");
        d.show(5);
        // prediction: int      | result: int (exact match)

        System.out.print("show(5.0)  -> ");
        d.show(5.0);
        // prediction: double   | result: double (exact match)

        System.out.print("show('A')  -> ");
        d.show('A');
        // prediction: int      | result: int (char has no own method, so it widens to int, 'A' = 65)

        System.out.print("show(\"A\")  -> ");
        d.show("A");
        // prediction: String   | result: String (exact match)

        System.out.print("show(5L)   -> ");
        d.show(5L);
        // prediction: double   | result: double (long can not go to int without cast,
        //                                         but it can widen to double)
    }
}
