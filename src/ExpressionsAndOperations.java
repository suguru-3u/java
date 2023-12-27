public class ExpressionsAndOperations {
    public static void main(String[] args){

        // 式
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);

        // 型の変換
        // ①キャスト
        int num3 = (int)30.2;
        System.out.println(num3); // 30

        // 命令文の例
        int num4  = Math.max(3,8);
        System.out.println(num4); // 8

        // 文字列を数値に変換
        int num5 = Integer.parseInt("2");
        System.out.println(num5); // 2

        //  乱数の発生(上限は10に設定)
        int num6 = new java.util.Random().nextInt(10);
        System.out.println(num6); // 10以内

        // キーボードから文字列の入力の受付(入力されるまでプログラムは待機される)
        String str1 = new java.util.Scanner(System.in).nextLine();
        System.out.println(str1); //  入力した文字

        // キーボードから整数の入力を受付
        int num7 = new   java.util.Scanner(System.in).nextInt();
        System.out.println(num7); //  入力し整数

        // Todo:P96の占いの館を作成する
    }
}
