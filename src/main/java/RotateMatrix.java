
public class RotateMatrix {

    public int[][] rotate(int[][] input) {
        int sizea = input.length;
        int sizeb = input[0].length;
        int[][] output = new int[sizeb][sizea];

        for(int i = sizeb - 1; i >= 0; i--) {
            for(int j = 0; j < sizea; j++) {
                output[sizeb - i - 1][j] = input[j][i];
            }
        }

        return output;
    }
}
