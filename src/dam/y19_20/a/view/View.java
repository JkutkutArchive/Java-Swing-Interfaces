package dam.y19_20.a.view;

import dam.y19_20.a.control.Controller;
import dam.y19_20.a.model.Videojuego;

import javax.swing.*;

public class View extends JFrame {
    private static String TITLE = "";
    private JPanel jpMenu;
    private JPanel jpAddGame;
    private JComboBox cmbPlatform;
    private JButton btnAddGameAdd;

    public View() {
        setTitle(TITLE);
        setContentPane(jpMenu);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        // Init add game
        cmbPlatform.setModel(new DefaultComboBoxModel<>(Videojuego.PLATAFORMAS));
    }

    public void setControlador(Controller controller) {
        btnAddGameAdd.addActionListener(controller);
//        btnAddGameCancel.addActionListener(controller);
    }

    public void test() {
        jpAddGame.setVisible(false);
    }
}
