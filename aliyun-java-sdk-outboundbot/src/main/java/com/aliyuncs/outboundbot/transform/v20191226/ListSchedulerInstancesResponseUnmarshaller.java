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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListSchedulerInstancesResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListSchedulerInstancesResponse.SchedulerInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSchedulerInstancesResponseUnmarshaller {

	public static ListSchedulerInstancesResponse unmarshall(ListSchedulerInstancesResponse listSchedulerInstancesResponse, UnmarshallerContext _ctx) {
		
		listSchedulerInstancesResponse.setRequestId(_ctx.stringValue("ListSchedulerInstancesResponse.RequestId"));
		listSchedulerInstancesResponse.setSuccess(_ctx.booleanValue("ListSchedulerInstancesResponse.Success"));
		listSchedulerInstancesResponse.setCode(_ctx.stringValue("ListSchedulerInstancesResponse.Code"));
		listSchedulerInstancesResponse.setMessage(_ctx.stringValue("ListSchedulerInstancesResponse.Message"));
		listSchedulerInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListSchedulerInstancesResponse.HttpStatusCode"));

		List<SchedulerInstance> schedulerInstances = new ArrayList<SchedulerInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListSchedulerInstancesResponse.SchedulerInstances.Length"); i++) {
			SchedulerInstance schedulerInstance = new SchedulerInstance();
			schedulerInstance.setOwnerId(_ctx.stringValue("ListSchedulerInstancesResponse.SchedulerInstances["+ i +"].OwnerId"));
			schedulerInstance.setInstanceId(_ctx.stringValue("ListSchedulerInstancesResponse.SchedulerInstances["+ i +"].InstanceId"));
			schedulerInstance.setBusiness(_ctx.stringValue("ListSchedulerInstancesResponse.SchedulerInstances["+ i +"].Business"));
			schedulerInstance.setMaxConcurrency(_ctx.integerValue("ListSchedulerInstancesResponse.SchedulerInstances["+ i +"].MaxConcurrency"));

			schedulerInstances.add(schedulerInstance);
		}
		listSchedulerInstancesResponse.setSchedulerInstances(schedulerInstances);
	 
	 	return listSchedulerInstancesResponse;
	}
}