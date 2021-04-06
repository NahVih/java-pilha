
public class TryConnection {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = new Connection();
			con.readData();
		}
		catch(IllegalStateException ex) {
			System.out.println("Error. Connection fail");
		}
		finally {
			con.End();
		}

	}

}
