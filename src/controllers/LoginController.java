package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.LoginView;

public class LoginController {
	public LoginController(){
		loginView = new LoginView(this);
		
		loginView.getBtnSalir().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				loginView.dispose();
			}
		});
		loginView.getBtnEntrar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(validarLogin(loginView.getTxtTfusuario().getText(), loginView.getPwdPfclave().getPassword())){
					JOptionPane.showMessageDialog(loginView, "Usuario válido.");
				} else {
					JOptionPane.showMessageDialog(loginView, "Usuario inválido.");
				}
			}
		});
	}
	
	public void mostrarLogin() {
		loginView.setVisible(true);
	}
	
	private boolean validarLogin(String user, char[] password) {
		boolean valid = true;
		
//		for(Technician t : technicianController.getTechnicians()) {
//			if(user.equals(t.getNickName())) {
//				int index = 0;
//				for(char i : password){
//					if(i != t.getPassword().toCharArray()[index]) { valid = false; }
//					index++;
//				}
//			}
//		}
		return valid;
	}
	
	private LoginView loginView;
}