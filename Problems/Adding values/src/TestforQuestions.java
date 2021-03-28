import java.util.Arrays;

class TestForQuestions {
    public static void method2(int[] array) {
        array = new int[] { 1, 2, 3 };
    }
    public static void main(String[] args){

        int[] numbers = { 4, 5, 6 };

        method2(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}


