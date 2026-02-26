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

import com.aliyuncs.dms_enterprise.model.v20181101.PreviewWorkflowResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.PreviewWorkflowResponse.WorkflowDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.PreviewWorkflowResponse.WorkflowDetail.WorkflowNode;
import com.aliyuncs.dms_enterprise.model.v20181101.PreviewWorkflowResponse.WorkflowDetail.WorkflowNode.AuditUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreviewWorkflowResponseUnmarshaller {

	public static PreviewWorkflowResponse unmarshall(PreviewWorkflowResponse previewWorkflowResponse, UnmarshallerContext _ctx) {
		
		previewWorkflowResponse.setRequestId(_ctx.stringValue("PreviewWorkflowResponse.RequestId"));
		previewWorkflowResponse.setErrorCode(_ctx.stringValue("PreviewWorkflowResponse.ErrorCode"));
		previewWorkflowResponse.setErrorMessage(_ctx.stringValue("PreviewWorkflowResponse.ErrorMessage"));
		previewWorkflowResponse.setSuccess(_ctx.booleanValue("PreviewWorkflowResponse.Success"));

		WorkflowDetail workflowDetail = new WorkflowDetail();
		workflowDetail.setWfCateName(_ctx.stringValue("PreviewWorkflowResponse.WorkflowDetail.WfCateName"));
		workflowDetail.setComment(_ctx.stringValue("PreviewWorkflowResponse.WorkflowDetail.Comment"));

		List<WorkflowNode> workflowNodeList = new ArrayList<WorkflowNode>();
		for (int i = 0; i < _ctx.lengthValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList.Length"); i++) {
			WorkflowNode workflowNode = new WorkflowNode();
			workflowNode.setNodeName(_ctx.stringValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList["+ i +"].NodeName"));
			workflowNode.setNodeType(_ctx.stringValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList["+ i +"].NodeType"));
			workflowNode.setComment(_ctx.stringValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList["+ i +"].Comment"));

			List<AuditUser> auditUserList = new ArrayList<AuditUser>();
			for (int j = 0; j < _ctx.lengthValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList["+ i +"].AuditUserList.Length"); j++) {
				AuditUser auditUser = new AuditUser();
				auditUser.setUserId(_ctx.longValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList["+ i +"].AuditUserList["+ j +"].UserId"));
				auditUser.setNickName(_ctx.stringValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList["+ i +"].AuditUserList["+ j +"].NickName"));
				auditUser.setRealName(_ctx.stringValue("PreviewWorkflowResponse.WorkflowDetail.WorkflowNodeList["+ i +"].AuditUserList["+ j +"].RealName"));

				auditUserList.add(auditUser);
			}
			workflowNode.setAuditUserList(auditUserList);

			workflowNodeList.add(workflowNode);
		}
		workflowDetail.setWorkflowNodeList(workflowNodeList);
		previewWorkflowResponse.setWorkflowDetail(workflowDetail);
	 
	 	return previewWorkflowResponse;
	}
}