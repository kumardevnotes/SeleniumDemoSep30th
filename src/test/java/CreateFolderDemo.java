import java.io.File;
import java.io.IOException;

public class CreateFolderDemo {

	public static void main(String[] args) throws IOException {
		
		String rootpath = System.getProperty("user.dir");
		
		File fileObj = new File(rootpath + "//src//test//java//TestFolder");
		
		if(fileObj.mkdir()) {
			System.out.println("new folder is created!");
		}
		else {
			System.out.println("folder is already existed!");
		}
    
		File fileObj1 = new File(rootpath + "//src//test//java//TestFolder//TestDoc.pdf");
		
		if(fileObj1.createNewFile()) {
			System.out.println("new pdf doc is created!");
		}
		else {
			System.out.println("pdf doc is already existed! So deleteting it!");
			fileObj1.delete();
			System.out.println("Creating a new pdf doc again");
			fileObj1.createNewFile();
			System.out.println("new pdf doc is created again!");
		}
	}

}
