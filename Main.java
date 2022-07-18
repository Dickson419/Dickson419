package breakoutGame;
// 1. Create the JFrame --> the outer window. Make an instance of the JFrame class
// 2. Set properties for JFrame --> create the game window
// 3. Make a gameplay class
// 4. Add a gamePlay instance --> an object inside an object of JFame
// 5. Extend JPanel in gamePlay class
// 6. Implement keylistener, Action in gamePlay class
// 7. Add private properties(boolean play, starting score = 0, total bricks, timer, delay,
// player xy, ball xy, ballx direction, bally direction
// 8. Add game constructor

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // 1
        JFrame obj = new JFrame();
        // 4
        gamePlay Gameplay = new gamePlay();
        // 2
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(Gameplay);



    }
}
