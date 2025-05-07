package c.model;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String name) {
		this.name = name;
	}
	public MemberDTO(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public MemberDTO(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public static void main(String[] args) {
	MemberDTO dto = new MemberDTO("뫄", "0215", "mumemimu@gmail.com");
	MemberDTO dto2 = new MemberDTO("몌무", "0912", "mumemimu@gmail.com");
//	System.out.println("Name = " + dto.name + " Phone = " + dto.phone + " eMail = " + dto.email);
	System.out.println(dto);
	System.out.println(dto2);
	}
	public String toString() {
		return "Name= " + name + " Phone= " + phone + " eMail= " + email;
	}
}

