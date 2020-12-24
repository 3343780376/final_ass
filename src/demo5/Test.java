package demo5;

/*利用如下方法，可输出任意行数的带星号(*)的倒置三角形（如右上图所示），
请参照此代码结构并作修改，编写出另一方法drawUp(int n)，可输出顺置的三
角形（如右下图）。（注：不能另写一方法，必须在此方法的基础上改写。）
static void drawDown(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
				if(i>j)
				    System.out.print(" ");
				else
				    System.out.print("* ");
			System.out.println("");
			}
		}
 */
public class Test {
    public static void main(String[] args) {
        drawUp(5);
    }
    public static void drawUp(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--)
                if(i<j)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            System.out.println("");
        }

    }
}
