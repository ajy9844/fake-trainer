
import java.util.ArrayList;
import java.util.Calendar;
/**
 * Day 클래스는 운동기록을 저장하기 위한 클래스이다.
 * '운동기록 저장'기능은 addTodayExer() 메소드를 사용하여 수행한다.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  초기작성
 * 		ANJIYOUNG, 1.0.1, 2020.12.26
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.26
 */
public class Day {
	
	private int year;
	private int month;
	private int date;
	
	private ArrayList<TodayExer> exerList = new ArrayList<TodayExer>(); // 하루동안 수행한 운동정보를 저장
	private int exerNum;    // exerList의 사이즈
	private int calorieSum; // 하루동안 소모한 총 칼로리
	
	public Day() {
		Calendar cal = Calendar.getInstance();
		this.year = cal.get(Calendar.YEAR);
		this.month = cal.get(Calendar.MONTH) + 1;
		this.date = cal.get(Calendar.DATE);
		this.exerNum = 0;
		this.calorieSum = 0;
	}
	
	public TodayExer getExerList(int index) {
		return exerList.get(index);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public int getExerNum() {
		return exerNum;
	}

	public int getCalorieSum() {
		return calorieSum;
	}

	/**
	 * 하루동안 수행한 운동 목록(exerList)에 TodayExer 객체를 추가한다.
	 * 하루동안 소비한 칼로리 정보(calorieSum)를 업데이트한다.
	 * 
	 * @param exer 수행한 운동정보(운동부위+운동이름+칼로리정보)
	 */
	public void addTodayExer(TodayExer exer) {
		exerList.add(exer);
		exerNum++;
		calorieSum += exer.getCalorie();
	}

}
