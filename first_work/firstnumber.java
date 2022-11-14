public class firstnumber {
    public static void main( String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6};
        double sum = 0.0;
        for (int i : arr) {
            sum += (double) i;
        }
        String output = sum + ", " + sum / (double)arr.length;
        System.out.println(output);
    }

    }

