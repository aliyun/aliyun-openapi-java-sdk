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

import com.aliyuncs.emr.model.v20160408.ListClusterHostComponentForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHostComponentForAdminResponse.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHostComponentForAdminResponseUnmarshaller {

	public static ListClusterHostComponentForAdminResponse unmarshall(ListClusterHostComponentForAdminResponse listClusterHostComponentForAdminResponse, UnmarshallerContext _ctx) {
		
		listClusterHostComponentForAdminResponse.setRequestId(_ctx.stringValue("ListClusterHostComponentForAdminResponse.RequestId"));
		listClusterHostComponentForAdminResponse.setPageNumber(_ctx.integerValue("ListClusterHostComponentForAdminResponse.PageNumber"));
		listClusterHostComponentForAdminResponse.setPageSize(_ctx.integerValue("ListClusterHostComponentForAdminResponse.PageSize"));
		listClusterHostComponentForAdminResponse.setTotal(_ctx.integerValue("ListClusterHostComponentForAdminResponse.Total"));

		List<Component> componentList = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterHostComponentForAdminResponse.ComponentList.Length"); i++) {
			Component component = new Component();
			component.setServiceName(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].ServiceName"));
			component.setServiceDisplayName(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].ServiceDisplayName"));
			component.setComponentName(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].ComponentName"));
			component.setComponentDisplayName(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].ComponentDisplayName"));
			component.setStatus(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].Status"));
			component.setNeedRestart(_ctx.booleanValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].NeedRestart"));
			component.setHostId(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].HostId"));
			component.setServerStatus(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].ServerStatus"));
			component.setHostName(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].HostName"));
			component.setPublicIp(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].PublicIp"));
			component.setPrivateIp(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].PrivateIp"));
			component.setRole(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].Role"));
			component.setInstanceType(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].InstanceType"));
			component.setCpu(_ctx.integerValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].Cpu"));
			component.setMemory(_ctx.integerValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].Memory"));
			component.setHostInstanceId(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].HostInstanceId"));
			component.setSerialNumber(_ctx.stringValue("ListClusterHostComponentForAdminResponse.ComponentList["+ i +"].SerialNumber"));

			componentList.add(component);
		}
		listClusterHostComponentForAdminResponse.setComponentList(componentList);
	 
	 	return listClusterHostComponentForAdminResponse;
	}
}