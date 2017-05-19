package sheet5CreatingClasses;

public class Ex4Email {

	private String email;
	private String password;
	private int maxStorage;
	public static int id;
	
	public static final int MB_50 = 1;
	public static final int GB_100 = 2;
	public static final int GB_500 = 3;
	public static final int TR_1 = 4;
		
	public Ex4Email() {
		id++;
	}
	
	public Ex4Email(String email, String password, int maxStorage) {
		this();
		setEmail(email);
		setPassword(password);
		this.maxStorage=maxStorage;
					
	}
	public void setEmail(String email){
		if(email.contains("@") && email.contains(".") && email.indexOf('@')<(email.lastIndexOf('.')) )
			this.email = email;
			else 
			System.out.println("'@' symbol should be before '.'");
	}
	public void setPassword(String password){
		if ((password.length()) >= 7)
			this.password=password;
		else
			System.out.println("Password should contain at least 7 characters");
		
	}
	public void setStorage(int maxStorage){
		if (maxStorage >= 1 && maxStorage <= 8)
			this.maxStorage = maxStorage;
		else
			System.out.println("Invalid storage");
	}
	
	public String getEmail (){
		return email;
	}
	public String getPassword(){
		return password;
	}
	
	public int getStorage(){
		return maxStorage;
	}	
		
	public String getStorageString(){

		switch (maxStorage){
		case MB_50:
			return "50 MB";
		case GB_100:
			return "100 GB";
		case GB_500:
			return "500 GB";
		case TR_1:
			return "1 TR";
	
		default:
			return "Storage not set";
		}
	}		
			
	public String toString(){
		return 	"id: " + id +
				"\nemail: "+ email +
				"\npassword: " + password +
				"\nmax storage: " + getStorageString();
			
	}
}
