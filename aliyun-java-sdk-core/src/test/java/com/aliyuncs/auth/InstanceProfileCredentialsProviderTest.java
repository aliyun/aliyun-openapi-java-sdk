package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class InstanceProfileCredentialsProviderTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorNormalTest() {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        Assert.assertNotNull(provider);
    }

    @Test
    public void constructorNormalNullPointerExceptionTest() {
        thrown.expect(NullPointerException.class);
        String roleName = null;
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        Assert.assertNull(provider);
    }

    @Test
    public void withFetcherTest() {
        final String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) {
                String roleNameAgru = invocationOnMock.getArgument(0, String.class);
                Assert.assertEquals(roleName, roleNameAgru);
                return null;
            }
        }).when(fetcher).setRoleName(anyString());
        provider.withFetcher(fetcher);
        Assert.assertNotNull(provider);
    }

    @Test
    public void getCredentialsPreviousNull() throws ClientException {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        InstanceProfileCredentials credentials = mock(InstanceProfileCredentials.class);
        when(fetcher.fetch(anyInt())).thenReturn(credentials);
        provider.withFetcher(fetcher);
        AlibabaCloudCredentials credentialsRes = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes);
    }

    @Test
    public void getCredentialsPreviousExpired() throws ClientException {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        InstanceProfileCredentials credentials = mock(InstanceProfileCredentials.class);
        when(credentials.isExpired()).thenReturn(true);
        when(fetcher.fetch(anyInt())).thenReturn(credentials);
        provider.withFetcher(fetcher);
        AlibabaCloudCredentials credentialsRes = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);
        Assert.assertEquals(true, ((InstanceProfileCredentials) credentialsRes).isExpired());

        InstanceProfileCredentials credentials1 = mock(InstanceProfileCredentials.class);
        when(fetcher.fetch(anyInt())).thenReturn(credentials1);
        AlibabaCloudCredentials credentialsRes1 = provider.getCredentials();
        Assert.assertEquals(credentials1, credentialsRes1);
        Assert.assertEquals(2, provider.ecsMetadataServiceFetchCount);

    }

    @Test
    public void getCredentialsPreviousWillSoonExpiredAndShouldRefresh() throws ClientException {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        InstanceProfileCredentials credentials = mock(InstanceProfileCredentials.class);
        when(credentials.isExpired()).thenReturn(false);
        when(credentials.willSoonExpire()).thenReturn(true);
        when(credentials.shouldRefresh()).thenReturn(true);
        when(fetcher.fetch(anyInt())).thenReturn(credentials);
        provider.withFetcher(fetcher);
        AlibabaCloudCredentials credentialsRes = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);
        Assert.assertEquals(false, ((InstanceProfileCredentials) credentialsRes).isExpired());

        InstanceProfileCredentials credentials1 = mock(InstanceProfileCredentials.class);
        when(fetcher.fetch()).thenReturn(credentials1);
        AlibabaCloudCredentials credentialsRes1 = provider.getCredentials();
        Assert.assertEquals(credentials1, credentialsRes1);
        Assert.assertEquals(2, provider.ecsMetadataServiceFetchCount);

    }

    @Test
    public void getCredentialsPreviousWillSoonExpiredAndNotShouldRefresh() throws ClientException {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        InstanceProfileCredentials credentials = mock(InstanceProfileCredentials.class);
        when(credentials.isExpired()).thenReturn(false);
        when(credentials.willSoonExpire()).thenReturn(true);
        when(credentials.shouldRefresh()).thenReturn(false);
        when(fetcher.fetch(anyInt())).thenReturn(credentials);
        provider.withFetcher(fetcher);
        AlibabaCloudCredentials credentialsRes = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);
        Assert.assertEquals(false, ((InstanceProfileCredentials) credentialsRes).isExpired());

        InstanceProfileCredentials credentials1 = mock(InstanceProfileCredentials.class);
        when(fetcher.fetch()).thenReturn(credentials1);
        AlibabaCloudCredentials credentialsRes1 = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes1);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);

    }

    @Test
    public void getCredentialsPreviousNotWillSoonExpiredAndShouldRefresh() throws ClientException {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        InstanceProfileCredentials credentials = mock(InstanceProfileCredentials.class);
        when(credentials.isExpired()).thenReturn(false);
        when(credentials.willSoonExpire()).thenReturn(false);
        when(credentials.shouldRefresh()).thenReturn(true);
        when(fetcher.fetch(anyInt())).thenReturn(credentials);
        provider.withFetcher(fetcher);
        AlibabaCloudCredentials credentialsRes = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);
        Assert.assertEquals(false, ((InstanceProfileCredentials) credentialsRes).isExpired());

        InstanceProfileCredentials credentials1 = mock(InstanceProfileCredentials.class);
        when(fetcher.fetch()).thenReturn(credentials1);
        AlibabaCloudCredentials credentialsRes1 = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes1);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);

    }

    @Test
    public void getCredentialsPreviousNotWillSoonExpiredAndNotShouldRefresh() throws ClientException {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        InstanceProfileCredentials credentials = mock(InstanceProfileCredentials.class);
        when(credentials.isExpired()).thenReturn(false);
        when(credentials.willSoonExpire()).thenReturn(false);
        when(credentials.shouldRefresh()).thenReturn(false);
        when(fetcher.fetch(anyInt())).thenReturn(credentials);
        provider.withFetcher(fetcher);
        AlibabaCloudCredentials credentialsRes = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);
        Assert.assertEquals(false, ((InstanceProfileCredentials) credentialsRes).isExpired());

        InstanceProfileCredentials credentials1 = mock(InstanceProfileCredentials.class);
        when(fetcher.fetch()).thenReturn(credentials1);
        AlibabaCloudCredentials credentialsRes1 = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes1);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);

    }

    @Test
    public void getCredentialsPreviousWillSoonExpiredAndShouldRefreshAndThrowClientException() throws ClientException {
        String roleName = "roleName";
        InstanceProfileCredentialsProvider provider = new InstanceProfileCredentialsProvider(roleName);
        ECSMetadataServiceCredentialsFetcher fetcher = mock(ECSMetadataServiceCredentialsFetcher.class);
        InstanceProfileCredentials credentials = mock(InstanceProfileCredentials.class);
        when(credentials.isExpired()).thenReturn(false);
        when(credentials.willSoonExpire()).thenReturn(true);
        when(credentials.shouldRefresh()).thenReturn(true);
        when(fetcher.fetch(anyInt())).thenReturn(credentials);
        provider.withFetcher(fetcher);
        AlibabaCloudCredentials credentialsRes = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes);
        Assert.assertEquals(1, provider.ecsMetadataServiceFetchCount);
        Assert.assertEquals(false, ((InstanceProfileCredentials) credentialsRes).isExpired());

        doNothing().when(credentials).setLastFailedRefreshTime();
        doThrow(ClientException.class).when(fetcher).fetch();
        AlibabaCloudCredentials credentialsRes1 = provider.getCredentials();
        Assert.assertEquals(credentials, credentialsRes1);
        Assert.assertEquals(2, provider.ecsMetadataServiceFetchCount);
        verify(credentials, times(1)).setLastFailedRefreshTime();
    }
}
