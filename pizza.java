/*
 * all the code for what pizza you want 
 */
public class pizza {


 private String kind;
 private double price;
  

public pizza(){
  this("cheese", 10.99);
}

public pizza(String kind, double price){
  this.kind = kind;
    this.price = price;
}

   public void printDessertInfo() {
    System.out.println("kind: " + kind);
    System.out.println("Price: " + price);
  }

public String getkind(){
  return kind;
}


  public double getPrice(){
    return price;
  }

public void setkind(String newkind){
  kind = newkind;
}

public void setPrice(double newPrice){
  price = newPrice;
}

public String toString(){
  return "kind: " + kind +  "\nPrice: " + price;

}







  
}