import java.util.Scanner;
class missing_letter_in_palindrome{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter :");
        String str=sc.next();
        int n=str.length();
        int h=n/2;
        for (int i=0;i<h;i++){
            if (str.charAt(i)==str.charAt(n-(i+1))){
                continue;
            }
            else{
                if (str.charAt(i+1)==str.charAt(n-(i+1))){
                    System.out.println(str.charAt(i));
                    break;
                }
                else{
                    System.out.println(str.charAt(n-(i+1)));
                    break;
                }
            }
        }

        

    }
}