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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersResponse.VirtualBorderRouterType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVirtualBorderRoutersResponseUnmarshaller {

	public static DescribeVirtualBorderRoutersResponse unmarshall(DescribeVirtualBorderRoutersResponse describeVirtualBorderRoutersResponse, UnmarshallerContext context) {
		
		describeVirtualBorderRoutersResponse.setRequestId(context.stringValue("DescribeVirtualBorderRoutersResponse.RequestId"));
		describeVirtualBorderRoutersResponse.setPageNumber(context.integerValue("DescribeVirtualBorderRoutersResponse.PageNumber"));
		describeVirtualBorderRoutersResponse.setPageSize(context.integerValue("DescribeVirtualBorderRoutersResponse.PageSize"));
		describeVirtualBorderRoutersResponse.setTotalCount(context.integerValue("DescribeVirtualBorderRoutersResponse.TotalCount"));

		List<VirtualBorderRouterType> virtualBorderRouterSet = new ArrayList<VirtualBorderRouterType>();
		for (int i = 0; i < context.lengthValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet.Length"); i++) {
			VirtualBorderRouterType virtualBorderRouterType = new VirtualBorderRouterType();
			virtualBorderRouterType.setVbrId(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VbrId"));
			virtualBorderRouterType.setCreationTime(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CreationTime"));
			virtualBorderRouterType.setActivationTime(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].ActivationTime"));
			virtualBorderRouterType.setTerminationTime(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].TerminationTime"));
			virtualBorderRouterType.setRecoveryTime(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].RecoveryTime"));
			virtualBorderRouterType.setStatus(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Status"));
			virtualBorderRouterType.setVlanId(context.integerValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VlanId"));
			virtualBorderRouterType.setCircuitCode(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].CircuitCode"));
			virtualBorderRouterType.setRouteTableId(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].RouteTableId"));
			virtualBorderRouterType.setVlanInterfaceId(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].VlanInterfaceId"));
			virtualBorderRouterType.setLocalGatewayIp(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].LocalGatewayIp"));
			virtualBorderRouterType.setPeerGatewayIp(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeerGatewayIp"));
			virtualBorderRouterType.setPeeringSubnetMask(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PeeringSubnetMask"));
			virtualBorderRouterType.setPhysicalConnectionId(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionId"));
			virtualBorderRouterType.setPhysicalConnectionStatus(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionStatus"));
			virtualBorderRouterType.setPhysicalConnectionBusinessStatus(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionBusinessStatus"));
			virtualBorderRouterType.setPhysicalConnectionOwnerUid(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].PhysicalConnectionOwnerUid"));
			virtualBorderRouterType.setAccessPointId(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].AccessPointId"));
			virtualBorderRouterType.setName(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Name"));
			virtualBorderRouterType.setDescription(context.stringValue("DescribeVirtualBorderRoutersResponse.VirtualBorderRouterSet["+ i +"].Description"));

			virtualBorderRouterSet.add(virtualBorderRouterType);
		}
		describeVirtualBorderRoutersResponse.setVirtualBorderRouterSet(virtualBorderRouterSet);
	 
	 	return describeVirtualBorderRoutersResponse;
	}
}