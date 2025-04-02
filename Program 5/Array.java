import java.util.Arrays;
import java.util.Scanner;
class Array 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int size = scanner.nextInt();
int[] arr = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) 
{
arr[i] = scanner.nextInt();
}
Arrays.sort(arr);
System.out.print("Enter the element to search for: ");
int target = scanner.nextInt();
int result = Arrays.binarySearch(arr, target);
if (result < 0) 
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

