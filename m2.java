public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe1");
        int number = input.nextInt();

        System.out.println("Podaj liczbe2");
        int number2 = input.nextInt();

        System.out.println("Podaj liczbe3");
        int number3 = input.nextInt();


            int maximum = Math.max(Math.max(number2, number3), number);
        int minimum = Math.min(Math.min(number2, number3), number);
        System.out.println("Podaj liczbe najmniejsza:" + minimum + "Podaj liczbe najwieksza:" + maximum);
            }
        }
