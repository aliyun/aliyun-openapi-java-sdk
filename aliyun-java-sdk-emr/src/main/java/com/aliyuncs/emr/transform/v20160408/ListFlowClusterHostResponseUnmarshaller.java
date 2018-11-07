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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowClusterHostResponseUnmarshaller {

	public static ListFlowClusterHostResponse unmarshall(ListFlowClusterHostResponse listFlowClusterHostResponse, UnmarshallerContext context) {
		
		listFlowClusterHostResponse.setRequestId(context.stringValue("ListFlowClusterHostResponse.RequestId"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("ListFlowClusterHostResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostId(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].HostId"));
			host.setHostName(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].Role"));
			host.setInstanceType(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(context.integerValue("ListFlowClusterHostResponse.HostList["+ i +"].Cpu"));
			host.setMemory(context.integerValue("ListFlowClusterHostResponse.HostList["+ i +"].Memory"));
			host.setStatus(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].Status"));
			host.setType(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(context.stringValue("ListFlowClusterHostResponse.HostList["+ i +"].SerialNumber"));

			hostList.add(host);
		}
		listFlowClusterHostResponse.setHostList(hostList);
	 
	 	return listFlowClusterHostResponse;
	}
}