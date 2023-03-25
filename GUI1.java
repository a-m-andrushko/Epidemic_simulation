package panel1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI1 extends JFrame
{
	
	JPanel upperLeft, upperCentral, upperRight, lowerLeft, lowerCentral, lowerRight;
	JCheckBox highContrastMode, hygiene, medicine;
	JButton chooseColors;
	Color color = (Color.white), backgroundColor = new Color(179, 235, 255);
	JComboBox chooseDisease, chooseLanguage;
	String diseases[], languages[];
	JSlider tempo;
	JLabel chooseTempo;
	JButton SAVE, START, EXIT;

	private static final long serialVersionUID = 1L;
	static final int SLIDER_MIN = 1;
	static final int SLIDER_MAX = 10;
	static final int SLIDER_INIT = 5;
	
	public GUI1() throws HeadlessException
	{
		this.setSize(500, 500);
		this.setLayout(new GridLayout(2, 3));
		
		upperLeft = new JPanel();
		upperLeft.setBackground(backgroundColor);
		//upperLeft.setLayout(new GridLayout(2, 1));
		highContrastMode = new JCheckBox("Tryb dla niedowidzących");  
        //highContrastMode.setBounds(100, 100, 50, 50);
        highContrastMode.setSize(highContrastMode.getPreferredSize());
        upperLeft.add(highContrastMode);
        chooseColors = new JButton("Wybór kolorów");
		ActionListener colorListener = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				color = JColorChooser.showDialog(null, "Wybór kolorów", color);
				
				if(color == null)
				{
					color = (Color.white);
				}
			}	
		};
		chooseColors.addActionListener(colorListener);
		upperLeft.add(chooseColors);
		
		
		upperCentral = new JPanel();
		upperCentral.setBackground(backgroundColor);
		diseases = new String[] {"Wybór choroby:", "1", "2", "3"};
		chooseDisease = new JComboBox(diseases);
		chooseDisease.setSelectedIndex(0);
		languages = new String[] {"Język:", "Polski", "English"};
		chooseLanguage = new JComboBox(languages);
		chooseLanguage.setSelectedIndex(0);
		upperCentral.add(chooseDisease);
		upperCentral.add(chooseLanguage);
		
		
		upperRight = new JPanel();
		upperRight.setBackground(backgroundColor);
		tempo = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);
		tempo.setMajorTickSpacing(1);
		tempo.setPaintLabels(true);
		chooseTempo = new JLabel("Tempo symulacji");
		hygiene = new JCheckBox("Higiena"); 
		medicine = new JCheckBox("Rozwój medycyny");
		upperRight.add(tempo);
		upperRight.add(chooseTempo);
		upperRight.add(hygiene);
		upperRight.add(medicine);
		
		
		lowerLeft = new JPanel();
		lowerLeft.setBackground(backgroundColor);
		SAVE = new JButton("SAVE");
		lowerLeft.add(SAVE);
		
		
		lowerCentral = new JPanel();
		lowerCentral.setBackground(backgroundColor);
		START = new JButton("START");
		lowerCentral.add(START);
		
		
		lowerRight = new JPanel();
		lowerRight.setBackground(backgroundColor);
		EXIT = new JButton("EXIT");
		lowerRight.add(EXIT);
		
		add(upperLeft);
		add(upperCentral);
		add(upperRight);
		add(lowerLeft);
		add(lowerCentral);
		add(lowerRight);
	}

	public static void main(String[] args) 
	{
		GUI1 frameGUI1 = new GUI1();
		frameGUI1.setVisible(true);
	}

}
