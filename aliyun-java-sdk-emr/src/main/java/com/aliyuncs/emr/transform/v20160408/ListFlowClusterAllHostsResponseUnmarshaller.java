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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowClusterAllHostsResponseUnmarshaller {

	public static ListFlowClusterAllHostsResponse unmarshall(ListFlowClusterAllHostsResponse listFlowClusterAllHostsResponse, UnmarshallerContext _ctx) {
		
		listFlowClusterAllHostsResponse.setRequestId(_ctx.stringValue("ListFlowClusterAllHostsResponse.RequestId"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowClusterAllHostsResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostId(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].HostId"));
			host.setHostName(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Role"));
			host.setInstanceType(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(_ctx.integerValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Cpu"));
			host.setMemory(_ctx.integerValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Memory"));
			host.setStatus(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Status"));
			host.setType(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(_ctx.stringValue("ListFlowClusterAllHostsResponse.HostList["+ i +"].SerialNumber"));

			hostList.add(host);
		}
		listFlowClusterAllHostsResponse.setHostList(hostList);
	 
	 	return listFlowClusterAllHostsResponse;
	}
}