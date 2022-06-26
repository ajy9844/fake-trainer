
import java.util.*;
/**
 * Part Ŭ������ Ư�� ������ ����� ��� �����ϱ� ���� �ʿ��� Ŭ�����̴�.
 * '������� � �߰�'����� AddExerciseInfo() �޼ҵ带 ����Ͽ� �����Ѵ�.
 * 
 * @author LEE JAE-HYUB
 */
public class Part {
	
	String BodyName;	// BodyName (��, ����, �ھ� ... )
	// List of Exercise for given BodyName( BodyName:�ھ�, ExInfoList: [�a��ũ, ����Ʈ �÷�ũ, ...] )
	List <ExerciseInfo> ExInfoList = new ArrayList<ExerciseInfo>();
	
	public Part(String BodyName) {
		this.BodyName = BodyName;
	}
	
	/**
	 * �ϳ��� ExerInfo�� PartŬ���� ������ ExInfoList�� �߰��Ѵ�.
	 */
	public void AddExerciseInfo(String ExName, int BaseCount, int BaseTime, int KcalPer, String url) {
		ExerciseInfo e = new ExerciseInfo(ExName, BaseCount, BaseTime, KcalPer, url);
		this.ExInfoList.add(e);
	}
	
}