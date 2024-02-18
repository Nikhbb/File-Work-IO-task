import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть назву файла: ");
        Helper.BASE_URL = "files/" + sc.next() + ".txt";

        printMenu();
        int userNumber = sc.nextInt();

        switch (userNumber){
            case 1:
                System.out.print("Введіть текст: ");
                new FileWriteService().writeToFile(Helper.BASE_URL, sc.next());
                break;
            case 2:
                System.out.println("\n>> Вміст файлу " + Helper.BASE_URL);
                new FileReadService().readFromFile(Helper.BASE_URL);
                break;
            default:
                System.out.println("Спробуйте ще раз...");
        }
    }

    private static void printMenu(){
        System.out.println("МЕНЮ");
        System.out.println("1 - створити та записати;");
        System.out.println("2 - читати.");
        System.out.print("Ваш вибір: ");
    }

}
