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

import com.aliyuncs.emr.model.v20160408.ListFlowClusterHostResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowClusterHostResponse.Host;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowClusterHostResponseUnmarshaller {

	public static ListFlowClusterHostResponse unmarshall(ListFlowClusterHostResponse listFlowClusterHostResponse, UnmarshallerContext _ctx) {
		
		listFlowClusterHostResponse.setRequestId(_ctx.stringValue("ListFlowClusterHostResponse.RequestId"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowClusterHostResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostId(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].HostId"));
			host.setHostName(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].Role"));
			host.setInstanceType(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(_ctx.integerValue("ListFlowClusterHostResponse.HostList["+ i +"].Cpu"));
			host.setMemory(_ctx.integerValue("ListFlowClusterHostResponse.HostList["+ i +"].Memory"));
			host.setStatus(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].Status"));
			host.setType(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(_ctx.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].SerialNumber"));

			hostList.add(host);
		}
		listFlowClusterHostResponse.setHostList(hostList);
	 
	 	return listFlowClusterHostResponse;
	}
}