package strategy;import entity.Player;public interface WinningStrategy {    boolean checkWinner(int row, int col, Player player);}