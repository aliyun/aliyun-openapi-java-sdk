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

import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectSprintsResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectSprintsResponse.Sprint;
import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectSprintsResponse.Sprint.PlanToDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectSprintsResponseUnmarshaller {

	public static ListProjectSprintsResponse unmarshall(ListProjectSprintsResponse listProjectSprintsResponse, UnmarshallerContext _ctx) {
		
		listProjectSprintsResponse.setRequestId(_ctx.stringValue("ListProjectSprintsResponse.RequestId"));
		listProjectSprintsResponse.setSuccessful(_ctx.booleanValue("ListProjectSprintsResponse.Successful"));
		listProjectSprintsResponse.setErrorCode(_ctx.stringValue("ListProjectSprintsResponse.ErrorCode"));
		listProjectSprintsResponse.setErrorMsg(_ctx.stringValue("ListProjectSprintsResponse.ErrorMsg"));

		List<Sprint> object = new ArrayList<Sprint>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectSprintsResponse.Object.Length"); i++) {
			Sprint sprint = new Sprint();
			sprint.setAccomplished(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].Accomplished"));
			sprint.setIsDeleted(_ctx.booleanValue("ListProjectSprintsResponse.Object["+ i +"].IsDeleted"));
			sprint.setCreated(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].Created"));
			sprint.setDueDate(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].DueDate"));
			sprint.setName(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].Name"));
			sprint.setCreatorId(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].CreatorId"));
			sprint.setId(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].Id"));
			sprint.setUpdated(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].Updated"));
			sprint.setStartDate(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].StartDate"));
			sprint.setStatus(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].Status"));
			sprint.setProjectId(_ctx.stringValue("ListProjectSprintsResponse.Object["+ i +"].ProjectId"));

			PlanToDo planToDo = new PlanToDo();
			planToDo.setStoryPoints(_ctx.integerValue("ListProjectSprintsResponse.Object["+ i +"].PlanToDo.StoryPoints"));
			planToDo.setWorkTimes(_ctx.integerValue("ListProjectSprintsResponse.Object["+ i +"].PlanToDo.WorkTimes"));
			planToDo.setTasks(_ctx.integerValue("ListProjectSprintsResponse.Object["+ i +"].PlanToDo.Tasks"));
			sprint.setPlanToDo(planToDo);

			object.add(sprint);
		}
		listProjectSprintsResponse.setObject(object);
	 
	 	return listProjectSprintsResponse;
	}
}