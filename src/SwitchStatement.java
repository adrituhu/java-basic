public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("You are Amazing");
                break;
            case "B":
            case "C":
                System.out.println("You are Good");
                break;
            case "D":
                System.out.println("Need Improvement");
                break;
            default:
                System.out.println("You are at the wrong place");
        }

        switch (nilai) {
            case "A" -> System.out.println("You are Amazing");
            case "B", "C" -> System.out.println("You are Good");
            case "D"-> System.out.println("Need Improvement");
            default -> {
                System.out.println("You are at the wrong place");
            }
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "You are Amazing";
            case "B", "C" -> ucapan = "You are Good";
            case "D" -> ucapan = "Need Improvement";
            default -> {
                ucapan = "You are at the wrong place";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A":
                yield "You are Amazing";
            case "B", "C":
                yield "You are Goog";
            case "D":
                yield "Need Improvement";
            default:
                yield "You are at the wrong place";
        };
        System.out.println(ucapan);
    }
}
