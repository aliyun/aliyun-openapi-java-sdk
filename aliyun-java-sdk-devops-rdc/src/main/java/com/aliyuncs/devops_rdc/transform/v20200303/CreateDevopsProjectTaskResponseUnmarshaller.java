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

import com.aliyuncs.devops_rdc.model.v20200303.CreateDevopsProjectTaskResponse;
import com.aliyuncs.devops_rdc.model.v20200303.CreateDevopsProjectTaskResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDevopsProjectTaskResponseUnmarshaller {

	public static CreateDevopsProjectTaskResponse unmarshall(CreateDevopsProjectTaskResponse createDevopsProjectTaskResponse, UnmarshallerContext _ctx) {
		
		createDevopsProjectTaskResponse.setRequestId(_ctx.stringValue("CreateDevopsProjectTaskResponse.RequestId"));
		createDevopsProjectTaskResponse.setSuccessful(_ctx.booleanValue("CreateDevopsProjectTaskResponse.Successful"));
		createDevopsProjectTaskResponse.setErrorCode(_ctx.stringValue("CreateDevopsProjectTaskResponse.ErrorCode"));
		createDevopsProjectTaskResponse.setErrorMsg(_ctx.stringValue("CreateDevopsProjectTaskResponse.ErrorMsg"));

		Object object = new Object();
		object.setNote(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.Note"));
		object.setTasklistId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.TasklistId"));
		object.setDueDate(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.DueDate"));
		object.setRating(_ctx.integerValue("CreateDevopsProjectTaskResponse.Object.Rating"));
		object.setSource(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.Source"));
		object.setContent(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.Content"));
		object.setTaskflowstatusId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.TaskflowstatusId"));
		object.setTaskType(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.TaskType"));
		object.setScenarioFieldConfigId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.ScenarioFieldConfigId"));
		object.setPos(_ctx.integerValue("CreateDevopsProjectTaskResponse.Object.Pos"));
		object.setAncestorIds(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.AncestorIds"));
		object.setCreatorId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.CreatorId"));
		object.setVisible(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.Visible"));
		object.setExecutorId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.ExecutorId"));
		object.setStoryPoint(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.StoryPoint"));
		object.setCreated(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.Created"));
		object.setOrganizationId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.OrganizationId"));
		object.setPriority(_ctx.integerValue("CreateDevopsProjectTaskResponse.Object.Priority"));
		object.setIsDone(_ctx.booleanValue("CreateDevopsProjectTaskResponse.Object.IsDone"));
		object.setId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.Id"));
		object.setUpdated(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.Updated"));
		object.setUniqueId(_ctx.integerValue("CreateDevopsProjectTaskResponse.Object.UniqueId"));
		object.setStartDate(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.StartDate"));
		object.setSprintId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.SprintId"));
		object.setProjectId(_ctx.stringValue("CreateDevopsProjectTaskResponse.Object.ProjectId"));
		createDevopsProjectTaskResponse.setObject(object);
	 
	 	return createDevopsProjectTaskResponse;
	}
}