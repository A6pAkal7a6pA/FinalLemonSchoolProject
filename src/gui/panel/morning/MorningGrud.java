package gui.panel.morning;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MorningGrud extends JPanel {

        private JButton buttonPrevious;
        private JButton buttonMainMenu;
        private JScrollPane scrollPanel;
        private JLabel jLabel;
        private BufferedImage image;

        public MorningGrud(){
            setLayout(null);
            init();
            try{
            image = ImageIO.read(new File("src/otzhimania.jpg"));
            }catch (IOException e){

            }

        }

        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(image, 10, 50,jLabel.getWidth(),jLabel.getHeight(), this);
        }

        private void init(){
            initButtons();
            initLabel();
            add(buttonPrevious);
            add(buttonMainMenu);
            add(jLabel);
            jLabel.setBorder(BorderFactory.createLineBorder(Color.RED));

        }
        private void initButtons() {
            initPreviousButton();
            initMainMenuButton();
        }

        private void initLabel(){
            initJLabel();
        }

        private void initTextArea(){
        }

        private void initPreviousButton() {
            buttonPrevious = new JButton("Назад");
            buttonPrevious.setBounds(0, 0, 140, 25);
        }

        private void initMainMenuButton() {
            buttonMainMenu = new JButton("Главное меню");
            buttonMainMenu.setBounds(660, 0, 140, 25);
        }

        private void initJLabel(){
            jLabel = new JLabel("В примере создается два многострочных");
            jLabel.setBounds(400,50, 300, 200);
            //jLabel.setBorder();
        }

    }


