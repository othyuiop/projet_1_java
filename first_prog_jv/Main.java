public class Main {
    public static void main ( String [] args ) {
     Point point = new Point () ;
     System . out . println (" Point object created with coordinates : (" + point . getX () + ", " + point . getY () + ")") ;
    

     Student student = new Student () ; 
     System.out.println (" Student object created using the default constructor :") ;
      student.displayDetails () ;

     Car car = new Car () ;
         car . displayDetails () ;

     Employee emp = new Employee (" Alice Smith ", 30 , 50000.0) ;
         emp . displayDetails () ;

     Book original = new Book (" Java Basics ", 300) ;
     Book copy = new Book ( original ) ;
     System . out . print (" Original Book - ") ;
     original . displayDetails () ;
     System . out . print (" Copied Book - ") ;
     copy . displayDetails () ;

}
}