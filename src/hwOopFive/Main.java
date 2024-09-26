package hwOopFive;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		
//		File folder = new File( "C:\\Users\\chuha\\OneDrive\\Документы\\PAJava\\hwOopFive\\practice" );
//		File[] files = folder.listFiles();
//		for( File file : files  ) {
//			if( file.isFile() ) {
//				if( ( file.getName().substring(file.getName().lastIndexOf(".") ) ).equals(".doc")  ) {
//					System.out.println( file.getName() );
//				}
//			}
//		}
		
//		File folder = new File( "C:\\Users\\chuha\\OneDrive\\Документы\\PAJava\\hwOopFive\\practice" );
//		File[] files = folder.listFiles( (dir,name) -> name.endsWith(".doc") );
//		for( File file : files  ) {
//			System.out.println( file.getName() );
//		}
		
		File folderIn = new File( "C:\\Users\\chuha\\OneDrive\\Документы\\PAJava\\hwOopFive\\practice" );
		File folderOut = new File( "final" );
		folderOut.mkdir();
		try {
			CopyFilesFromFolder.findAndCopyFiles(folderIn, folderOut, ".docx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	
		

	}

}
