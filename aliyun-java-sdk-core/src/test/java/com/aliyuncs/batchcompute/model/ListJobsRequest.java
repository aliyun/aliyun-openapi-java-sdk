package com.aliyuncs.batchcompute.model;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

import java.security.NoSuchAlgorithmException;

public class ListJobsRequest extends RoaAcsRequest<ListJobsResponse> {

    public ListJobsRequest() {
        super("BatchCompute", "2013-01-11", "ListJobs");
        setSysUriPattern("/jobs");
        setSysMethod(MethodType.GET);
    }

    @Override
    public Class<ListJobsResponse> getResponseClass() {
        return ListJobsResponse.class;
    }

    public void setContent(Job job) throws NoSuchAlgorithmException {
        String c = "this is a httpContent test";//convert job to json string

        super.setHttpContent(c.getBytes(), super.getSysEncoding(), super.getSysAcceptFormat());
    }
}
