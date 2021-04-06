public class Connection implements AutoCloseable{

	public Connection() {
		System.out.println("Creating Connection");
//		throw new IllegalSelectorException();	
	}
	
	public void readData() {
		System.out.println("Receiving Data");
		throw new IllegalStateException();		
	}
	
	@Override
	public void close() {
		System.out.println("Closing Coneection");
	}
}
