package br.com.exemplosswing.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	static Login frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblUsuario.setBounds(180, 11, 91, 31);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Consolas", Font.PLAIN, 20));
		txtUsuario.setBounds(111, 39, 228, 31);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblSenha.setBounds(187, 81, 84, 30);
		contentPane.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBackground(new Color(255, 255, 255));
		txtSenha.setFont(new Font("Consolas", Font.PLAIN, 20));
		txtSenha.setBounds(111, 112, 228, 31);
		contentPane.add(txtSenha);
		
		JButton btnEntrarSistema = new JButton("Entrar");
		btnEntrarSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals("admin") && txtSenha.getText().equals("1234")) {
					Principal telaPrincipal = new Principal();
					telaPrincipal.setVisible(true);
					telaPrincipal.setLocationRelativeTo(null);
					frame.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Dados incorretos");
				}
				
			}
		});
		btnEntrarSistema.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnEntrarSistema.setBounds(134, 170, 180, 31);
		contentPane.add(btnEntrarSistema);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		btnSair.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnSair.setBounds(134, 217, 180, 31);
		contentPane.add(btnSair);
	}
}
