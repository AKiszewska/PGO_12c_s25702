package ĆW4;

public class Matrix {
    private int[][] matrix;
    private static int[][] temporaryMatrix;

    private Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static void setUpMatrix(int rowCount, int columnCount) {
        temporaryMatrix = new int[rowCount][columnCount];
    }

    static void insertRow(int[] row) {
        if (temporaryMatrix.length != row.length) {
            throw new RuntimeException("Different length of the matrix");
        }
        for (int i = 0; i < temporaryMatrix.length; i++) {
            if (temporaryMatrix[i][0] == 0) {
                temporaryMatrix[i] = row;
                break;
            }
        }
    }

    static Matrix create() {
        Matrix matrix = new Matrix(temporaryMatrix);
        temporaryMatrix = null;
        return matrix;
    }


    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println();

    }
    Matrix add(Matrix m) {
        Matrix.setUpMatrix(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            int[] row = new int[matrix[0].length];
            for (int j = 0; j < matrix[0].length; j++) {
                row[j] = matrix[i][j] + m.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        matrix = Matrix.create().matrix;
        return this;
    }

    static Matrix add(Matrix m1, Matrix m2) {
        if(m1.matrix.length!=m2.matrix.length){
            throw new RuntimeException("Different dimensions");
        }
        Matrix.setUpMatrix(m1.matrix.length, m1.matrix[0].length);
        for (int i = 0; i < m1.matrix.length; i++) {
            int[] row = new int[m1.matrix[0].length];
            for (int j = 0; j < m1.matrix[0].length; j++) {
                row[j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        return Matrix.create();
    }
    Matrix subtract(Matrix m) {
        Matrix.setUpMatrix(matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            int[] row = new int[matrix[0].length];
            for (int j = 0; j < matrix[0].length; j++) {
                row[j] = matrix[i][j] - m.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        matrix = Matrix.create().matrix;
        return this;
    }


    static Matrix subtract(Matrix m1, Matrix m2){
        if(m1.matrix.length!=m2.matrix.length){
            throw new RuntimeException("Different dimensions");
        }
        Matrix.setUpMatrix(m1.matrix.length, m1.matrix[0].length);
        for (int i = 0; i < m1.matrix.length; i++) {
            int[] row = new int[m1.matrix[0].length];
            for (int j = 0; j < m1.matrix[0].length; j++) {
                row[j] = m1.matrix[i][j] - m2.matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        return Matrix.create();
    }

        }