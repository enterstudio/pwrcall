import jpwrcall.Node;

/**
 * 
 * @author Mark Schloesser
 */
public class jpwrtestsrv1 {
	private static Math m;

	public static class Math {
		public int add(int a, int b) {
			return a+b;
		}
		public int mul(int a, int b) {
			return a*b;
		}
	}

	public static void main(String[] args) {
		Node n = new Node("server_keystore.jks");
		jpwrtestsrv1.m = new Math();
		String ref = n.register_object(m, "mathobj");
		n.listen("0.0.0.0", 10003);
		System.out.println("Math srv ready at " + n.refurl(ref));
	}
}
