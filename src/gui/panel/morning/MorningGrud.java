package gui.panel.morning;

import gui.panel.MainMenuPanel;
import gui.panel.evening.EveningMenuPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MorningGrud extends JPanel {

    private JButton buttonPrevious;
    private JButton buttonMainMenu;
    private JScrollPane scrollPanel;
    private JLabel jLabel;
    private BufferedImage image;
    private ActionListener actionListener;
    public MainMenuPanel mainMenuPanel;
    public EveningMenuPanel eveningMenuPanel;
    public CardLayout cardLayout = new CardLayout();
    public JRootPane rootPane = new JRootPane();

    public MorningGrud() {
        setLayout(null);
        init();
        try {
            image = ImageIO.read(new File("src/otzhimania.jpg"));
        } catch (IOException e) {

        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 10, 50, jLabel.getWidth(), jLabel.getHeight(), this);
    }

    private void init() {
        initButtons();
        initLabel();




    }

    private void initButtons() {
        initPreviousButton();
        initMainMenuButton();

    }

    private void initLabel() {
        initJLabel();
    }

    private void initTextArea() {
    }

    private void initPreviousButton() {
        buttonPrevious = new JButton("Назад");
        buttonPrevious.setBounds(0, 0, 140, 25);
        add(buttonPrevious);
        buttonPrevious.addActionListener(new MyListener());
    }

    private void initMainMenuButton() {
        buttonMainMenu = new JButton("Главное меню");
        buttonMainMenu.setBounds(660, 0, 140, 25);
        add(buttonMainMenu);
    }

    private void initJLabel() {
        jLabel = new JLabel("В примере создается два многострочных");
        jLabel.setBounds(400, 50, 300, 200);
        //jLabel.setBorder();
//            int i = 0;
//            int y =50;
//            while ( i !=3) {
//                jLabel = new JLabel();
//                jLabel.setText("i");
//                jLabel.setBounds(400, y, 300, 200);
//                y+=220;
//                i++;
//            }
        jLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
        add(jLabel);
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            removeAll();
            eveningMenuPanel = new EveningMenuPanel();
            add(eveningMenuPanel);
            repaint();
            validate();
        }
    }
}


