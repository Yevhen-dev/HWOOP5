package hwOopFive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFilesFromFolder {
	
	public static long copyFile( File fileIn, File fileOut ) throws IOException {
		
		try( InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut) ) {
			return is.transferTo(os);
		}
		
	}

	public static long findAndCopyFiles( File folderIn, File folderOut, String ext  ) throws IOException {
		long fileCount = 0;
		
		
		File[] files = folderIn.listFiles( (dir,name) -> name.endsWith(ext) );
		for( File file : files ) {
			File fileOut = new File( folderOut, file.getName() );
			System.out.println("info");
			copyFile(file, fileOut);
			fileCount++;
		}
		
		
		
		return fileCount;
	}

}
