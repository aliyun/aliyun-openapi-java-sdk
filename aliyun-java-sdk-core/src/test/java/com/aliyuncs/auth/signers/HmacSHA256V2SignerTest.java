package com.aliyuncs.auth.signers;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.crypto.Mac;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import static org.mockito.ArgumentMatchers.any;

@RunWith(PowerMockRunner.class)
@PrepareForTest({HmacSHA256V2Signer.class, Mac.class})
@PowerMockIgnore({"javax.xml.*", "org.xml.*", "org.w3c.*"})
public class HmacSHA256V2SignerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void failWhenSha256IsUnavailable() throws Exception {
        PowerMockito.mockStatic(Mac.class);
        PowerMockito.when(Mac.getInstance("HmacSHA256"))
                .thenThrow(new NoSuchAlgorithmException("HmacSHA256 is unavailable"));
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("HmacSHA256 is unavailable");
        new HmacSHA256V2Signer().signString("message", "test-secret");
    }

    @Test
    public void failWhenProviderRejectsKey() throws Exception {
        PowerMockito.mockStatic(Mac.class);
        Mac mac = PowerMockito.mock(Mac.class);
        PowerMockito.when(Mac.getInstance("HmacSHA256")).thenReturn(mac);
        PowerMockito.doThrow(new InvalidKeyException("Provider rejected key")).when(mac).init(any(Key.class));
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Provider rejected key");
        new HmacSHA256V2Signer().signString("message", "test-secret");
    }
}
