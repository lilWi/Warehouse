public class Product {
    private String name;
    private int id;

    public  Product(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
