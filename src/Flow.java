public class Flow {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(Exception ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        }
        System.out.println("Main End");
    }

    private static void metodo1() throws MyException {
        System.out.println("Start Met1");
        metodo2();
        System.out.println("End Met1");
    }

    private static void metodo2() throws MyException {
        System.out.println("Start Met2");
        throw new MyException ("System is not working");
        //System.out.println("End Met2");
    }
}
