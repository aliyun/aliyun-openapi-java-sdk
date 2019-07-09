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

import com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePhysicalConnectionsResponse.PhysicalConnectionType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhysicalConnectionsResponseUnmarshaller {

	public static DescribePhysicalConnectionsResponse unmarshall(DescribePhysicalConnectionsResponse describePhysicalConnectionsResponse, UnmarshallerContext _ctx) {
		
		describePhysicalConnectionsResponse.setRequestId(_ctx.stringValue("DescribePhysicalConnectionsResponse.RequestId"));
		describePhysicalConnectionsResponse.setPageNumber(_ctx.integerValue("DescribePhysicalConnectionsResponse.PageNumber"));
		describePhysicalConnectionsResponse.setPageSize(_ctx.integerValue("DescribePhysicalConnectionsResponse.PageSize"));
		describePhysicalConnectionsResponse.setTotalCount(_ctx.integerValue("DescribePhysicalConnectionsResponse.TotalCount"));

		List<PhysicalConnectionType> physicalConnectionSet = new ArrayList<PhysicalConnectionType>();
		for (int i = 0; i < _ctx.lengthValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet.Length"); i++) {
			PhysicalConnectionType physicalConnectionType = new PhysicalConnectionType();
			physicalConnectionType.setPhysicalConnectionId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PhysicalConnectionId"));
			physicalConnectionType.setAccessPointId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AccessPointId"));
			physicalConnectionType.setType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Type"));
			physicalConnectionType.setStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Status"));
			physicalConnectionType.setBusinessStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].BusinessStatus"));
			physicalConnectionType.setCreationTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CreationTime"));
			physicalConnectionType.setEnabledTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].EnabledTime"));
			physicalConnectionType.setLineOperator(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].LineOperator"));
			physicalConnectionType.setSpec(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Spec"));
			physicalConnectionType.setPeerLocation(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PeerLocation"));
			physicalConnectionType.setPortType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortType"));
			physicalConnectionType.setRedundantPhysicalConnectionId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].RedundantPhysicalConnectionId"));
			physicalConnectionType.setName(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Name"));
			physicalConnectionType.setDescription(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Description"));
			physicalConnectionType.setAdLocation(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AdLocation"));
			physicalConnectionType.setPortNumber(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortNumber"));
			physicalConnectionType.setCircuitCode(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CircuitCode"));
			physicalConnectionType.setBandwidth(_ctx.longValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Bandwidth"));

			physicalConnectionSet.add(physicalConnectionType);
		}
		describePhysicalConnectionsResponse.setPhysicalConnectionSet(physicalConnectionSet);
	 
	 	return describePhysicalConnectionsResponse;
	}
}