public class ForEach {
    public static void main(String[] args) {

        String names[] = {
                "Adrianto", "Meritus", "Tuhu",
                "Programmer", "Masa", "Kini"
        };

        for (var i = 0; i < names.length; i++ ){
            System.out.println(names[i]);
        }

        System.out.println("FOREACH");

        for (String name : names){
            System.out.println(name);
        }

    }
}
