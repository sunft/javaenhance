package cn.sunft.day02.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 自定义类加载器
 * @author sunft
 *
 */
public class MyClassLoader extends ClassLoader {

	public static void main(String[] args) throws Exception {
		String srcPath = 
				"F:\\code\\MyeclipseProjects\\javaenhance\\bin\\cn"
				+ "\\sunft\\day02\\classloader\\ClassLoaderAttachment.class";
		String destDir = "sunftlib";
		InputStream is = new FileInputStream(srcPath);
		System.out.println(File.separator);//\
		System.out.println(File.pathSeparator);//;
		System.out.println(srcPath.lastIndexOf(File.separator));
		String destFileName = srcPath
				.substring(srcPath.lastIndexOf(File.separator));
		String destFilePath = destDir + destFileName;
		OutputStream os = new FileOutputStream(destFilePath);
		cypher(is, os);
		is.close();
		os.close();
	}
	
	private static void cypher(InputStream ips, OutputStream ops) 
			throws Exception {
		int b = -1;
		while((b = ips.read()) != -1) {
			ops.write(b ^ 0xff);
		}
	}

	private String classDir;

	/**
	 * 重写方法,实现自己的类加载器
	 */
	@Override
	protected Class<?> findClass(String name) 
			throws ClassNotFoundException {
		String classFileName = classDir + File.separator 
				+ name.substring(name.lastIndexOf('.') + 1) 
				+ ".class";
		try {
			InputStream is = new FileInputStream(classFileName);
			ByteArrayOutputStream os = new ByteArrayOutputStream(); 
			cypher(is, os);
			is.close();
			byte[] bytes = os.toByteArray();
			//返回解密后的Class
			return defineClass(null, bytes, 0, bytes.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.findClass(name);
	}
	
	public MyClassLoader() {
		
	}
	
	public MyClassLoader(String classDir) {
		this.classDir = classDir;
	}

}




