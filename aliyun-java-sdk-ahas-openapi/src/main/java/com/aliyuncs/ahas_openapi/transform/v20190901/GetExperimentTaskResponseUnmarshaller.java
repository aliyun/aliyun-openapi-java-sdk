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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetExperimentTaskResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.GetExperimentTaskResponse.ActivitiesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExperimentTaskResponseUnmarshaller {

	public static GetExperimentTaskResponse unmarshall(GetExperimentTaskResponse getExperimentTaskResponse, UnmarshallerContext _ctx) {
		
		getExperimentTaskResponse.setRequestId(_ctx.stringValue("GetExperimentTaskResponse.RequestId"));
		getExperimentTaskResponse.setExperimentId(_ctx.stringValue("GetExperimentTaskResponse.ExperimentId"));
		getExperimentTaskResponse.setExperimentName(_ctx.stringValue("GetExperimentTaskResponse.ExperimentName"));
		getExperimentTaskResponse.setHttpStatusCode(_ctx.integerValue("GetExperimentTaskResponse.HttpStatusCode"));
		getExperimentTaskResponse.setStartTime(_ctx.longValue("GetExperimentTaskResponse.StartTime"));
		getExperimentTaskResponse.setState(_ctx.stringValue("GetExperimentTaskResponse.State"));
		getExperimentTaskResponse.setSuccess(_ctx.booleanValue("GetExperimentTaskResponse.Success"));
		getExperimentTaskResponse.setTaskId(_ctx.stringValue("GetExperimentTaskResponse.TaskId"));
		getExperimentTaskResponse.setResult(_ctx.stringValue("GetExperimentTaskResponse.Result"));

		List<ActivitiesItem> activities = new ArrayList<ActivitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetExperimentTaskResponse.Activities.Length"); i++) {
			ActivitiesItem activitiesItem = new ActivitiesItem();
			activitiesItem.setActivityId(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].ActivityId"));
			activitiesItem.setActivityName(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].ActivityName"));
			activitiesItem.setCheckState(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].CheckState"));
			activitiesItem.setEndTime(_ctx.longValue("GetExperimentTaskResponse.Activities["+ i +"].EndTime"));
			activitiesItem.setExperimentTaskId(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].ExperimentTaskId"));
			activitiesItem.setRunResult(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].RunResult"));
			activitiesItem.setStartTime(_ctx.longValue("GetExperimentTaskResponse.Activities["+ i +"].StartTime"));
			activitiesItem.setState(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].State"));
			activitiesItem.setPhase(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].Phase"));
			activitiesItem.setTaskId(_ctx.stringValue("GetExperimentTaskResponse.Activities["+ i +"].TaskId"));

			activities.add(activitiesItem);
		}
		getExperimentTaskResponse.setActivities(activities);
	 
	 	return getExperimentTaskResponse;
	}
}