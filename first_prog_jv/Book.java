public class Book {
     private String title ;
     private int pages ;
    
     public Book ( String title , int pages ) {
     this . title = title ;
     this . pages = pages ;
     }
    
     public Book ( Book other ) {
     this . title = other . getTitle () ;
     this . pages = other . getPages () ;
     }
    
     public String getTitle () { return title ; }
     public int getPages () { return pages ; }
    
     public void displayDetails () {
     System . out . println (" Title : " + getTitle () + ", Pages : " +
    
    getPages () ) ;
    
     }
     }