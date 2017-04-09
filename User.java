import java.util.ArrayList;

class User{
 private String name;
 private ArrayList<String> borrowedBooks = new ArrayList<String>();
 private static int countBorrowedBooks = 0;
 
 public User(String name){
  this.name = name;
 }
 
 void borrowBook(String title){
  this.countBorrowedBooks++;
 }
 
 void returnBook(){
  this.countBorrowedBooks--;
 }
}
