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

	public static DescribeMonitoringAgentHostsResponse unmarshall(DescribeMonitoringAgentHostsResponse describeMonitoringAgentHostsResponse, UnmarshallerContext _ctx) {
		
		describeMonitoringAgentHostsResponse.setRequestId(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.RequestId"));
		describeMonitoringAgentHostsResponse.setSuccess(_ctx.booleanValue("DescribeMonitoringAgentHostsResponse.Success"));
		describeMonitoringAgentHostsResponse.setCode(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Code"));
		describeMonitoringAgentHostsResponse.setMessage(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Message"));
		describeMonitoringAgentHostsResponse.setPageNumber(_ctx.integerValue("DescribeMonitoringAgentHostsResponse.PageNumber"));
		describeMonitoringAgentHostsResponse.setPageSize(_ctx.integerValue("DescribeMonitoringAgentHostsResponse.PageSize"));
		describeMonitoringAgentHostsResponse.setPageTotal(_ctx.integerValue("DescribeMonitoringAgentHostsResponse.PageTotal"));
		describeMonitoringAgentHostsResponse.setTotal(_ctx.integerValue("DescribeMonitoringAgentHostsResponse.Total"));

		List<Host> hosts = new ArrayList<Host>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMonitoringAgentHostsResponse.Hosts.Length"); i++) {
			Host host = new Host();
			host.setSerialNumber(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].SerialNumber"));
			host.setNatIp(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].NatIp"));
			host.setHostName(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].HostName"));
			host.setAliUid(_ctx.longValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].AliUid"));
			host.setNetworkType(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].NetworkType"));
			host.setInstanceId(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].InstanceId"));
			host.setIsAliyunHost(_ctx.booleanValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].isAliyunHost"));
			host.setEipAddress(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].EipAddress"));
			host.setAgentVersion(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].AgentVersion"));
			host.setIpGroup(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].IpGroup"));
			host.setEipId(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].EipId"));
			host.setRegion(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].Region"));
			host.setInstanceTypeFamily(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].InstanceTypeFamily"));
			host.setOperatingSystem(_ctx.stringValue("DescribeMonitoringAgentHostsResponse.Hosts["+ i +"].OperatingSystem"));

			hosts.add(host);
		}
		describeMonitoringAgentHostsResponse.setHosts(hosts);
	 
	 	return describeMonitoringAgentHostsResponse;
	}
}