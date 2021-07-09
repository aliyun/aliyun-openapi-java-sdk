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

import com.aliyuncs.devops_rdc.model.v20200303.CreateDevopsProjectSprintResponse;
import com.aliyuncs.devops_rdc.model.v20200303.CreateDevopsProjectSprintResponse.Object;
import com.aliyuncs.devops_rdc.model.v20200303.CreateDevopsProjectSprintResponse.Object.PlanToDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDevopsProjectSprintResponseUnmarshaller {

	public static CreateDevopsProjectSprintResponse unmarshall(CreateDevopsProjectSprintResponse createDevopsProjectSprintResponse, UnmarshallerContext _ctx) {
		
		createDevopsProjectSprintResponse.setRequestId(_ctx.stringValue("CreateDevopsProjectSprintResponse.RequestId"));
		createDevopsProjectSprintResponse.setErrorMsg(_ctx.stringValue("CreateDevopsProjectSprintResponse.ErrorMsg"));
		createDevopsProjectSprintResponse.setSuccessful(_ctx.booleanValue("CreateDevopsProjectSprintResponse.Successful"));
		createDevopsProjectSprintResponse.setErrorCode(_ctx.stringValue("CreateDevopsProjectSprintResponse.ErrorCode"));

		Object object = new Object();
		object.setStatus(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Status"));
		object.setProjectId(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.ProjectId"));
		object.setStartDate(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.StartDate"));
		object.setCreatorId(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.CreatorId"));
		object.setExecutor(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Executor"));
		object.setDescription(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Description"));
		object.setAccomplished(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Accomplished"));
		object.setIsDeleted(_ctx.booleanValue("CreateDevopsProjectSprintResponse.Object.IsDeleted"));
		object.setUpdated(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Updated"));
		object.setDueDate(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.DueDate"));
		object.setCreated(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Created"));
		object.setName(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Name"));
		object.setId(_ctx.stringValue("CreateDevopsProjectSprintResponse.Object.Id"));

		PlanToDo planToDo = new PlanToDo();
		planToDo.setTasks(_ctx.integerValue("CreateDevopsProjectSprintResponse.Object.PlanToDo.Tasks"));
		planToDo.setWorkTimes(_ctx.integerValue("CreateDevopsProjectSprintResponse.Object.PlanToDo.WorkTimes"));
		planToDo.setStoryPoints(_ctx.integerValue("CreateDevopsProjectSprintResponse.Object.PlanToDo.StoryPoints"));
		object.setPlanToDo(planToDo);
		createDevopsProjectSprintResponse.setObject(object);
	 
	 	return createDevopsProjectSprintResponse;
	}
}