package panel1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI1 extends JFrame
{
	
	JCheckBox highContrastMode, hygiene, medicine;
	JButton chooseColors;
	Color color = (Color.white), backgroundColor = new Color(179, 235, 255);
	JComboBox chooseDisease, chooseLanguage;
	String diseases[], languages[];
	JSlider tempo;
	JLabel chooseTempo;
	JButton RESET, SAVE, START, EXIT;
	JPanel panel;
	GridBagLayout layout;
	gui22 Gui2 = new gui22();

	private static final long serialVersionUID = 1L;
	static final int SLIDER_MIN = 1;
	static final int SLIDER_MAX = 10;
	static final int SLIDER_INIT = 5;
	
	public GUI1() throws HeadlessException
	{
		this.setSize(550, 325);
		this.setResizable(false);
		
		highContrastMode = new JCheckBox("Tryb dla niedowidzących");
		highContrastMode.setBackground(backgroundColor);
		
        	chooseColors = new JButton("Wybór kolorów");
		ActionListener colorListener = new ActionListener()
    		{
    			@Override
    			public void actionPerformed(ActionEvent arg0)
    			{
    			
    		      Gui2.setVisible(true);
    			}	
    		};
		chooseColors.addActionListener(colorListener);

		diseases = new String[] {"Wybór choroby:", "1", "2", "3"};
		chooseDisease = new JComboBox(diseases);
		chooseDisease.setSelectedIndex(0);
		
		languages = new String[] {"Język:", "Polski", "English"};
		chooseLanguage = new JComboBox(languages);
		chooseLanguage.setSelectedIndex(0);
		
		chooseTempo = new JLabel("Tempo symulacji");

		tempo = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);
		tempo.setBackground(backgroundColor);
		tempo.setMajorTickSpacing(1);
		tempo.setPaintLabels(true);		
		
		hygiene = new JCheckBox("Higiena"); 
		hygiene.setBackground(backgroundColor);
		
		medicine = new JCheckBox("Rozwój medycyny");
		medicine.setBackground(backgroundColor);
		
		RESET = new JButton("RESET");

		SAVE = new JButton("SAVE");

		START = new JButton("START");

		EXIT = new JButton("EXIT");
		
		ActionListener exit = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
			}	
		};
		
		panel = new JPanel();
		
		layout = new GridBagLayout(); 
		panel.setLayout(layout); 
		
		GridBagConstraints gbc = new GridBagConstraints();  
	    	gbc.fill = GridBagConstraints.HORIZONTAL; 
	    
	    	gbc.insets = new Insets(1, 1, 1, 1);
	    	gbc.gridx = 0;  
	    	gbc.gridy = 0;  
	    	panel.add(highContrastMode, gbc);  
	    
	   	gbc.insets = new Insets(5, 5, 5, 5);
	   	gbc.gridx = 1;  
	    	gbc.gridy = 0; 
	   	panel.add(chooseDisease, gbc); 
	    
	    	gbc.insets = new Insets(0, 60, 0, 50);
	    	gbc.gridx = 2;
	    	gbc.gridy = 0;
	    	panel.add(chooseTempo, gbc);
	    
	    	gbc.insets = new Insets(1, 1, 1, 1);
	    	gbc.gridx = 0;  
	    	gbc.gridy = 1;  
	    	panel.add(chooseColors, gbc);
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 1;  
	    	gbc.gridy = 1;  
	    	panel.add(chooseLanguage, gbc);
		
		gbc.insets = new Insets(50, 5, 0, 5);
	    	gbc.gridx = 1;  
	    	gbc.gridy = 3;  
	    	panel.add(RESET, gbc);
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 1;  
	    	panel.add(tempo, gbc); 
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 2;  
	    	panel.add(hygiene, gbc);
	    
	    	gbc.insets = new Insets(5, 5, 5, 5);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 3;  
	    	panel.add(medicine, gbc);
	    
		gbc.insets = new Insets(25, 0, 0, 1);
	    	gbc.gridx = 0;  
	   	gbc.gridy = 4; 
	   	panel.add(SAVE, gbc); 
	    
	    	gbc.insets = new Insets(25, 5, 0, 5);
	    	gbc.gridx = 1;  
	    	gbc.gridy = 4;  
	    	panel.add(START, gbc); 
	    
	    	gbc.insets = new Insets(25, 1, 0, 0);
	    	gbc.gridx = 2;  
	    	gbc.gridy = 4;  
	    	panel.add(EXIT, gbc); 
	    
	    	panel.setBackground(backgroundColor);
	    
	    	this.add(panel);
	}

	public static void main(String[] args) 
	{
		GUI1 frameGUI1 = new GUI1();
		frameGUI1.setVisible(true);
	}

}
