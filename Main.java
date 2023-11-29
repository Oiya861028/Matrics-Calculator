import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the first matrix:");
        int aRow = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix:");
        int aColumn = sc.nextInt();
        System.out.print("Enter the number of rows for the second matrix: ");
        int bRow = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix:");
        int bColumn = sc.nextInt();
        int[][] a = new int[aRow][aColumn];
        for (int i = 0; i < aRow; i++) {
            for (int j = 0; j < aColumn; j++) {
                a[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        int[][] b = new int[bRow][bColumn];
        for (int i = 0; i < bRow; i++) {
            for (int j = 0; j < bColumn; j++) {
                b[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        System.out.println("Choose an operation(1-Addition; 2-Subtraction; 3-Multiplication):");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                if (aRow != bRow && aColumn != bColumn) {
                    System.out.println("Sorry, you did not enter the same dimensions for both matrices. It is impossible to add them. Please restart the program and try again:");
                    break;
                }
                int[][] add = addMatrices(a, b);
                System.out.println("The result for adding the matrices are:");
                for(int i=0;i<add.length;i++){
                    System.out.print("{");
                    for(int j=0;j<add[i].length-1;j++){
                        System.out.print(add[i][j] +", ");
                    }
                    System.out.print(add[i][add[i].length-1]+"}");
                    System.out.println();
                }
                break;
            case 2:
                if (aRow != bRow && aColumn != bColumn) {
                    System.out.println("Sorry, you did not enter the same dimensions for both matrices. It is impossible to subtract them. Please restart the program and try again:");
                    break;
                }
                int[][] subtract = subtractMatrices(a, b);
                System.out.println("The result for subtracting the matrices are:");
                for(int i=0;i<subtract.length;i++){
                    System.out.print("{");
                    for(int j=0;j<subtract[i].length-1;j++){
                        System.out.print(subtract[i][j] +", ");
                    }
                    System.out.print(subtract[i][subtract[i].length-1]+"}");
                    System.out.println();
                }
                break;
            case 3:
                if (aColumn != bRow) {
                    System.out.println("Sorry, matrices dimensions you inputted can not be multiplied. Please read the README and restart the program:");
                    break;
                }
                int[][] multiply = multiplyMatrices(a, b);
                System.out.println("The result for multiplying matrices of your dimensions are:");
                for(int i=0;i<multiply.length;i++){
                    System.out.print("{");
                    for(int j=0;j<multiply[i].length-1;j++){
                        System.out.print(multiply[i][j] +", ");
                    }
                    System.out.print(multiply[i][multiply[i].length-1]+"}");
                    System.out.println();
                }
                break;
        }

    }

    public static int[][] addMatrices(int[][] arr1, int[][] arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

    public static int[][] subtractMatrices(int[][] arr1, int[][] arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }
    public static int[][] multiplyMatrices(int[][] arr1, int[][] arr2){
        int[][] result = new int[arr1.length][arr2[0].length];
        for(int i=0;i<result.length; i++){
            for(int j=0;j<result[i].length;j++){
                for(int k=0;k<result.length;k++){
                    result[i][j] += (arr1[i][k]*arr2[k][j]);
                }
            }
        }
        return result;
    }
}

