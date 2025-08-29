import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird by Kaveen");

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(boardWidth, boardHeight);

        FlappyBird flappybird = new FlappyBird();
        frame.add(flappybird);
        frame.pack();
        frame.setVisible(true);
        flappybird.requestFocus();

    }
}
