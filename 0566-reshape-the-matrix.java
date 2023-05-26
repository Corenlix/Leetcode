// https://leetcode.com/problems/reshape-the-matrix

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int width = mat.length;
        int height = mat[0].length;
        if (r*c != width * height)
            return mat;
        int x = 0, y = 0;
        int[][] reshaped = new int[r][c];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                reshaped[y][x] = mat[i][j];
                x++;
                if (x >= c) {
                    x -= c;
                    y++;
                }
            }
        }

        return reshaped;
    }
}