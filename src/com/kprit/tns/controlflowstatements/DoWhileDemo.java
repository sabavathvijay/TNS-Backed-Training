package com.kprit.tns.controlflowstatements;

import java.util.Scanner;

public class DoWhileDemo {
	//Do-while Loop Method
	
	/*
	 It is Login confirmation and Validation  loop logic
	 we could  login if we want , else exit , and if we want login after login=No , just change exit= no 
	 and the again it ask for name and login , now choose login=yes; 
	 and enter email and you we'll be logined ..!  
	 
	 */
	
	//
	static String email;
	static String exit = "yes";
	static String login = "yes";
	static String password;

	
		void do_while_loop() {
			System.out.println(" This is do_while__loop Method \n ");
			Scanner sc = new Scanner(System.in);
			String name;
			
			String userChoice;
			
			System.out.println(" Enter Detail to Login");
			do {
				
				System.out.println(" Enter Your name = ");
				name =sc.nextLine();
				
				if(true) {
					System.out.println(name);
					System.out.println("Want to login ?");
					String userlogin =sc.nextLine();
					
					
					
					if(login.equals(userlogin)) {
						
						System.out.println(" Enter Your Email = ");
						email =sc.nextLine();
						
						System.out.println(" Enter Your Password = ");
						password =sc.nextLine();
						
						System.out.println("Hello "+name );
						System.out.println("Your email : "+email );
						
					System.out.println(" Welcome You Logined 🤗 ");	
					}else {
						System.out.println(" No problem \n 😊 Have Great Day");
					}
					
				
					
					
				}
				
				System.out.println(" Do you want to Exit ? ");
				
				 userChoice =sc.nextLine();
				
			}while( ! userChoice.equals(exit)); 
			/*
			 We have two ways to comparisons : 
			 1.  " == " => It compares the Memory Address of 2 Objects (copied of main Object can be Same with Main Object Address)
			 2. " .equals() " => It compares Value/Content of the Objects (for string comparison of different variable we use .equal() bcz , memory Address are Different  )
			 
			 
			 */
			
			//for string match we use '.equals()' method instead the '=='
												//because .equals() compare content , 
												//where as '==' compare memory Addresses of 2 Objects
			sc.close();
		}

}
