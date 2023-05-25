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
			physicalConnectionType.setAdLocation(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AdLocation"));
			physicalConnectionType.setCreationTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CreationTime"));
			physicalConnectionType.setStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Status"));
			physicalConnectionType.setType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Type"));
			physicalConnectionType.setPortNumber(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortNumber"));
			physicalConnectionType.setCircuitCode(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].CircuitCode"));
			physicalConnectionType.setSpec(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Spec"));
			physicalConnectionType.setBandwidth(_ctx.longValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Bandwidth"));
			physicalConnectionType.setDescription(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Description"));
			physicalConnectionType.setPortType(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PortType"));
			physicalConnectionType.setEnabledTime(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].EnabledTime"));
			physicalConnectionType.setBusinessStatus(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].BusinessStatus"));
			physicalConnectionType.setLineOperator(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].LineOperator"));
			physicalConnectionType.setName(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].Name"));
			physicalConnectionType.setRedundantPhysicalConnectionId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].RedundantPhysicalConnectionId"));
			physicalConnectionType.setPeerLocation(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PeerLocation"));
			physicalConnectionType.setAccessPointId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].AccessPointId"));
			physicalConnectionType.setPhysicalConnectionId(_ctx.stringValue("DescribePhysicalConnectionsResponse.PhysicalConnectionSet["+ i +"].PhysicalConnectionId"));

			physicalConnectionSet.add(physicalConnectionType);
		}
		describePhysicalConnectionsResponse.setPhysicalConnectionSet(physicalConnectionSet);
	 
	 	return describePhysicalConnectionsResponse;
	}
}