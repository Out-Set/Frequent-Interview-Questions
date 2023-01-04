package Array;

public class SecondLargest {
    public static void main(String[] args) {
        
        int a[] = new int[]{12, 34, 11, 99, 45, 67, 34};
        System.out.println(firstLar(a));

        System.out.println(secondLar(a));

    }

    static int firstLar(int a[]){
        int res = 0;

        for(int i=1; i<a.length; i++){
            if(a[i] > a[res]){
                res = i;
            }
        }
        return res;
    }

    static int secondLar(int a[]){
        int largest = firstLar(a);

        int res = -1;

        for(int i=1; i<a.length; i++){
            if(a[i] != a[largest]){
                if(res == -1){
                    res = i;
                }
    
                else if(a[i] > a[res]){
                    res = i;
                }
            }
        }
        return res;
    }
}
