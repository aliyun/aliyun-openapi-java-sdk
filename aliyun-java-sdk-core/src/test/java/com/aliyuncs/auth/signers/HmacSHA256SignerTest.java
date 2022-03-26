package com.aliyuncs.auth.signers;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.security.NoSuchAlgorithmException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HmacSHA256SignerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getSignerName() {
        HmacSHA256Signer signer = new HmacSHA256Signer();
        Assert.assertEquals("ACS3-HMAC-SHA256", signer.getSignerName());
    }

    @Test
    public void getSignerVersion() {
        HmacSHA256Signer signer = new HmacSHA256Signer();
        Assert.assertEquals("3.0", signer.getSignerVersion());
    }

    @Test
    public void getSignerType() {
        HmacSHA256Signer signer = new HmacSHA256Signer();
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
        HmacSHA256Signer signer = new HmacSHA256Signer();
        String signedString = signer.signString(stringToSign, sk);
        String expectString = "7070fc618be1a3bae79889f6c8edd47c6c6054c9dcee92b9228a6787ca3729e2";
        Assert.assertEquals(expectString, signedString);
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
        HmacSHA256Signer signer = new HmacSHA256Signer();
        String signedString = signer.signString(stringToSign, credentials);
        String expectString = "5fa387e0d92355c28e718dcf7721c232045d2ca8fcc9d4808ce7d2f9f8c9f372";
        Assert.assertEquals(expectString, signedString);
    }

    @Test
    public void hash() {
        HmacSHA256Signer signer = new HmacSHA256Signer();
        try {
            Assert.assertNull(signer.hash(null));
        } catch (NoSuchAlgorithmException e) {
            Assert.fail();
        }
    }

    @Test
    public void getContent() {
        HmacSHA256Signer signer = new HmacSHA256Signer();
        Assert.assertEquals("x-acs-content-sha256", signer.getContent());
    }
}
