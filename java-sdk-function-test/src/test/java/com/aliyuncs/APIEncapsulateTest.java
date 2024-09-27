package com.aliyuncs;

import com.aliyuncs.dysmsapi.model.v20170525.AddSmsSignRequest;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnCertificateDetailRequest;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnCertificateDetailResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.ram.model.v20150501.ListAccessKeysRequest;
import com.aliyuncs.ram.model.v20150501.ListAccessKeysResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRegionsRequest;
import com.aliyuncs.rds.model.v20140815.DescribeRegionsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeAccessPointsRequest;
import com.aliyuncs.vpc.model.v20160428.DescribeAccessPointsResponse;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

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
    public void rpcPostTest() throws ClientException {	
        AddSmsSignRequest request = new AddSmsSignRequest();
        request.setRegionId("test");
        request.setSignName("");
        request.setRemark("test");
        request.setSignSource(0);
        AddSmsSignRequest.SignFileList signFileList = new AddSmsSignRequest.SignFileList();
        signFileList.setFileContents("\tR0lGODlhHAAmAKIHAKqqqsvLy0hISObm5vf394uLiwAA");
        signFileList.setFileSuffix("jbg");
        List<AddSmsSignRequest.SignFileList> list = new ArrayList<AddSmsSignRequest.SignFileList>();
        list.add(signFileList);
        request.setSignFileLists(list);
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("MissingSignName", e.getErrCode());
            Assert.assertEquals("SignName is mandatory for this action.", e.getErrMsg());
        }
    }
}
