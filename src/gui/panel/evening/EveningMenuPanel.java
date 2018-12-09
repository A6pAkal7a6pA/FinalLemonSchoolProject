package gui.panel.evening;

import javax.swing.*;

public class EveningMenuPanel extends JPanel {
    private JButton buttonPrevious;
    private JButton buttonMainMenu;
    private JButton buttonGrud;
    private JButton buttonHand;
    private JButton buttonFoot;
    private JButton buttonPres;
    private JButton buttonPlechi;
    private JButton buttonSpina;
    private JLabel jLabelEveningMenu;

    public EveningMenuPanel(){
        setLayout(null);
        init();
    }

    private void init(){
        initButtons();
        initLabel();
        add(buttonPrevious);
        add(buttonMainMenu);
        add(buttonGrud);
        add(buttonHand);
        add(buttonPres);
        add(buttonFoot);
        add(buttonPlechi);
        add(buttonSpina);
        add(jLabelEveningMenu);

    }
    private void initButtons() {
        initPreviousButton();
        initMainMenuButton();
        initGrudButton();
        initHandButton();
        initPresButton();
        initPlechiButton();
        initFootButton();
        initSpinaButton();
    }

    private void initLabel(){
        initLabelEveningMenu();
    }

    private void initPreviousButton() {
        buttonPrevious = new JButton("Назад");
        buttonPrevious.setBounds(0, 0, 140, 25);
    }

    private void initMainMenuButton() {
        buttonMainMenu = new JButton("Главное меню");
        buttonMainMenu.setBounds(660, 0, 140, 25);
    }

    private void initLabelEveningMenu(){
        jLabelEveningMenu = new JLabel("<html>Джордж Гре́гори Плитт мла́дший (англ. George Gregory Plitt, Jr.; 3 ноября 1977, " +
                "Литервилль, Мэриленд — 17 января 2015, Бербанк, Калифорния) — американский актёр, " +
                "фитнес-модель и пропагандист здорового образа жизни. Известен своей программой тренировок MFT28, " +
                "появлялся на обложках журналов более 200 раз.</html>");
        jLabelEveningMenu.setBounds(250, 0, 300, 500);
    }

    private void initGrudButton() {
        buttonGrud = new JButton("Грудь");
        buttonGrud.setBounds(10, 50, 220, 150);
    }

    private void initHandButton() {
        buttonHand = new JButton("Руки");
        buttonHand.setBounds(10, 210, 220, 150);
    }

    private void initPresButton() {
        buttonPres = new JButton("Прес");
        buttonPres.setBounds(10, 370, 220, 150);
    }

    private void initSpinaButton() {
        buttonSpina = new JButton("Спина");
        buttonSpina.setBounds(565, 50, 220, 150);
    }

    private void initPlechiButton() {
        buttonPlechi = new JButton("Плечи");
        buttonPlechi.setBounds(565, 210, 220, 150);
    }

    private void initFootButton() {
        buttonFoot = new JButton("Ноги");
        buttonFoot.setBounds(565, 370, 220, 150);
    }
}
