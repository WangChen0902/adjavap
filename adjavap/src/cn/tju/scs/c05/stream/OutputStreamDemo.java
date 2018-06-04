package cn.tju.scs.c05.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("E:" + File.separator + "demo" + File.separator + "testoutput.txt");
		
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		OutputStream os = new FileOutputStream(file,true);
		String str = "Good good study, day day up \r\n";
		byte data[] = str.getBytes(); //将字符串变为字节数组，将字符数组转为字符串？
		for(int x = 0; x<data.length; x++){
			os.write(data[x]);
		}
//		os.write(data);
//		os.write(data, 6, 6);
		os.close();
	}

}
