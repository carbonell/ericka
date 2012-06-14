package views;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.LoginController;

public class LoginView extends JFrame {

	public LoginView(LoginController loginController) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alvin\\Documents\\Eclipse Proyects\\ericka\\src\\images\\bananaIcon.gif"));
		setTitle("El Bananero - Iniciar Sesi\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(29, 64, 105, 23);
		contentPane.add(btnEntrar);
		
		btnSalir = new JButton("Salir");
		
		btnSalir.setBounds(144, 64, 105, 23);
		contentPane.add(btnSalir);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setBounds(10, 11, 77, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblClave = new JLabel("Contrase\u00F1a:");
		lblClave.setHorizontalAlignment(SwingConstants.RIGHT);
		lblClave.setBounds(10, 39, 77, 14);
		contentPane.add(lblClave);
		
		txtTfusuario = new JTextField();
		txtTfusuario.setBounds(97, 8, 152, 20);
		contentPane.add(txtTfusuario);
		txtTfusuario.setColumns(10);
		
		pwdPfclave = new JPasswordField();
		pwdPfclave.setBounds(97, 36, 152, 20);
		contentPane.add(pwdPfclave);
	}
	
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	public JTextField getTxtTfusuario() {
		return txtTfusuario;
	}
	public JPasswordField getPwdPfclave() {
		return pwdPfclave;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTfusuario;
	private JPasswordField pwdPfclave;
	private JButton btnSalir;
	private JButton btnEntrar;
}