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
import com.aliyuncs.ga.model.v20191120.DescribeEndpointGroupResponse.PortOverridesItem;
import com.aliyuncs.ga.model.v20191120.DescribeEndpointGroupResponse.ServiceManagedInfosItem;
import com.aliyuncs.ga.model.v20191120.DescribeEndpointGroupResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEndpointGroupResponseUnmarshaller {

	public static DescribeEndpointGroupResponse unmarshall(DescribeEndpointGroupResponse describeEndpointGroupResponse, UnmarshallerContext _ctx) {
		
		describeEndpointGroupResponse.setRequestId(_ctx.stringValue("DescribeEndpointGroupResponse.RequestId"));
		describeEndpointGroupResponse.setHealthCheckIntervalSeconds(_ctx.integerValue("DescribeEndpointGroupResponse.HealthCheckIntervalSeconds"));
		describeEndpointGroupResponse.setTrafficPercentage(_ctx.integerValue("DescribeEndpointGroupResponse.TrafficPercentage"));
		describeEndpointGroupResponse.setEndpointGroupId(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointGroupId"));
		describeEndpointGroupResponse.setDescription(_ctx.stringValue("DescribeEndpointGroupResponse.Description"));
		describeEndpointGroupResponse.setHealthCheckPath(_ctx.stringValue("DescribeEndpointGroupResponse.HealthCheckPath"));
		describeEndpointGroupResponse.setThresholdCount(_ctx.integerValue("DescribeEndpointGroupResponse.ThresholdCount"));
		describeEndpointGroupResponse.setName(_ctx.stringValue("DescribeEndpointGroupResponse.Name"));
		describeEndpointGroupResponse.setEndpointGroupRegion(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointGroupRegion"));
		describeEndpointGroupResponse.setState(_ctx.stringValue("DescribeEndpointGroupResponse.State"));
		describeEndpointGroupResponse.setHealthCheckProtocol(_ctx.stringValue("DescribeEndpointGroupResponse.HealthCheckProtocol"));
		describeEndpointGroupResponse.setHealthCheckPort(_ctx.integerValue("DescribeEndpointGroupResponse.HealthCheckPort"));
		describeEndpointGroupResponse.setEndpointRequestProtocol(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointRequestProtocol"));
		describeEndpointGroupResponse.setEndpointGroupType(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointGroupType"));
		describeEndpointGroupResponse.setAcceleratorId(_ctx.stringValue("DescribeEndpointGroupResponse.AcceleratorId"));
		describeEndpointGroupResponse.setListenerId(_ctx.stringValue("DescribeEndpointGroupResponse.ListenerId"));
		describeEndpointGroupResponse.setSlsRegion(_ctx.stringValue("DescribeEndpointGroupResponse.SlsRegion"));
		describeEndpointGroupResponse.setSlsProjectName(_ctx.stringValue("DescribeEndpointGroupResponse.SlsProjectName"));
		describeEndpointGroupResponse.setSlsLogStoreName(_ctx.stringValue("DescribeEndpointGroupResponse.SlsLogStoreName"));
		describeEndpointGroupResponse.setAccessLogSwitch(_ctx.stringValue("DescribeEndpointGroupResponse.AccessLogSwitch"));
		describeEndpointGroupResponse.setEnableAccessLog(_ctx.booleanValue("DescribeEndpointGroupResponse.EnableAccessLog"));
		describeEndpointGroupResponse.setHealthCheckEnabled(_ctx.booleanValue("DescribeEndpointGroupResponse.HealthCheckEnabled"));
		describeEndpointGroupResponse.setServiceId(_ctx.stringValue("DescribeEndpointGroupResponse.ServiceId"));
		describeEndpointGroupResponse.setServiceManaged(_ctx.booleanValue("DescribeEndpointGroupResponse.ServiceManaged"));

		List<String> endpointGroupIpList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.EndpointGroupIpList.Length"); i++) {
			endpointGroupIpList.add(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointGroupIpList["+ i +"]"));
		}
		describeEndpointGroupResponse.setEndpointGroupIpList(endpointGroupIpList);

		List<String> endpointGroupUnconfirmedIpList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.EndpointGroupUnconfirmedIpList.Length"); i++) {
			endpointGroupUnconfirmedIpList.add(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointGroupUnconfirmedIpList["+ i +"]"));
		}
		describeEndpointGroupResponse.setEndpointGroupUnconfirmedIpList(endpointGroupUnconfirmedIpList);

		List<String> forwardingRuleIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.ForwardingRuleIds.Length"); i++) {
			forwardingRuleIds.add(_ctx.stringValue("DescribeEndpointGroupResponse.ForwardingRuleIds["+ i +"]"));
		}
		describeEndpointGroupResponse.setForwardingRuleIds(forwardingRuleIds);

		List<EndpointConfigurationsItem> endpointConfigurations = new ArrayList<EndpointConfigurationsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.EndpointConfigurations.Length"); i++) {
			EndpointConfigurationsItem endpointConfigurationsItem = new EndpointConfigurationsItem();
			endpointConfigurationsItem.setType(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].Type"));
			endpointConfigurationsItem.setEnableClientIPPreservation(_ctx.booleanValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].EnableClientIPPreservation"));
			endpointConfigurationsItem.setWeight(_ctx.integerValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].Weight"));
			endpointConfigurationsItem.setProbeProtocol(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].ProbeProtocol"));
			endpointConfigurationsItem.setEndpoint(_ctx.stringValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].Endpoint"));
			endpointConfigurationsItem.setEnableProxyProtocol(_ctx.booleanValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].EnableProxyProtocol"));
			endpointConfigurationsItem.setProbePort(_ctx.integerValue("DescribeEndpointGroupResponse.EndpointConfigurations["+ i +"].ProbePort"));

			endpointConfigurations.add(endpointConfigurationsItem);
		}
		describeEndpointGroupResponse.setEndpointConfigurations(endpointConfigurations);

		List<PortOverridesItem> portOverrides = new ArrayList<PortOverridesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.PortOverrides.Length"); i++) {
			PortOverridesItem portOverridesItem = new PortOverridesItem();
			portOverridesItem.setListenerPort(_ctx.integerValue("DescribeEndpointGroupResponse.PortOverrides["+ i +"].ListenerPort"));
			portOverridesItem.setEndpointPort(_ctx.integerValue("DescribeEndpointGroupResponse.PortOverrides["+ i +"].EndpointPort"));

			portOverrides.add(portOverridesItem);
		}
		describeEndpointGroupResponse.setPortOverrides(portOverrides);

		List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.ServiceManagedInfos.Length"); i++) {
			ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
			serviceManagedInfosItem.setAction(_ctx.stringValue("DescribeEndpointGroupResponse.ServiceManagedInfos["+ i +"].Action"));
			serviceManagedInfosItem.setChildType(_ctx.stringValue("DescribeEndpointGroupResponse.ServiceManagedInfos["+ i +"].ChildType"));
			serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("DescribeEndpointGroupResponse.ServiceManagedInfos["+ i +"].IsManaged"));

			serviceManagedInfos.add(serviceManagedInfosItem);
		}
		describeEndpointGroupResponse.setServiceManagedInfos(serviceManagedInfos);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointGroupResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeEndpointGroupResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("DescribeEndpointGroupResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		describeEndpointGroupResponse.setTags(tags);
	 
	 	return describeEndpointGroupResponse;
	}
}