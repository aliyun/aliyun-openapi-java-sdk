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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectSprintInfoResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectSprintInfoResponse.Object;
import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectSprintInfoResponse.Object.PlanToDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectSprintInfoResponseUnmarshaller {

	public static GetProjectSprintInfoResponse unmarshall(GetProjectSprintInfoResponse getProjectSprintInfoResponse, UnmarshallerContext _ctx) {
		
		getProjectSprintInfoResponse.setRequestId(_ctx.stringValue("GetProjectSprintInfoResponse.RequestId"));
		getProjectSprintInfoResponse.setSuccessful(_ctx.booleanValue("GetProjectSprintInfoResponse.Successful"));
		getProjectSprintInfoResponse.setErrorCode(_ctx.stringValue("GetProjectSprintInfoResponse.ErrorCode"));
		getProjectSprintInfoResponse.setErrorMsg(_ctx.stringValue("GetProjectSprintInfoResponse.ErrorMsg"));

		Object object = new Object();
		object.setAccomplished(_ctx.stringValue("GetProjectSprintInfoResponse.Object.Accomplished"));
		object.setIsDeleted(_ctx.booleanValue("GetProjectSprintInfoResponse.Object.IsDeleted"));
		object.setCreated(_ctx.stringValue("GetProjectSprintInfoResponse.Object.Created"));
		object.setDueDate(_ctx.stringValue("GetProjectSprintInfoResponse.Object.DueDate"));
		object.setName(_ctx.stringValue("GetProjectSprintInfoResponse.Object.Name"));
		object.setCreatorId(_ctx.stringValue("GetProjectSprintInfoResponse.Object.CreatorId"));
		object.setId(_ctx.stringValue("GetProjectSprintInfoResponse.Object.Id"));
		object.setUpdated(_ctx.stringValue("GetProjectSprintInfoResponse.Object.Updated"));
		object.setStartDate(_ctx.stringValue("GetProjectSprintInfoResponse.Object.StartDate"));
		object.setStatus(_ctx.stringValue("GetProjectSprintInfoResponse.Object.Status"));
		object.setProjectId(_ctx.stringValue("GetProjectSprintInfoResponse.Object.ProjectId"));

		PlanToDo planToDo = new PlanToDo();
		planToDo.setStoryPoints(_ctx.integerValue("GetProjectSprintInfoResponse.Object.PlanToDo.StoryPoints"));
		planToDo.setWorkTimes(_ctx.integerValue("GetProjectSprintInfoResponse.Object.PlanToDo.WorkTimes"));
		planToDo.setTasks(_ctx.integerValue("GetProjectSprintInfoResponse.Object.PlanToDo.Tasks"));
		object.setPlanToDo(planToDo);
		getProjectSprintInfoResponse.setObject(object);
	 
	 	return getProjectSprintInfoResponse;
	}
}