public class Adidas extends Shoes {

// instance variables
  private String model;

// default values
  public Adidas(){
    super();
    this.model = "unknown";
  }

// constructors
  public Adidas(String name, int size, String model){
    super(name, size);
    this.model = model;
  }

// get
  public String getModel(){
    return model;
  }

// set
  public void setModel(String newModel){
    this.model = newModel;
  }

  public String toString(){
    return super.toString() + ", Brand = Adidas, Model = " + model;
  }

} //end