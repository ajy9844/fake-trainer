
import java.io.File;
/**
 * Directory 클래스는 디렉토리 확인 및 생성을 위한 클래스이다.
 * '디렉토리 확인'기능은 existDirectory() 메소드를 사용하여 수행한다.
 * '디렉토리 생성'기능은 makeDirectory()  메소드를 사용하여 수행한다.
 * 
 * <b>History:</b>
 * 		ANJIYOUNG, 1.0.0, 2020.12.11  초기작성
 * 		ANJIYOUNG, 1.0.1, 2020.12.24
 * 
 * @author ANJIYOUNG
 * @version 1.0.1 2020.12.24
 */
public class Directory {
	
	private String rootPath; // 현재 작업 경로
	private String path;	 // 디렉토리 경로
	private String dirName;  // 디렉토리 이름
	
	public Directory() {
		
	}
	
	public Directory(String dirName) {
		File file = new File(".");
		rootPath = file.getAbsolutePath();
		path = rootPath + "\\" + dirName;
		this.dirName = dirName;
	}
	
	public String getPath() {
		return path;
	}

	public String getDirName() {
		return dirName;
	}
	
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	/**
	 * 'path'경로에 'dirName'디렉토리가 존재하는지 확인한다.
	 */
	public boolean existDirectory() {
		File dir = new File(path);
		if (dir.exists()) 
			return true;
		else 
			return false;
	}
	
	/**
	 * 'path'경로에 'dirName'디렉토리를  생성한다.
	 */
	public void makeDirectory() {
		File dir = new File(path);
		if (!dir.exists())
			dir.mkdir(); // If the directory does not exist, create a directory.
	} 
	
}
