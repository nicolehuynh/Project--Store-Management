public class Shoes{
  
  // instance variables
  private String name;
  private int size;

  // constructors
  public Shoes(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public Shoes(){
    this.name = " ";
    this.size = 8;
  }

  // get
  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  // set
  public void setName (String newName) {
      this.name = newName;
    }

  public void setSize (int newSize){
    this.size = newSize;
  }

  public String toString(){
    return "Name: " + name + ", Size: " + size;
  }

} // end of class