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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowNodesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowNodesResponse.WorkflowNode;
import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowNodesResponse.WorkflowNode.AuditUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkFlowNodesResponseUnmarshaller {

	public static ListWorkFlowNodesResponse unmarshall(ListWorkFlowNodesResponse listWorkFlowNodesResponse, UnmarshallerContext _ctx) {
		
		listWorkFlowNodesResponse.setRequestId(_ctx.stringValue("ListWorkFlowNodesResponse.RequestId"));
		listWorkFlowNodesResponse.setSuccess(_ctx.booleanValue("ListWorkFlowNodesResponse.Success"));
		listWorkFlowNodesResponse.setErrorMessage(_ctx.stringValue("ListWorkFlowNodesResponse.ErrorMessage"));
		listWorkFlowNodesResponse.setErrorCode(_ctx.stringValue("ListWorkFlowNodesResponse.ErrorCode"));

		List<WorkflowNode> workflowNodes = new ArrayList<WorkflowNode>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkFlowNodesResponse.WorkflowNodes.Length"); i++) {
			WorkflowNode workflowNode = new WorkflowNode();
			workflowNode.setNodeName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].NodeName"));
			workflowNode.setComment(_ctx.stringValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].Comment"));
			workflowNode.setNodeId(_ctx.longValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].NodeId"));
			workflowNode.setNodeType(_ctx.stringValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].NodeType"));
			workflowNode.setCreateUserId(_ctx.longValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].CreateUserId"));
			workflowNode.setCreateUserNickName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].CreateUserNickName"));

			List<AuditUser> auditUsers = new ArrayList<AuditUser>();
			for (int j = 0; j < _ctx.lengthValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].AuditUsers.Length"); j++) {
				AuditUser auditUser = new AuditUser();
				auditUser.setUserId(_ctx.longValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].AuditUsers["+ j +"].UserId"));
				auditUser.setNickName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].AuditUsers["+ j +"].NickName"));
				auditUser.setRealName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkflowNodes["+ i +"].AuditUsers["+ j +"].RealName"));

				auditUsers.add(auditUser);
			}
			workflowNode.setAuditUsers(auditUsers);

			workflowNodes.add(workflowNode);
		}
		listWorkFlowNodesResponse.setWorkflowNodes(workflowNodes);
	 
	 	return listWorkFlowNodesResponse;
	}
}