public class sort {
    public static void main(String[] args) {
        int debitcounts =0;
        int[] arr ={900,1500,600,1200,400};
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                debitcounts++;
            }
        }
        System.out.println("no of debits:"+debitcounts);
    }

}
