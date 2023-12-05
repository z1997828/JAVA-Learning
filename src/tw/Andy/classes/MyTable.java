package tw.Andy.classes;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class MyTable extends JTable{
	private MyModel myModel;
	private FoodDB foodDb; 
	
	public MyTable() {
		
		try {
			foodDb = new FoodDB();
			foodDb.queryDB();
		} catch (Exception e) {
			System.out.println(e);
		}
		myModel = new MyModel();
		setModel(myModel);
		
		myModel.setColumnIdentifiers(foodDb.getHeader()	);
		
	}
	
	public void delData() {
		int n = getSelectedRow();
		if(n >= 0) {
			try {
				foodDb.delRow();
				repaint();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	

	
	private class MyModel extends DefaultTableModel{

		public int getRowCount() {
			return foodDb.getRows();
		}

	
		public int getColumnCount() {
			
			return foodDb.getRCols();
		}
		
		public Object getValueAt(int row,int column) {
			
			return foodDb.getData(row+1,column+1);
		}
		

		public void setValueAt(Object aValue, int row, int column) {
			foodDb.updateDB(row+1, column+1, (String)aValue);
		}


		public boolean isCellEditable(int row, int column) {
			boolean isEditable = true;
			if(column == 0 ) isEditable = false;
				
			return isEditable;
		}
	}

	public void moveNewRow() {
		// TODO Auto-generated method stub
		foodDb.moveNewRow();
		repaint();
	}

	
}
