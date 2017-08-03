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

import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVirtualBorderRoutersForPhysicalConnectionResponseUnmarshaller {

	public static DescribeVirtualBorderRoutersForPhysicalConnectionResponse unmarshall(DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionResponse, UnmarshallerContext context) {
		
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setRequestId(context.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.RequestId"));
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setPageNumber(context.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.PageNumber"));
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setPageSize(context.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.PageSize"));
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setTotalCount(context.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.TotalCount"));

		List<VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionSet = new ArrayList<VirtualBorderRouterForPhysicalConnectionType>();
		for (int i = 0; i < context.lengthValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet.Length"); i++) {
			VirtualBorderRouterForPhysicalConnectionType virtualBorderRouterForPhysicalConnectionType = new VirtualBorderRouterForPhysicalConnectionType();
			virtualBorderRouterForPhysicalConnectionType.setVbrId(context.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].VbrId"));
			virtualBorderRouterForPhysicalConnectionType.setVbrOwnerUid(context.longValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].VbrOwnerUid"));
			virtualBorderRouterForPhysicalConnectionType.setCreationTime(context.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].CreationTime"));
			virtualBorderRouterForPhysicalConnectionType.setActivationTime(context.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].ActivationTime"));
			virtualBorderRouterForPhysicalConnectionType.setTerminationTime(context.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].TerminationTime"));
			virtualBorderRouterForPhysicalConnectionType.setRecoveryTime(context.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].RecoveryTime"));
			virtualBorderRouterForPhysicalConnectionType.setVlanId(context.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].VlanId"));
			virtualBorderRouterForPhysicalConnectionType.setCircuitCode(context.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].CircuitCode"));

			virtualBorderRouterForPhysicalConnectionSet.add(virtualBorderRouterForPhysicalConnectionType);
		}
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setVirtualBorderRouterForPhysicalConnectionSet(virtualBorderRouterForPhysicalConnectionSet);
	 
	 	return describeVirtualBorderRoutersForPhysicalConnectionResponse;
	}
}