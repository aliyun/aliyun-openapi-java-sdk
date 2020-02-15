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
import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowNodesResponse.WorkFlowNode;
import com.aliyuncs.dms_enterprise.model.v20181101.ListWorkFlowNodesResponse.WorkFlowNode.AuditUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkFlowNodesResponseUnmarshaller {

	public static ListWorkFlowNodesResponse unmarshall(ListWorkFlowNodesResponse listWorkFlowNodesResponse, UnmarshallerContext _ctx) {
		
		listWorkFlowNodesResponse.setRequestId(_ctx.stringValue("ListWorkFlowNodesResponse.RequestId"));
		listWorkFlowNodesResponse.setSuccess(_ctx.booleanValue("ListWorkFlowNodesResponse.Success"));
		listWorkFlowNodesResponse.setErrorMessage(_ctx.stringValue("ListWorkFlowNodesResponse.ErrorMessage"));
		listWorkFlowNodesResponse.setErrorCode(_ctx.stringValue("ListWorkFlowNodesResponse.ErrorCode"));

		List<WorkFlowNode> workFlowNodes = new ArrayList<WorkFlowNode>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkFlowNodesResponse.WorkFlowNodes.Length"); i++) {
			WorkFlowNode workFlowNode = new WorkFlowNode();
			workFlowNode.setNodeName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].NodeName"));
			workFlowNode.setComment(_ctx.stringValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].Comment"));
			workFlowNode.setNodeId(_ctx.longValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].NodeId"));
			workFlowNode.setNodeType(_ctx.stringValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].NodeType"));
			workFlowNode.setCreateUserId(_ctx.longValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].CreateUserId"));
			workFlowNode.setCreateUserNickName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].CreateUserNickName"));

			List<AuditUser> auditUsers = new ArrayList<AuditUser>();
			for (int j = 0; j < _ctx.lengthValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].AuditUsers.Length"); j++) {
				AuditUser auditUser = new AuditUser();
				auditUser.setUserId(_ctx.longValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].AuditUsers["+ j +"].UserId"));
				auditUser.setNickName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].AuditUsers["+ j +"].NickName"));
				auditUser.setRealName(_ctx.stringValue("ListWorkFlowNodesResponse.WorkFlowNodes["+ i +"].AuditUsers["+ j +"].RealName"));

				auditUsers.add(auditUser);
			}
			workFlowNode.setAuditUsers(auditUsers);

			workFlowNodes.add(workFlowNode);
		}
		listWorkFlowNodesResponse.setWorkFlowNodes(workFlowNodes);
	 
	 	return listWorkFlowNodesResponse;
	}
}