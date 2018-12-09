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
    private JButton buttonStart;

    private JLabel jLabelMainMenu;
    private JLabel mainLabelBottom;
    private JLabel mainLabelTop;


    public MainMenuPanel(){
        setLayout(null);
        init();
    }

   private void init(){
        initButtons();
        initLabel();

    }
    private void initButtons() {
        initPreviousButton();
        initMainMenuButton();
        initStartButton();
        //initMorningBotton();
       // initEveningBotton();
    }

    private void initLabel(){
      // initLabelMainMenu();
       initMainLabelBottom();
       initMainLabelTop();
    }

    private void initPreviousButton() {
        buttonPrevious = new JButton("Назад");
        buttonPrevious.setBounds(0, 0, 140, 25);
        add(buttonPrevious);
    }

    private void initMainMenuButton() {
        buttonMainMenu = new JButton("Главное меню");
        buttonMainMenu.setBounds(660, 0, 140, 25);
        add(buttonMainMenu);
    }

    private void initStartButton(){
        buttonStart = new JButton("Начать работу с приложением");
        buttonStart.setBounds(280,200, 250,100);
        add(buttonStart);
    }

    private void initLabelMainMenu(){
       jLabelMainMenu = new JLabel("<html>Джордж Гре́гори Плитт мла́дший (англ. George Gregory Plitt, Jr.; 3 ноября 1977, " +
               "Литервилль, Мэриленд — 17 января 2015, Бербанк, Калифорния) — американский актёр, " +
               "фитнес-модель и пропагандист здорового образа жизни. Известен своей программой тренировок MFT28, " +
               "появлялся на обложках журналов более 200 раз.</html>");
      jLabelMainMenu.setBounds(250, 0, 300, 500);
      add(jLabelMainMenu);
    }

    private void initMainLabelTop(){

        mainLabelTop = new JLabel("Методика упражнений MFT28");
        //mainLabelTop.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mainLabelTop.setBounds(265,0, 300, 50);
        mainLabelTop.setFont(new Font("Calibri", Font.PLAIN, 20));
        add(mainLabelTop);

    }

    private void initMainLabelBottom(){

        mainLabelBottom = new JLabel("Информация об авторе.");
        mainLabelBottom.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mainLabelBottom.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1.5f)));
        mainLabelBottom.setBounds(-1,545,800,30);
        mainLabelBottom.setHorizontalAlignment(SwingConstants.CENTER);

        add(mainLabelBottom);
    }

    private void initMorningBotton(){
        buttonMorning = new JButton("Утренняя тренировка");
        buttonMorning.setBounds(10, 42, 220, 500);
        add(buttonMorning);
    }

    private void initEveningBotton(){
        buttonEvening = new JButton("Вечерняя тренировка");
        buttonEvening.setBounds(565, 42, 220, 500);
        add(buttonEvening);
    }

}
