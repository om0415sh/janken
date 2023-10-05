package jankenpackage;

public class Winorlose{
    public static void winorlose(){
        if (Main.myhand==Main.cpuhand){
            System.out.println("引き分けです");
        }else if ((Main.myhand==0&&Main.cpuhand==2)||(Main.myhand==1&&Main.cpuhand==0)||(Main.myhand==2&&Main.cpuhand==1)){
            System.out.println("あなたの勝ちです");
        }else if  ((Main.myhand==0&&Main.cpuhand==1)||(Main.myhand==1&&Main.cpuhand==2)||(Main.myhand==2&&Main.cpuhand==0)){
            System.out.println("あなたの負けです");
        }
    }
}