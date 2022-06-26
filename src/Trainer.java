
import java.util.*;
/**
 * Trainer 클래스는'가짜 트레이너'프로그램 동작을 위한 클래스이다.
 * 이 클래스는 main method를 가지고 있으며, 사용자에 의해 프로그램의 기능이 선택될 수 있도록 전반적인 흐름을 제공한다.
 * 
 * @author LEE JAE-HYUB, HUH CHANG-HYUN
 */
public class Trainer {
	
	public static void main(String[] arg) {
						
		Lists Base  = new Lists();
		Scanner sc = new Scanner(System.in);
		int temp;
		int option = 0;
		int option2 = 0;
		int option3 = 0;
		int option4 = 0;
		int option5 = 0;
		int option6 = 0;
		boolean exist = false;
		boolean d = true;
		
		String ID = "";

		while(option !=3) {
			System.out.println("가짜 트레이너에 오신 것을 환영합니다.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			try {
			option = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 처음 화면으로 돌아갑니다.");
				System.out.println("-----------------------");
				sc.nextLine();
				continue;
			}
			if(option !=1 && option !=2 && option !=3) {
				System.out.println("잘못된 입력입니다. 처음 화면으로 돌아갑니다.");
				System.out.println("-----------------------");
				sc.nextLine();
				continue;
			}
			
			sc.nextLine();
			
			switch(option) {
				case 1:
					System.out.println("가입할 ID를 입력해 주세요.");
					ID = sc.nextLine();
					
					exist = Customer.existCustomer(ID);
					if(exist ==false) {
						Customer c = new Customer(ID);
						Customer.addCustomer(c);
						System.out.println("회원가입이 완료되었습니다!");
					}
					
					while(exist){
						System.out.println("해당 ID는 이미 사용 중이거나 입력이 빈칸입니다.");
						System.out.println("1.새로운 ID 입력");
						System.out.println("2.메인 화면으로 돌아가기");
						
						temp = sc.nextInt();
						sc.nextLine();
						
						switch(temp){
							case 1:
								System.out.println("가입할 ID를 입력해 주세요.");
								ID = sc.nextLine();
								exist = Customer.existCustomer(ID);
								if(exist) 	break;
								
								Customer.addCustomer(new Customer(ID));
								System.out.println("회원가입이 완료되었습니다.");
								break;
								
							case 2:
								exist = false;
								break;
						} // switch()
					} // while()
					break;
					
				case 2:
					while(option == 2) {
						System.out.println("ID를 입력해 주세요.");
						
						ID = sc.nextLine();
						exist = Customer.existCustomer(ID);
						if(exist) break;
						while(!exist) {
							System.out.println("존재하지 않는 ID 입니다.");
							System.out.println("1.ID 다시 입력하기");
							System.out.println("2.프로그램 종료");
							try{
								temp = sc.nextInt();
							}
							catch(InputMismatchException e) {
								System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
								System.out.println("-----------------------");
								sc.nextLine();
								continue;
							}
								
							if(temp == 1) {
								exist = true;			
							}
							else if(temp==2) {
								System.out.println("프로그램을 종료합니다.");
								System.exit(0);
							}
							if(temp!=1 && temp!=2) {
								System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
								System.out.println("-----------------------");
								sc.nextLine();
								continue;
							}
							sc.nextLine();
						}
					}
					
					System.out.println(ID + "님 환영합니다.");
					Customer cus = new MyCalendar(ID); // polymorphism!
					Day exer_records = cus.login();
					
					while(option2 != 3) {	
						if(option2 == 0) {
						System.out.println("-----------------------");
						System.out.println("1. 운동하기");
						System.out.println("2. 캘린더 확인 후 종료하기");
						System.out.println("3. 종료하기");
						try{
							option2 = sc.nextInt();
						}
						catch(InputMismatchException e) {
							System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
							sc.nextLine();
							continue;
						}
						sc.nextLine();
						}
						
						outer:
						switch(option2) {
							case 1:
								System.out.println("--------------------");
								System.out.println("운동 부위를 선택해 주세요.");
								System.out.println("1. 가슴");
								System.out.println("2. 등");
								System.out.println("3. 코어");
								System.out.println("4. 복근");
								System.out.println("5. 하체");
								System.out.println("6. 운동종료");
								try{
									option3 = sc.nextInt();
								}
								catch(InputMismatchException e) {
									System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
									sc.nextLine();
									continue;
								}
								
								sc.nextLine();
								if(option3<1 || 6<option3) {
									System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
									continue;
								}
								else if(option3 == 6) {
									option2 = 0;
									break;
								}
								
								d=true;
								while(d) {
									System.out.println("--------------------");
									System.out.println("운동 방법을 선택하세요");
									for(int i=0; i<Base.Part_List.get(option3-1).ExInfoList.size();i++) {
										System.out.println((i+1) +". " +Base.Part_List.get(option3-1).ExInfoList.get(i).ExName);
									}	
									try{
										option4 = sc.nextInt();
									}
									catch(InputMismatchException e) {
										System.out.println("잘못된 입력입니다.이전 화면으로 돌아갑니다.");
										sc.nextLine();
										continue;
									}
								
									sc.nextLine();
									if(option4<1 || Base.Part_List.get(option3-1).ExInfoList.size()<option4) {
										System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
										continue;
									}
									d = false;
								}
								
								d = true;
								while(d) {
									System.out.println("--------------------");
									System.out.println("난이도를 선택해 주세요. (1:하, 2:중, 3:상)");
									
									try{
										option5 = sc.nextInt();
									}
									catch(InputMismatchException e) {
										System.out.println("잘못된 입력입니다.이전 화면으로 돌아갑니다.");
										sc.nextLine();
										continue;
									}
									if(option5<1 || 3<option5) {
										System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
										continue;
									}
									
									sc.nextLine();
									d = false;
								}
								
								System.out.println("--------------------");
								System.out.println("선택하신 운동 부위는 "+ Base.Part_List.get(option3-1).BodyName);
								System.out.println("선택하신 운동 방법은 " + Base.Part_List.get(option3-1).ExInfoList.get(option4-1).ExName);
								System.out.println("난이도는 " + option5 + " 단계입니다.");
								System.out.println("반복 횟수는 " +  Base.Part_List.get(option3-1).ExInfoList.get(option4-1).BaseCount * (option5+1)+"회");
								System.out.println("제한 시간은 " +  Base.Part_List.get(option3-1).ExInfoList.get(option4-1).BaseTime * (option5+1) + " 초");
								System.out.println("예상 Kcal 소모량은 " + Base.Part_List.get(option3-1).ExInfoList.get(option4-1).KcalPer * (option5+1) + " Kcal 입니다.");
								
								// Show the Video about ExName
								d = true;
								while(d) {
									System.out.println(Base.Part_List.get(option3-1).ExInfoList.get(option4-1).ExName + "안내 영상을 보시겠습니까? (1. YES, 2.NO )");
									try{option6 = sc.nextInt();}
									catch(InputMismatchException e) {
										System.out.println("잘못된 입력입니다.이전 화면으로 돌아갑니다.");
										sc.nextLine();
										continue;
									}
									if(option6<1 || 2<option6) {
										System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
										continue;
									}
									sc.nextLine();
									d=false;
								}
								if(option6 ==1)	Module_Methods.ShowVideo(Base.Part_List.get(option3-1).ExInfoList.get(option4-1).url);
								
								d = true;
								while(d) {
									System.out.println("운동을 시작하시겠습니까? 1. YES, 2. NO");
									try{option6 = sc.nextInt();}
									catch(InputMismatchException e) {
										System.out.println("잘못된 입력입니다.이전 화면으로 돌아갑니다.");
										sc.nextLine();
										continue;
									}
									if(option6<1 || 2<option6) {
										System.out.println("잘못된 입력입니다. 이전 화면으로 돌아갑니다.");
										continue;
									}
									sc.nextLine();
									d=false;
								}
								
								if(option6 == 2) {
									System.out.println("운동 부위 선택 화면으로 돌아갑니다.");
									break outer;
								}

								// Start the time watch for given limit time
								Module_Methods.TimeWatch(Base.Part_List.get(option3-1).ExInfoList.get(option4-1).BaseTime * (option5+1));
								
								cus.exercise(exer_records, new TodayExer(Base.Part_List.get(option3-1).BodyName, Base.Part_List.get(option3-1).ExInfoList.get(option4-1).ExName,Base.Part_List.get(option3-1).ExInfoList.get(option4-1).KcalPer * (option5+1)));
								cus.writeCalendar(exer_records);
								
								option2 = sc.nextInt();
								break;
								
							case 2:
								cus.checkCalendar();
								option2=3;
								option =3;
								break;
								
							case 3:
								option = 3;
								System.out.println("프로그램을 종료합니다.");
								break;				
								
							default:
								option2 =0;
								System.out.println("잘못된 입력입니다.");
								break;
						}
					}
					break;
					
					
				case 3:
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;			
			}
		} // while()
		sc.close();
	} // main()

}
