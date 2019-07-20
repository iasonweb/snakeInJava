package com.snake.game;

import javax.swing.*;


class Universe extends JFrame {

    Universe() {
        String GAME_TITLE = "Snake In Java";
        setTitle(GAME_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 320);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}