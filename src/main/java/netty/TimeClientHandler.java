package netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
 
public class TimeClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf m = (ByteBuf) msg; 
        System.out.println("服务端传过来的消息："+m);
        try {
            long currentTimeMillis = (m.readUnsignedInt() - 2208988800L) * 1000L;
            
            
            System.out.println("currentTimeMillis："+currentTimeMillis);
            
            ctx.close();
        } finally {
            m.release();
        }
    }
 
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
