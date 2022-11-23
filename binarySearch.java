//binary Search using Recursion
public int binarySearch(int[] arr, int key, int first, int last){
        if(first >= last) return -1;
        
        int mid = (first + last) / 2;
        if(arr[mid] == key) return mid;
        
        if(arr[mid] > key){
            return  binarySearch(arr, key, first, mid-1);   
        }
        
        return binarySearch(arr, key, mid+1, last);
}


//Calling
public static void main(String[] args) {
        int[] arr = {2, 4, 8, 16, 32, 64, 128};
        int indexOf = binarySearch(arr, 128, 0, arr.length);
        System.out.println(indexOf);
}
