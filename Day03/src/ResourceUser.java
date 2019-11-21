
public class ResourceUser {

	public static void main(String[] args) {
//		Resource res = new Resource();
//		System.out.println("using the resource");
//		res.close();
	
		//using (Resource res = new Resource() ) {}
		try(Resource res = new Resource()) {
			System.out.println("Using the resource");
		}
		
		System.out.println("End of main");
	}

}
