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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryWorkflowActivityListResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryWorkflowActivityListResponse.ActivityInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryWorkflowActivityListResponseUnmarshaller {

	public static OpsQueryWorkflowActivityListResponse unmarshall(OpsQueryWorkflowActivityListResponse opsQueryWorkflowActivityListResponse, UnmarshallerContext _ctx) {
		
		opsQueryWorkflowActivityListResponse.setTotalCount(_ctx.integerValue("OpsQueryWorkflowActivityListResponse.TotalCount"));

		List<ActivityInstance> activityInstances = new ArrayList<ActivityInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryWorkflowActivityListResponse.ActivityInstances.Length"); i++) {
			ActivityInstance activityInstance = new ActivityInstance();
			activityInstance.setState(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].State"));
			activityInstance.setWorkerNode(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].WorkerNode"));
			activityInstance.setCreateTime(_ctx.longValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].CreateTime"));
			activityInstance.setActivityId(_ctx.longValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].ActivityId"));
			activityInstance.setBizMethod(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Method"));
			activityInstance.setOutput(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Output"));
			activityInstance.setInput(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Input"));
			activityInstance.setEndTime(_ctx.longValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].EndTime"));
			activityInstance.setStartTime(_ctx.longValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].StartTime"));
			activityInstance.setError(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Error"));
			activityInstance.setWorkflowId(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].WorkflowId"));
			activityInstance.setDuration(_ctx.longValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].Duration"));
			activityInstance.setActivityName(_ctx.stringValue("OpsQueryWorkflowActivityListResponse.ActivityInstances["+ i +"].ActivityName"));

			activityInstances.add(activityInstance);
		}
		opsQueryWorkflowActivityListResponse.setActivityInstances(activityInstances);
	 
	 	return opsQueryWorkflowActivityListResponse;
	}
}