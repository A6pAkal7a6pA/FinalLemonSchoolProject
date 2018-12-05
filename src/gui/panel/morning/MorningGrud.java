package gui.panel.morning;

import javax.swing.*;
import java.awt.*;

public class MorningGrud extends JPanel {

        private JButton buttonPrevious;
        private JButton buttonMainMenu;
        private ScrollPane scrollPane;
        private JTextField jTextField;

        public MorningGrud(){
            setLayout(null);
            init();
        }

        private void init(){
            //JFrame frame = new JFrame();
            initButtons();
            initLabel();
            initTextField();
            add(buttonPrevious);
            add(buttonMainMenu);
            add(jTextField);
        }
        private void initButtons() {
            initPreviousButton();
            initMainMenuButton();
        }

        private void initLabel(){
            //initLabelMorningMenu();
        }

        private void initScroll(){

        }

        private void initTextField(){
            initJTextField();
        }

        private void initPreviousButton() {
            buttonPrevious = new JButton("Назад");
            buttonPrevious.setBounds(0, 0, 140, 25);
        }

        private void initMainMenuButton() {
            buttonMainMenu = new JButton("Главное меню");
            buttonMainMenu.setBounds(660, 0, 140, 25);
        }

        private void initScrollPanel(){
            scrollPane = new ScrollPane();
        }

        private void initJTextField(){
            jTextField = new JTextField("Текстовое поле", 20);
            jTextField.setCaretColor(Color.RED);
            jTextField.setHorizontalAlignment(JTextField.RIGHT);



        }

    }


