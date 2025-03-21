import java.util.Scanner;
class Search
{
public static int linearSearch(int[] arr, int target) 
{
for (int i=0; i < arr.length;i++) 
{
if ( arr[i] == target) 
{
return i; 
}
}
return -1; 
}
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int size = scanner.nextInt();
int[] arr = new int[size];
System.out.println("Enter the elements of the array:");
for (int i=0;i<size; i++) 
{
arr[i]=scanner.nextInt();
}
System.out.print("Enter the element to search for: ");
int target=scanner.nextInt();
int result=linearSearch(arr, target);
if (result == -1) 
{
System.out.println("Element not found in the array.");
} 
else 
{
System.out.println("Element found at position: " + result);
}
scanner.close();
}
}
