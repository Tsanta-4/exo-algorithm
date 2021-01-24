import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] tab1 = {1, 1, 1, 3, 3, 5};
        int[] result = index(tab1, 9);

        System.out.println(Arrays.toString(result));
    }

    public static int[] index(int[] tab, int target) {
        int[] ret = {-1,-1};
        int index = 0;

        while (index < tab.length && tab[index] != target) {
            index++;
        }
        if (index < tab.length) {
            ret[0] = index; ret[1] = index;
        }
        for (int j = index+1; j < tab.length; j++) {
            if (tab[j] == target) {
                ret[1]++;
            }
            else {
                break;
            }
        }
        return ret;
    }
}