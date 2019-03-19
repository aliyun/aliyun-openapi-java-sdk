import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.cas.model.v20180813.*;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by zhanglihai on 2019/3/19.
 */
public class TestMain {


    /**
     * 将文件读取到内存中
     *
     * @param file
     * @return
     * @throws Exception
     */
    byte[] readFile(String file) throws Exception {
        FileInputStream       fileInputStream       = new FileInputStream(file);
        byte[]                buffer                = new byte[1024];
        int                   len                   = 0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024 * 100);
        while ((len = fileInputStream.read(buffer, 0, buffer.length)) > 0) {
            byteArrayOutputStream.write(buffer, 0, len);
        }
        byteArrayOutputStream.flush();
        fileInputStream.close();
        return byteArrayOutputStream.toByteArray();
    }


    /**
     * 将内容写到文件中
     * @param data
     * @param file
     * @throws Exception
     */
    void writeFile(byte[] data,String file) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(data);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    /**
     * base64 编码
     * @param data
     * @return
     */
    String base64Encoder(byte[] data) {
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(data);
    }


    /**
     * Base64 解码
     * @param base64
     * @return
     * @throws Exception
     */
    byte[] base64Decoder(String base64) throws Exception{
        BASE64Decoder base64Decoder = new BASE64Decoder();
        return base64Decoder.decodeBuffer(base64);
    }


    IAcsClient createClient() throws Exception {
        String accessKeyId  = "LTAI1nJuW3Bwu9YI";
        String accessSecret = "Ik3DJ10LGqUcXia9amxcUkEatMac2G";
        DefaultProfile.addEndpoint("cn-hangzhou", "cas", "cas.aliyuncs.com");
        return new DefaultAcsClient(DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessSecret));
    }

    public void testProductState() throws Exception {
        DescribeSignatureProductStateRequest request = new DescribeSignatureProductStateRequest();
        request.setAcceptFormat(FormatType.JSON);
        DescribeSignatureProductStateResponse response = this.createClient().getAcsResponse(request);
        System.out.println("state: " + response.getState());
    }

    /**
     * 测试个人证书申请
     *
     * @throws Exception
     */
    public void testCreateSignaturePeopleCertificate() throws Exception {
        CreateSignaturePeopleCertificateRequest request = new CreateSignaturePeopleCertificateRequest();
        request.setAcceptFormat(FormatType.JSON);
        request.setPeopleName("路人甲");
        request.setEmail("lihai.zhang@alibaba-inc.com");
        request.setIdentityNumber("");
        request.setMobile("13065674548");
        CreateSignaturePeopleCertificateResponse response = this.createClient().getAcsResponse(request);
        //返回的 个人Id: C0833B2F10EF76D48B8B6A9DE4D25B40
        System.out.println("peopleId: " + response.getPeopleId());
    }


    public void testCreateSignatureDocument()  throws Exception{
        String pdfFile = "/Users/zhanglihai/Downloads/test_sign_001.pdf";
        CreateSignatureDocumentRequest request = new CreateSignatureDocumentRequest();
        request.setAcceptFormat(FormatType.JSON);
        request.setSysMethod(MethodType.POST);
        request.setDocContent(this.base64Encoder(this.readFile(pdfFile)));
        request.setDocTitle("测试文档");
        CreateSignatureDocumentResponse response = this.createClient().getAcsResponse(request);
        //DocId: cXoiA5LH72VHGOivx41vYIdtc58xsOXQ
        System.out.println("docId: "+response.getDocId());
    }

    public void testCreateSignature() throws Exception{
        String file = "/Users/zhanglihai/Downloads/test_sign_001_done.pdf";
        CreateSignatureRequest request = new CreateSignatureRequest();
        request.setAcceptFormat(FormatType.JSON);
        request.setDocTitle("测试签章");
        request.setDocId("cXoiA5LH72VHGOivx41vYIdtc58xsOXQ");
        request.setPeopleId("C0833B2F10EF76D48B8B6A9DE4D25B40");
        //按照关键词进行定位
        request.setPositionType(new Integer(0));
        //签章位置的关键词
        request.setSignKeyword("路人甲");
        //2: 最后一个关键字签章;
        request.setKeywordStrategy(new Integer(2));
        CreateSignatureResponse response = this.createClient().getAcsResponse(request);
        //该内容是Base64内容，解码后保存成PDF文件
        String docContent = response.getDocContent();
        this.writeFile(this.base64Decoder(docContent),file);
        //本次交易编号: S2fIc7OE3o4K0M4050xaC0W6xFgDxFH2
        System.out.println("transactionId:"+response.getTransactionId());
    }


    public void testCreateFilingSignatureDocument() throws Exception{
        CreateFilingSignatureDocumentRequest request = new CreateFilingSignatureDocumentRequest();
        request.setAcceptFormat(FormatType.JSON);
        request.setDocId("cXoiA5LH72VHGOivx41vYIdtc58xsOXQ");
        CreateFilingSignatureDocumentResponse response = this.createClient().getAcsResponse(request);
    }

    public static void main(String[] args) {
        TestMain main = new TestMain();
        try {
            main.testCreateFilingSignatureDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
