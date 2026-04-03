import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        int []count=new int[26];
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c>='a'&&c<='z'){
                count[c-'a']++;
            }
            

        }
        int max=0;
        int min=Integer.MAX_VALUE;
        char res='a';
        for(int i=0;i<26;i++){
            if(count[i]>max){
                max=count[i];
                res=(char)('a'+i);
            }
        }
        System.out.println(res);
        System.out.println(min);
        System.out.println(res);
    }
}


