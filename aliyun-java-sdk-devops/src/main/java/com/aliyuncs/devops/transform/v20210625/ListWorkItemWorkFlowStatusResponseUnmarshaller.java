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

import com.aliyuncs.devops.model.v20210625.ListWorkItemWorkFlowStatusResponse;
import com.aliyuncs.devops.model.v20210625.ListWorkItemWorkFlowStatusResponse.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkItemWorkFlowStatusResponseUnmarshaller {

	public static ListWorkItemWorkFlowStatusResponse unmarshall(ListWorkItemWorkFlowStatusResponse listWorkItemWorkFlowStatusResponse, UnmarshallerContext _ctx) {
		
		listWorkItemWorkFlowStatusResponse.setRequestId(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.requestId"));
		listWorkItemWorkFlowStatusResponse.setErrorCode(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.errorCode"));
		listWorkItemWorkFlowStatusResponse.setErrorMessage(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.errorMessage"));
		listWorkItemWorkFlowStatusResponse.setSuccess(_ctx.booleanValue("ListWorkItemWorkFlowStatusResponse.success"));

		List<Status> statuses = new ArrayList<Status>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkItemWorkFlowStatusResponse.statuses.Length"); i++) {
			Status status = new Status();
			status.setIdentifier(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].identifier"));
			status.setName(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].name"));
			status.setWorkflowStageName(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].workflowStageName"));
			status.setWorkflowStageIdentifier(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].workflowStageIdentifier"));
			status.setSource(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].source"));
			status.setGmtCreate(_ctx.longValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].gmtCreate"));
			status.setCreator(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].creator"));
			status.setDescription(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].description"));
			status.setModifier(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].modifier"));
			status.setGmtModified(_ctx.longValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].gmtModified"));
			status.setResourceType(_ctx.stringValue("ListWorkItemWorkFlowStatusResponse.statuses["+ i +"].resourceType"));

			statuses.add(status);
		}
		listWorkItemWorkFlowStatusResponse.setStatuses(statuses);
	 
	 	return listWorkItemWorkFlowStatusResponse;
	}
}