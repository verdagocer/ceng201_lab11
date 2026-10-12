package game.inventory;

public class inventory {
    private item[] items;
    private int count;
    public inventory(){
        items=new item[10];
        count=0;
    }
    public void additem(item item1){
        if (count<items.length){
            items[count]=item1;
            count++;
        }
    }
    public void displayall(){
        System.out.println("===inventory listing===");
        for (int i=0;i<count;i++){
            System.out.println(items[i].getName()+"    / "+ items[i].getGenre() + "    / stock: " + items[i].getStockcount());
        }
    }
}
