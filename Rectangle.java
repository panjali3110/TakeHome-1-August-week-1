class Rectangle{
  public double length;
  public double breadth;

  public Rectangle(double length, double breadth){
    this.length=length;
    this.breadth=breadth;
  }
  public double getLength(){
    return length;
  }
  public double getBreadth(){
    return breadth;
  }
  public String toString(){
    return String.format("[ Length : %.1f Units, Breadth : %.1f Units ]", length, breadth);
  }
  public double calculateArea(){
    return length*breadth;
  }
 }