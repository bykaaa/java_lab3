public class Main {
    public static void main(String[] args){
        Student st = new Student();
        st.showInfo(22, "Magistracy","ПИМ-22", "RSATU");
        Tractor tr = new Tractor();
        System.out.print("Red ");
        tr.showName();
        tr.makeSound();
        tr.responsible();

        Reflect.dumpEverything(tr.getClass().getName());
        Reflect.dumpEverything(tr.getClass().getSuperclass().getName());
    }
}