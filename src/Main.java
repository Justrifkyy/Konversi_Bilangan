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
            scanner.nextLine();

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

    // =====================================
    // Decimal Converter
    // =====================================
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
            scanner.nextLine();

            if (input == 4) return;

            System.out.print("Enter Decimal Number: ");
            int decimal = scanner.nextInt();

            switch (input) {
                case 1 -> System.out.println("Binary: " + decimalToBinary(decimal));
                case 2 -> System.out.println("Octal: " + decimalToOctal(decimal));
                case 3 -> System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
                default -> System.out.println("Invalid choice!");
            }
        } while (input != 4);
    }

    private static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    private static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        return octal.toString();
    }

    private static String decimalToHexadecimal(int decimal) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (decimal > 0) {
            hex.insert(0, hexChars[decimal % 16]);
            decimal /= 16;
        }
        return hex.toString();
    }

    // =====================================
    // Binary Converter
    // =====================================
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
            String binary = scanner.nextLine();

            if (!binary.matches("[01]+")) {
                System.out.println("Error: Invalid binary number! Please enter only 0s and 1s.");
                continue;
            }

            int decimal = binaryToDecimal(binary);

            switch (input) {
                case 1 -> System.out.println("Decimal: " + decimal);
                case 2 -> System.out.println("Octal: " + decimalToOctal(decimal));
                case 3 -> System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
                default -> System.out.println("Invalid choice!");
            }
        } while (input != 4);
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * Math.pow(2, power++);
        }
        return decimal;
    }

    // =====================================
    // Octal Converter
    // =====================================
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

            int decimal = octalToDecimal(octal);

            switch (input) {
                case 1 -> System.out.println("Decimal: " + decimal);
                case 2 -> System.out.println("Binary: " + decimalToBinary(decimal));
                case 3 -> System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
                default -> System.out.println("Invalid choice!");
            }
        } while (input != 4);
    }

    private static int octalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * Math.pow(8, power++);
        }
        return decimal;
    }

    // =====================================
    // Hexadecimal Converter
    // =====================================
    private static void hexadecimalMenu() {
        // Sama seperti menu lain, ubah hexadecimal ke decimal secara manual
    }
}