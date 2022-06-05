package util;

import visualization.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GUI window = new GUI(1000, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1000, 1000);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);
    }
}
