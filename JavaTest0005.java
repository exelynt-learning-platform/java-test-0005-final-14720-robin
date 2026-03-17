class Pattern
{
   void PrintPattern(int rows)
   {
    int num = 1;
        for (int i = 1; i <= rows; i++) {        
            for (int j = 1; j <= i; j++) {    
                System.out.print(num + " ");
                num++;
                }
                System.out.println();             
                }
   }
}
public class JavaTest0005 {
    public static void main(String[] args) {
     Pattern p1 = new Pattern();
     p1.PrintPattern(5);
    }
}
