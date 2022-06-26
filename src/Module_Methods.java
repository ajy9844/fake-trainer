
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Module_Methods 클래스는 영상 시청 및 스탑워치 실행을 위해 필요한 클래스이다.
 *
 * '안내 영상 시청'기능은 ShowVideo() 메소드를 사용하여 수행한다.
 * '스탑워치'기능은 TimeWatch() 메소드를 사용하여 수행한다.
 * 
 * @author LEE JAE-HYUB
 */
public class Module_Methods {
	
	public static int count;	// for Calculating remaining time
	
	public static void TimeWatch(int limit) {
		// Using TimeWatch for "limit" seconds
		count = 0;
		Timer m_timer = new Timer();
		TimerTask m_task = new TimerTask() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				if(count < (limit/10)-1) {
					System.out.println( (limit - count*10) + " 초 남았습니다.");
					toolkit.beep();
					count++;
				}
				else if(count == (limit/10)-1) {
					System.out.println("10 초 남았습니다. 힘내세요!");
					toolkit.beep();
					count++;
				}
				else {
					toolkit.beep();
					System.out.println("수고하셨습니다.");
					System.out.println("--------------------");
					System.out.println("1. 운동하기");
					System.out.println("2. 캘린더 확인 후 종료하기");
					System.out.println("3. 종료하기");
					m_timer.cancel();
					
				}
			}
		};
		m_timer.schedule(m_task,0,10000);
	}
	
	public static void ShowVideo(String url) {
	      try
	      {
	         Desktop.getDesktop().browse(new URI(url)); 
	      }
	      catch (IOException e)
	      {
	         e.printStackTrace(); 
	      } 
	      catch (URISyntaxException e)
	      {
	         e.printStackTrace(); 
	      }
	}
	
}
