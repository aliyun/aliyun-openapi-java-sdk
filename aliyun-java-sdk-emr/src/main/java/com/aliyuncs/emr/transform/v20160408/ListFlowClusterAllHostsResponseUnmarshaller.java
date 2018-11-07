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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListFlowClusterAllHostsResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterAllHostsResponse.Host;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowClusterAllHostsResponseUnmarshaller {

	public static ListFlowClusterAllHostsResponse unmarshall(ListFlowClusterAllHostsResponse listFlowClusterAllHostsResponse, UnmarshallerContext context) {
		
		listFlowClusterAllHostsResponse.setRequestId(context.stringValue("ListFlowClusterAllHostsResponse.RequestId"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("ListFlowClusterAllHostsResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostId(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].HostId"));
			host.setHostName(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Role"));
			host.setInstanceType(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(context.integerValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Cpu"));
			host.setMemory(context.integerValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Memory"));
			host.setStatus(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Status"));
			host.setType(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(context.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].SerialNumber"));

			hostList.add(host);
		}
		listFlowClusterAllHostsResponse.setHostList(hostList);
	 
	 	return listFlowClusterAllHostsResponse;
	}
}