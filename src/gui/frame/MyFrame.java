package gui.frame;

import gui.panel.MainMenuPanel;
import gui.panel.evening.EveningMenuPanel;
import gui.panel.morning.MorningGrud;
import gui.panel.morning.MorningMenuPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame {

    private MainMenuPanel mainMenuPanel;
    private MorningMenuPanel morningMenuPanel;
    private EveningMenuPanel eveningMenuPanel;
    private MorningGrud morningGrud;

    public MyFrame() {
        init();
    }

    private void init() {
        this.setTitle("Дневник упражнений по методике Грег Плитта");

        Dimension frameDimension = new Dimension(800, 600);
        setSize(frameDimension);

        //главное меню
        mainMenuPanel = new MainMenuPanel();
        getContentPane().add(mainMenuPanel);
        //утренняя тренировка
//        morningMenuPanel = new MorningMenuPanel();
//        getContentPane().add(morningMenuPanel);
        //вечерняя тренировка
//        eveningMenuPanel = new EveningMenuPanel();
//        getContentPane().add(eveningMenuPanel);
        //утренняя грудь
//        morningGrud = new MorningGrud();
//        getContentPane().add(morningGrud);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        //pack();

        setVisible(true);
    }
}


