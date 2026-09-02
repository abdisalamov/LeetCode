class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);
        for (int i = 1; i < numRows; i++){
            List<Integer> row1 = new ArrayList<>();
            row1.add(1);
            for (int j = 0; j < triangle.get(i-1).size() - 1; j++){
                row1.add(triangle.get(i-1).get(j) + triangle.get(i-1).get(j+1));
            }
            row1.add(1);
            triangle.add(row1);
        }
        return triangle;
    }
}
