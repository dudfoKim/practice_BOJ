https://yoloaeee.tistory.com/255


================================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        
        for(int i=1; i/2<=n; i++)
        {
            if(n%i==0)
            {
                cnt++;
                
                if(k==cnt)
                {
                    System.out.println(i);
                    return;
                }
            }
        }
        
        System.out.println(0);
        sc.close();
    }
}
