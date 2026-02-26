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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.CreateSprintResponse;
import com.aliyuncs.devops.model.v20210625.CreateSprintResponse.Sprint;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSprintResponseUnmarshaller {

	public static CreateSprintResponse unmarshall(CreateSprintResponse createSprintResponse, UnmarshallerContext _ctx) {
		
		createSprintResponse.setRequestId(_ctx.stringValue("CreateSprintResponse.requestId"));
		createSprintResponse.setErrorMsg(_ctx.stringValue("CreateSprintResponse.errorMsg"));
		createSprintResponse.setErrorCode(_ctx.stringValue("CreateSprintResponse.errorCode"));
		createSprintResponse.setSuccess(_ctx.booleanValue("CreateSprintResponse.success"));

		Sprint sprint = new Sprint();
		sprint.setCreator(_ctx.stringValue("CreateSprintResponse.sprint.creator"));
		sprint.setDescription(_ctx.stringValue("CreateSprintResponse.sprint.description"));
		sprint.setGmtCreate(_ctx.longValue("CreateSprintResponse.sprint.gmtCreate"));
		sprint.setGmtModified(_ctx.longValue("CreateSprintResponse.sprint.gmtModified"));
		sprint.setEndDate(_ctx.longValue("CreateSprintResponse.sprint.endDate"));
		sprint.setStartDate(_ctx.longValue("CreateSprintResponse.sprint.startDate"));
		sprint.setIdentifier(_ctx.stringValue("CreateSprintResponse.sprint.identifier"));
		sprint.setModifier(_ctx.stringValue("CreateSprintResponse.sprint.modifier"));
		sprint.setName(_ctx.stringValue("CreateSprintResponse.sprint.name"));
		sprint.setSpaceIdentifier(_ctx.stringValue("CreateSprintResponse.sprint.spaceIdentifier"));
		sprint.setScope(_ctx.stringValue("CreateSprintResponse.sprint.scope"));
		sprint.setStatus(_ctx.stringValue("CreateSprintResponse.sprint.status"));
		createSprintResponse.setSprint(sprint);
	 
	 	return createSprintResponse;
	}
}