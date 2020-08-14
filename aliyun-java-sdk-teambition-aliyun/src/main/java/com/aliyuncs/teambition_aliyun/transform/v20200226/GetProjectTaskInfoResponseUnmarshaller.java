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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectTaskInfoResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.GetProjectTaskInfoResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectTaskInfoResponseUnmarshaller {

	public static GetProjectTaskInfoResponse unmarshall(GetProjectTaskInfoResponse getProjectTaskInfoResponse, UnmarshallerContext _ctx) {
		
		getProjectTaskInfoResponse.setRequestId(_ctx.stringValue("GetProjectTaskInfoResponse.RequestId"));
		getProjectTaskInfoResponse.setSuccessful(_ctx.booleanValue("GetProjectTaskInfoResponse.Successful"));
		getProjectTaskInfoResponse.setErrorCode(_ctx.stringValue("GetProjectTaskInfoResponse.ErrorCode"));
		getProjectTaskInfoResponse.setErrorMsg(_ctx.stringValue("GetProjectTaskInfoResponse.ErrorMsg"));

		Object object = new Object();
		object.setTasklistId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.TasklistId"));
		object.setTaskflowstatusId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.TaskflowstatusId"));
		object.setTaskType(_ctx.stringValue("GetProjectTaskInfoResponse.Object.TaskType"));
		object.setIsDeleted(_ctx.booleanValue("GetProjectTaskInfoResponse.Object.IsDeleted"));
		object.setCreatorId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.CreatorId"));
		object.setIsTopInProject(_ctx.booleanValue("GetProjectTaskInfoResponse.Object.IsTopInProject"));
		object.setExecutorId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.ExecutorId"));
		object.setStoryPoint(_ctx.stringValue("GetProjectTaskInfoResponse.Object.StoryPoint"));
		object.setCreated(_ctx.stringValue("GetProjectTaskInfoResponse.Object.Created"));
		object.setOrganizationId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.OrganizationId"));
		object.setIsDone(_ctx.booleanValue("GetProjectTaskInfoResponse.Object.IsDone"));
		object.setId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.Id"));
		object.setUpdated(_ctx.stringValue("GetProjectTaskInfoResponse.Object.Updated"));
		object.setSprintId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.SprintId"));
		object.setProjectId(_ctx.stringValue("GetProjectTaskInfoResponse.Object.ProjectId"));
		object.setContent(_ctx.stringValue("GetProjectTaskInfoResponse.Object.Content"));
		object.setNote(_ctx.stringValue("GetProjectTaskInfoResponse.Object.Note"));
		object.setDueDate(_ctx.stringValue("GetProjectTaskInfoResponse.Object.DueDate"));
		object.setStartDate(_ctx.stringValue("GetProjectTaskInfoResponse.Object.StartDate"));
		object.setVisible(_ctx.stringValue("GetProjectTaskInfoResponse.Object.Visible"));
		object.setPriority(_ctx.stringValue("GetProjectTaskInfoResponse.Object.Priority"));

		List<String> involveMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectTaskInfoResponse.Object.InvolveMembers.Length"); i++) {
			involveMembers.add(_ctx.stringValue("GetProjectTaskInfoResponse.Object.InvolveMembers["+ i +"]"));
		}
		object.setInvolveMembers(involveMembers);
		getProjectTaskInfoResponse.setObject(object);
	 
	 	return getProjectTaskInfoResponse;
	}
}