
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * FileOP 클래스는 텍스트 파일 생성과 쓰기 및 읽기를 위한 클래스이다.
 * '파일 생성'기능은 makeFile()  메소드를 사용하여 수행한다.
 * '파일 쓰기'기능은 writeFile() 메소드를 사용하여 수행한다.
 * '파일 읽기'기능은 readFile()  메소드를 사용하여 수행한다.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  초기작성
 * 		ANJIYOUNG, 1.0.1, 2020.12.25
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.25
 */
public class FileOP extends Directory {

	public FileOP() {
	
	}
	
	public FileOP(String name) {
		super(name);
	}

	/**
	 * 'date'정보를 이름으로 하는 텍스트 파일을 생성한다.
	 * 
	 * @param  date 날짜정보
	 * @return 생성된 텍스트 파일의 레퍼런스
	 */
	private File makeFile(String date) {
		String fileName = date + ".txt";
		String filePath = super.getPath() + "\\" + fileName;
		File file = new File(filePath);
		return file;
	}

	/**
	 * 디렉토리에서 'date'텍스트 파일을 찾고(없다면 파일 생성)
	 * 파일에 'userLog'정보를 쓴다.
	 * 
	 * @param date 날짜정보
	 * @param userLog 하루 운동기록
	 * @exception IOException 파일로 출력할 수 없는 경우,리소스 클로즈에 실패한 경우
	 */
	public void writeFile(String date, String userLog) {
		File file = makeFile(date);
		try(FileWriter fw = new FileWriter(file, true)) {
			fw.write(userLog);
			fw.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 'userName'디렉토리에서 'date'텍스트 파일을 찾고
	 *  전체 파일내용을 한줄씩 읽어서 출력한다.
	 * 
	 * @param userName 사용자이름
	 * @param date	       날짜정보
	 * @exception FileNotFoundException FileReader의 인자가 디렉토리이거나 파일이 존재하지 않는 경우
	 * @exception IOException <BufferedReader에서 발생>,리소스 클로즈에 실패한 경우
	 */
	public void readFile(String userName, String date) {
		File dir = new File(super.getPath());		
		if (dir.exists()) {
			String fileName = date + ".txt";
			String filePath = getPath() + "\\" + fileName;
			File file = new File(filePath);
			
			if (file.exists()) { // read the file!
				try(FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr)) {
					String line = "";
					while ((line = br.readLine()) != null) {
						System.out.println(line);
					}
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else
				System.err.println(fileName + " 파일이 존재하지 않습니다.");
		} else
			System.err.println(userName + " 디렉토리가 존재하지 않습니다.");
	}

}
