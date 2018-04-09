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

import com.aliyuncs.emr.model.v20160408.ListClusterHostGroupForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHostGroupForAdminResponse.Host;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHostGroupForAdminResponseUnmarshaller {

	public static ListClusterHostGroupForAdminResponse unmarshall(ListClusterHostGroupForAdminResponse listClusterHostGroupForAdminResponse, UnmarshallerContext context) {
		
		listClusterHostGroupForAdminResponse.setRequestId(context.stringValue("ListClusterHostGroupForAdminResponse.RequestId"));
		listClusterHostGroupForAdminResponse.setPageNumber(context.integerValue("ListClusterHostGroupForAdminResponse.PageNumber"));
		listClusterHostGroupForAdminResponse.setPageSize(context.integerValue("ListClusterHostGroupForAdminResponse.PageSize"));
		listClusterHostGroupForAdminResponse.setTotal(context.integerValue("ListClusterHostGroupForAdminResponse.Total"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("ListClusterHostGroupForAdminResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostId(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].HostId"));
			host.setHostName(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].HostName"));
			host.setPublicIp(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].PublicIp"));
			host.setPrivateIp(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].PrivateIp"));
			host.setRole(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].Role"));
			host.setInstanceType(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].InstanceType"));
			host.setCpu(context.integerValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].Cpu"));
			host.setMemory(context.integerValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].Memory"));
			host.setStatus(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].Status"));
			host.setType(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].Type"));
			host.setHostInstanceId(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].HostInstanceId"));
			host.setSerialNumber(context.stringValue("ListClusterHostGroupForAdminResponse.HostList["+ i +"].SerialNumber"));

			hostList.add(host);
		}
		listClusterHostGroupForAdminResponse.setHostList(hostList);
	 
	 	return listClusterHostGroupForAdminResponse;
	}
}