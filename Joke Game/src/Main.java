import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Main extends JPanel implements KeyListener, Runnable {

    private final int screenWidth = 800;
    private final int screenHeight = 600;
    private final int mapWidth = 8;
    private final int mapHeight = 8;
    private final int blockSize = 64;

    private final String[] map = {
            "########",
            "#......#",
            "#..##..#",
            "#......#",
            "#..#...#",
            "#..#...#",
            "#......#",
            "########"
    };

    private double playerX = 100, playerY = 100, playerAngle = 0;
    private boolean forward, backward, left, right;

    private BufferedImage frame;

    public Main() {
        JFrame frameWindow = new JFrame("Fake 3D FPS");
        frameWindow.setSize(screenWidth, screenHeight);
        frameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameWindow.add(this);
        frameWindow.setVisible(true);
        frameWindow.addKeyListener(this);

        frame = new BufferedImage(screenWidth, screenHeight, BufferedImage.TYPE_INT_RGB);

        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            update();
            render();
            repaint();

            try {
                Thread.sleep(16); // ~60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        double moveSpeed = 4.0;
        double rotSpeed = 0.05;

        if (forward) {
            playerX += Math.cos(playerAngle) * moveSpeed;
            playerY += Math.sin(playerAngle) * moveSpeed;
        }
        if (backward) {
            playerX -= Math.cos(playerAngle) * moveSpeed;
            playerY -= Math.sin(playerAngle) * moveSpeed;
        }
        if (left) {
            playerAngle -= rotSpeed;
        }
        if (right) {
            playerAngle += rotSpeed;
        }
    }

    private void render() {
        Graphics g = frame.getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, screenWidth, screenHeight);

        for (int x = 0; x < screenWidth; x++) {
            double rayAngle = (playerAngle - Math.PI / 6.0) + (x / (double)screenWidth) * (Math.PI / 3.0);

            double rayX = Math.cos(rayAngle);
            double rayY = Math.sin(rayAngle);

            double distanceToWall = 0.0;
            boolean hitWall = false;

            while (!hitWall && distanceToWall < 1000) {
                distanceToWall += 1.0;
                int testX = (int)((playerX + rayX * distanceToWall) / blockSize);
                int testY = (int)((playerY + rayY * distanceToWall) / blockSize);

                if (testX < 0 || testX >= mapWidth || testY < 0 || testY >= mapHeight) {
                    hitWall = true;
                    distanceToWall = 1000;
                } else if (map[testY].charAt(testX) == '#') {
                    hitWall = true;
                }
            }

            int wallHeight = (int)(screenHeight / distanceToWall * 70);
            int wallStart = (screenHeight / 2) - wallHeight / 2;
            int wallEnd = (screenHeight / 2) + wallHeight / 2;

            g.setColor(Color.WHITE);
            g.drawLine(x, wallStart, x, wallEnd);
        }

        g.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(frame, 0, 0, null);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> forward = true;
            case KeyEvent.VK_S -> backward = true;
            case KeyEvent.VK_A -> left = true;
            case KeyEvent.VK_D -> right = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> forward = false;
            case KeyEvent.VK_S -> backward = false;
            case KeyEvent.VK_A -> left = false;
            case KeyEvent.VK_D -> right = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
