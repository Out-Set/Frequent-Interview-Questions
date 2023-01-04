public class RemoveDuplicateElements {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{1, 1, 1, 1, 2, 3, 4, 4, 5, 7};

        // removeDuplicateElements1(arr);
        removeDuplicateElements2(arr);
    }

    // Important
    static void removeDuplicateElements2(int arr[]){
        int n = arr.length;
        int a[] = new int[n];

        a[0] = arr[0];

        int j = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                continue;
            }
            else{
                j++;
                a[j] = arr[i+1];
            }
        }

        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
    static void removeDuplicateElements1(int arr[]){

        int j = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                continue;
            }
            else{
                j++;
                arr[j] = arr[i+1];

            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

