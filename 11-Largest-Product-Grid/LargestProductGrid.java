// Project Euler Problem 11 - Largest Product in a grid
// Done by: Zack Chua

import java.util.*;

public class LargestProductGrid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[20][20];

        readInput(sc, grid);
        // printGrid(grid);
        long largest = getLargestHorizontal(grid);
        largest = Math.max(largest, getLargestVertical(grid));
        largest = Math.max(largest, getLargestDiagonal(grid));
        largest = Math.max(largest, getLargestAntiDiag(grid));

        System.out.println(largest);
    }

    public static long getLargestHorizontal(int[][] grid) {

        long largest = 0;
        long curr = 0;

        for (int row = 0; row < grid.length; row++) {

            curr = grid[row][0] * grid[row][1] * grid[row][2] * grid[row][3];
            largest = Math.max(largest, curr);

            for (int col = 4; col < grid[row].length; col++) {

                if (grid[row][col - 4] != 0)
                    curr /= grid[row][col - 4];
                else
                    curr = grid[row][col - 1] * grid[row][col - 2] * grid[row][col - 3];

                curr *= grid[row][col];

                largest = Math.max(largest, curr);

            }
        }

        return largest;
    }

    public static long getLargestVertical(int[][] grid) {

        long largest = 0;
        long curr = 0;

        for (int col = 0; col < grid[0].length; col++) {

            curr = grid[0][col] * grid[1][col] * grid[2][col] * grid[3][col];
            largest = Math.max(largest, curr);

            for (int row = 4; row < grid.length; row++) {

                if (grid[row - 4][col] != 0)
                    curr /= grid[row - 4][col];
                else
                    curr = grid[row - 1][col] * grid[row - 2][col] * grid[row - 3][col];

                curr *= grid[row][col];

                largest = Math.max(largest, curr);

            }
        }

        return largest;

    }

    public static long getLargestDiagonal(int[][] grid) {

        long largest = 0;
        long curr = 0;

        for (int row = 0; row + 3 < grid.length; row++) {

            for (int col = 0; col + 3 < grid[row].length; col++) {

                curr = grid[row][col];

                for (int index = 1 ; index < 4; index++) {

                    curr *= grid[row + index][col + index];
                }

                largest = Math.max(largest, curr);

            }
        }
        return largest;
    }

    public static long getLargestAntiDiag(int[][] grid) {


        long largest = 0;
        long curr = 0;

        for (int row = 0; row + 3  < grid.length; row++) {

            for (int col = grid[row].length - 1; col - 3 >= 0; col--) {

                curr = grid[row][col];


                for (int index = 1 ; index < 4; index++) {

                    curr *= grid[row + index][col - index];
                }
                largest = Math.max(largest, curr);
            }
        }

        return largest;
    }
    public static void readInput(Scanner sc, int[][] grid) {

        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[row].length; col++) {

                grid[row][col] = sc.nextInt();
            }
        }

    }

    public static void printGrid(int[][] grid) {

        for (int row = 0; row < grid.length; row++) {

            for (int col = 0; col < grid[row].length; col++) {

                System.out.print(grid[row][col] + " ");
            }

            System.out.println();
        }
    }

}
