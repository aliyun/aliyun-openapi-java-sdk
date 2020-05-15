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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.DescribeEndpointGroupResponse;
import com.aliyuncs.ga.model.v20191120.DescribeEndpointGroupResponse.EndpointConfigurationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEndpointGroupResponseUnmarshaller {

	public static DescribeEndpointGroupResponse unmarshall(DescribeEndpointGroupResponse describeEndpointGroupResponse, UnmarshallerContext _ctx) {
		
		describeEndpointGroupResponse.setRequestId(_ctx.stringValue("DescribeEndpointGroupResponse.RequestId"));
		describeEndpointGroupResponse.setTotalCount(_ctx.integerValue("DescribeEndpointGroupResponse.TotalCount"));
		describeEndpointGroupResponse.setEndpointGroupId(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointGroupId"));
		describeEndpointGroupResponse.setName(_ctx.stringValue("DescribeEndpointGroupResponse.Name"));
		describeEndpointGroupResponse.setDescription(_ctx.stringValue("DescribeEndpointGroupResponse.Description"));
		describeEndpointGroupResponse.setTrafficPercentage(_ctx.integerValue("DescribeEndpointGroupResponse.TrafficPercentage"));
		describeEndpointGroupResponse.setEndpointGroupRegion(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointGroupRegion"));
		describeEndpointGroupResponse.setState(_ctx.stringValue("DescribeEndpointGroupResponse.State"));
		describeEndpointGroupResponse.setListenerId(_ctx.stringValue("DescribeEndpointGroupResponse.ListenerId"));
		describeEndpointGroupResponse.setHealthCheckIntervalSeconds(_ctx.integerValue("DescribeEndpointGroupResponse.HealthCheckIntervalSeconds"));
		describeEndpointGroupResponse.setHealthCheckPath(_ctx.stringValue("DescribeEndpointGroupResponse.HealthCheckPath"));
		describeEndpointGroupResponse.setHealthCheckPort(_ctx.integerValue("DescribeEndpointGroupResponse.HealthCheckPort"));
		describeEndpointGroupResponse.setHealthCheckProtocol(_ctx.stringValue("DescribeEndpointGroupResponse.HealthCheckProtocol"));
		describeEndpointGroupResponse.setThresholdCount(_ctx.integerValue("DescribeEndpointGroupResponse.ThresholdCount"));

		List<EndpointConfigurationsItem> endpointConfigurations = new ArrayList<EndpointConfigurationsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.EndpointConfigurations.Length"); i++) {
			EndpointConfigurationsItem endpointConfigurationsItem = new EndpointConfigurationsItem();
			endpointConfigurationsItem.setEndpoint(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].Endpoint"));
			endpointConfigurationsItem.setWeight(_ctx.integerValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].Weight"));
			endpointConfigurationsItem.setType(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].Type"));

			endpointConfigurations.add(endpointConfigurationsItem);
		}
		describeEndpointGroupResponse.setEndpointConfigurations(endpointConfigurations);
	 
	 	return describeEndpointGroupResponse;
	}
}