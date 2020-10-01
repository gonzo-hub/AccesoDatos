import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CopiarFichero {

	private JFrame frmCopiarfichero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CopiarFichero window = new CopiarFichero();
					window.frmCopiarfichero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CopiarFichero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCopiarfichero = new JFrame();
		frmCopiarfichero.setTitle("CopiarFichero");
		frmCopiarfichero.setBounds(100, 100, 863, 546);
		frmCopiarfichero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCopiarfichero.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(2);
		flowLayout.setHgap(2);
		frmCopiarfichero.getContentPane().add(panel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Copiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmCopiarfichero.getContentPane().add(btnNewButton, BorderLayout.NORTH);
	}

}
