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
package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeShardingNetworkAddressResponse;
import com.aliyuncs.dds.model.v20151201.DescribeShardingNetworkAddressResponse.NetworkAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardingNetworkAddressResponseUnmarshaller {

	public static DescribeShardingNetworkAddressResponse unmarshall(DescribeShardingNetworkAddressResponse describeShardingNetworkAddressResponse, UnmarshallerContext context) {
		
		describeShardingNetworkAddressResponse.setRequestId(context.stringValue("DescribeShardingNetworkAddressResponse.RequestId"));

		List<NetworkAddress> networkAddresses = new ArrayList<NetworkAddress>();
		for (int i = 0; i < context.lengthValue("DescribeShardingNetworkAddressResponse.NetworkAddresses.Length"); i++) {
			NetworkAddress networkAddress = new NetworkAddress();
			networkAddress.setNetworkAddress(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].NetworkAddress"));
			networkAddress.setIPAddress(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].IPAddress"));
			networkAddress.setNetworkType(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].NetworkType"));
			networkAddress.setPort(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].Port"));
			networkAddress.setVPCId(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].VPCId"));
			networkAddress.setVswitchId(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].VswitchId"));
			networkAddress.setNodeId(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].NodeId"));
			networkAddress.setExpiredTime(context.stringValue("DescribeShardingNetworkAddressResponse.NetworkAddresses["+ i +"].ExpiredTime"));

			networkAddresses.add(networkAddress);
		}
		describeShardingNetworkAddressResponse.setNetworkAddresses(networkAddresses);
	 
	 	return describeShardingNetworkAddressResponse;
	}
}