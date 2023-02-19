public class Resolution {
    private String name;

    public Resolution(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "{Resolution} " + this.name;
    }
}
