
import java.util.*;
/**
 * Part 클래스는 특정 부위의 운동끼리 묶어서 저장하기 위해 필요한 클래스이다.
 * '운동부위별 운동 추가'기능은 AddExerciseInfo() 메소드를 사용하여 수행한다.
 * 
 * @author LEE JAE-HYUB
 */
public class Part {
	
	String BodyName;	// BodyName (등, 가슴, 코어 ... )
	// List of Exercise for given BodyName( BodyName:코어, ExInfoList: [픞랭크, 사이트 플랭크, ...] )
	List <ExerciseInfo> ExInfoList = new ArrayList<ExerciseInfo>();
	
	public Part(String BodyName) {
		this.BodyName = BodyName;
	}
	
	/**
	 * 하나의 ExerInfo를 Part클래스 내부의 ExInfoList에 추가한다.
	 */
	public void AddExerciseInfo(String ExName, int BaseCount, int BaseTime, int KcalPer, String url) {
		ExerciseInfo e = new ExerciseInfo(ExName, BaseCount, BaseTime, KcalPer, url);
		this.ExInfoList.add(e);
	}
	
}
