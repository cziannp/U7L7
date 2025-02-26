import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6}; 
    // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};    
    // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

    
    /* --- SELECTION SORT --- */
    int[] arr1 = {100, 89, 86, 77, 54, 40, 19, 14, 13, 12, 6, 3, 0, -4, -5, -20}; 
    // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {100, 89, 86, 77, 54, 40, 19, 14, 13, 12, 6, 3, 0, -4, -5, -20};    
    // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));


    /* --- SELECTION SORT --- */
    int[] arr1 = {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86}; 
    // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86};    
    // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));


    /* --- SELECTION SORT --- */
    int[] arr1 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100}; 
    // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};    
    // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
