

import java.util.List;


public class University {

	private String name;
	
	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + ", slist="
				+ slist + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Student> getSlist() {
		return slist;
	}
	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}
	private String address;
	private  List<Student> slist;
	
	public  List<Student> intialize(){
		UniversityUtility u=new UniversityUtility();
		List<Student> list=u.getStudentsList();
		
		return list;
	}
	
	
}
