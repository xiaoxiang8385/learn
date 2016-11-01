package nio2;

import java.nio.ByteBuffer;


/**
 * Buffer中有3个重要的参数：位置（position）、容量（capactiy）和上限（limit）
 * @author: xiaoxiang
 * @date: 2016年10月20日
 */
public class Buffer {
	
	public static void main(String[] args) throws Exception {
        ByteBuffer b = ByteBuffer.allocate(15); // 15个字节大小的缓冲区
        System.out.println("limit=" + b.limit() + " capacity=" + b.capacity()
                + " position=" + b.position());
        for (int i = 0; i < 10; i++) {
            // 存入10个字节数据
            b.put((byte) i);
        }
        System.out.println("limit=" + b.limit() + " capacity=" + b.capacity()
                + " position=" + b.position());
        b.flip(); // 重置position
        System.out.println("limit=" + b.limit() + " capacity=" + b.capacity()
                + " position=" + b.position());
        for (int i = 0; i < 5; i++) {
            System.out.print(b.get());
        }
        System.out.println();
        System.out.println("limit=" + b.limit() + " capacity=" + b.capacity()
                + " position=" + b.position());
        b.flip();
        System.out.println("limit=" + b.limit() + " capacity=" + b.capacity()
                + " position=" + b.position());
    }
}
