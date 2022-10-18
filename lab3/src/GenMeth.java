public class GenMeth {

    public static <T> void printT(T[] items){
        for (T item: items){
            System.out.print(item + " ");
        }
    }

    public static void main (String args[]){
        Generic <String> GenClass1 = new Generic<String>("lr_3");
        String a = GenClass1.getId();
        System.out.println(a);

        Generic <Integer> GenClass2 = new Generic<Integer>(1);
        Integer b = GenClass2.getId();
        System.out.println(b);

        GenMeth gm = new GenMeth();
        String[] chars = {"K","E","K","LoL"};
        Integer[] numbs = {228,22};
        gm.printT(chars);
        gm.printT(numbs);
    }
}
