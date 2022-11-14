package twolab;

public class reverseArray {
    public static void main(String[] args) {
        String[] arr= (new String[]{"one", "two", "three"});
        String [] returnArr = sort(arr);
        for (String s : returnArr) {
            System.out.println(s);
        }

    }
    public static String[] sort(String[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            String tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
        return massive;
    }


}
