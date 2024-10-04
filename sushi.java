public class sushi extends pizza{

/*
 * all the code for what sushi you want 
 */
private String fish;
  private int pieces;

   public sushi(){
    super();
    fish = "tuna";
    pieces= 3;
  }

  public sushi(String flavor, double price, String fish, int pieces){
    super(flavor, price);
    this.fish = fish;
      this.pieces= pieces;
  }

public String getfish(){
  return fish;
}

  public int getpieces(){
    return pieces;
  }

public void setfish(String newfish){
  fish = newfish;
}

  public void setpieces(int newpieces){
  pieces= newpieces;
}


  
  public String toString() {
  return super.toString() + "\nfish: " + fish + "\npieces:" + pieces;
  }














  
}