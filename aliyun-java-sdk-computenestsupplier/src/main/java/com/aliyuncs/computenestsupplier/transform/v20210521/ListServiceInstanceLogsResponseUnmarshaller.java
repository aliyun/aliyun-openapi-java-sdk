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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstanceLogsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceInstanceLogsResponse.ServiceInstanceLogs;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceInstanceLogsResponseUnmarshaller {

	public static ListServiceInstanceLogsResponse unmarshall(ListServiceInstanceLogsResponse listServiceInstanceLogsResponse, UnmarshallerContext _ctx) {
		
		listServiceInstanceLogsResponse.setRequestId(_ctx.stringValue("ListServiceInstanceLogsResponse.RequestId"));
		listServiceInstanceLogsResponse.setNextToken(_ctx.stringValue("ListServiceInstanceLogsResponse.NextToken"));
		listServiceInstanceLogsResponse.setMaxResults(_ctx.stringValue("ListServiceInstanceLogsResponse.MaxResults"));

		List<ServiceInstanceLogs> serviceInstancesLogs = new ArrayList<ServiceInstanceLogs>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs.Length"); i++) {
			ServiceInstanceLogs serviceInstanceLogs = new ServiceInstanceLogs();
			serviceInstanceLogs.setTimestamp(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].Timestamp"));
			serviceInstanceLogs.setServiceInstanceId(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].ServiceInstanceId"));
			serviceInstanceLogs.setSource(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].Source"));
			serviceInstanceLogs.setContent(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].Content"));
			serviceInstanceLogs.setLogType(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].LogType"));
			serviceInstanceLogs.setResourceType(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].ResourceType"));
			serviceInstanceLogs.setResourceId(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].ResourceId"));
			serviceInstanceLogs.setStatus(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].Status"));

			serviceInstancesLogs.add(serviceInstanceLogs);
		}
		listServiceInstanceLogsResponse.setServiceInstancesLogs(serviceInstancesLogs);
	 
	 	return listServiceInstanceLogsResponse;
	}
}