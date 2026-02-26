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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListServiceInstancesResponse;
import com.aliyuncs.eas.model.v20210701.ListServiceInstancesResponse.InstancesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceInstancesResponseUnmarshaller {

	public static ListServiceInstancesResponse unmarshall(ListServiceInstancesResponse listServiceInstancesResponse, UnmarshallerContext _ctx) {
		
		listServiceInstancesResponse.setRequestId(_ctx.stringValue("ListServiceInstancesResponse.RequestId"));
		listServiceInstancesResponse.setPageNumber(_ctx.integerValue("ListServiceInstancesResponse.PageNumber"));
		listServiceInstancesResponse.setPageSize(_ctx.integerValue("ListServiceInstancesResponse.PageSize"));
		listServiceInstancesResponse.setTotalCount(_ctx.integerValue("ListServiceInstancesResponse.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setHostIP(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].HostIP"));
			instancesItem.setHostName(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].HostName"));
			instancesItem.setInnerIP(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].InnerIP"));
			instancesItem.setInstanceName(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].InstanceName"));
			instancesItem.setInstancePort(_ctx.integerValue("ListServiceInstancesResponse.Instances["+ i +"].InstancePort"));
			instancesItem.setNamespace(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].Namespace"));
			instancesItem.setReason(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].Reason"));
			instancesItem.setRestartCount(_ctx.integerValue("ListServiceInstancesResponse.Instances["+ i +"].RestartCount"));
			instancesItem.setStatus(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].Status"));
			instancesItem.setTotalProcesses(_ctx.integerValue("ListServiceInstancesResponse.Instances["+ i +"].TotalProcesses"));
			instancesItem.setReadyProcesses(_ctx.integerValue("ListServiceInstancesResponse.Instances["+ i +"].ReadyProcesses"));
			instancesItem.setStartAt(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].StartAt"));
			instancesItem.setRole(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].Role"));
			instancesItem.setResourceType(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].ResourceType"));
			instancesItem.setTenantInstanceIP(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].TenantInstanceIP"));
			instancesItem.setTenantHostIP(_ctx.stringValue("ListServiceInstancesResponse.Instances["+ i +"].TenantHostIP"));
			instancesItem.setIsSpot(_ctx.booleanValue("ListServiceInstancesResponse.Instances["+ i +"].IsSpot"));
			instancesItem.setCurrentAmount(_ctx.floatValue("ListServiceInstancesResponse.Instances["+ i +"].CurrentAmount"));
			instancesItem.setOriginalAmount(_ctx.floatValue("ListServiceInstancesResponse.Instances["+ i +"].OriginalAmount"));

			List<Map<Object, Object>> lastState = _ctx.listMapValue("ListServiceInstancesResponse.Instances["+ i +"].LastState");
			instancesItem.setLastState(lastState);

			instances.add(instancesItem);
		}
		listServiceInstancesResponse.setInstances(instances);
	 
	 	return listServiceInstancesResponse;
	}
}