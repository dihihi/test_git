public class Perm {
    private int[] a = new int[10];
   
    public void init(){
        for(int i=1;i<=9;i++){
            a[i]=i;   
        }
    }
   
    private void printNumber(){
        for(int j=1;j<=9;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }
   
    public void range(int index){
        if(index==9){
            printNumber();
        }
        else{
            for(int i=index;i<=9;i++){
                int k = index;
                swap(i,k);
                range(k+1);               
                swap(i,k);
            }      
        }
    }
   
    private void swap(int i, int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
   
    public static void main(String[] args) {
        Perm p = new Perm();
        p.init();
        p.range(1);
    }
}