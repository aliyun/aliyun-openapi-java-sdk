package com.aliyuncs.batchcompute.transformunittest.v20151111;

import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.GroupDescription;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by zu on 2017/5/20.
 */
public class TestStringify extends TestCase {

    @Test
    public void testNonDefault() throws IOException {

        ClusterDescription clusterDesc = new ClusterDescription();
        GroupDescription groupDesc = new GroupDescription();
        groupDesc.setDesiredVMCount(0);
        //groupDesc.setResourceType(null);
        clusterDesc.addGroup("group1", groupDesc);

        ObjectMapper mapper = new ObjectMapper();


        //默认值不序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);

        String contentString = null;
        contentString = mapper.writeValueAsString(clusterDesc);

        System.out.println(contentString);

        assert contentString.indexOf("DesiredVMCount")!=-1;
        assert contentString.indexOf("0")!=-1;
    }


    @Test
    public void testNonDefault2() throws IOException {

        ClusterDescription clusterDesc = new ClusterDescription();
        GroupDescription groupDesc = new GroupDescription();
        //groupDesc.setDesiredVMCount(0);
        //groupDesc.setResourceType(null);
        clusterDesc.addGroup("group1", groupDesc);

        ObjectMapper mapper = new ObjectMapper();


        //默认值不序列化
        mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);

        String contentString = null;
        contentString = mapper.writeValueAsString(clusterDesc);

        System.out.println(contentString);

        assert contentString.indexOf("DesiredVMCount")==-1;
        assert contentString.indexOf("0")==-1;
    }
}
