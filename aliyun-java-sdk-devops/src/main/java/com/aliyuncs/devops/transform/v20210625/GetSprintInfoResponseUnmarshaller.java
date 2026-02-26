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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetSprintInfoResponse;
import com.aliyuncs.devops.model.v20210625.GetSprintInfoResponse.Sprint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSprintInfoResponseUnmarshaller {

	public static GetSprintInfoResponse unmarshall(GetSprintInfoResponse getSprintInfoResponse, UnmarshallerContext _ctx) {
		
		getSprintInfoResponse.setRequestId(_ctx.stringValue("GetSprintInfoResponse.requestId"));
		getSprintInfoResponse.setErrorCode(_ctx.stringValue("GetSprintInfoResponse.errorCode"));
		getSprintInfoResponse.setErrorMessage(_ctx.stringValue("GetSprintInfoResponse.errorMessage"));
		getSprintInfoResponse.setSuccess(_ctx.booleanValue("GetSprintInfoResponse.success"));

		Sprint sprint = new Sprint();
		sprint.setCreator(_ctx.stringValue("GetSprintInfoResponse.sprint.creator"));
		sprint.setDescription(_ctx.stringValue("GetSprintInfoResponse.sprint.description"));
		sprint.setGmtCreate(_ctx.longValue("GetSprintInfoResponse.sprint.gmtCreate"));
		sprint.setGmtModified(_ctx.longValue("GetSprintInfoResponse.sprint.gmtModified"));
		sprint.setEndDate(_ctx.longValue("GetSprintInfoResponse.sprint.endDate"));
		sprint.setStartDate(_ctx.longValue("GetSprintInfoResponse.sprint.startDate"));
		sprint.setIdentifier(_ctx.stringValue("GetSprintInfoResponse.sprint.identifier"));
		sprint.setModifier(_ctx.stringValue("GetSprintInfoResponse.sprint.modifier"));
		sprint.setName(_ctx.stringValue("GetSprintInfoResponse.sprint.name"));
		sprint.setSpaceIdentifier(_ctx.stringValue("GetSprintInfoResponse.sprint.spaceIdentifier"));
		sprint.setScope(_ctx.stringValue("GetSprintInfoResponse.sprint.scope"));
		sprint.setStatus(_ctx.stringValue("GetSprintInfoResponse.sprint.status"));

		List<String> owners = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSprintInfoResponse.sprint.owners.Length"); i++) {
			owners.add(_ctx.stringValue("GetSprintInfoResponse.sprint.owners["+ i +"]"));
		}
		sprint.setOwners(owners);
		getSprintInfoResponse.setSprint(sprint);
	 
	 	return getSprintInfoResponse;
	}
}