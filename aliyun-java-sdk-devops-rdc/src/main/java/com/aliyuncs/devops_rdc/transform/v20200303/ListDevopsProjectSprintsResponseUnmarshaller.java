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

import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectSprintsResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectSprintsResponse.Sprint;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectSprintsResponse.Sprint.PlanToDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevopsProjectSprintsResponseUnmarshaller {

	public static ListDevopsProjectSprintsResponse unmarshall(ListDevopsProjectSprintsResponse listDevopsProjectSprintsResponse, UnmarshallerContext _ctx) {
		
		listDevopsProjectSprintsResponse.setRequestId(_ctx.stringValue("ListDevopsProjectSprintsResponse.RequestId"));
		listDevopsProjectSprintsResponse.setSuccessful(_ctx.booleanValue("ListDevopsProjectSprintsResponse.Successful"));
		listDevopsProjectSprintsResponse.setErrorCode(_ctx.stringValue("ListDevopsProjectSprintsResponse.ErrorCode"));
		listDevopsProjectSprintsResponse.setErrorMsg(_ctx.stringValue("ListDevopsProjectSprintsResponse.ErrorMsg"));

		List<Sprint> object = new ArrayList<Sprint>();
		for (int i = 0; i < _ctx.lengthValue("ListDevopsProjectSprintsResponse.Object.Length"); i++) {
			Sprint sprint = new Sprint();
			sprint.setAccomplished(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].Accomplished"));
			sprint.setIsDeleted(_ctx.booleanValue("ListDevopsProjectSprintsResponse.Object["+ i +"].IsDeleted"));
			sprint.setCreated(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].Created"));
			sprint.setDueDate(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].DueDate"));
			sprint.setName(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].Name"));
			sprint.setCreatorId(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].CreatorId"));
			sprint.setId(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].Id"));
			sprint.setUpdated(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].Updated"));
			sprint.setStartDate(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].StartDate"));
			sprint.setStatus(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].Status"));
			sprint.setProjectId(_ctx.stringValue("ListDevopsProjectSprintsResponse.Object["+ i +"].ProjectId"));

			PlanToDo planToDo = new PlanToDo();
			planToDo.setStoryPoints(_ctx.integerValue("ListDevopsProjectSprintsResponse.Object["+ i +"].PlanToDo.StoryPoints"));
			planToDo.setWorkTimes(_ctx.integerValue("ListDevopsProjectSprintsResponse.Object["+ i +"].PlanToDo.WorkTimes"));
			planToDo.setTasks(_ctx.integerValue("ListDevopsProjectSprintsResponse.Object["+ i +"].PlanToDo.Tasks"));
			sprint.setPlanToDo(planToDo);

			object.add(sprint);
		}
		listDevopsProjectSprintsResponse.setObject(object);
	 
	 	return listDevopsProjectSprintsResponse;
	}
}