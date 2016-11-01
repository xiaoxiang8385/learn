package nio2;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 文件映射到内存
 * 对MappedByteBuffer的修改就相当于修改文件本身，这样操作的速度是很快的。
 * @author: xiaoxiang
 * @date: 2016年10月20日
 */
public class fileAccess {

	
	public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("C:\\mapfile.txt", "rw");
        FileChannel fc = raf.getChannel();
        // 将文件映射到内存中
        MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0,
                raf.length());
        while (mbb.hasRemaining()) {
            System.out.print((char) mbb.get());
        }
        mbb.put(0, (byte) 98); // 修改文件
        raf.close();
    }
}
