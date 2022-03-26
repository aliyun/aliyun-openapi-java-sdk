package com.aliyuncs.auth.signers;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.security.NoSuchAlgorithmException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NewSHA256withRSASignerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getSignerName() {
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        Assert.assertEquals("ACS3-RSA-SHA256", signer.getSignerName());
    }

    @Test
    public void getSignerVersion() {
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        Assert.assertEquals("3.0", signer.getSignerVersion());
    }

    @Test
    public void getSignerType() {
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        Assert.assertNull(signer.getSignerType());
    }

    @Test
    public void signStringWithSKNormal() {
        String stringToSign = "abcdefg";
        String sk = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDk4WyBF8Cj9JVK7ua6nuVfXt2AWdfvhpfSTznM+Dg8m"
                + "4jQwe6OzJV+UkTrY12ugWJuCXdrzyzV4jHScQaazDaS6AQZt2/6zZZT8MdO6632W/elCiv2oglFpZ8y/j5BSeGQrYZlHfb"
                + "2wz38Whko0fgKPA9ff7uS4u+8oMU5XgxhxJddWrh3dO24GVo9lX87NGDjDgQbXQ1E4CeArKmFYHJlngn/cKt1CcpiR67O/9"
                + "V/ja1wKJylUyYCvmd8k29efspse2/BHZ+zk/qlHPsAjxhTfLIkqmup0+tc0DwLuv1uMbBgJPQ15GCGPAw1ky9qay/ynXjj8"
                + "iZNcDyMfKvm6BNJAgMBAAECggEAc7aX8af9h6aGt8ySL7VXh2DhoRtK9VjZdsUBFuRDIjkL8WaqYd2Cksuq9kpVOX1GMxVs"
                + "H8AtDbD+uULVMPufd6P/NrUr0uOPZb6sNPUoDQ4v5GuBEH6ZK3HxS4mIFd/xPwDLmmGM0vKgau1uHNoSibIVn5VnUnqS841"
                + "gSIGIxv/1HI3q2/lPM7nCiTRP8iRlfousQOmmZVm+6h1DKSBaiCe+HZBwLA5IpLzz9XQ4f2N9quaMqp5I6q8pdbIWpL/KXX"
                + "rD1Y7qnZyCgEWaiqLOeoxeNtqRF/BFllXTbvGITm7QrGh5lQoeX2cmYXQQ7j+ohJ2Q+j0H2ffB0VnYgaw0BQKBgQD5badIq"
                + "7Asy367qjhv3q/ygoD+7EhQdNnQ9adN0sm0ecy0CUYqqxAxlCUddC8wEF445dw37wbOcvZoP7ogzMRivHhcTTISHmX12YAv"
                + "umFImUYahcx5ae/Mu6z0r/o+/a1XLwikKxfhEojpMRLJm/OkgmGJx1IkhPM+mxim+X6kXwKBgQDq6S35izCRIs4jJWbs7ct"
                + "6ghMXRlKnomodffwtVAlV1ZwdL3QJoMgmaE3A0Ko7E0GeoX3SoIiA79veSRlHeEwOINsJARGO3Hp0mzaZEN8f4PJyaoOrx9"
                + "PCO2aP9TFFELFapIbmH800nBL2Mxii65FiOTao9wsoD1e6oR+UX1UpVwKBgQDwP5tSlvShoPyYHDQyJOeKigNgCAz7WiH3c"
                + "LZOcosQSAVRIGGydYSqjIxXW3KcNBfdbCH6ykPfFMKc1U0djL5YcDrqhPyGkTsaW/5pend76w6oO1ohVFXC+L52DQ7YH5YY"
                + "FNiY8F0W0LiJDFiRUqKSQXdbs14+iMSW9+L96fD+twKBgEItxPz7YIhS1N4D6HYxG9T8liJFdn2xfNGoL4YZmbOrxRpXxwn"
                + "7WMexNM5wOrT/3Mmy1z6iaTJh4IBD+bIvysVkLjDgMzEbHgiBvaTrouBZQBRJu6SGXDro/yDpQ6Mga8aMeVCVfvsmSRVBGd"
                + "y0HrYcRjDdwC/d+qoiQEJNhTFrAoGBAJqc15i8tlEVjU45uWmJs+mpG6x365MGsC7q9yZ31xUCCx1lwZSlidmaY19q+wGJK"
                + "iYSz/4+KyWuOdRaFbWY/Y4jq7lVinc1S1OR8yqOSyCiYIJaDYHbPsMdZ9twX0aY/QkN+O9RyGnwL4Lmbkt/lry+OyC1vZEF"
                + "SNzdR5kSfNvY";
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        String signedString = signer.signString(stringToSign, sk);
        String expectString = "8f573b2d43252e5c1d4012da865f649bbf43da8fac508bd6b182ccd9fef6493d21b9cdcdcaad69c7113"
                + "7cd02261834149c3921200fd5b7a8e1ab93471354ee6b9e58378726acc1bcf0d9685d7955f0bb8835884b28e5014851"
                + "49ceeedfbb10e0f4d6731758798fb8cd30382110977357ce61cbd2fff2f04743e1a79634b6741030e23cd3cb0ea2494"
                + "1345b8e3e6adccecd2b12b5b5d3e806fd9ccdab55678ceafbf8f420e8aa7d55be05b4229548966c03218d8945aac80e"
                + "0c8b9f800d0b38a3a2b25d7b430d3ce7415cd184f87f602f9d55a1689756b71eaa3164f82bde25edf4737d0fa3da430"
                + "81d0358ee281b81512681f2820ecc681e10bc7b653f732f3e";
        Assert.assertEquals(expectString, signedString);
    }

    @Test
    public void signStringWithSKThrowIllegalArgumentExceptiony() {
        thrown.expect(IllegalArgumentException.class);
        String stringToSign = "abc!@#";
        String sk = "sk";
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        String signedString = signer.signString(stringToSign, sk);
        Assert.assertEquals("abc", signedString);
    }

    @Test
    public void signStringWithCredentials() {
        String stringToSign = "abc!@#";
        String sk = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDk4WyBF8Cj9JVK7ua6nuVfXt2AWdfvhpfSTznM+Dg8m4"
                + "jQwe6OzJV+UkTrY12ugWJuCXdrzyzV4jHScQaazDaS6AQZt2/6zZZT8MdO6632W/elCiv2oglFpZ8y/j5BSeGQrYZlHfb2wz"
                + "38Whko0fgKPA9ff7uS4u+8oMU5XgxhxJddWrh3dO24GVo9lX87NGDjDgQbXQ1E4CeArKmFYHJlngn/cKt1CcpiR67O/9V/ja"
                + "1wKJylUyYCvmd8k29efspse2/BHZ+zk/qlHPsAjxhTfLIkqmup0+tc0DwLuv1uMbBgJPQ15GCGPAw1ky9qay/ynXjj8iZNcD"
                + "yMfKvm6BNJAgMBAAECggEAc7aX8af9h6aGt8ySL7VXh2DhoRtK9VjZdsUBFuRDIjkL8WaqYd2Cksuq9kpVOX1GMxVsH8AtDb"
                + "D+uULVMPufd6P/NrUr0uOPZb6sNPUoDQ4v5GuBEH6ZK3HxS4mIFd/xPwDLmmGM0vKgau1uHNoSibIVn5VnUnqS841gSIGIxv"
                + "/1HI3q2/lPM7nCiTRP8iRlfousQOmmZVm+6h1DKSBaiCe+HZBwLA5IpLzz9XQ4f2N9quaMqp5I6q8pdbIWpL/KXXrD1Y7qnZ"
                + "yCgEWaiqLOeoxeNtqRF/BFllXTbvGITm7QrGh5lQoeX2cmYXQQ7j+ohJ2Q+j0H2ffB0VnYgaw0BQKBgQD5badIq7Asy367qj"
                + "hv3q/ygoD+7EhQdNnQ9adN0sm0ecy0CUYqqxAxlCUddC8wEF445dw37wbOcvZoP7ogzMRivHhcTTISHmX12YAvumFImUYahc"
                + "x5ae/Mu6z0r/o+/a1XLwikKxfhEojpMRLJm/OkgmGJx1IkhPM+mxim+X6kXwKBgQDq6S35izCRIs4jJWbs7ct6ghMXRlKnom"
                + "odffwtVAlV1ZwdL3QJoMgmaE3A0Ko7E0GeoX3SoIiA79veSRlHeEwOINsJARGO3Hp0mzaZEN8f4PJyaoOrx9PCO2aP9TFFEL"
                + "FapIbmH800nBL2Mxii65FiOTao9wsoD1e6oR+UX1UpVwKBgQDwP5tSlvShoPyYHDQyJOeKigNgCAz7WiH3cLZOcosQSAVRIG"
                + "GydYSqjIxXW3KcNBfdbCH6ykPfFMKc1U0djL5YcDrqhPyGkTsaW/5pend76w6oO1ohVFXC+L52DQ7YH5YYFNiY8F0W0LiJDF"
                + "iRUqKSQXdbs14+iMSW9+L96fD+twKBgEItxPz7YIhS1N4D6HYxG9T8liJFdn2xfNGoL4YZmbOrxRpXxwn7WMexNM5wOrT/3M"
                + "my1z6iaTJh4IBD+bIvysVkLjDgMzEbHgiBvaTrouBZQBRJu6SGXDro/yDpQ6Mga8aMeVCVfvsmSRVBGdy0HrYcRjDdwC/d+q"
                + "oiQEJNhTFrAoGBAJqc15i8tlEVjU45uWmJs+mpG6x365MGsC7q9yZ31xUCCx1lwZSlidmaY19q+wGJKiYSz/4+KyWuOdRaFb"
                + "WY/Y4jq7lVinc1S1OR8yqOSyCiYIJaDYHbPsMdZ9twX0aY/QkN+O9RyGnwL4Lmbkt/lry+OyC1vZEFSNzdR5kSfNvY";
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        when(credentials.getAccessKeySecret()).thenReturn(sk);
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        String signedString = signer.signString(stringToSign, credentials);
        String expectString = "3f8314d6840c36a6e3fcd262485911a4fb72b65058e4f631c97bd2aedde786be4ed86b2b9f55546439ac"
                + "074307b58ebfef7463a3501b4f8a8cb2062c500bd9fa148bf1c4b9e761188dede9348eb5f8b1dfdc26f672fa0f322a30"
                + "a9fdbc5c1ff791b80ff4bec80eee5fa39d6d8d9996b49ca267b895e094e1dccbf624ec6a5154b4af670d7fe615f2b8f6"
                + "9ada70fd7c12694dcd7523fb01876e8de77184569a11607fb9d2c4f8f57eb1bc548167a3c392c5846bdb5a83bc3643c1"
                + "156c0c52cc5a3fed1cc60a016d5c2399ff1c3aa6606ac4f694ebb5261ee6eda6af1677e4fb404e9319a872740b09c484"
                + "91188e5aadfbd55bcad57b7f7cdb91659d2cc9399588";
        Assert.assertEquals(expectString, signedString);
    }

    @Test
    public void hash() {
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        try {
            Assert.assertNull(signer.hash(null));
        } catch (NoSuchAlgorithmException e) {
            Assert.fail();
        }
    }

    @Test
    public void getContent() {
        NewSHA256withRSASigner signer = new NewSHA256withRSASigner();
        Assert.assertEquals("x-acs-content-sha256", signer.getContent());
    }
}
