/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVirtualBorderRoutersForPhysicalConnectionResponseUnmarshaller {

	public static DescribeVirtualBorderRoutersForPhysicalConnectionResponse unmarshall(DescribeVirtualBorderRoutersForPhysicalConnectionResponse describeVirtualBorderRoutersForPhysicalConnectionResponse, UnmarshallerContext _ctx) {
		
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setRequestId(_ctx.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.RequestId"));
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setPageNumber(_ctx.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.PageNumber"));
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setPageSize(_ctx.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.PageSize"));
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setTotalCount(_ctx.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.TotalCount"));

		List<VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionSet = new ArrayList<VirtualBorderRouterForPhysicalConnectionType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet.Length"); i++) {
			VirtualBorderRouterForPhysicalConnectionType virtualBorderRouterForPhysicalConnectionType = new VirtualBorderRouterForPhysicalConnectionType();
			virtualBorderRouterForPhysicalConnectionType.setVbrId(_ctx.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].VbrId"));
			virtualBorderRouterForPhysicalConnectionType.setVbrOwnerUid(_ctx.longValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].VbrOwnerUid"));
			virtualBorderRouterForPhysicalConnectionType.setCreationTime(_ctx.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].CreationTime"));
			virtualBorderRouterForPhysicalConnectionType.setActivationTime(_ctx.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].ActivationTime"));
			virtualBorderRouterForPhysicalConnectionType.setTerminationTime(_ctx.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].TerminationTime"));
			virtualBorderRouterForPhysicalConnectionType.setRecoveryTime(_ctx.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].RecoveryTime"));
			virtualBorderRouterForPhysicalConnectionType.setVlanId(_ctx.integerValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].VlanId"));
			virtualBorderRouterForPhysicalConnectionType.setCircuitCode(_ctx.stringValue("DescribeVirtualBorderRoutersForPhysicalConnectionResponse.VirtualBorderRouterForPhysicalConnectionSet["+ i +"].CircuitCode"));

			virtualBorderRouterForPhysicalConnectionSet.add(virtualBorderRouterForPhysicalConnectionType);
		}
		describeVirtualBorderRoutersForPhysicalConnectionResponse.setVirtualBorderRouterForPhysicalConnectionSet(virtualBorderRouterForPhysicalConnectionSet);
	 
	 	return describeVirtualBorderRoutersForPhysicalConnectionResponse;
	}
}