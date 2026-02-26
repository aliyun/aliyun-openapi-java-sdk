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

import com.aliyuncs.ga.model.v20191120.DescribeCustomRoutingEndpointGroupResponse;
import com.aliyuncs.ga.model.v20191120.DescribeCustomRoutingEndpointGroupResponse.ServiceManagedInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomRoutingEndpointGroupResponseUnmarshaller {

	public static DescribeCustomRoutingEndpointGroupResponse unmarshall(DescribeCustomRoutingEndpointGroupResponse describeCustomRoutingEndpointGroupResponse, UnmarshallerContext _ctx) {
		
		describeCustomRoutingEndpointGroupResponse.setRequestId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.RequestId"));
		describeCustomRoutingEndpointGroupResponse.setAcceleratorId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.AcceleratorId"));
		describeCustomRoutingEndpointGroupResponse.setListenerId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.ListenerId"));
		describeCustomRoutingEndpointGroupResponse.setEndpointGroupId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.EndpointGroupId"));
		describeCustomRoutingEndpointGroupResponse.setName(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.Name"));
		describeCustomRoutingEndpointGroupResponse.setDescription(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.Description"));
		describeCustomRoutingEndpointGroupResponse.setEndpointGroupRegion(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.EndpointGroupRegion"));
		describeCustomRoutingEndpointGroupResponse.setState(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.State"));
		describeCustomRoutingEndpointGroupResponse.setSlsRegion(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.SlsRegion"));
		describeCustomRoutingEndpointGroupResponse.setSlsProjectName(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.SlsProjectName"));
		describeCustomRoutingEndpointGroupResponse.setSlsLogStoreName(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.SlsLogStoreName"));
		describeCustomRoutingEndpointGroupResponse.setAccessLogSwitch(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.AccessLogSwitch"));
		describeCustomRoutingEndpointGroupResponse.setEnableAccessLog(_ctx.booleanValue("DescribeCustomRoutingEndpointGroupResponse.EnableAccessLog"));
		describeCustomRoutingEndpointGroupResponse.setServiceId(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.ServiceId"));
		describeCustomRoutingEndpointGroupResponse.setServiceManaged(_ctx.booleanValue("DescribeCustomRoutingEndpointGroupResponse.ServiceManaged"));

		List<String> endpointGroupIpList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomRoutingEndpointGroupResponse.EndpointGroupIpList.Length"); i++) {
			endpointGroupIpList.add(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.EndpointGroupIpList["+ i +"]"));
		}
		describeCustomRoutingEndpointGroupResponse.setEndpointGroupIpList(endpointGroupIpList);

		List<String> endpointGroupUnconfirmedIpList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomRoutingEndpointGroupResponse.EndpointGroupUnconfirmedIpList.Length"); i++) {
			endpointGroupUnconfirmedIpList.add(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.EndpointGroupUnconfirmedIpList["+ i +"]"));
		}
		describeCustomRoutingEndpointGroupResponse.setEndpointGroupUnconfirmedIpList(endpointGroupUnconfirmedIpList);

		List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomRoutingEndpointGroupResponse.ServiceManagedInfos.Length"); i++) {
			ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
			serviceManagedInfosItem.setAction(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.ServiceManagedInfos["+ i +"].Action"));
			serviceManagedInfosItem.setChildType(_ctx.stringValue("DescribeCustomRoutingEndpointGroupResponse.ServiceManagedInfos["+ i +"].ChildType"));
			serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("DescribeCustomRoutingEndpointGroupResponse.ServiceManagedInfos["+ i +"].IsManaged"));

			serviceManagedInfos.add(serviceManagedInfosItem);
		}
		describeCustomRoutingEndpointGroupResponse.setServiceManagedInfos(serviceManagedInfos);
	 
	 	return describeCustomRoutingEndpointGroupResponse;
	}
}