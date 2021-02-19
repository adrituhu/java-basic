public class MethodVariableArguments {
    public static void main(String[] args) {

        int[] values = {50,70,80,80,90};
        sayCongrats("Adri", values);

        sayCongrats("Jaswan", 50,80,80,80,90);

    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Congrats " + name + " " + "You Passed The Test");
        } else {
            System.out.println("Sorry " + name + " " + "You Have To Try Again!!!");
        }

    }
}
