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

import com.aliyuncs.teambition_aliyun.model.v20200226.CreateProjectTaskResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.CreateProjectTaskResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProjectTaskResponseUnmarshaller {

	public static CreateProjectTaskResponse unmarshall(CreateProjectTaskResponse createProjectTaskResponse, UnmarshallerContext _ctx) {
		
		createProjectTaskResponse.setRequestId(_ctx.stringValue("CreateProjectTaskResponse.RequestId"));
		createProjectTaskResponse.setSuccessful(_ctx.booleanValue("CreateProjectTaskResponse.Successful"));
		createProjectTaskResponse.setErrorCode(_ctx.stringValue("CreateProjectTaskResponse.ErrorCode"));
		createProjectTaskResponse.setErrorMsg(_ctx.stringValue("CreateProjectTaskResponse.ErrorMsg"));

		Object object = new Object();
		object.setNote(_ctx.stringValue("CreateProjectTaskResponse.Object.Note"));
		object.setTasklistId(_ctx.stringValue("CreateProjectTaskResponse.Object.TasklistId"));
		object.setDueDate(_ctx.stringValue("CreateProjectTaskResponse.Object.DueDate"));
		object.setRating(_ctx.integerValue("CreateProjectTaskResponse.Object.Rating"));
		object.setSource(_ctx.stringValue("CreateProjectTaskResponse.Object.Source"));
		object.setContent(_ctx.stringValue("CreateProjectTaskResponse.Object.Content"));
		object.setTaskflowstatusId(_ctx.stringValue("CreateProjectTaskResponse.Object.TaskflowstatusId"));
		object.setTaskType(_ctx.stringValue("CreateProjectTaskResponse.Object.TaskType"));
		object.setScenarioFieldConfigId(_ctx.stringValue("CreateProjectTaskResponse.Object.ScenarioFieldConfigId"));
		object.setPos(_ctx.integerValue("CreateProjectTaskResponse.Object.Pos"));
		object.setAncestorIds(_ctx.stringValue("CreateProjectTaskResponse.Object.AncestorIds"));
		object.setCreatorId(_ctx.stringValue("CreateProjectTaskResponse.Object.CreatorId"));
		object.setVisible(_ctx.stringValue("CreateProjectTaskResponse.Object.Visible"));
		object.setExecutorId(_ctx.stringValue("CreateProjectTaskResponse.Object.ExecutorId"));
		object.setStoryPoint(_ctx.stringValue("CreateProjectTaskResponse.Object.StoryPoint"));
		object.setCreated(_ctx.stringValue("CreateProjectTaskResponse.Object.Created"));
		object.setOrganizationId(_ctx.stringValue("CreateProjectTaskResponse.Object.OrganizationId"));
		object.setPriority(_ctx.integerValue("CreateProjectTaskResponse.Object.Priority"));
		object.setIsDone(_ctx.booleanValue("CreateProjectTaskResponse.Object.IsDone"));
		object.setId(_ctx.stringValue("CreateProjectTaskResponse.Object.Id"));
		object.setUpdated(_ctx.stringValue("CreateProjectTaskResponse.Object.Updated"));
		object.setUniqueId(_ctx.integerValue("CreateProjectTaskResponse.Object.UniqueId"));
		object.setStartDate(_ctx.stringValue("CreateProjectTaskResponse.Object.StartDate"));
		object.setSprintId(_ctx.stringValue("CreateProjectTaskResponse.Object.SprintId"));
		object.setProjectId(_ctx.stringValue("CreateProjectTaskResponse.Object.ProjectId"));
		createProjectTaskResponse.setObject(object);
	 
	 	return createProjectTaskResponse;
	}
}