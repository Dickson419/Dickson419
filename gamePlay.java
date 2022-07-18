package breakoutGame;
//This will be the panel in the panel of the game
// 4. Needs to be added tp main JFrame panel
// 7. Add private properties(boolean play, starting score = 0, total bricks, timer, delay,
// player xy, ball xy, ballx direction, bally direction
// 8. Add game constructor

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 4 & 5 extend and implement. Errors resolve after being used in class (implement on red light bulb)
public class gamePlay extends JPanel implements KeyListener, ActionListener {

    // 7
    private boolean play = false; // so game does not immediately start
    private int score = 0; //the score
    private int totalBricks = 21;

    private Timer time;
    private int delay = 8;

    private int playerX = 310;
    private int ballPosX = 120;
    private int ballPosY = 350;
    private int ballXDir = -1;
    private int ballYDir = -2;





    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
