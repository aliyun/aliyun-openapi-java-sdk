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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceComponentResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceComponentResponse.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceComponentResponseUnmarshaller {

	public static ListClusterServiceComponentResponse unmarshall(ListClusterServiceComponentResponse listClusterServiceComponentResponse, UnmarshallerContext _ctx) {
		
		listClusterServiceComponentResponse.setRequestId(_ctx.stringValue("ListClusterServiceComponentResponse.RequestId"));
		listClusterServiceComponentResponse.setPageNumber(_ctx.integerValue("ListClusterServiceComponentResponse.PageNumber"));
		listClusterServiceComponentResponse.setPageSize(_ctx.integerValue("ListClusterServiceComponentResponse.PageSize"));
		listClusterServiceComponentResponse.setTotal(_ctx.integerValue("ListClusterServiceComponentResponse.Total"));

		List<Component> componentList = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterServiceComponentResponse.ComponentList.Length"); i++) {
			Component component = new Component();
			component.setServiceName(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].ServiceName"));
			component.setServiceDisplayName(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].ServiceDisplayName"));
			component.setComponentName(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].ComponentName"));
			component.setComponentDisplayName(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].ComponentDisplayName"));
			component.setStatus(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].Status"));
			component.setNeedRestart(_ctx.booleanValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].NeedRestart"));
			component.setServerStatus(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].ServerStatus"));
			component.setPodName(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].PodName"));
			component.setPublicIp(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].PublicIp"));
			component.setPrivateIp(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].PrivateIp"));
			component.setRole(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].Role"));
			component.setCommissionStatus(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].CommissionStatus"));
			component.setDesiredCount(_ctx.integerValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].DesiredCount"));
			component.setNamespace(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].Namespace"));
			component.setWorkloadType(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].WorkloadType"));
			component.setWorkloadName(_ctx.stringValue("ListClusterServiceComponentResponse.ComponentList["+ i +"].WorkloadName"));

			componentList.add(component);
		}
		listClusterServiceComponentResponse.setComponentList(componentList);
	 
	 	return listClusterServiceComponentResponse;
	}
}