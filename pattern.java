import java.util.Scanner;
class Pattern{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        for(int i=1;i<=number;i++)
        {
            int j;
            for(j=0;j<number-i;j++){
                    System.out.print(" ");
            }
            while(j<number){
                    System.out.print("*");
                    j++;
            }
            System.out.println();
        }
    }
}