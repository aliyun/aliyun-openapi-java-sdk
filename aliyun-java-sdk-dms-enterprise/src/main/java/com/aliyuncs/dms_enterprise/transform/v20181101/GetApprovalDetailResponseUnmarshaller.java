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

import com.aliyuncs.dms_enterprise.model.v20181101.GetApprovalDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetApprovalDetailResponse.ApprovalDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetApprovalDetailResponse.ApprovalDetail.CurrentHandler;
import com.aliyuncs.dms_enterprise.model.v20181101.GetApprovalDetailResponse.ApprovalDetail.WorkflowNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApprovalDetailResponseUnmarshaller {

	public static GetApprovalDetailResponse unmarshall(GetApprovalDetailResponse getApprovalDetailResponse, UnmarshallerContext _ctx) {
		
		getApprovalDetailResponse.setRequestId(_ctx.stringValue("GetApprovalDetailResponse.RequestId"));
		getApprovalDetailResponse.setErrorCode(_ctx.stringValue("GetApprovalDetailResponse.ErrorCode"));
		getApprovalDetailResponse.setErrorMessage(_ctx.stringValue("GetApprovalDetailResponse.ErrorMessage"));
		getApprovalDetailResponse.setSuccess(_ctx.booleanValue("GetApprovalDetailResponse.Success"));

		ApprovalDetail approvalDetail = new ApprovalDetail();
		approvalDetail.setDescription(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.Description"));
		approvalDetail.setOrderType(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.OrderType"));
		approvalDetail.setTitle(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.Title"));
		approvalDetail.setAuditId(_ctx.longValue("GetApprovalDetailResponse.ApprovalDetail.AuditId"));
		approvalDetail.setOrderId(_ctx.longValue("GetApprovalDetailResponse.ApprovalDetail.OrderId"));
		approvalDetail.setWorkflowInsCode(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowInsCode"));

		List<String> reasonList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApprovalDetailResponse.ApprovalDetail.ReasonList.Length"); i++) {
			reasonList.add(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.ReasonList["+ i +"]"));
		}
		approvalDetail.setReasonList(reasonList);

		List<WorkflowNode> workflowNodes = new ArrayList<WorkflowNode>();
		for (int i = 0; i < _ctx.lengthValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes.Length"); i++) {
			WorkflowNode workflowNode = new WorkflowNode();
			workflowNode.setOperateTime(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes["+ i +"].OperateTime"));
			workflowNode.setOperatorId(_ctx.longValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes["+ i +"].OperatorId"));
			workflowNode.setNodeName(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes["+ i +"].NodeName"));
			workflowNode.setOperateComment(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes["+ i +"].OperateComment"));
			workflowNode.setWorkflowInsCode(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes["+ i +"].WorkflowInsCode"));

			List<String> auditUserIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes["+ i +"].AuditUserIdList.Length"); j++) {
				auditUserIdList.add(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.WorkflowNodes["+ i +"].AuditUserIdList["+ j +"]"));
			}
			workflowNode.setAuditUserIdList(auditUserIdList);

			workflowNodes.add(workflowNode);
		}
		approvalDetail.setWorkflowNodes(workflowNodes);

		List<CurrentHandler> currentHandlers = new ArrayList<CurrentHandler>();
		for (int i = 0; i < _ctx.lengthValue("GetApprovalDetailResponse.ApprovalDetail.CurrentHandlers.Length"); i++) {
			CurrentHandler currentHandler = new CurrentHandler();
			currentHandler.setNickName(_ctx.stringValue("GetApprovalDetailResponse.ApprovalDetail.CurrentHandlers["+ i +"].NickName"));
			currentHandler.setId(_ctx.longValue("GetApprovalDetailResponse.ApprovalDetail.CurrentHandlers["+ i +"].Id"));

			currentHandlers.add(currentHandler);
		}
		approvalDetail.setCurrentHandlers(currentHandlers);
		getApprovalDetailResponse.setApprovalDetail(approvalDetail);
	 
	 	return getApprovalDetailResponse;
	}
}