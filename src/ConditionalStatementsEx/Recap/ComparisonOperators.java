package ConditionalStatementsEx.Recap;

public class ComparisonOperators {
    public static void main(String[] args) {

        // 1. Оператори за сравнение:
        {
            //Равно (==): Проверява дали стойностите на две числа са равни.
            //Неравно (!=): Проверява дали стойностите на две числа не са равни.
            //По-голямо от (>): Проверява дали първата стойност е по-голяма от втората.
            //По-малко от (<): Проверява дали първата стойност е по-малка от втората.
            //По-голямо или равно (>=): Проверява дали първата стойност е по-голяма или равна на втората.
            //По-малко или равно (<=): Проверява дали първата стойност е по-малка или равна на втората.
        }

        // 1.1 Пример
        {
            int a = 5;
            int b = 10;
            boolean result1 = a == b;  // false
            boolean result2 = a != b;  // true
            boolean result3 = a > b;   // false
            boolean result4 = a < b;   // true
            boolean result5 = a >= b;  // false
            boolean result6 = a <= b;  // true

            System.out.println(result1);
            System.out.println(a < b);
        }

        // 1.2 Пример
        {
            //За сравнение на стойностите на два String-а НЕ използваме оператора за сравнение (==)!!!
            //Сравняваме два String-a с метода .equals();

            String myName = "Ivan";
            String anotherName = "Ivan";

            boolean result7 = myName.equals(anotherName);
            System.out.println(result7); // true
        }
    }
}
