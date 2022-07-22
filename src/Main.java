import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String h1 = sc.nextLine();
        String[] words = h1.split(" ");
        int check = 0;
        int var1 = 0;
        int var2 = 0;
        int result = 0;
        int check1 = 0;
        int check2 = 0;
        StringBuilder finalresult = new StringBuilder();
        String[] massive = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        if (words.length != 3) {
            throw new Exception("Invalid value of a mathematical operation");
        }

        try {
            var1 = Integer.parseInt(words[0]);
        } catch (NumberFormatException e) {
            check++;
        }
        try {
            var2 = Integer.parseInt(words[2]);
        } catch (NumberFormatException e) {
            check++;
        }

        if (check == 0) {
            if (var1 > 10 || var1 < 1 || var2 > 10 || var2 < 1){
                throw new Exception("The number too large or too small");       //added check
            }
            switch (words[1]) {
                case "+" -> System.out.println(var1 + var2);
                case "-" -> System.out.println(var1 - var2);
                case "*" -> System.out.println(var1 * var2);
                case "/" -> System.out.println(var1 / var2);
            }
        } else if (check == 1) {
            throw new Exception("Different data type");
        } else if (check == 2) {
            for (String number1 : massive) {
                if (words[0].equals(number1)) {
                    check1++;
                }
            }

            for (String number2 : massive) {
                if (words[2].equals(number2)) {
                    check2++;
                }
            }
            if (check1 != 1 || check2 != 1) {
                throw new Exception("Invalid value");
            }

            var1 = words[0].replace("X", "VV").replace("IV", "IIII").replace("V", "IIIII").length();
            var2 = words[2].replace("X", "VV").replace("IV", "IIII").replace("V", "IIIII").length();
            switch (words[1]) {
                case "+" -> result = var1 + var2;
                case "-" -> result = var1 - var2;
                case "*" -> result = var1 * var2;
                case "/" -> result = var1 / var2;
            }
            if (result <= 0) {                                          // added "<"
                throw new Exception("Negative number or result = 0");   // added "... or result = 0"
            }
            while (result != 0) {
                while (result >= 100) {
                    finalresult.append("C");
                    result -= 100;
                }
                while (result >= 90) {
                    finalresult.append("XC");
                    result -= 90;
                }
                while (result >= 50) {
                    finalresult.append("L");
                    result -= 50;
                }
                while (result >= 40) {
                    finalresult.append("XL");
                    result -= 40;
                }
                while (result >= 10) {
                    finalresult.append("X");
                    result -= 10;
                }
                while (result >= 9) {
                    finalresult.append("IX");
                    result -= 9;
                }
                while (result >= 5) {
                    finalresult.append("V");
                    result -= 5;
                }
                while (result >= 4) {
                    finalresult.append("IV");
                    result -= 4;
                }
                while (result >= 1) {
                    finalresult.append("I");
                    result -= 1;
                }
            }
            System.out.println(finalresult);
        }
    }
    }