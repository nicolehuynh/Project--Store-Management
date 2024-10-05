public class Nike extends Shoes {

  // instance variables
  private String material;

  // default values
  public Nike() {
    super();
    this.material = "unknown";
  }

  public Nike (String name, int size, String material) {
    super(name, size);
    this.material = material;
  }

  // get
  public String getMaterial() {
    return material;
  }

  // set
  public void setMaterial(String newMaterial){
    this.material = newMaterial;
  }

  // toString
  public String toString() {
    return super.toString() + ", Brand = Nike, Material = " + material;
  }
  

} //end