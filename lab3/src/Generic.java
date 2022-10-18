public class Generic <T>{
    private T id;
    Generic(T id){
        this.id = id;
    }
    public T getId(){
        return id;
    }
}
