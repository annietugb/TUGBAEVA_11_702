package ru.itis;

public class Main {

    public static void main(String[] args) {
        Function function = numbers -> {
            int s = 0;
            while(numbers > 0){
                s = s + numbers % 10;
                numbers /= 10;
            }
            return s;
        };

        Predicate predicate = numbers -> {
            if ((numbers % 2) != 0) {
                return true;
            }
            return false;
        };

        IntegersList list = new IntegersList();
        list.add(11);
        list.add(12);
        list.add(43);
        list.add(246);
        list.add(357);
        IntegersList newList2 = list.map(function);
        System.out.println("Исходный массив: ");
        list.printList();
        System.out.println("Преобразованный массив: ");
        newList2.printList();
        IntegersList newList = list.filter(predicate);
        System.out.println("Нечетные числа исходного массива: ");
        newList.printList();

    }
}
