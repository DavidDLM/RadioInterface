import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ButtonGroup;

public class Radio extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Create the frame.
	 */
	public Radio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 159, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(105, 159, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(200, 159, 89, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(295, 159, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(394, 159, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(493, 159, 89, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 193, 89, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(105, 193, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(200, 193, 89, 23);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(295, 193, 89, 23);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(394, 193, 89, 23);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(493, 193, 89, 23);
		contentPane.add(btn12);
		
		JRadioButton rdbtnFm = new JRadioButton("FM");
		buttonGroup.add(rdbtnFm);
		rdbtnFm.setBounds(10, 72, 89, 23);
		contentPane.add(rdbtnFm);
		
		JRadioButton rdbtnAm = new JRadioButton("AM");
		buttonGroup.add(rdbtnAm);
		rdbtnAm.setBounds(10, 46, 62, 23);
		contentPane.add(rdbtnAm);
		
		
		
		
		
		JLabel lblEstacion = new JLabel("Estacion:");
		lblEstacion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEstacion.setBounds(175, 71, 132, 19);
		contentPane.add(lblEstacion);
		
		JLabel lblEstacionActual = new JLabel("");
		lblEstacionActual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstacionActual.setBounds(317, 72, 100, 19);
		contentPane.add(lblEstacionActual);
		
		JButton btnOn = new JButton("Encender");
		btnOn.setBounds(394, 11, 89, 23);
		contentPane.add(btnOn);
		
		JButton btnApagado = new JButton("Apagar");
		btnApagado.setBounds(493, 11, 89, 23);
		contentPane.add(btnApagado);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(220, 113, 164, 20);
		contentPane.add(spinner);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(394, 112, 89, 23);
		contentPane.add(btnGuardar);
		
		btnApagado.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		rdbtnAm.setEnabled(false);
		rdbtnFm.setEnabled(false);
		spinner.setEnabled(false);
		btnGuardar.setEnabled(false);
		

		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnOn.isEnabled()){

					btnApagado.setEnabled(true);
					btn1.setEnabled(true);
					btn2.setEnabled(true);
					btn3.setEnabled(true);
					btn4.setEnabled(true);
					btn5.setEnabled(true);
					btn6.setEnabled(true);
					btn7.setEnabled(true);
					btn8.setEnabled(true);
					btn9.setEnabled(true);
					btn10.setEnabled(true);
					btn11.setEnabled(true);
					btn12.setEnabled(true);
					rdbtnAm.setEnabled(true);
					rdbtnFm.setEnabled(true);
					spinner.setEnabled(true);
					btnOn.setEnabled(false);
					rdbtnFm.setSelected(true);
					btnGuardar.setEnabled(true);
					
					if (rdbtnAm.isSelected()) {
						rdbtnFm.setSelected(false);
						spinner.setModel(new SpinnerNumberModel(530,530,1610,10));
						
					}else if (rdbtnFm.isSelected()) {
						rdbtnAm.setSelected(false);
						spinner.setModel(new SpinnerNumberModel(87.9, 87.9, 107.9, 0.2));	
					}
					
					//Cambiar a AM
					rdbtnAm.addActionListener(new ActionListener()
					{
					    @Override
					    public void actionPerformed(ActionEvent e)
					    {
					    	spinner.setModel(new SpinnerNumberModel(530,530,1610,10));					
					    	}
					});
					
					//Cambiar a FM
					rdbtnFm.addActionListener(new ActionListener()
					{
					    @Override
					    public void actionPerformed(ActionEvent e)
					    {
					    	spinner.setModel(new SpinnerNumberModel(87.9, 87.9, 107.9, 0.2));
					    	}
					});
					
					//Botones
					
					btnGuardar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(btnGuardar.isEnabled()) {
								if (rdbtnAm.isSelected()) {
									JOptionPane.showMessageDialog(null, "Puede guardar hasta 12 emisoras AM distintas!");
									String emisora1 = String.valueOf(spinner.getValue());
									FuncionesRadio.listaAM.add(emisora1);
								}else if (rdbtnFm.isSelected()) {
									JOptionPane.showMessageDialog(null, "Puede guardar hasta 12 emisoras FM distintas!");
									String emisora1 = String.valueOf(spinner.getValue());
									FuncionesRadio.listaFM.add(emisora1);
								}
								
							}
						}
					});
					
					//Boton 1
					btn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.isEmpty()==true) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.isEmpty()==false) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(0)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.isEmpty()==true) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.isEmpty()==false) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(0)));
								}
							}
						}
					});
					
					//Boton 2
					btn2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=1) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=2) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(1)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=1) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=2) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(1)));
								}
							}
						}
					});
					
					//Boton 3
					btn3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=2) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=2) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(2)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=2) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=2) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(2)));
								}
							}
						}
					});
					
					//Boton 4
					
					btn4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=3) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=3) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(3)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=3) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=3) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(3)));
								}
							}
						}
					});
					
					//Boton 5
					
					btn5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=4) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=4) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(4)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=4) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=4) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(4)));
								}
							}
						}
					});
					
					//Boton 6
					
					btn6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=5) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=5) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(5)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=5) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=5) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(5)));
								}
							}
						}
					});
					
					//Boton 7
					
					btn7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=6) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=6) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(6)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=6) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=6) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(6)));
								}
							}
						}
					});
					
					//Boton 8
					
					btn8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=7) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=7) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(7)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=7) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=7) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(7)));
								}
							}
						}
					});
					
					//Boton 9
					btn9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=8) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=8) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(8)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=8) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=8) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(8)));
								}
							}
						}
					});
					
					//Boton 10
					btn10.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=9) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=9) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(9)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=9) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=9) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(9)));
								}
							}
						}
					});
					
					//Boton 11
					btn11.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=10) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=10) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(10)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=10) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=10) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(10)));
								}
							}
						}
					});
					
					//Boton 12
					btn12.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (rdbtnAm.isSelected()) {
								if (FuncionesRadio.listaAM.size()<=11) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaAM.size()>=11) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaAM.get(11)));
								}
								
							}else if (rdbtnFm.isSelected()) {
								if (FuncionesRadio.listaFM.size()<=11) {
									JOptionPane.showMessageDialog(null, "No tiene emisoras guardadas!");
								}else if (FuncionesRadio.listaFM.size()>=11) {
									lblEstacionActual.setText(String.valueOf(FuncionesRadio.listaFM.get(11)));
								}
							}
						}
					});
					
					
					
				}
				
			}
		});
		
		btnApagado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnApagado.isEnabled()){
					
					btnApagado.setEnabled(false);
					btn1.setEnabled(false);
					btn2.setEnabled(false);
					btn3.setEnabled(false);
					btn4.setEnabled(false);
					btn5.setEnabled(false);
					btn6.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					btn10.setEnabled(false);
					btn11.setEnabled(false);
					btn12.setEnabled(false);
					rdbtnAm.setEnabled(false);
					rdbtnFm.setEnabled(false);
					spinner.setEnabled(false);
					btnOn.setEnabled(true);
					btnGuardar.setEnabled(false);
					
				}
			}
		});
		
	}
}