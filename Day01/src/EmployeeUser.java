
public class EmployeeUser {

	public static void main(String[] args) {
		Employee sam = new Employee();
		sam.id = "kwfuy";
		sam.name = "Sam Thomas";
		sam.salary = 239847;
		
		MedicalInsurance mediAssist = new MedicalInsurance();
		mediAssist.duration = 12;
		mediAssist.premium = 10000;
		
		sam.medicalInsurance = mediAssist;
		
		mediAssist.duration = 15;
		System.out.println(sam.medicalInsurance.duration);
		
		sam.medicalInsurance.premium = 20000;
		System.out.println(mediAssist.premium);
		
	}

}
