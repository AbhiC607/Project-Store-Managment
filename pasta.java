public class pasta extends pizza{
/*
 * all the code for what pasta you want 
 */
private String size;
  private boolean cheese;

  public pasta(){
    super();
    size = "medium";
    cheese = true; 
  }

  public pasta(String kind, double price, String size, boolean cheese){
    super(kind, price);
    this.size = size;
      this.cheese = cheese;
  }

  
public String getSize(){
  return size;
}

  public boolean getcheese(){
    return cheese;
  }

public void setcheese(boolean newcheese){
  cheese = newcheese;
}

  public void setSize(String newSize){
  size = newSize;
}


  
  public String toString() {
  return super.toString() + "\nSize: " + size + "\ncheese:" + cheese;
}












  
}