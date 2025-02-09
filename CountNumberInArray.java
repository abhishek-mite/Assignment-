class CountNumberInArray{

    public static void main(String main[]){

        int[] arr = {2,1,4,3,1,2,5};

        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            System.out.println(arr[i]+":"+count);
        }
    }
}