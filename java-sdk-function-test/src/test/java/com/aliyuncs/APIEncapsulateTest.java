package com.aliyuncs;

import com.aliyuncs.ccc.model.v20170705.CommitContactFlowVersionModificationRequest;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnCertificateDetailRequest;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnCertificateDetailResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.ram.model.v20150501.ListAccessKeysRequest;
import com.aliyuncs.ram.model.v20150501.ListAccessKeysResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRegionsRequest;
import com.aliyuncs.rds.model.v20140815.DescribeRegionsResponse;
import com.aliyuncs.ros.model.v20150901.DeleteStackRequest;
import com.aliyuncs.ros.model.v20150901.DoActionsRequest;
import com.aliyuncs.ros.model.v20150901.UpdateStackRequest;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListsRequest;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeAccessPointsRequest;
import com.aliyuncs.vpc.model.v20160428.DescribeAccessPointsResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class APIEncapsulateTest extends BaseTest {

    @Test
    public void ecsRequestTest() throws ClientException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = this.client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

    @Test
    public void rdsRequestTest() throws ClientException {
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        DescribeRegionsResponse response = this.client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(response.checkShowJsonItemName());
    }

    @Test
    public void cdnRequestTest() throws ClientException {
        DescribeCdnCertificateDetailRequest request = new DescribeCdnCertificateDetailRequest();
        request.setCertName("cdnRequestTest");
        DescribeCdnCertificateDetailResponse response = this.client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getRequestId());
    }

    @Test
    public void slbRequestTest() throws ClientException {
        DescribeAccessControlListsRequest request = new DescribeAccessControlListsRequest();
        DescribeAccessControlListsResponse response = this.client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getAcls());
    }

    @Test
    public void ramRequestTest() throws ClientException {
        ListAccessKeysRequest request = new ListAccessKeysRequest();
        ListAccessKeysResponse response = this.client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getAccessKeys());
    }

    @Test
    public void vpcRequestTest() throws ClientException {
        DescribeAccessPointsRequest request = new DescribeAccessPointsRequest();
        DescribeAccessPointsResponse response = this.client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getTotalCount());
    }

    @Test
    public void JsonPutTypeTest() {
        UpdateStackRequest request = new UpdateStackRequest();
        request.setStackName("test");
        request.setStackId("test");
        request.putBodyParameter("ContentMD5NotMatched", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("HTTPBadRequest", e.getErrCode());
            Assert.assertEquals("No template specified", e.getErrMsg());
        }
    }

    @Test
    @Ignore
    public void XmlPutTypeTest() throws ClientException {
        // TODO：xml mode is not supported by the server
        UpdateStackRequest request = new UpdateStackRequest();
        request.setStackName("test");
        request.setStackId("test");
        request.setHttpContentType(FormatType.XML);
        request.putBodyParameter("ContentMD5NotMatched", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (IllegalStateException e) {
            Assert.assertEquals("Server response has a bad format type: null", e.getMessage());
        }
    }

    @Test
    public void FormPutTypeTest() {
        UpdateStackRequest request = new UpdateStackRequest();
        request.setStackName("test");
        request.setStackId("test");
        request.setHttpContentType(FormatType.FORM);
        request.putBodyParameter("ContentMD5NotMatched", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("HTTPBadRequest", e.getErrCode());
            Assert.assertEquals(
                    "The server could not comply with the request since it is either malformed or otherwise incorrect. "
                            + "The content type is application/x-www-form-urlencoded. Try use \"application/json\" instead.", e.getErrMsg());
        }
    }

    @Test
    public void JsonDeleteTypeTest() {
        DeleteStackRequest request = new DeleteStackRequest();
        request.setStackName("test");
        request.setStackId("test");
        // TODO: this is a bug.It should be set automatically region
        request.putHeaderParameter("x-acs-region-id", "cn-hangzhou");
        request.setHttpContentType(FormatType.JSON);
        request.putBodyParameter("ContentMD5NotMatched", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("StackNotFound", e.getErrCode());
            Assert.assertEquals("The Stack (test) could not be found.", e.getErrMsg());
        }
    }

    @Test
    public void XmlDeleteTypeTest() throws ClientException {
        DeleteStackRequest request = new DeleteStackRequest();
        request.setStackName("test");
        request.setStackId("test");
        request.putHeaderParameter("x-acs-region-id", "cn-hangzhou");
        request.setHttpContentType(FormatType.XML);
        request.putBodyParameter("ContentMD5NotMatched", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("StackNotFound", e.getErrCode());
            Assert.assertEquals("The Stack (test) could not be found.", e.getErrMsg());
        }
    }

    @Test
    public void FormDeleteTypeTest() {
        DeleteStackRequest request = new DeleteStackRequest();
        request.setStackName("test");
        request.setStackId("test");
        request.putHeaderParameter("x-acs-region-id", "cn-hangzhou");
        request.setHttpContentType(FormatType.FORM);
        request.putBodyParameter("ContentMD5NotMatched", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("StackNotFound", e.getErrCode());
            Assert.assertEquals("The Stack (test) could not be found.", e.getErrMsg());
        }
    }

    /**
     * xml method
     */
    @Test
    @Ignore
    public void xmlPostTypeTest() throws ClientException {
        DoActionsRequest request = new DoActionsRequest();
        request.setHttpContentType(FormatType.XML);
        request.setStackName("test");
        request.setStackId("test");
        request.putBodyParameter("test", "test");
        request.putBodyParameter("test2", "test2");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (IllegalStateException e) {
            Assert.assertEquals("Server response has a bad format type: null", e.getMessage());
        }
    }

    @Test
    public void JsonPostTypeTest() {
        DoActionsRequest request = new DoActionsRequest();
        request.setHttpContentType(FormatType.JSON);
        request.setStackName("test");
        request.setStackId("test");
        request.putBodyParameter("test", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("HTTPBadRequest", e.getErrCode());
            Assert.assertEquals("Invalid action test specified", e.getErrMsg());
        }
    }

    @Test
    public void FormPostTypeTest() {
        DoActionsRequest request = new DoActionsRequest();
        request.setHttpContentType(FormatType.FORM);
        request.setStackName("test");
        request.setStackId("test");
        request.putBodyParameter("test", "test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("HTTPBadRequest", e.getErrCode());
            Assert.assertEquals("No action specified", e.getErrMsg());
        }
    }

    @Test
    public void rpcPostTest() throws ClientException {
        CommitContactFlowVersionModificationRequest request = new CommitContactFlowVersionModificationRequest();
        request.setContent("test");
        request.setCanvas("test");
        request.setContactFlowVersionId("test");
        request.setInstanceId("test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ServerException e) {
            Assert.assertEquals("ServiceUnavailable", e.getErrCode());
            Assert.assertEquals("The request has failed due to a temporary failure of the server.", e.getErrMsg());
        }
    }
}
