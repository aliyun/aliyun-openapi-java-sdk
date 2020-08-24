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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectTaskInfoResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetDevopsProjectTaskInfoResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDevopsProjectTaskInfoResponseUnmarshaller {

	public static GetDevopsProjectTaskInfoResponse unmarshall(GetDevopsProjectTaskInfoResponse getDevopsProjectTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getDevopsProjectTaskInfoResponse.setRequestId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.RequestId"));
		getDevopsProjectTaskInfoResponse.setSuccessful(_ctx.booleanValue("GetDevopsProjectTaskInfoResponse.Successful"));
		getDevopsProjectTaskInfoResponse.setErrorCode(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.ErrorCode"));
		getDevopsProjectTaskInfoResponse.setErrorMsg(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.ErrorMsg"));

		Object object = new Object();
		object.setTasklistId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.TasklistId"));
		object.setTaskflowstatusId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.TaskflowstatusId"));
		object.setTaskType(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.TaskType"));
		object.setIsDeleted(_ctx.booleanValue("GetDevopsProjectTaskInfoResponse.Object.IsDeleted"));
		object.setCreatorId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.CreatorId"));
		object.setIsTopInProject(_ctx.booleanValue("GetDevopsProjectTaskInfoResponse.Object.IsTopInProject"));
		object.setExecutorId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.ExecutorId"));
		object.setStoryPoint(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.StoryPoint"));
		object.setCreated(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.Created"));
		object.setOrganizationId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.OrganizationId"));
		object.setIsDone(_ctx.booleanValue("GetDevopsProjectTaskInfoResponse.Object.IsDone"));
		object.setId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.Id"));
		object.setUpdated(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.Updated"));
		object.setSprintId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.SprintId"));
		object.setProjectId(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.ProjectId"));
		object.setContent(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.Content"));
		object.setNote(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.Note"));
		object.setDueDate(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.DueDate"));
		object.setStartDate(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.StartDate"));
		object.setVisible(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.Visible"));
		object.setPriority(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.Priority"));

		List<String> involveMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDevopsProjectTaskInfoResponse.Object.InvolveMembers.Length"); i++) {
			involveMembers.add(_ctx.stringValue("GetDevopsProjectTaskInfoResponse.Object.InvolveMembers["+ i +"]"));
		}
		object.setInvolveMembers(involveMembers);
		getDevopsProjectTaskInfoResponse.setObject(object);
	 
	 	return getDevopsProjectTaskInfoResponse;
	}
}