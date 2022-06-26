
/**
 * Customer 클래스는 회원정보 등록 및 조회와 운동 수행을 관리하기 위한 클래스이다.
 * 
 * '회원정보 조회'기능은 existCustomer() 메소드를 사용하여 수행한다.
 * '회원정보 등록'기능은 addCustomer() 메소드를 사용하여 수행한다.
 * '로그인'기능은 login() 메소드를 사용하여 수행한다.
 * '운동하기'기능은 exercise() 메소드를 사용하여 수행한다.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  초기작성
 * 		ANJIYOUNG, 1.0.1, 2020.12.26
 * 		ANJIYOUNG, 1.0.2, 2020.12.27 상속관계 수정
 * 
 * @author AN JI-YOUNG
 * @version 1.0.2 2020.12.27
 */
public class Customer {
	
	private String ID; // 사용자 아이디

	public Customer() {
		
	}
	
	public Customer(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return ID;
	}

	/**
	 * 'ID'정보를 이름으로 하는 디렉토리가 존재하는지 확인한다: 회원정보 확인
	 * 
	 * @param  ID 사용자 아이디
	 * @return 해당 디렉토리가 존재하면 true 리턴 
	 * 					   존재하지 않으면 false 리턴
	 */
	public static boolean existCustomer(String ID) {
		Directory d = new Directory(ID);
		return d.existDirectory();
	}
	
	/**
	 * 'ID'정보를 이름으로 하는 디렉토리를 생성한다: 회원정보 등록
	 */
	public static void addCustomer(Customer c) {
		Directory d = new Directory(c.getID());
		d.makeDirectory();
	}
	
	/**
	 * 하루 운동기록을 저장하기 위한 Day 객체를 생성한다: 로그인
	 * 
	 * @return 생성된 Day 객체의 레퍼런스
	 */
	public Day login() {
		Day exer_records = new Day();
		return exer_records;
	}
	
	/**
	 * 사용자 입장에서 운동 하면,
	 * 내부적으로 Day 객체의 하루동안 수행한 운동 목록에 TodayExer 객체를  추가한다.
	 * 
	 * @param exer_records 하루 운동기록
	 * @param exer 수행한 운동정보(운동부위+운동이름+칼로리정보)
	 */
	public void exercise(Day exer_records, TodayExer exer) {
		exer_records.addTodayExer(exer);
	}
	
	public void writeCalendar(Day exer_records) {
		
	}

	public void checkCalendar() {
		
	}
	
}
