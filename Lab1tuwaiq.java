import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {


        //1
//        Scanner s= new Scanner(System.in);
//        try {
//            System.out.print("Enter the first number: ");
//            double num1 = s.nextDouble();
//
//            System.out.print("Enter the second number: ");
//            double num2 = s.nextDouble();
//
//            double sum = num1 + num2;
//            double multi = num1 * num2;
//            double sub = num1 - num2;
//            double division = num1 / num2;
//            double remainder = num1 % num2; // باقي القسمه
//
//            System.out.println("Sum: " + sum);
//            System.out.println("multi: " + multi);
//            System.out.println("sub: " + sub);
//            System.out.println("Division: " + division);
//            System.out.println("Remainder: " + remainder);
//
//        } catch (InputMismatchException e1) {
//            System.out.println("Invalid input. Please enter a valid number.");
//        } catch (ArithmeticException e2) {
//            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());}}}


        //2
//        Scanner s = new Scanner(System.in);
//        try {
//            System.out.print("Input a number: ");
//            int number = s.nextInt();
//
//            System.out.println("Multiplication table for " + number + ":");
//
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(number + " x " + i + " = " + (number * i)); // يطبع الرقم المدخل مضروب من 1-10
//            }
//        } catch (InputMismatchException e1) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        } catch (NullPointerException e2) {
//            System.out.println("Null pointer exception occurred.");}}}
//


        //3
//        Scanner s= new Scanner(System.in);
//        try {
//            System.out.println("Radius");
//
//            double radius = s.nextDouble(); // نصف قطر الدائره
//            double perimeter = 2 * Math.PI * radius; // mathpi هو الباي,,
//            double area = Math.PI * radius * radius; // المساحه
//
//            System.out.println("Perimeter is = " + perimeter);
//            System.out.println("Area is = " + area);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input for radius. Please enter a valid number.");
//        } catch (Exception e1) {
//            System.out.println("An error occurred: " + e1.getMessage());
//        }
//    }
//}


        //4
//        Scanner s = new Scanner(System.in);
//        try {
//
//            System.out.print("Enter the count of numbers: ");
//            int count = s.nextInt(); // عدد الارقام الي بتكون بالانتيجر
//
//            int sum = 0;
//            for (int i = 0; i < count; i++) { // يزيد الى يوصل للكونت الي دخلناه
//
//                System.out.print("Enter an integer: ");
//                int number = s.nextInt();
//                sum += number;
//            }
//            double average = (double) sum / count; // يحول ال int الى double  من نوع sum , ناتج السم دبل تقسيم عددهم
//            System.out.println("The average is: " + average);
//        } catch (InputMismatchException e) {
//                System.out.println("Invalid input. Please enter valid integers only.");
//            } catch (ArithmeticException e) {
//            System.out.println("Division by zero is not allowed.");
//        }}}


        //5
//        try {
//            performOperations();
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter integers only. " + e.getMessage());
//        }
//    }
//
//    public static void performOperations() throws InputMismatchException {
//        Scanner s = new Scanner(System.in);
//
//        try {
//            System.out.print("Input the first number: ");
//            int firstNum = s.nextInt();
//
//            System.out.print("Input the second number: ");
//            int secondNum = s.nextInt();
//
//            System.out.print("Input the third number: ");
//            int thirdNum = s.nextInt();
//
//            boolean result = (firstNum + secondNum) == thirdNum;
//
//            System.out.println("The result is: " + result);}}}

        //6
//        Scanner s = new Scanner(System.in);
//try {
//        System.out.print("input a word");
//        String inputString = s.nextLine();
//        // عكس النص
//        String reversedString = "";
//        for (int i = inputString.length() - 1; i >= 0; i--) { // طول الكلمه طرح 1 عشان الاندكس يبدا من 0 واكبر من ويساوي 0 عشان اقدر اتقدم في السلسله يتم تقليل قيمه i--
//            reversedString += inputString.charAt(i); // في كل تكرار يتم استخراج الحرف ويتم اضافته في charAt
//        }
//        System.out.println("revers word " + reversedString);
//    }catch (InputMismatchException e1){
//    System.out.println(e1.getMessage());
//}catch (Exception e){
//    System.out.println(e.getMessage());
//}
//    }}


        //7
//        Scanner s = new Scanner(System.in);
//try {
//        System.out.print("Enter a number: ");
//        int number = s.nextInt();
//
//        if (number % 2 == 0) { // اذا باقي قسمه يكون فردي
//            System.out.println(number + " is even.");
//        } else {
//            System.out.println(number + " is odd."); // فردي
//        }
//}catch (InputMismatchException e){
//    System.out.println("just numbers  " +e.getMessage());
//}catch (Exception e1){
//    System.out.println(e1.getMessage());
//}
//    }}


        //8
//        Scanner s = new Scanner(System.in);
//try {
//
//        System.out.print("ادخل درجة الحرارة بالمئوية: ");
//        double celsius = s.nextDouble();
//
//        double fahrenheit = (celsius * 9 / 5) + 32; // تحويل الدرجات المئوية إلى فهرنهايت
//
//        System.out.println(celsius + " درجة مئوية تعادل " + fahrenheit + " درجة فهرنهايت.");
//    }catch (InputMismatchException e){
//    System.out.println("الرجاء ادخال قيمه صحيحه"+ e.getMessage());
//    }
//    }}


        //9
//        Scanner s = new Scanner(System.in);
//
//        try {
//            System.out.print("input a string ");
//            String str = s.nextLine(); // nextLine عشان بعدها اقدر احط كلمتين وروح للرقم
//
//            System.out.print("input a num");
//            int index = s.nextInt();
//
//            char character = str.charAt(index); // يحدد اندكس الرقم يطلع الحرف
//
//            System.out.println("Expected ouput: " + character);
//
//        }catch (StringIndexOutOfBoundsException e1){
//            System.out.println("Error: Index out of bounds. Please make sure the index is within the length of the string." +e1.getMessage());
//        }catch (InputMismatchException e){
//            System.out.println("Error: Invalid input. Please enter a valid number." +e.getMessage());
//        }}}


//        //10
//        Scanner s = new Scanner(System.in);
//try {
//
//        System.out.print("Enter the width ");
//        double width = s.nextDouble();
//
//        System.out.print("Enter the heigh ");
//        double heigh = s.nextDouble();
//
//        double area = width * heigh;
//
//        double perimeter = 2 * (width + heigh);
//
//        System.out.println("Area of the rectangle: " + area);
//        System.out.println("Perimeter of the rectangle: " + perimeter);
//
//    }catch (InputMismatchException){
//    System.out.println("Invalid input: Width and height must be greater than zero.");
//    }}}

        //11
//        Scanner s = new Scanner(System.in);
//try {
//        System.out.print("input first number ");
//        int firstNum = s.nextInt();
//
//        System.out.print("input second number ");
//        int secondNum = s.nextInt();
//
//            if (firstNum != secondNum) {
//                System.out.println(firstNum + " != " + secondNum);
//            } else {
//                System.out.println(firstNum + " == " + secondNum);
//            }
//
//            if (firstNum < secondNum) {
//                System.out.println(firstNum + " < " + secondNum);
//            } else {
//                System.out.println(firstNum + " > " + secondNum);
//            }
//
//            if (firstNum <= secondNum) {
//                System.out.println(firstNum + " <= " + secondNum);
//            } else {
//                System.out.println(firstNum + " >= " + secondNum);
//            }}catch (InputMismatchException){
//    System.out.println("Invalid input. Please enter integer numbers.");}
//    }}


        //12
//        Scanner s = new Scanner(System.in);
//try {
//
//        System.out.print("Enter seconds: ");
//        int totalSeconds = s.nextInt();
//
//        int hours = totalSeconds / 3600;
//
//        int remainingSeconds = totalSeconds % 3600; // الثواني  المتبقيه
//        int minutes = remainingSeconds / 60;
//        int seconds = remainingSeconds % 60;
//
//        System.out.println("Hours: " + hours);
//        System.out.println("Minutes: " + minutes);
//        System.out.println("Seconds: " + seconds);
//    }catch (InputMismatchException){
//    System.out.println("Error: Invalid input. Please enter a valid integer.");
//}}}


        //13

//        Scanner s = new Scanner(System.in);
//try {
//
//        System.out.println("Enter four integers:");
//        int num1 = s.nextInt();
//        int num2 = s.nextInt();
//        int num3 = s.nextInt();
//        int num4 = s.nextInt();
//
//        if (num1 == num2 && num2 == num3 && num3 == num4) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }}catch (InputMismatchException){
//    System.out.println("Invalid input. Please enter four valid integers.");}
//    }}


        //14
//        Scanner s = new Scanner(System.in);
//try {
//
//    System.out.print("Enter an integer: ");
//    int number = s.nextInt();
//
//
//        if (number < 0) {
//            System.out.println("The number is negative.");
//        } else if (number == 0) {
//            System.out.println("The number is zero.");
//        } else {
//            System.out.println("The number is positive.");
//        }
//    }catch (InputMismatchException e1)  //   احط رساله الخطا نوع الخطا // اذا صار خطا بالادخال يروح للكاتش ويطبعه اذا مافي خطا يتعدا
//    {
//        System.out.println(e1.getMessage());
//    } catch (Exception e)
//
//    {
//        System.out.println(e.getMessage()); // بيطبع الكلام الي كتبته بالميثود
//    }}}


        //15
//        Scanner s = new Scanner(System.in);
//
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//
//        System.out.println("Enter numbers (Enter -1 to end):");
//        try {
//            while (true) {
//                int number = s.nextInt();
//
//                if (number == -1) {
//                    break;
//                }
//                if (number > 0) {
//                    positiveCount++;
//                } else if (number < 0) {
//                    negativeCount++;
//                } else {
//                    zeroCount++;
//                }
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input: Please enter valid integers.");
//        }
//        System.out.println("Count of positive numbers: " + positiveCount);
//        System.out.println("Count of zero numbers: " + zeroCount);
//        System.out.println("Count of negative numbers: " + negativeCount);
//
//    }}


        //16
//        Scanner s = new Scanner(System.in);
//try {
//
//    System.out.print("Enter an integer: ");
//    int number = s.nextInt();
//    int reversedNumber = 0; // الي يحتوي على العدد المقلوب
//
//    while (number != 0) {
//        reversedNumber = reversedNumber * 10 + number % 10;// نضربه بعشره عشان لازاحه الارقام الحاليه لليسار,,ويضيف الرقم الاخير للعدد المدخل الذي هو الباقي عند القسمه على 10  يتم حذف الرقم الاخير من العدد المدخل عن طريق القسمه ع 10 تستمر هذذي العمليه لين يصبح العدد المدخل 0,,
//        number /= 10; //بعد مانقسم المدخل على 10 يحذف اخر رقم ويتخزن هنا
//    }
//    System.out.println("Reversed number: " + reversedNumber);
//}catch (InputMismatchException e) {
//    System.out.println("Invalid input: Please enter a valid integer.");
//}}}


        //17
//        Scanner s = new Scanner(System.in);
//
//        int number;
//        int largest = Integer.MIN_VALUE; // حطيت مين عشان بعدين ب أف
//        int smallest = Integer.MAX_VALUE;
//try {
//
//    while (true) {
//        System.out.print("Enter the number (0 to end): ");
//        number = s.nextInt();
//
//        if (number == 0) {
//            break;
//        }
//        if (number > largest) { // اذا الرقم المدخل اكبر من لارجيست الي هو القيمه صغيره فيكون الرقم المدخل يساوي لارجيست
//            largest = number;
//        }
//        if (number < smallest) { // اذا كان الرقم المدخل اصغر من سموليست الي هو قيمته كبيره فيكون الرقم المدخل يساوي اصغر
//            smallest = number;
//        }
//    }
//    System.out.println("The largest number: " + largest);
//    System.out.println("The smallest number: " + smallest);
//}catch (InputMismatchException e) {
//    System.out.println("Invalid input: Please enter valid integers.");
//}catch (IllegalArgumentException e){ // اذا دخل المستخدم رقم سالب
//    System.out.println(e.getMessage());
//}}}


        //18

//        Scanner s = new Scanner(System.in);
//try {
//
//        System.out.print("Enter String: ");
//        String input = s.nextLine();
//
//        int count = 0; // يبدا بعدد صفر عشان الحسبه
//        for (int i = 0; i < input.length(); i++) { // يكرر الحلقه من0وحتى طول السلسه المدخله
//            if (input.charAt(i) == 'a') { // يتحقق اذا اندكس الحرف في السلسله
//                count++; // يتم زياده العداد اذا كان الحرف a
//            }
//        }
//        System.out.println("Number of a's: " + count);
//    }catch (Exception e){
//    System.out.println("An error occurred: " + e.getMessage());
