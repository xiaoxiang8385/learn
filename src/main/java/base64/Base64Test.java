package base64;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Test 
{
    public static void main(String[] args)
    {
        /*String strImg = GetImageStr();
        System.out.println(strImg);*/
    	
        GenerateImage("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");
        		}
    //图片转化成base64字符串
    public static String GetImageStr()
    {//将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        String imgFile = "d://test.jpg";//待处理的图片
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try 
        {
            in = new FileInputStream(imgFile);        
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        //对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);//返回Base64编码过的字节数组字符串
    }
    
    //base64字符串转化成图片
    public static boolean GenerateImage(String imgStr)
    {   //对字节数组字符串进行Base64解码并生成图片
        if (imgStr == null) //图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try 
        {
            //Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片
            String imgFilePath = "d://223.jpg";//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);    
            out.write(b);
            out.flush();
            out.close();
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }
}


