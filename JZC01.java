import java.util.Scanner;

class subarray{
    private int[] arr = new int[100];
    private int num;
    public void setnum(int num){
        this.num=num;
    }
    public int getnum(){
        return num;
    }
    public void setarray(int i,int array_num){
        arr[i]=array_num;
    }
    public void getarray(){
        for(int i = 0;i<this.num;i++)
            System.out.println("数组第"+(i+1)+"个元素为"+arr[i]);
    }
    public void getmaxsubarray(){
        int arraymax=0;
        int arraysum=0;
        for(int i = 0;i<this.num;i++){
            arraysum+=arr[i];
            if (arraymax<arraysum) {
                arraymax=arraysum;
            }
            if (arraysum<0){
                arraysum=0;
            }
        }
        System.out.println("最大子数组合为"+arraymax);
    }
}
public class JZC01{
    public static void main(String[] args) {
        subarray array = new subarray();
        System.out.println("请输入数组元素个数");
        Scanner sc =new Scanner(System.in);
        array.setnum(sc.nextInt());
        int num = array.getnum();
        for(int i = 0;i<num;i++){
            System.out.println("请输入第"+(i+1)+"个元素的值");
            array.setarray(i,sc.nextInt());
        }
        sc.close();
        array.getarray();
        array.getmaxsubarray();
    }
}