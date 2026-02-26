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

import com.aliyuncs.devops.model.v20210625.GetWorkItemWorkFlowInfoResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkItemWorkFlowInfoResponse.Workflow;
import com.aliyuncs.devops.model.v20210625.GetWorkItemWorkFlowInfoResponse.Workflow.Statuse;
import com.aliyuncs.devops.model.v20210625.GetWorkItemWorkFlowInfoResponse.Workflow.WorkflowAction;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkItemWorkFlowInfoResponseUnmarshaller {

	public static GetWorkItemWorkFlowInfoResponse unmarshall(GetWorkItemWorkFlowInfoResponse getWorkItemWorkFlowInfoResponse, UnmarshallerContext _ctx) {
		
		getWorkItemWorkFlowInfoResponse.setRequestId(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.requestId"));
		getWorkItemWorkFlowInfoResponse.setErrorCode(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.errorCode"));
		getWorkItemWorkFlowInfoResponse.setErrorMessage(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.errorMessage"));
		getWorkItemWorkFlowInfoResponse.setSuccess(_ctx.booleanValue("GetWorkItemWorkFlowInfoResponse.success"));

		Workflow workflow = new Workflow();
		workflow.setIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.identifier"));
		workflow.setName(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.name"));
		workflow.setDescription(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.description"));
		workflow.setOwnerSpaceIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.ownerSpaceIdentifier"));
		workflow.setOwnerSpaceType(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.ownerSpaceType"));
		workflow.setDefaultStatusIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.defaultStatusIdentifier"));
		workflow.setStatusOrder(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statusOrder"));
		workflow.setResourceType(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.resourceType"));
		workflow.setSource(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.source"));
		workflow.setGmtCreate(_ctx.longValue("GetWorkItemWorkFlowInfoResponse.workflow.gmtCreate"));
		workflow.setGmtModified(_ctx.longValue("GetWorkItemWorkFlowInfoResponse.workflow.gmtModified"));
		workflow.setCreator(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.creator"));
		workflow.setModifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.modifier"));

		List<WorkflowAction> workflowActions = new ArrayList<WorkflowAction>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemWorkFlowInfoResponse.workflow.workflowActions.Length"); i++) {
			WorkflowAction workflowAction = new WorkflowAction();
			workflowAction.setId(_ctx.longValue("GetWorkItemWorkFlowInfoResponse.workflow.workflowActions["+ i +"].id"));
			workflowAction.setName(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.workflowActions["+ i +"].name"));
			workflowAction.setWorkflowIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.workflowActions["+ i +"].workflowIdentifier"));
			workflowAction.setWorkflowStatusIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.workflowActions["+ i +"].workflowStatusIdentifier"));
			workflowAction.setNextWorkflowStatusIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.workflowActions["+ i +"].nextWorkflowStatusIdentifier"));

			workflowActions.add(workflowAction);
		}
		workflow.setWorkflowActions(workflowActions);

		List<Statuse> statuses = new ArrayList<Statuse>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses.Length"); i++) {
			Statuse statuse = new Statuse();
			statuse.setIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].identifier"));
			statuse.setName(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].name"));
			statuse.setWorkflowStageName(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].workflowStageName"));
			statuse.setWorkflowStageIdentifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].workflowStageIdentifier"));
			statuse.setSource(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].source"));
			statuse.setGmtCreate(_ctx.longValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].gmtCreate"));
			statuse.setGmtModified(_ctx.longValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].gmtModified"));
			statuse.setCreator(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].creator"));
			statuse.setModifier(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].modifier"));
			statuse.setDescription(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].description"));
			statuse.setResourceType(_ctx.stringValue("GetWorkItemWorkFlowInfoResponse.workflow.statuses["+ i +"].resourceType"));

			statuses.add(statuse);
		}
		workflow.setStatuses(statuses);
		getWorkItemWorkFlowInfoResponse.setWorkflow(workflow);
	 
	 	return getWorkItemWorkFlowInfoResponse;
	}
}