import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=====================* Number Converter *=====================");
            System.out.println("1. Decimal Converter");
            System.out.println("2. Binary Converter");
            System.out.println("3. Octal Converter");
            System.out.println("4. Hexadecimal Converter");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Mengatasi newline issue setelah nextInt()

            switch (choice) {
                case 1 -> decimalMenu();
                case 2 -> binaryMenu();
                case 3 -> octalMenu();
                case 4 -> hexadecimalMenu();
                case 5 -> System.out.println("Exiting the program. Thank you!");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    private static void decimalMenu() {
        int input;
        do {
            System.out.println("\n[ Decimal Converter ]");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Decimal to Octal");
            System.out.println("3. Decimal to Hexadecimal");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            input = scanner.nextInt();
            scanner.nextLine(); // Mengatasi newline issue

            if (input == 4) return;

            System.out.print("Enter Decimal Number: ");
            int decimal = scanner.nextInt();

            switch (input) {
                case 1 -> System.out.println("Binary: " + Integer.toBinaryString(decimal));
                case 2 -> System.out.println("Octal: " + Integer.toOctalString(decimal));
                case 3 -> System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                default -> System.out.println("Invalid choice!");
            }
        } while (input != 4);
    }

    private static void binaryMenu() {
        int input;
        do {
            System.out.println("\n[ Binary Converter ]");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Binary to Octal");
            System.out.println("3. Binary to Hexadecimal");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 4) return;

            System.out.print("Enter Binary Number: ");
            String binaryInput = scanner.nextLine();

            if (!binaryInput.matches("[01]+")) {
                System.out.println("Error: Invalid binary number! Please enter only 0s and 1s.");
                continue;
            }

            int decimalValue = Integer.parseInt(binaryInput, 2);

            switch (input) {
                case 1 -> System.out.println("Decimal: " + decimalValue);
                case 2 -> System.out.println("Octal: " + Integer.toOctalString(decimalValue));
                case 3 -> System.out.println("Hexadecimal: " + Integer.toHexString(decimalValue).toUpperCase());
                default -> System.out.println("Invalid choice!");
            }
        } while (input != 4);
    }

    private static void octalMenu() {
        int input;
        do {
            System.out.println("\n[ Octal Converter ]");
            System.out.println("1. Octal to Decimal");
            System.out.println("2. Octal to Binary");
            System.out.println("3. Octal to Hexadecimal");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 4) return;

            System.out.print("Enter Octal Number: ");
            String octal = scanner.nextLine();

            if (!octal.matches("[0-7]+")) {
                System.out.println("Error: Invalid octal number! Please enter only digits 0-7.");
                continue;
            }

            int decimal = Integer.parseInt(octal, 8);

            switch (input) {
                case 1 -> System.out.println("Decimal: " + decimal);
                case 2 -> System.out.println("Binary: " + Integer.toBinaryString(decimal));
                case 3 -> System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                default -> System.out.println("Invalid choice!");
            }
        } while (input != 4);
    }

    private static void hexadecimalMenu() {
        int input;
        do {
            System.out.println("\n[ Hexadecimal Converter ]");
            System.out.println("1. Hexadecimal to Decimal");
            System.out.println("2. Hexadecimal to Binary");
            System.out.println("3. Hexadecimal to Octal");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");

            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 4) return;

            System.out.print("Enter Hexadecimal Number: ");
            String hex = scanner.nextLine();

            if (!hex.matches("[0-9A-Fa-f]+")) {
                System.out.println("Error: Invalid hexadecimal number! Please enter only digits 0-9 and letters A-F.");
                continue;
            }

            int decimal = Integer.parseInt(hex, 16);

            switch (input) {
                case 1 -> System.out.println("Decimal: " + decimal);
                case 2 -> System.out.println("Binary: " + Integer.toBinaryString(decimal));
                case 3 -> System.out.println("Octal: " + Integer.toOctalString(decimal));
                default -> System.out.println("Invalid choice!");
            }
        } while (input != 4);
    }
}
