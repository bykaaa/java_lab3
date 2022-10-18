public class Student implements Human{
    public void showAge(int x) {
        System.out.println(x);
    }
    public void showEducation(String s) {
        System.out.println(s);
    }
    public void showGroup(String n) {
        System.out.println(n);
    }
    public void showUniversity(String u){
        System.out.println(u);
    }
    public void showInfo(int x, String s,String n, String u){
        showAge(x);
        showEducation(s);
        showGroup(n);
        showUniversity(u);
    }
}
