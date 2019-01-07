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

import com.aliyuncs.exceptions.ClientException;

public class XmlReaderTest {
    String xml
        = "<?xml version=\"1.0\" encoding=\"utf-8\"?><DescribeInstancesResponse><Instances><Instance><CreationTime"
        + ">2014-10-13T11:51:22Z</CreationTime><Description></Description><EipAddress><AllocationId></AllocationId"
        + "><IpAddress>127.0.0.1</IpAddress><InternetChargeType></InternetChargeType></EipAddress><HostName"
        + ">iZ23a8l47rmZ</HostName><ImageId>centos6u5_64_20G_aliaegis_20140926.vhd</ImageId><InnerIpAddress"
        + "><IpAddress>10.132.60.90</IpAddress><IpAddress>10.132.60.91</IpAddress></InnerIpAddress><InstanceId>i"
        + "-23a8l47rm</InstanceId><InstanceName>iZ23a8l47r&amp;"
        + "mZ-vncpwd-869735</InstanceName><InstanceNetworkType>classic</InstanceNetworkType><InstanceType>ecs"
        + ".t1.xsmall</InstanceType><InternetChargeType></InternetChargeType><InternetMaxBandwidthIn>-1"
        + "</InternetMaxBandwidthIn><InternetMaxBandwidthOut>1</InternetMaxBandwidthOut><OperationLocks"
        + "></OperationLocks><PublicIpAddress><IpAddress>121.199.43.126</IpAddress></PublicIpAddress><RegionId>cn"
        + "-hangzhou</RegionId><SecurityGroupIds><SecurityGroupId>G1344371</SecurityGroupId></SecurityGroupIds"
        + "><Status>Stopped</Status><VlanId></VlanId><VpcAttributes><NatIpAddress></NatIpAddress><PrivateIpAddress"
        + "></PrivateIpAddress><VSwitchId></VSwitchId><VpcId></VpcId></VpcAttributes><ZoneId>cn-hangzhou-b</ZoneId"
        + "><ClusterId></ClusterId></Instance></Instances><PageNumber>1</PageNumber><PageSize>10</PageSize"
        + "><TotalCount>1</TotalCount><RequestId>555FF875-0341-4D16-BFD1-E5B96FFEACC5</RequestId"
        + "></DescribeInstancesResponse>";
    Map<String, String> map = null;

    @Before
    public void init() throws ClientException {
        XmlReader xmlReader = new XmlReader();
        map = xmlReader.read(xml, "DescribeInstancesResponse");
        System.out.println(map);
    }

    @Test
    public void numberTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.TotalCount").equals("1"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InternetMaxBandwidthIn").equals("-1"));
    }

    @Test
    public void structTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].EipAddress.AllocationId").equals(""));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].EipAddress.IpAddress").equals("127.0.0.1"));
    }

    @Test
    public void stringTest() {
        Assert.assertTrue(
            map.get("DescribeInstancesResponse.RequestId").equals("555FF875-0341-4D16-BFD1-E5B96FFEACC5"));
        Assert.assertTrue(
            map.get("DescribeInstancesResponse.Instances[0].ImageId").equals("centos6u5_64_20G_aliaegis_20140926.vhd"));
    }

    @Test
    public void listTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances.Length").equals("1"));

        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress.Length").equals("2"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress[0]").equals("10.132.60.90"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress[1]").equals("10.132.60.91"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].PublicIpAddress.Length").equals("1"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].OperationLocks.Length") == null);
    }
}
