import java.util.*;
class pattern6
{
    void printTriangle(int n) 
  {
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n - i + 1; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
