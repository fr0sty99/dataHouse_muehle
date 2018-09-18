package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import assets.AppColors;

public class PlayerView {
	public JSplitPane panel;
	public JLabel playerOneLabel;
	public JLabel playerTwoLabel;

	// width should be windowd width and height should be like 120
	public PlayerView(int viewWidth, int viewHeight) {
		// add playerPanel, which is responsible for showing the playernames and pieces to set, in the specific player color.
		panel = new JSplitPane();
		panel.setBackground(Color.GREEN);
		Dimension playerPanelDimension = new Dimension(viewWidth, viewHeight);
		panel.setPreferredSize(playerPanelDimension);
		panel.setMaximumSize(playerPanelDimension);
		
		panel.setBackground(AppColors.panelDefaultColor);
		
		// create the labels for our component

		playerOneLabel = new JLabel("Player 1");
		playerOneLabel.setForeground(AppColors.playerOneColor);
		
		playerTwoLabel = new JLabel("Player 2");
		playerTwoLabel.setForeground(AppColors.playerTwoColor);		
		
		// split our splitPane
		panel.setDividerSize(0);
		panel.setDividerLocation(viewHeight/2);
		
		// set orientation and components of our splitPane
		panel.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panel.setTopComponent(playerOneLabel);
		panel.setBottomComponent(playerTwoLabel);
	}
	
	public JSplitPane getPlayerView() {
		return panel;
	}
}