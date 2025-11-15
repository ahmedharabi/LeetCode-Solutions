class NumMatrix {
    ArrayList<ArrayList<Integer>> prefix = new ArrayList<>();

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        

        
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(matrix[i][0]);
            for (int j = 1; j < n; j++) { // start from 1
                arr.add(arr.get(j - 1) + matrix[i][j]);
            }
            prefix.add(arr);
        }

        
        for (int i = 1; i < m; i++) { 
            for (int j = 0; j < n; j++) { 
                prefix.get(i).set(j, prefix.get(i - 1).get(j) + prefix.get(i).get(j));
            }
        }
        System.out.println(prefix);

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int total = prefix.get(row2).get(col2);
        int top = (row1 > 0) ? prefix.get(row1 - 1).get(col2) : 0;
        int left = (col1 > 0) ? prefix.get(row2).get(col1 - 1) : 0;
        int topLeft = (row1 > 0 && col1 > 0) ? prefix.get(row1 - 1).get(col1 - 1) : 0;

        return total - top - left + topLeft;
    }

}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */