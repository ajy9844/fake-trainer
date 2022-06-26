
/**
 * TodayExer 클래스는 수행한 운동정보를 표현하는 클래스이다.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  초기작성
 * 		ANJIYOUNG, 1.0.1, 2020.12.26
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.26
 */
public class TodayExer {
	
	private String exPart; // exercise part: 운동부위	
	private String exName; // exercise name: 운동이름
	private int calorie;   // calorie: 칼로리정보 
	
	public TodayExer() {

	}
	
	public TodayExer(String exPart, String exName, int calorie) {	
		this.exPart = exPart;
		this.exName = exName;
		this.calorie = calorie;
	}
	
	public String getExPart() {
		return exPart;
	}

	public String getExName() {
		return exName;
	}

	public int getCalorie() {
		return calorie;
	}
	
}
