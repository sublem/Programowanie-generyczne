//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
    CustomList<Integer> names = new CustomList<>();
    names.addLast(0);
    names.addFirst(-1);
    names.addLast(1);
    names.addFirst(-2);
    names.addLast(2);
    names.addFirst(-3);
    names.removeLast();
    }
}