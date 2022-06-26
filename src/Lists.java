
import java.util.*;
/**
 * Lists 클래스는 운동정보를 운동부위별로 분류하여 저장하기 위해 필요한 클래스이다.
 * 
 * @author HUH CHANG-HYUN
 */
public class Lists {

	public final ArrayList<Part> Part_List = new ArrayList<Part>();

	public Lists() {
		Part p1 = new Part("가슴");
		p1.AddExerciseInfo("패러럴 푸쉬업", 20, 120, 18,
				"https://www.youtube.com/watch?v=-_DUjHxgmWk&list=PLzHSf8hnzg85NC8bY1_64OBCTncMmmFUB");
		p1.AddExerciseInfo("힌두 푸쉬업", 15, 90, 18, "https://www.youtube.com/watch?v=vhFqzT_D3kc");
		p1.AddExerciseInfo("다이아몬드 푸쉬업", 15, 90, 18, "https://www.youtube.com/watch?v=GZrKaAvShbA");
		p1.AddExerciseInfo("무릎 푸쉬업", 15, 90, 10, "https://www.youtube.com/watch?v=TSGR0rqhxo0");
		p1.AddExerciseInfo("의자 딥스", 15, 90, 15, "https://www.youtube.com/watch?v=8KuqUSAgYqY");
		Part_List.add(p1);

		Part p2 = new Part("등");
		p2.AddExerciseInfo("의자 리버스 로우", 20, 120, 25, "https://www.youtube.com/watch?v=XZV9IwluPjw");
		p2.AddExerciseInfo("슈퍼맨 로우", 15, 90, 18, "https://www.youtube.com/watch?v=jv-ccooNVLk");
		p2.AddExerciseInfo("리버스 백플라이", 15, 90, 18, "https://www.youtube.com/watch?v=9q_uz605P_k");
		p2.AddExerciseInfo("백 익스텐션", 10, 60, 10, "https://www.youtube.com/watch?v=0gRQTOiL1HQ");
		Part_List.add(p2);

		Part p3 = new Part("코어");
		p3.AddExerciseInfo("플랭크", 1, 30, 27, "https://www.youtube.com/watch?v=QkCHldUiFt4");
		p3.AddExerciseInfo("사이드 플랭크", 1, 10, 20, "https://www.youtube.com/watch?v=MD3vCPQi7WU"); // 20
		p3.AddExerciseInfo("리버스 플랭크", 1, 20, 20, "https://www.youtube.com/watch?v=xVTmi3peEvU");
		p3.AddExerciseInfo("트위스트 플랭크", 15, 90, 18, "https://www.youtube.com/watch?v=f1L6ch1y5YA");
		Part_List.add(p3);

		Part p4 = new Part("복근");
		p4.AddExerciseInfo("싯업", 30, 90, 27, "https://www.youtube.com/watch?v=80N4tDCyzKc");
		p4.AddExerciseInfo("크런치", 20, 90, 12, "https://www.youtube.com/watch?v=NpsdFbhAR0Q");
		p4.AddExerciseInfo("레그레이즈", 20, 90, 12, "https://www.youtube.com/watch?v=TbjbJKqz6vI");
		p4.AddExerciseInfo("힐터치", 20, 90, 18, "https://www.youtube.com/watch?v=fP55EzRZM2g");
		p4.AddExerciseInfo("바이시클 크런치", 15, 60, 10, "https://www.youtube.com/watch?v=B_B5C8gSP0U");
		Part_List.add(p4);

		Part p5 = new Part("하체");
		p5.AddExerciseInfo("스쿼트", 30, 120, 27, "https://www.youtube.com/watch?v=f8GRxHJhn_M");
		p5.AddExerciseInfo("와이드 스쿼트", 30, 120, 27, "https://www.youtube.com/watch?v=Gp4Cho7z5HU");
		p5.AddExerciseInfo("런지", 20, 90, 18, "https://www.youtube.com/watch?v=oYiBDWhmrX8");
		p5.AddExerciseInfo("카프레이즈", 30, 90, 18, "https://www.youtube.com/watch?v=UBEYmHEC9PE");
		p5.AddExerciseInfo("사이드 레그레이즈", 20, 90, 18, "https://www.youtube.com/watch?v=HXMb5LTtBNo");
		Part_List.add(p5);
	}

}
