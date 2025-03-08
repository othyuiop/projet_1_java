public class Car {
 private String model ;
 private int year ;

 public Car () {
 this . model = " Unknown ";
 this . year = 2020;
 }
 public String getModel () { return model ; }
 public int getYear () { return year ; }

 public void displayDetails () {
 System . out . println (" Model : " + getModel () ) ;
 System . out . println (" Year : " + getYear () ) ;
 }
 }
