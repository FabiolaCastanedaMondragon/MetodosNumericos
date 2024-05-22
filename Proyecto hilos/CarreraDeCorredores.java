//Dia 1 ¿Como crear una linea de codigo para implementar imagenes??

//Dia 2 Implementar simples cubos

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarreraDeCorredores extends JFrame {
    private JPanel panel;
    private JButton btnStart, btnReset, btnPause;
    private Runner runner1, runner2;
    private Timer timer;
    private boolean isRunning = false;

    public CarreraDeCorredores() {
        setTitle("Competencia de Corredores");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                runner1.draw(g);
                runner2.draw(g);
            }
        };

        btnStart = new JButton("Iniciar");
        btnReset = new JButton("Reiniciar");
        btnPause = new JButton("Pausar");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnStart);
        buttonPanel.add(btnReset);
        buttonPanel.add(btnPause);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);




        runner1 = new Runner(Color.RED, 10, 100);
        runner2 = new Runner(Color.BLUE, 10, 200);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                runner1.move();
                runner2.move();
                panel.repaint();
                if (runner1.getX() >= panel.getWidth() || runner2.getX() >= panel.getWidth()) {
                    timer.stop();
                    String winner = runner1.getX() >= panel.getWidth() ? "Corredor 1" : "Corredor 2";
                    JOptionPane.showMessageDialog(panel, "¡" + winner + " ha ganado!");
                    isRunning = false;
                }
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isRunning) {
                    timer.start();
                    isRunning = true;
                }
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                runner1.reset();
                runner2.reset();
                panel.repaint();
                isRunning = false;
            }
        });

        btnPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isRunning) {
                    timer.stop();
                    isRunning = false;
                }
            }
        });
    }

/*
    private class Runner {
        private ima;
        private int m, t;
        private int un;
        private int velocidd;

 */
    private class Runner {
        private Color color;
        private int x, y;
        private int initialX;
        private int speed;

        public Runner(Color color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
            this.initialX = x;
            this.speed = (int) (Math.random() * 10 + 1);
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, 50, 50);
        }

        public void move() {
            x += speed;
        }

        public int getX() {
            return x;
        }

        public void reset() {
            x = initialX;
            speed = (int) (Math.random() * 10 + 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarreraDeCorredores().setVisible(true);
            }
        });
    }
}