
public class Main {

	public static void main(String[] args) {
		
		IdandPassword idandPasswords = new IdandPassword();
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

	}

}
