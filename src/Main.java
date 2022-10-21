public class Main {
    public static void main(String[] args) {
        //Задача 1
        int monthNum = 2; //номер месяца
        String monthName = task1(monthNum); //имя месяца
        System.out.println("Задача 1: Название " + monthNum + " месяца - " + monthName);

        //Задача 2
        int mass[] = {5, 6, 1243, 9, 3, 453};
        int mValue = 1243; //искомое значение
        int mIndex = task2(mass, mValue);
        System.out.println("Задача 2: Индекс значения " + mValue + " в массиве - " + mIndex);

        //Задача 3
        String startWord = "HELLO";
        String backWord = task3(startWord); //слово наоборот
        System.out.println("Задача 3: Слово " + startWord + " перевернутое - " + backWord);

        //Задача 4
        int decNumber = 12349; //десятичное число
        String hexNumber = task4(decNumber);
        System.out.println("Задача 4: Десятичная цифра " + decNumber + " в шестнадцетиричном - " + hexNumber);

        //Задача 5
        int bubbledMass[] = task5(mass);
        System.out.print("Задача 5: Отсортированный массив: ");
        //вывод массива
        for (int i = 0; i < bubbledMass.length; i++) {
            System.out.print(bubbledMass[i] + ";");
        }
    }

    //Задача 1
    public static String task1(int monthNum) {
        String monthName;
        switch (monthNum) {
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            case 4:
                monthName = "Апрель";
                break;
            case 5:
                monthName = "Май";
                break;
            case 6:
                monthName = "Июнь";
                break;
            case 7:
                monthName = "Июль";
                break;
            case 8:
                monthName = "Август";
                break;
            case 9:
                monthName = "Сентябрь";
                break;
            case 10:
                monthName = "Октябрь";
                break;
            case 11:
                monthName = "Ноябрь";
                break;
            case 12:
                monthName = "Декабрь";
                break;
            default:
                monthName = "Введен не существующий номер месяца";
                break;
        }
        return monthName;
    }

    //Задача 2
    public static int task2(int[] mass, int mValue) {
        int mIndex = -1;
        //сверяем значенеи массива с искомым значение и выводим его индекс (i)
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == mValue) {
                mIndex = i;
                break;
            }
        }
        return mIndex;
    }

    //Задача 3
    public static String task3(String startWord) {
        String backWord = "";
        //проходимся по буквам с конца слова до его начала и записываем в новую переменную
        for (int i = startWord.length() - 1; i >= 0; i--) {
            backWord += startWord.charAt(i);
        }
        return backWord;
    }

    //Задача 4
    public static String task4(int decNumber) {
        String hexNumber = "";
        int modFromDecNumber = 0;
        //берем отстатки от деления на 16 и записываем их задом наперед
        do {
            //остаток от деления на 16
            modFromDecNumber = decNumber % 16;
            //записываем остаток в переменную, но предварительно преобразовываем через case
            hexNumber = hexNumber + hexNum(modFromDecNumber);
            //убираем целое
            decNumber = decNumber / 16;
        } while (decNumber != 0); //делаем так пока целое не равно 0
        //переворачивам как в задании 3
        hexNumber = task3(hexNumber);
        return hexNumber;
    }

    //преобразоывываем остаток в 16 значение
    public static String hexNum(int decNum) {
        String hexNum = "";
        switch (decNum) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                hexNum = String.valueOf(decNum);
                break;
            case 10:
                hexNum = "A";
                break;
            case 11:
                hexNum = "B";
                break;
            case 12:
                hexNum = "C";
                break;
            case 13:
                hexNum = "D";
                break;
            case 14:
                hexNum = "E";
                break;
            case 15:
                hexNum = "F";
                break;
            default:
                hexNum = "Передано что-то не то";
                break;
        }
        return hexNum;
    }

    //Задача 5
    public static int[] task5(int[] mass) {
        int bubbledMass[] = mass;
        int buf;
        for (int i = 0; i < bubbledMass.length; i++) {
            for (int j = 0; j < bubbledMass.length; j++) {
                if (bubbledMass[i] < bubbledMass[j]) {
                    buf = bubbledMass[i];
                    bubbledMass[i] = bubbledMass[j];
                    bubbledMass[j] = buf;
                }
            }
        }
        return bubbledMass;
    }

}