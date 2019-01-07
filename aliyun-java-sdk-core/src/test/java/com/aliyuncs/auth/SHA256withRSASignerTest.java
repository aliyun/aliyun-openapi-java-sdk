package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SHA256withRSASignerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void getSignerName() {
        SHA256withRSASigner signer = new SHA256withRSASigner();
        Assert.assertEquals("SHA256withRSA", signer.getSignerName());
    }

    @Test
    public void getSignerVersion() {
        SHA256withRSASigner signer = new SHA256withRSASigner();
        Assert.assertEquals("1.0", signer.getSignerVersion());
    }

    @Test
    public void getSignerType() {
        SHA256withRSASigner signer = new SHA256withRSASigner();
        Assert.assertEquals("PRIVATEKEY", signer.getSignerType());
    }

    @Test
    public void signStringWithSKNormal() {
        String stringToSign = "abcdefg";
        String sk = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDk4WyBF8Cj9JVK7ua6nuVfXt2AWdfvhpfSTznM+Dg8m4jQwe6OzJV+UkTrY12ugWJuCXdrzyzV4jHScQaazDaS6AQZt2/6zZZT8MdO6632W/elCiv2oglFpZ8y/j5BSeGQrYZlHfb2wz38Whko0fgKPA9ff7uS4u+8oMU5XgxhxJddWrh3dO24GVo9lX87NGDjDgQbXQ1E4CeArKmFYHJlngn/cKt1CcpiR67O/9V/ja1wKJylUyYCvmd8k29efspse2/BHZ+zk/qlHPsAjxhTfLIkqmup0+tc0DwLuv1uMbBgJPQ15GCGPAw1ky9qay/ynXjj8iZNcDyMfKvm6BNJAgMBAAECggEAc7aX8af9h6aGt8ySL7VXh2DhoRtK9VjZdsUBFuRDIjkL8WaqYd2Cksuq9kpVOX1GMxVsH8AtDbD+uULVMPufd6P/NrUr0uOPZb6sNPUoDQ4v5GuBEH6ZK3HxS4mIFd/xPwDLmmGM0vKgau1uHNoSibIVn5VnUnqS841gSIGIxv/1HI3q2/lPM7nCiTRP8iRlfousQOmmZVm+6h1DKSBaiCe+HZBwLA5IpLzz9XQ4f2N9quaMqp5I6q8pdbIWpL/KXXrD1Y7qnZyCgEWaiqLOeoxeNtqRF/BFllXTbvGITm7QrGh5lQoeX2cmYXQQ7j+ohJ2Q+j0H2ffB0VnYgaw0BQKBgQD5badIq7Asy367qjhv3q/ygoD+7EhQdNnQ9adN0sm0ecy0CUYqqxAxlCUddC8wEF445dw37wbOcvZoP7ogzMRivHhcTTISHmX12YAvumFImUYahcx5ae/Mu6z0r/o+/a1XLwikKxfhEojpMRLJm/OkgmGJx1IkhPM+mxim+X6kXwKBgQDq6S35izCRIs4jJWbs7ct6ghMXRlKnomodffwtVAlV1ZwdL3QJoMgmaE3A0Ko7E0GeoX3SoIiA79veSRlHeEwOINsJARGO3Hp0mzaZEN8f4PJyaoOrx9PCO2aP9TFFELFapIbmH800nBL2Mxii65FiOTao9wsoD1e6oR+UX1UpVwKBgQDwP5tSlvShoPyYHDQyJOeKigNgCAz7WiH3cLZOcosQSAVRIGGydYSqjIxXW3KcNBfdbCH6ykPfFMKc1U0djL5YcDrqhPyGkTsaW/5pend76w6oO1ohVFXC+L52DQ7YH5YYFNiY8F0W0LiJDFiRUqKSQXdbs14+iMSW9+L96fD+twKBgEItxPz7YIhS1N4D6HYxG9T8liJFdn2xfNGoL4YZmbOrxRpXxwn7WMexNM5wOrT/3Mmy1z6iaTJh4IBD+bIvysVkLjDgMzEbHgiBvaTrouBZQBRJu6SGXDro/yDpQ6Mga8aMeVCVfvsmSRVBGdy0HrYcRjDdwC/d+qoiQEJNhTFrAoGBAJqc15i8tlEVjU45uWmJs+mpG6x365MGsC7q9yZ31xUCCx1lwZSlidmaY19q+wGJKiYSz/4+KyWuOdRaFbWY/Y4jq7lVinc1S1OR8yqOSyCiYIJaDYHbPsMdZ9twX0aY/QkN+O9RyGnwL4Lmbkt/lry+OyC1vZEFSNzdR5kSfNvY";
        SHA256withRSASigner signer = new SHA256withRSASigner();
        String signedString = signer.signString(stringToSign, sk);
        Assert.assertEquals("j1c7LUMlLlwdQBLahl9km79D2o+sUIvWsYLM2f72ST0huc3Nyq1pxxE3zQImGDQUnDkhIA/Vt6jhq5NHE1Tua55YN4cmrMG88NloXXlV8LuINYhLKOUBSFFJzu7fuxDg9NZzF1h5j7jNMDghEJdzV85hy9L/8vBHQ+GnljS2dBAw4jzTyw6iSUE0W44+atzOzSsStbXT6Ab9nM2rVWeM6vv49CDoqn1VvgW0IpVIlmwDIY2JRarIDgyLn4ANCzijorJde0MNPOdBXNGE+H9gL51VoWiXVrceqjFk+CveJe30c30Po9pDCB0DWO4oG4FRJoHygg7MaB4QvHtlP3MvPg==", signedString);
    }

    @Test
    public void signStringWithSKThrowIllegalArgumentExceptiony() {
        thrown.expect(IllegalArgumentException.class);
        String stringToSign = "abc!@#";
        String sk = "sk";
        SHA256withRSASigner signer = new SHA256withRSASigner();
        String signedString = signer.signString(stringToSign, sk);
        Assert.assertEquals("abc", signedString);
    }

    @Test
    public void signStringWithCredentials() {
        String stringToSign = "abc!@#";
        String sk = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDk4WyBF8Cj9JVK7ua6nuVfXt2AWdfvhpfSTznM+Dg8m4jQwe6OzJV+UkTrY12ugWJuCXdrzyzV4jHScQaazDaS6AQZt2/6zZZT8MdO6632W/elCiv2oglFpZ8y/j5BSeGQrYZlHfb2wz38Whko0fgKPA9ff7uS4u+8oMU5XgxhxJddWrh3dO24GVo9lX87NGDjDgQbXQ1E4CeArKmFYHJlngn/cKt1CcpiR67O/9V/ja1wKJylUyYCvmd8k29efspse2/BHZ+zk/qlHPsAjxhTfLIkqmup0+tc0DwLuv1uMbBgJPQ15GCGPAw1ky9qay/ynXjj8iZNcDyMfKvm6BNJAgMBAAECggEAc7aX8af9h6aGt8ySL7VXh2DhoRtK9VjZdsUBFuRDIjkL8WaqYd2Cksuq9kpVOX1GMxVsH8AtDbD+uULVMPufd6P/NrUr0uOPZb6sNPUoDQ4v5GuBEH6ZK3HxS4mIFd/xPwDLmmGM0vKgau1uHNoSibIVn5VnUnqS841gSIGIxv/1HI3q2/lPM7nCiTRP8iRlfousQOmmZVm+6h1DKSBaiCe+HZBwLA5IpLzz9XQ4f2N9quaMqp5I6q8pdbIWpL/KXXrD1Y7qnZyCgEWaiqLOeoxeNtqRF/BFllXTbvGITm7QrGh5lQoeX2cmYXQQ7j+ohJ2Q+j0H2ffB0VnYgaw0BQKBgQD5badIq7Asy367qjhv3q/ygoD+7EhQdNnQ9adN0sm0ecy0CUYqqxAxlCUddC8wEF445dw37wbOcvZoP7ogzMRivHhcTTISHmX12YAvumFImUYahcx5ae/Mu6z0r/o+/a1XLwikKxfhEojpMRLJm/OkgmGJx1IkhPM+mxim+X6kXwKBgQDq6S35izCRIs4jJWbs7ct6ghMXRlKnomodffwtVAlV1ZwdL3QJoMgmaE3A0Ko7E0GeoX3SoIiA79veSRlHeEwOINsJARGO3Hp0mzaZEN8f4PJyaoOrx9PCO2aP9TFFELFapIbmH800nBL2Mxii65FiOTao9wsoD1e6oR+UX1UpVwKBgQDwP5tSlvShoPyYHDQyJOeKigNgCAz7WiH3cLZOcosQSAVRIGGydYSqjIxXW3KcNBfdbCH6ykPfFMKc1U0djL5YcDrqhPyGkTsaW/5pend76w6oO1ohVFXC+L52DQ7YH5YYFNiY8F0W0LiJDFiRUqKSQXdbs14+iMSW9+L96fD+twKBgEItxPz7YIhS1N4D6HYxG9T8liJFdn2xfNGoL4YZmbOrxRpXxwn7WMexNM5wOrT/3Mmy1z6iaTJh4IBD+bIvysVkLjDgMzEbHgiBvaTrouBZQBRJu6SGXDro/yDpQ6Mga8aMeVCVfvsmSRVBGdy0HrYcRjDdwC/d+qoiQEJNhTFrAoGBAJqc15i8tlEVjU45uWmJs+mpG6x365MGsC7q9yZ31xUCCx1lwZSlidmaY19q+wGJKiYSz/4+KyWuOdRaFbWY/Y4jq7lVinc1S1OR8yqOSyCiYIJaDYHbPsMdZ9twX0aY/QkN+O9RyGnwL4Lmbkt/lry+OyC1vZEFSNzdR5kSfNvY";
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        when(credentials.getAccessKeySecret()).thenReturn(sk);
        SHA256withRSASigner signer = new SHA256withRSASigner();
        String signedString = signer.signString(stringToSign, credentials);
        Assert.assertEquals("P4MU1oQMNqbj/NJiSFkRpPtytlBY5PYxyXvSrt3nhr5O2Gsrn1VUZDmsB0MHtY6/73Rjo1AbT4qMsgYsUAvZ+hSL8cS552EYje3pNI61+LHf3Cb2cvoPMiowqf28XB/3kbgP9L7IDu5fo51tjZmWtJyiZ7iV4JTh3Mv2JOxqUVS0r2cNf+YV8rj2mtpw/XwSaU3NdSP7AYdujedxhFaaEWB/udLE+PV+sbxUgWejw5LFhGvbWoO8NkPBFWwMUsxaP+0cxgoBbVwjmf8cOqZgasT2lOu1Jh7m7aavFnfk+0BOkxmocnQLCcSEkRiOWq371VvK1Xt/fNuRZZ0syTmViA==", signedString);
    }
}
