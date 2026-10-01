import javax.swing.*;

public class TicTacToeRunner {
    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT) for thread safety
        SwingUtilities.invokeLater(() -> {
            // Instantiate the frame
            TicTacToeFrame frame = new TicTacToeFrame();

            // Make the game visible to the players
            frame.setVisible(true);
        });
    }
}