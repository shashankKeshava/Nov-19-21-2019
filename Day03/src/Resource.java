public class Resource implements AutoCloseable {
	public Resource() {
		System.out.println("***Resource created ");
	}

	public void close()  {
		System.out.println("****Resource cleaned");
	}
}
