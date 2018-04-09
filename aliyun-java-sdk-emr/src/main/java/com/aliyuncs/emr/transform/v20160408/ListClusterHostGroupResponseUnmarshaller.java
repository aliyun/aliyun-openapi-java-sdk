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

import com.aliyuncs.emr.model.v20160408.ListClusterHostGroupResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHostGroupResponse.Host;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHostGroupResponseUnmarshaller {

	public static ListClusterHostGroupResponse unmarshall(ListClusterHostGroupResponse listClusterHostGroupResponse, UnmarshallerContext context) {
		
		listClusterHostGroupResponse.setRequestId(context.stringValue("ListClusterHostGroupResponse.RequestId"));
		listClusterHostGroupResponse.setPageNumber(context.integerValue("ListClusterHostGroupResponse.PageNumber"));
		listClusterHostGroupResponse.setPageSize(context.integerValue("ListClusterHostGroupResponse.PageSize"));
		listClusterHostGroupResponse.setTotal(context.integerValue("ListClusterHostGroupResponse.Total"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("ListClusterHostGroupResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostId(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].HostId"));
			host.setHostName(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].Role"));
			host.setInstanceType(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(context.integerValue("ListClusterHostGroupResponse.HostList["+ i +"].Cpu"));
			host.setMemory(context.integerValue("ListClusterHostGroupResponse.HostList["+ i +"].Memory"));
			host.setStatus(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].Status"));
			host.setType(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(context.stringValue("ListClusterHostGroupResponse.HostList["+ i +"].SerialNumber"));

			hostList.add(host);
		}
		listClusterHostGroupResponse.setHostList(hostList);
	 
	 	return listClusterHostGroupResponse;
	}
}