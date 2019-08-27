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

import com.aliyuncs.emr.model.v20160408.ListClusterHostComponentResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterHostComponentResponse.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterHostComponentResponseUnmarshaller {

	public static ListClusterHostComponentResponse unmarshall(ListClusterHostComponentResponse listClusterHostComponentResponse, UnmarshallerContext _ctx) {
		
		listClusterHostComponentResponse.setRequestId(_ctx.stringValue("ListClusterHostComponentResponse.RequestId"));
		listClusterHostComponentResponse.setPageNumber(_ctx.integerValue("ListClusterHostComponentResponse.PageNumber"));
		listClusterHostComponentResponse.setPageSize(_ctx.integerValue("ListClusterHostComponentResponse.PageSize"));
		listClusterHostComponentResponse.setTotal(_ctx.integerValue("ListClusterHostComponentResponse.Total"));

		List<Component> componentList = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterHostComponentResponse.ComponentList.Length"); i++) {
			Component component = new Component();
			component.setServiceName(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ServiceName"));
			component.setServiceDisplayName(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ServiceDisplayName"));
			component.setComponentName(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ComponentName"));
			component.setComponentDisplayName(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ComponentDisplayName"));
			component.setStatus(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Status"));
			component.setNeedRestart(_ctx.booleanValue("ListClusterHostComponentResponse.ComponentList["+ i +"].NeedRestart"));
			component.setHostId(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].HostId"));
			component.setServerStatus(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ServerStatus"));
			component.setHostName(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].HostName"));
			component.setPublicIp(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].PublicIp"));
			component.setPrivateIp(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].PrivateIp"));
			component.setRole(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Role"));
			component.setInstanceType(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].InstanceType"));
			component.setCpu(_ctx.integerValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Cpu"));
			component.setMemory(_ctx.integerValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Memory"));
			component.setHostInstanceId(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].HostInstanceId"));
			component.setSerialNumber(_ctx.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].SerialNumber"));

			componentList.add(component);
		}
		listClusterHostComponentResponse.setComponentList(componentList);
	 
	 	return listClusterHostComponentResponse;
	}
}