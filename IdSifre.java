Scanner scanner = new Scanner(System.in);
	int giriş_hakkı = 3;
	String sys_kullanici_adi = "hoşver";
	String sys_parola = "1953";
	
	System.out.println("**************");
	System.out.println("Kullanıcı girişie Hoşgeldiniz");
	System.out.println("**************");
	
	while(true) {
		System.out.println("Kullanıcı Adı : " );
		String kullanici = scanner.nextLine();
		System.out.println("Parola :" );
		String parola = scanner.nextLine();
		
		if (kullanici.equals(sys_kullanici_adi)&& parola.equals(sys_parola)) {
			System.out.println("Hoşgeldin, " + kullanici);
			break;
			
		}
		else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
			giriş_hakkı -= 1;
			System.out.println("Kullanıcı adı yada parola hatalı " + "Kalan hak " + giriş_hakkı);
		}
		else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
			giriş_hakkı -= 1;
			System.out.println("Kullanıcı adı yada parola hatalı " + "Kalan hak " + giriş_hakkı);
		}
		else { 
			giriş_hakkı -= 1;
			System.out.println("Kullanıcı adı yada parola hatalı " + "Kalan hak " + giriş_hakkı);
			
		}
		if (giriş_hakkı == 0) {
			System.out.println("Giriş hakkınız doldu. 1 saat sonra tekrar deneyin!");
			break;
			
			}
		}
