package org.samples;

public class CompanyInfo {
	//argument depends on datatype count
	private void compDetails(String name) {
		System.out.println("employee name is:"+ name);
		int a=10;
		int a1=20;
		
	}
	private void compDetails(String email, int empId ) {
		System.out.println("employee email is:"+email+"\n"+"employee empid is:"+empId);
	}
	//argument depend on datatype
	private void compDetails(float salary) {
		System.out.println("employee salary is:"+salary);
	}
	private void compDetails(long phone) {
		System.out.println("employee phone is:"+phone);
	}
	//argument depend on datatype order
	private void compDetails(int landline, char grade) {
		System.out.println("employee landline is:"+landline+"\t"+"employee grade is:"+grade);

	}
	private void compDetails(char grade,int landline ) {
		System.out.println("employee grade is:"+grade+"\t"+"employee landline is:"+landline);
	}
	public static void main(String[] args) {
		CompanyInfo a = new CompanyInfo();
		a.compDetails("kavin");
		a.compDetails("erpradhap.10@gmail.com", 2345);
		a.compDetails(354.456767f);
		a.compDetails(9677612053l);
		a.compDetails(876543987, 'A');
		a.compDetails('A',876543987);
		
	}
	

}
