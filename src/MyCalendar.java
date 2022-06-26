
import javax.swing.SwingUtilities;
/**
 * MyCalendar 클래스는 캘린더 작성을 위한 클래스이다.
 * 
 * '날짜정보 스트링 생성'기능은 makeDateLog() 메소드를 사용하여 수행한다.
 * '운동기록 스트링 생성'기능은 makeUserLog() 메소드를 사용하여 수행한다.
 * '달력 작성하기'기능은 writeCalendar() 메소드를 사용하여 수행한다.
 * '달력 보기'기능은 checkCalendar() 메소드를 사용하여 수행한다.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  초기작성
 * 		ANJIYOUNG, 1.0.1, 2020.12.25 
 * 		ANJIYOUNG, 1.0.2, 2020.12.27 상속관계 수정
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.27
 */
public class MyCalendar extends Customer {
	
	public MyCalendar() {
		
	}
	
	public MyCalendar(String ID) {
		super(ID);
	}

	/**
	 * Day 객체로부터 당일 날짜정보(year/month/date)를 각각 읽어서 하나의 스트링으로 합친다. 
	 * 
	 * @param  date_records 당일 날짜정보
	 * @return 날짜정보
	 */
	private String makeDateLog(Day date_records) {
		String dateLog = "";
		dateLog += Integer.toString(date_records.getYear());
		dateLog += Integer.toString(date_records.getMonth());
		dateLog += Integer.toString(date_records.getDate());
		return dateLog;
	}
	
	/**
	 * Day 객체로부터 하루 운동기록(운동종류+소모된칼로리)을 읽어서 하나의 스트링으로 합친다.
	 * 
	 * @param  exer_records 하루 운동기록
	 * @return 운동기록
	 */
	private String makeUserLog(Day exer_records) {
		String userLog = "";
		int size = exer_records.getExerNum();
		TodayExer exer;
		
		for (int i = 0; i < size; i++) {
			exer = exer_records.getExerList(i);
			userLog += exer.getExPart();
			userLog += "[" + exer.getExName() + "]-";
		}
		userLog += Integer.toString(exer_records.getCalorieSum()) + "Kcal\n";
		return userLog;
	}
	
	/**
	 * 하루동안 수행한 운동 목록과 소비한 칼로리 정보를 한 줄의 스트링으로 만들고,
	 * 사용자의 캘린더에 해당 스트링을 작성한다.
	 * 
	 * @param exer_records 하루 운동기록
	 */
	@Override
	public void writeCalendar(Day exer_records) {
		FileOP file_op = new FileOP(getID());
		String dateLog = makeDateLog(exer_records);
		String userLog = makeUserLog(exer_records);
		file_op.writeFile(dateLog, userLog);
	}
	
	/**
	 * 운동기록이 저장된 캘린더를 보여준다.
	 */
	@Override
	public void checkCalendar() {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new MemoCalendar(getID());
			}
		});
	}
	
}
