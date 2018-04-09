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

	public static ListClusterHostComponentResponse unmarshall(ListClusterHostComponentResponse listClusterHostComponentResponse, UnmarshallerContext context) {
		
		listClusterHostComponentResponse.setRequestId(context.stringValue("ListClusterHostComponentResponse.RequestId"));
		listClusterHostComponentResponse.setPageNumber(context.integerValue("ListClusterHostComponentResponse.PageNumber"));
		listClusterHostComponentResponse.setPageSize(context.integerValue("ListClusterHostComponentResponse.PageSize"));
		listClusterHostComponentResponse.setTotal(context.integerValue("ListClusterHostComponentResponse.Total"));

		List<Component> componentList = new ArrayList<Component>();
		for (int i = 0; i < context.lengthValue("ListClusterHostComponentResponse.ComponentList.Length"); i++) {
			Component component = new Component();
			component.setServiceName(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ServiceName"));
			component.setServiceDisplayName(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ServiceDisplayName"));
			component.setComponentName(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ComponentName"));
			component.setComponentDisplayName(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ComponentDisplayName"));
			component.setStatus(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Status"));
			component.setNeedRestart(context.booleanValue("ListClusterHostComponentResponse.ComponentList["+ i +"].NeedRestart"));
			component.setHostId(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].HostId"));
			component.setServerStatus(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].ServerStatus"));
			component.setHostName(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].HostName"));
			component.setPublicIp(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].PublicIp"));
			component.setPrivateIp(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].PrivateIp"));
			component.setRole(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Role"));
			component.setInstanceType(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].InstanceType"));
			component.setCpu(context.integerValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Cpu"));
			component.setMemory(context.integerValue("ListClusterHostComponentResponse.ComponentList["+ i +"].Memory"));
			component.setHostInstanceId(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].HostInstanceId"));
			component.setSerialNumber(context.stringValue("ListClusterHostComponentResponse.ComponentList["+ i +"].SerialNumber"));

			componentList.add(component);
		}
		listClusterHostComponentResponse.setComponentList(componentList);
	 
	 	return listClusterHostComponentResponse;
	}
}