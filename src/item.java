package game.inventory;

public class item {
    private String name;
    private String genre;
    private int stockcount;
    private String serialcode;
    public item(String name,String genre,int stockcount,String serialcode){
        this.name=name;
        this genre=genre;
        this.stockcount=stockcount;
        this.serialcode=serialcode;
    }
    public String getName(){
        return name;
    }
    public String getGenre() {
        return genre;
    }
    public int getStockcount() {
        return stockcount;
    }
    public String getSerialcode() {
        return serialcode;
    }
    private boolean isavailable(int quantity){
        return stockcount>=quantity;
    }
    public void sell(int quantity){
        if (isavailable(quantity)) {
            stockcount-=quantity;
            System.out.println(
                    "sold" + quantity+ " copy/copies of " + name + ".remaining stock: " + stockcount);
        }else {
            System.out.println("warning!not enough stock for" + name +
                    ". requested: " + quantity + ",avaliable: " + stockcount);
        }
    }
}
