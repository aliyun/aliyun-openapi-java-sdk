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

import com.aliyuncs.devops.model.v20210625.ListSprintsResponse;
import com.aliyuncs.devops.model.v20210625.ListSprintsResponse.Sprint;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSprintsResponseUnmarshaller {

	public static ListSprintsResponse unmarshall(ListSprintsResponse listSprintsResponse, UnmarshallerContext _ctx) {
		
		listSprintsResponse.setTotalCount(_ctx.longValue("ListSprintsResponse.totalCount"));
		listSprintsResponse.setNextToken(_ctx.stringValue("ListSprintsResponse.nextToken"));
		listSprintsResponse.setMaxResults(_ctx.longValue("ListSprintsResponse.maxResults"));
		listSprintsResponse.setRequestId(_ctx.stringValue("ListSprintsResponse.requestId"));
		listSprintsResponse.setErrorMsg(_ctx.stringValue("ListSprintsResponse.errorMsg"));
		listSprintsResponse.setErrorCode(_ctx.stringValue("ListSprintsResponse.errorCode"));
		listSprintsResponse.setSuccess(_ctx.booleanValue("ListSprintsResponse.success"));

		List<Sprint> sprints = new ArrayList<Sprint>();
		for (int i = 0; i < _ctx.lengthValue("ListSprintsResponse.sprints.Length"); i++) {
			Sprint sprint = new Sprint();
			sprint.setCreator(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].creator"));
			sprint.setDescription(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].description"));
			sprint.setGmtCreate(_ctx.longValue("ListSprintsResponse.sprints["+ i +"].gmtCreate"));
			sprint.setGmtModified(_ctx.longValue("ListSprintsResponse.sprints["+ i +"].gmtModified"));
			sprint.setEndDate(_ctx.longValue("ListSprintsResponse.sprints["+ i +"].endDate"));
			sprint.setStartDate(_ctx.longValue("ListSprintsResponse.sprints["+ i +"].startDate"));
			sprint.setIdentifier(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].identifier"));
			sprint.setModifier(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].modifier"));
			sprint.setName(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].name"));
			sprint.setSpaceIdentifier(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].spaceIdentifier"));
			sprint.setScope(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].scope"));
			sprint.setStatus(_ctx.stringValue("ListSprintsResponse.sprints["+ i +"].status"));

			sprints.add(sprint);
		}
		listSprintsResponse.setSprints(sprints);
	 
	 	return listSprintsResponse;
	}
}