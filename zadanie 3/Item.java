public class Item {
    private int id;
    private String nazwa;
    public Item(int id, String nazwa){
        this.id = id;
        this.nazwa = nazwa;
    }

    public void show(){
        System.out.println(nazwa);
    }
    public String toString(){
        return "ID: " + id + ", nazwa: " + nazwa;
    }

    public int getId(){
        return id;
    }

    public String getNazwa(){
        return nazwa;
    }
}