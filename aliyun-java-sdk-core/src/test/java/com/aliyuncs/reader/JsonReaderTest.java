/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.reader;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JsonReaderTest {
    String json
        = "{\"Instances\":{\"Instance\":[{\"CreationTime\":\"2015-01-14T03:31:26Z\",\"Description\":\"test escape "
        + "\\\"Timeout\\\"\",\"EipAddress\":{\"AllocationId\":\"\",\"IpAddress\":\"127.0.0.1\","
		+ "\"InternetChargeType\":\"\"},\"HostName\":\"iZ25dbbj9izZ\","
		+ "\"ImageId\":\"centos7u0_64_20G_aliaegis_20141117.vhd\",\"InnerIpAddress\":{\"IpAddress\":[\"127.0.0.101\","
		+ "\"127.0.0.102\"]},\"InstanceId\":\"i-25dbbj9iz\",\"InstanceName\":\"iZ25dbbj9izZ-vnc-260755\","
		+ "\"InstanceNetworkType\":\"classic\",\"InstanceType\":\"ecs.t1.xsmall\","
		+ "\"InternetChargeType\":\"PayByBandwidth\",\"InternetMaxBandwidthIn\":200,\"InternetMaxBandwidthOut\":200,"
		+ "\"OperationLocks\":{\"LockReason\":[]},\"PublicIpAddress\":{\"IpAddress\":[]},\"RegionId\":\"cn-beijing\","
		+ "\"SecurityGroupIds\":{\"SecurityGroupId\":[\"sg-259bpu24m\"]},\"Status\":\"Running\",\"VlanId\":\"\","
		+ "\"VpcAttributes\":{\"NatIpAddress\":\"\",\"PrivateIpAddress\":{\"IpAddress\":[]},\"VSwitchId\":\"\","
		+ "\"VpcId\":\"\"},\"ZoneId\":\"cn-beijing-a\",\"ClusterId\":\"\"},{\"CreationTime\":\"2015-01-05T03:43:02Z\","
		+ "\"Description\":\"\",\"EipAddress\":{\"AllocationId\":\"\",\"IpAddress\":\"\",\"InternetChargeType\":\"\"},"
		+ "\"HostName\":\"iZ25fk8a1ngZ\",\"ImageId\":\"centos7u0_64_20G_aliaegis_20141117.vhd\","
		+ "\"InnerIpAddress\":{\"IpAddress\":[]},\"InstanceId\":\"i-25fk8a1ng\","
		+ "\"InstanceName\":\"ESS-sg-vpc??????2-ecs-i-25fk8a1ng\",\"InstanceNetworkType\":\"vpc\","
		+ "\"InstanceType\":\"ecs.t1.xsmall\",\"InternetChargeType\":\"\",\"InternetMaxBandwidthIn\":0,"
		+ "\"InternetMaxBandwidthOut\":0,\"OperationLocks\":{\"LockReason\":[]},"
		+ "\"PublicIpAddress\":{\"IpAddress\":[]},\"RegionId\":\"cn-beijing\","
		+ "\"SecurityGroupIds\":{\"SecurityGroupId\":[\"sg-25k9r0l1s\"]},\"Status\":\"Running\",\"VlanId\":\"\","
		+ "\"VpcAttributes\":{\"NatIpAddress\":\"10.175.65.9\",\"PrivateIpAddress\":{\"IpAddress\":[\"172.16.0.7\"]},"
		+ "\"VSwitchId\":\"vsw-25y0u4t0d\",\"VpcId\":\"vpc-25nhkqvej\"},\"ZoneId\":\"cn-beijing-a\","
		+ "\"ClusterId\":\"\"}]},\"PageNumber\":1,\"PageSize\":10,\"TotalCount\":2,"
		+ "\"RequestId\":\"A11D2D03-8DE3-43E6-B362-625DEBF3F88F\"}";
    Map<String, String> map = null;

    @Before
    public void init() {
        JsonReader jsonReader = new JsonReader();
        map = jsonReader.read(json, "DescribeInstancesResponse");
    }

    @Test
    public void numberTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.TotalCount").equals("2"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InternetMaxBandwidthIn").equals("200"));
    }

    @Test
    public void structTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].EipAddress.AllocationId").equals(""));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].EipAddress.IpAddress").equals("127.0.0.1"));
    }

    @Test
    public void stringTest() {
        Assert.assertTrue(
            map.get("DescribeInstancesResponse.RequestId").equals("A11D2D03-8DE3-43E6-B362-625DEBF3F88F"));
        Assert.assertTrue(
            map.get("DescribeInstancesResponse.Instances[0].ImageId").equals("centos7u0_64_20G_aliaegis_20141117.vhd"));
        Assert.assertTrue(
            map.get("DescribeInstancesResponse.Instances[0].Description").equals("test escape \"Timeout\""));
    }

    @Test
    public void listTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances.Length").equals("2"));

        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress.Length").equals("2"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress[0]").equals("127.0.0.101"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress[1]").equals("127.0.0.102"));

        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].OperationLocks.Length") == null);
    }

    @Test
    public void test() {
        System.out.println(
            JsonReaderTest.class.getName().substring(JsonReaderTest.class.getName().lastIndexOf(".") + 1));

    }

}
