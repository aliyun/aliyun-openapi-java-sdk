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

package com.aliyuncs.computenest.transform.v20210601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenest.model.v20210601.ListServiceInstanceLogsResponse;
import com.aliyuncs.computenest.model.v20210601.ListServiceInstanceLogsResponse.ServiceInstanceLogs;
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
			serviceInstanceLogs.setPhase(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].Phase"));
			serviceInstanceLogs.setContent(_ctx.stringValue("ListServiceInstanceLogsResponse.ServiceInstancesLogs["+ i +"].Content"));

			serviceInstancesLogs.add(serviceInstanceLogs);
		}
		listServiceInstanceLogsResponse.setServiceInstancesLogs(serviceInstancesLogs);
	 
	 	return listServiceInstanceLogsResponse;
	}
}