import java.util.Scanner;
class Publisher 
{
String publisherName;
Publisher(String publisherName) 
{
this.publisherName = publisherName;
}
void displayPublisher()
{
System.out.println("Publisher: " + publisherName);
}
}
class Book extends Publisher 
{
String title, author;
Book(String publisherName, String title, String author) 
{
super(publisherName);
this.title = title;
this.author = author;
}
void displayBook() 
{
displayPublisher();
System.out.println("Title: " + title);
System.out.println("Author: " + author);
}
}
class Literature extends Book 
{
String category;
Literature(String publisherName, String title, String author, String category)
{
super(publisherName, title, author);
this.category = category;
}
void displayDetails() {
System.out.println("\n--- Literature Book Details ---");
displayBook();
System.out.println("category: " + category);
}
}
class Fiction extends Book {
String subcategory;
Fiction(String publisherName, String title, String author, String Category) 
{
super(publisherName, title, author);
this.Category = Category;
}
void displayDetails() {
System.out.println("\n--- Fiction Book Details ---");
displayBook();
System.out.println("Category: " + Category);
}
}
public class BookMenuSimple {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;
do {
System.out.println("\n===== Book Menu =====");
System.out.println("\n 1. Enter Literature Book Details");
System.out.println("2. Enter Fiction Book Details");
System.out.println("3. Exit");
System.out.print("Enter your choice : ");
choice = sc.nextInt();
sc.nextLine(); 
switch (choice) {
case 1:
System.out.print("Enter Publisher: ");
String lp = sc.nextLine();
System.out.print("Enter Title: ");
String lt = sc.nextLine();
System.out.print("Enter Author: ");
String la = sc.nextLine();
System.out.print("Enter Category: ");
String lc = sc.nextLine();
Literature literature = new Literature(lp, lt, la, lc);
literature.displayDetails();
break;
case 2:
System.out.print("Enter Publisher: ");
String fp = sc.nextLine();
System.out.print("Enter Title: ");
String ft = sc.nextLine();
System.out.print("Enter Author: ");
String fa = sc.nextLine();
System.out.print("Enter Category: ");
String fc = sc.nextLine();
Fiction fiction = new Fiction(fp, ft, fa, fc);
fiction.displayDetails();
break;
case 3:
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid choice! Please enter a valid choice .");
}
}
while (choice != 3);
sc.close();
}
}

