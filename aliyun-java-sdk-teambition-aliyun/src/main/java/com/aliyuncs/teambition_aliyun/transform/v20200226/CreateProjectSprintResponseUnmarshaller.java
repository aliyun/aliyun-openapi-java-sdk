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

import com.aliyuncs.teambition_aliyun.model.v20200226.CreateProjectSprintResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.CreateProjectSprintResponse.Object;
import com.aliyuncs.teambition_aliyun.model.v20200226.CreateProjectSprintResponse.Object.PlanToDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectSprintResponseUnmarshaller {

	public static CreateProjectSprintResponse unmarshall(CreateProjectSprintResponse createProjectSprintResponse, UnmarshallerContext _ctx) {
		
		createProjectSprintResponse.setRequestId(_ctx.stringValue("CreateProjectSprintResponse.RequestId"));
		createProjectSprintResponse.setSuccessful(_ctx.booleanValue("CreateProjectSprintResponse.Successful"));
		createProjectSprintResponse.setErrorCode(_ctx.stringValue("CreateProjectSprintResponse.ErrorCode"));
		createProjectSprintResponse.setErrorMsg(_ctx.stringValue("CreateProjectSprintResponse.ErrorMsg"));

		Object object = new Object();
		object.setCreated(_ctx.stringValue("CreateProjectSprintResponse.Object.Created"));
		object.setDueDate(_ctx.stringValue("CreateProjectSprintResponse.Object.DueDate"));
		object.setDescription(_ctx.stringValue("CreateProjectSprintResponse.Object.Description"));
		object.setAccomplished(_ctx.stringValue("CreateProjectSprintResponse.Object.Accomplished"));
		object.setIsDeleted(_ctx.booleanValue("CreateProjectSprintResponse.Object.IsDeleted"));
		object.setExecutor(_ctx.stringValue("CreateProjectSprintResponse.Object.Executor"));
		object.setName(_ctx.stringValue("CreateProjectSprintResponse.Object.Name"));
		object.setCreatorId(_ctx.stringValue("CreateProjectSprintResponse.Object.CreatorId"));
		object.setId(_ctx.stringValue("CreateProjectSprintResponse.Object.Id"));
		object.setUpdated(_ctx.stringValue("CreateProjectSprintResponse.Object.Updated"));
		object.setStartDate(_ctx.stringValue("CreateProjectSprintResponse.Object.StartDate"));
		object.setStatus(_ctx.stringValue("CreateProjectSprintResponse.Object.Status"));
		object.setProjectId(_ctx.stringValue("CreateProjectSprintResponse.Object.ProjectId"));

		PlanToDo planToDo = new PlanToDo();
		planToDo.setStoryPoints(_ctx.integerValue("CreateProjectSprintResponse.Object.PlanToDo.StoryPoints"));
		planToDo.setWorkTimes(_ctx.integerValue("CreateProjectSprintResponse.Object.PlanToDo.WorkTimes"));
		planToDo.setTasks(_ctx.integerValue("CreateProjectSprintResponse.Object.PlanToDo.Tasks"));
		object.setPlanToDo(planToDo);
		createProjectSprintResponse.setObject(object);
	 
	 	return createProjectSprintResponse;
	}
}