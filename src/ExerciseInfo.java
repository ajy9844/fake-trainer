
/**
 * ExerciseInfo 클래스는 하나의 운동 정보(운동이름,기본횟수,기본시간,칼로리정보,URL)를 저장하기 위해 필요한 클래스이다.
 * 
 * @author HUH CHANG-HYUN
 */
public class ExerciseInfo {
	
	String ExName; // Name of Exercise (플랭크, 스쿼트 등)
	int BaseCount; // Number of repetitions = BaseCount * Level
	int BaseTime;  // Limit time = BaseTime * Level
	int KcalPer;   // Kcal per 1 time
	String url;	   // URL for each ExName
	
	public ExerciseInfo(String ExName, int BaseCount, int BaseTime, int KcalPer, String url) {
		this.ExName=ExName;
		this.BaseCount = BaseCount;
		this.BaseTime = BaseTime;
		this.KcalPer = KcalPer;
		this.url = url;
	}
	
}
