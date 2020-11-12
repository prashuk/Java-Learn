import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) {
        Position[] positions = solverNQueen(8);
        Arrays.stream(positions).forEach(position -> System.out.println(position.row + " " + position.col));
    }

    static class Position {
        int row, col;
        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static Position[] solverNQueen(int N) {
        Position[] positions = new Position[N];
        boolean hasFound = solverNQueenUtil(N, 0, positions);
        if (hasFound) {
            return positions;
        } else {
            return new Position[0];
        }
    }

    public static boolean solverNQueenUtil(int N, int row, Position[] positions) {
        if(N == row) return true;

        int col;
        for(col = 0; col < N; col++) {
            boolean found = true;

            for(int queen = 0; queen < row; queen++) {
                if(positions[queen].col == col || positions[queen].row + positions[queen].col == row + col || positions[queen].row - positions[queen].col == row - col) {
                    found = false;
                    break;
                }
            }

            if(found) {
                positions[row] = new Position(row, col);
                if(solverNQueenUtil(N, row+1, positions)) {
                    return true;
                }
            }
        }
        return false;
    }
}
