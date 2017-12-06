
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class OnlineUsers extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JList list;

	public OnlineUsers() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200, 320);
		setTitle("Online Users");
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gridLayoutContentPane = new GridBagLayout();
		gridLayoutContentPane.columnWidths = new int[] { 0, 0 };
		gridLayoutContentPane.rowHeights = new int[] { 0, 0 };
		gridLayoutContentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridLayoutContentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gridLayoutContentPane);

		list = new JList();
		GridBagConstraints gridList = new GridBagConstraints();
		gridList.fill = GridBagConstraints.BOTH;
		gridList.gridx = 0;
		gridList.gridy = 0;
		JScrollPane p = new JScrollPane();
		p.setViewportView(list);
		contentPane.add(p, gridList);
		list.setFont(new Font("Verdana", 0, 24));
	}

	public void update(String[] users) {
		list.setListData(users);
	}

}
