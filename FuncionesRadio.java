import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 * @author Mario de Leon
 *
 */

public class FuncionesRadio implements RadioInterface{
	
	private boolean estado;
	static List<String> listaAM = new ArrayList<String>();
	static List<String> listaFM = new ArrayList<String>();
	//static List<Integer> listaBotones = new ArrayList<Integer>();
	
	
	
	public FuncionesRadio() {
		
		estado = false;

	}
	

	@Override
	public String estacionActual() {
		// TODO Auto-generated method stub
		String actual = "La estación actual la puede consultar en su pantalla. La estacion guardada se mostrara en grande al "
				+ "seleccionar uno de los 12 botones.";
		return actual;
	}

	@Override
	public boolean estado() {
		// TODO Auto-generated method stub
		return estado;
	}

	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		
		if (estado == false) {
			estado = true;
			JOptionPane.showMessageDialog(null, "Bienvenido!");
		}else if (estado == true) {
			estado = false;
			JOptionPane.showMessageDialog(null, "Hasta pronto!");
		}
		
	}

	@Override
	public void cambiarFrecuencia() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Las estaciones AM estan disponibles desde la 530 a la 1610. Las estaciones FM estan disponibles desde la"
				+ " 87.9 a la 107.9.");
	}

	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardar(int boton) {
		// TODO Auto-generated method stub
		if(boton < 200) {
			JOptionPane.showMessageDialog(null, "Puede guardar hasta 12 emisoras FM distintas!");
		}else if (boton > 200){
			JOptionPane.showMessageDialog(null, "Puede guardar hasta 12 emisoras AM distintas!");
		}else {
			JOptionPane.showMessageDialog(null, "Puede guardar hasta 12 emisoras AM y 12 emisoras FM distintas!");
		}

	}

	@Override
	public void seleccionarEmisora(int boton) {
		// TODO Auto-generated method stub
		final int TIME_VISIBLE = 3000;
		
		JOptionPane pane = new JOptionPane("Sintonizando la emisora guardada. Por favor espere unos segundos...", JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = pane.createDialog(null, "Sintonizando. Por favor espere...");
        dialog.setModal(false);
        dialog.setVisible(true);
		

		new Timer(TIME_VISIBLE, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.setVisible(false);
			}
		}).start();
		
	}
	

}
