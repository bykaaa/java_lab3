import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Map_set_list {
    public static String getCharForNumber(int i) {//функция чтобы найти букву по номеру
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
    public static void main(String[] args) {

        //Map
        HashMap<Integer, String> numAndLetter = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            numAndLetter.put(i, getCharForNumber(i));//заполнение
        }
        //Set
        HashSet<Integer> numbs = new HashSet<Integer>(numAndLetter.keySet());//создание сета и одновременно выборка данных из мапы
        System.out.println(numbs);

        //List
        ArrayList<String> letters = new ArrayList<>(numAndLetter.values());//создание листа и одновременно выборка данных из мапы
        System.out.println(letters);

        System.out.println("Размер мапы = " + numAndLetter.size());
        numAndLetter.clear();
        System.out.println("Пусто = "+numAndLetter.isEmpty());

        for (Integer i = 6; i < 8; i++) {
            numbs.add(i);//добавление
        }
        System.out.println(numbs);
        for (Integer i = 1; i <= 5; i++) {
            numbs.remove(i);//удаление
        }
        System.out.println(numbs);
        if (numbs.add(8)){//попытка добавить число, которое уже есть
            System.out.println("Добавление.");
        }else{
            System.out.println("Такое число уже есть.");
        }


        int lSize = letters.size();//размер листа
        System.out.println("Размер списка = "+lSize);
        for (Integer i=1; i<3; i++){
            letters.remove(getCharForNumber(i));//удаление элементов
            letters.add(getCharForNumber(i));//добавление элементов
        }
        System.out.println(letters);
    }
}
