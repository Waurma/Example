import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h1 = sc.nextLine();
        String[] words = h1.split(" ");
        int check = 0;
        int var1 = 0;
        int var2 = 0;
        int result = 0;
        StringBuilder finalresult = new StringBuilder();
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
            switch (words[1]) {
                case "+" -> System.out.println(var1 + var2);
                case "-" -> System.out.println(var1 - var2);
                case "*" -> System.out.println(var1 * var2);
                case "/" -> System.out.println(var1 / var2);
            }
        } else if (check == 1) {
            System.out.println("Different data type");
        } else {
            var1 = words[0].replace("X", "VV").replace("IV", "IIII").replace("V", "IIIII").length();
            var2 = words[2].replace("X", "VV").replace("IV", "IIII").replace("V", "IIIII").length();
            switch (words[1]) {
                case "+" :
                    result = var1 + var2;
                case "-" :
                    try {

                        System.out.println("Negative number");
                        break;
                    }
                    System.out.println(var1 - var2);
                    break;
                case "*" :
                    result = var1 * var2;
                case "/" :
                    result = var1 / var2;
            }
            while (result != 0){
                while (result >= 100){
                    finalresult.append("C");
                    result -= 100;
                }
                while (result >= 90){
                    finalresult.append("XC");
                    result -= 90;
                }
                while (result >= 50){
                    finalresult.append("L");
                    result -= 50;
                }
                while (result >= 40){
                    finalresult.append("XL");
                    result -= 40;
                }
                while (result >= 10){
                    finalresult.append("X");
                    result -= 10;
                }
                while (result >= 9){
                    finalresult.append("IX");
                    result -= 9;
                }
                while (result >= 5){
                    finalresult.append("V");
                    result -= 5;
                }
                while (result >= 4){
                    finalresult.append("IV");
                    result -= 4;
                }
                while (result >= 1){
                    finalresult.append("I");
                    result -= 1;
                }
            }
        }
        System.out.println(finalresult);
    }
}
        /*String num1 = words[0];
        char [] charArray = num1.toCharArray(); //Взяли число и разбили по символам
        int lennum1 = num1.length();

        String num2 = words[2];
        char [] charArray1 = num2.toCharArray(); //Взяли число и разбили по символам XCIV
        int lennum2 = num2.length();

        for (int z = 0; lennum1 > z; z++){
            if
        }
        for (char element: charArray){
            switch (element){
                case 'I':
                    chislo++;
                    break;
                case ' ':
            }
        }

        switch (words[1]){
            case "+" :
                System.out.println(words[0] + words[2]);
                break;
            case "-" :
                System.out.println(words[0] - words[2]);
                break;
            case "*" :
                System.out.println(words[0] * words[2]);
                break;
            case "/" :
                System.out.println(words[0] / words[2]);
                break;*/
