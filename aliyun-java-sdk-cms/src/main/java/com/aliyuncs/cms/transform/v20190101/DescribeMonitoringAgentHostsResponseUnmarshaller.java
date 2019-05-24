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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMonitoringAgentHostsResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMonitoringAgentHostsResponse.Host;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitoringAgentHostsResponseUnmarshaller {

	public static DescribeMonitoringAgentHostsResponse unmarshall(DescribeMonitoringAgentHostsResponse describeMonitoringAgentHostsResponse, UnmarshallerContext context) {
		
		describeMonitoringAgentHostsResponse.setRequestId(context.stringValue("DescribeMonitoringAgentHostsResponse.RequestId"));
		describeMonitoringAgentHostsResponse.setCode(context.stringValue("DescribeMonitoringAgentHostsResponse.Code"));
		describeMonitoringAgentHostsResponse.setMessage(context.stringValue("DescribeMonitoringAgentHostsResponse.Message"));
		describeMonitoringAgentHostsResponse.setSuccess(context.booleanValue("DescribeMonitoringAgentHostsResponse.Success"));
		describeMonitoringAgentHostsResponse.setPageTotal(context.integerValue("DescribeMonitoringAgentHostsResponse.PageTotal"));
		describeMonitoringAgentHostsResponse.setTotal(context.integerValue("DescribeMonitoringAgentHostsResponse.Total"));

		List<Host> hosts = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("DescribeMonitoringAgentHostsResponse.Hosts.Length"); i++) {
			Host host = new Host();
			host.setInstanceId(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].InstanceId"));
			host.setSerialNumber(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].SerialNumber"));
			host.setHostName(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].HostName"));
			host.setAliUid(context.longValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].AliUid"));
			host.setOperatingSystem(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].OperatingSystem"));
			host.setIpGroup(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].IpGroup"));
			host.setRegion(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].Region"));
			host.setAgentVersion(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].AgentVersion"));
			host.setEipAddress(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].EipAddress"));
			host.setEipId(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].EipId"));
			host.setIsAliyunHost(context.booleanValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].isAliyunHost"));
			host.setNatIp(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].NatIp"));
			host.setNetworkType(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].NetworkType"));
			host.setInstanceTypeFamily(context.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].InstanceTypeFamily"));

			hosts.add(host);
		}
		describeMonitoringAgentHostsResponse.setHosts(hosts);
	 
	 	return describeMonitoringAgentHostsResponse;
	}
}