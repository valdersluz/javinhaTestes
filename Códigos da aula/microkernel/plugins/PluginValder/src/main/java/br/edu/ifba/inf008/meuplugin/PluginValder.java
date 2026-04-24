package br.edu.ifba.inf008.meuplugin;

import br.edu.ifba.inf008.interfaces.IPlugin;
import br.edu.ifba.inf008.interfaces.IUIController;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class HelloPlugin implements IPlugin {

    @Override
    public void start(IUIController ui) {
        JButton btn = new JButton("Hello!");

        btn.addActionListener(e -> {
            System.out.println("Hello from plugin!");
            JOptionPane.showMessageDialog(null, "Hello!");
        });

        ui.addButton(btn);
    }

    @Override
    public String getName() {
        return "Hello Plugin";
    }
}