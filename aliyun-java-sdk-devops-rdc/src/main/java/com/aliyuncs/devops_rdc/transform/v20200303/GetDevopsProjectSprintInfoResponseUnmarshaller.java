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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectSprintInfoResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectSprintInfoResponse.Object;
import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectSprintInfoResponse.Object.PlanToDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDevopsProjectSprintInfoResponseUnmarshaller {

	public static GetDevopsProjectSprintInfoResponse unmarshall(GetDevopsProjectSprintInfoResponse getDevopsProjectSprintInfoResponse, UnmarshallerContext _ctx) {
		
		getDevopsProjectSprintInfoResponse.setRequestId(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.RequestId"));
		getDevopsProjectSprintInfoResponse.setErrorMsg(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.ErrorMsg"));
		getDevopsProjectSprintInfoResponse.setSuccessful(_ctx.booleanValue("GetDevopsProjectSprintInfoResponse.Successful"));
		getDevopsProjectSprintInfoResponse.setErrorCode(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.ErrorCode"));

		Object object = new Object();
		object.setStatus(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.Status"));
		object.setAccomplished(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.Accomplished"));
		object.setProjectId(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.ProjectId"));
		object.setIsDeleted(_ctx.booleanValue("GetDevopsProjectSprintInfoResponse.Object.IsDeleted"));
		object.setStartDate(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.StartDate"));
		object.setUpdated(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.Updated"));
		object.setCreatorId(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.CreatorId"));
		object.setDueDate(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.DueDate"));
		object.setName(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.Name"));
		object.setCreated(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.Created"));
		object.setId(_ctx.stringValue("GetDevopsProjectSprintInfoResponse.Object.Id"));

		PlanToDo planToDo = new PlanToDo();
		planToDo.setTasks(_ctx.integerValue("GetDevopsProjectSprintInfoResponse.Object.PlanToDo.Tasks"));
		planToDo.setWorkTimes(_ctx.integerValue("GetDevopsProjectSprintInfoResponse.Object.PlanToDo.WorkTimes"));
		planToDo.setStoryPoints(_ctx.integerValue("GetDevopsProjectSprintInfoResponse.Object.PlanToDo.StoryPoints"));
		object.setPlanToDo(planToDo);
		getDevopsProjectSprintInfoResponse.setObject(object);
	 
	 	return getDevopsProjectSprintInfoResponse;
	}
}