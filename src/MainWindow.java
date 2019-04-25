import javax.swing.*;


class MainWindow extends JFrame {

    private MainWindow() {
        initFrame();
    }

    private void initFrame() {
        pack();
        setTitle("Snake 2");
        setSize(320,340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
