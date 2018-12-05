package gui.panel;

import gui.menu.MyMenuBar;
import gui.panel.morning.MorningMenuPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static com.sun.javafx.fxml.expression.Expression.add;

public class MainMenuPanel extends JPanel {

    private MorningMenuPanel morningMenuPanel;

    private JButton buttonPrevious;
    private JButton buttonMainMenu;
    private JButton buttonMorning;
    private JButton buttonEvening;
    private MyMenuBar myMenuBar;
    private JLabel jLabelMainMenu;

    public MainMenuPanel(){
        setLayout(null);
        init();
    }

   private void init(){
        //JFrame frame = new JFrame();
        initButtons();
        initLabel();
        add(buttonPrevious);
        add(buttonMainMenu);
        add(jLabelMainMenu);
        add(buttonMorning);
        add(buttonEvening);
       // add(BorderLayout.CENTER, jLabelMainMenu);
    }
    private void initButtons() {
        initPreviousButton();
        initMainMenuButton();
        initMorningBotton();
        initEveningBotton();
    }

    private void initLabel(){
       initLabelMainMenu();
    }

    private void initPreviousButton() {
        buttonPrevious = new JButton("Назад");
        buttonPrevious.setBounds(0, 0, 140, 25);
    }

    private void initMainMenuButton() {
        buttonMainMenu = new JButton("Главное меню");
        buttonMainMenu.setBounds(660, 0, 140, 25);
    }

    private void initLabelMainMenu(){
       jLabelMainMenu = new JLabel("<html>Джордж Гре́гори Плитт мла́дший (англ. George Gregory Plitt, Jr.; 3 ноября 1977, " +
               "Литервилль, Мэриленд — 17 января 2015, Бербанк, Калифорния) — американский актёр, " +
               "фитнес-модель и пропагандист здорового образа жизни. Известен своей программой тренировок MFT28, " +
               "появлялся на обложках журналов более 200 раз.</html>");
      jLabelMainMenu.setBounds(250, 0, 300, 500);
    }

    private void initMorningBotton(){
        buttonMorning = new JButton("Утренняя тренировка");
        buttonMorning.setBounds(10, 50, 220, 500);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                morningMenuPanel = new MorningMenuPanel();
            }
        });
    }

    private void initEveningBotton(){
        buttonEvening = new JButton("Вечерняя тренировка");
        buttonEvening.setBounds(565, 50, 220, 500);
    }

}
