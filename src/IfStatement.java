public class IfStatement {
    public static void main(String[] args) {
        var math = 74;
        var english = 79;

        if (math >=80 && english >=85){
            System.out.println("Selamat Anda LULUS!!!");
        } else if (math >=75 && english >=80){
            System.out.println("Nilai Anda B");
        }else {
            System.out.println("Silahkan Coba lagi");
        }
    }
}
