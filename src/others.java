import java.util.Scanner;

public class others {
    public static void main(String[] args) {
        test6();
        test7();
    }
    public static void test6() {
        int a = 5;
        int b = -3;

        System.out.println(-a%b++);
        System.out.println(a>1 && a<12 ? a : b);
        System.out.println(a++%b--);
    }
    public static void test7() {
        System.out.println("请输入摄氏度");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        System.out.println("你输入的是" + num + "摄氏度");
        double huashi = 1.8 * num + 32 ;
        System.out.println("转化为华氏度是" + String.format("%.2f",huashi) + "度");
    }
}
