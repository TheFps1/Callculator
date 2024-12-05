import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            System.out.println(calc(str));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String calc(String str) throws Exception {
        String[] mass = str.split(" ");
        int a = Integer.parseInt(mass[0]);
        int b = Integer.parseInt(mass[2]);
        if(mass.length != 3){
            throw new Exception("Не удовлетворяет условию");
        }
        if(!mass[1].equals("+") && !mass[1].equals("-") && !mass[1].equals("*") && !mass[1].equals("/")){
            throw new Exception("Не является математической операцией");}
        if(!(a >= 1 && a <= 10 && b >= 1 && b <= 10)){
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) и числа от 1 до 10");

        }
        if(mass[1].equals("+")){
            return String.valueOf((a + b));
        }else if(mass[1].equals("-")){
            return String.valueOf((a-b));
        }else if(mass[1].equals("*")){
            return String.valueOf((a*b));
        }else if(mass[1].equals("/")){
            return String.valueOf((a/b));
        }
        return null;
    }
}
