import java.util.Arrays;

public class BasicConcept {
    public static void main(String[] args){
        int num = 5;
        String myName = "Computer";
        char letter = '0';
        boolean isMale = true;
        double myScore = 99.4;
        double myInt2double = 99;
        float number = 2.86879f;
        System.out.println("My name is: " + myName + " and my score is: " + myScore);
        String[] myString = {"Mango", "Orange", "Pear"};
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        Arrays.stream(arr).forEachOrdered(System.out::println);
        ;
        for (String s : myString) {
            System.out.println(s);
        };
        System.out.println("The total is: " + addition(3, 8));
        System.out.println(display("Good Day Guys"));
    };
    public static int addition(int a, int b){
        return a + b;
    };
    public static String display(String message){
        return "Output:" + message;
    }
};

