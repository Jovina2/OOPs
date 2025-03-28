import java.util.Scanner;
import java.util.Arrays;
class Recursive
{
public static int binarySearch(int[] arr, int low,int high,int target) 
{
if(low > high)
{
return -1;
}
int mid=low + (high - low)/2;
if(arr[mid]==target)
{
return mid;
}
else if (arr[mid] > target)
{
return binarySearch(arr,low,mid-1,target);
}
else
{
return binarySearch(arr,mid+1,high,target);
}
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
Arrays.sort(arr);
System.out.println("Sorted array:"+Arrays.toString(arr));
System.out.print("Enter the element to search for: ");
int target=scanner.nextInt();
int result=binarySearch(arr,0,arr.length - 1,target);
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
