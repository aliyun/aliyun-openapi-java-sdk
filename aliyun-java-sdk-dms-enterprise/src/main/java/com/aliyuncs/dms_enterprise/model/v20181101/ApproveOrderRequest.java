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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApproveOrderRequest extends RpcAcsRequest<ApproveOrderResponse> {
	   

	private Long tid;

	private Long workflowInstanceId;

	private String approvalType;

	private Long newApprover;

	private Long approvalNodeId;

	private Long oldApprover;

	private String comment;

	private String approvalNodePos;
	public ApproveOrderRequest() {
		super("dms-enterprise", "2018-11-01", "ApproveOrder", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Long getWorkflowInstanceId() {
		return this.workflowInstanceId;
	}

	public void setWorkflowInstanceId(Long workflowInstanceId) {
		this.workflowInstanceId = workflowInstanceId;
		if(workflowInstanceId != null){
			putQueryParameter("WorkflowInstanceId", workflowInstanceId.toString());
		}
	}

	public String getApprovalType() {
		return this.approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
		if(approvalType != null){
			putQueryParameter("ApprovalType", approvalType);
		}
	}

	public Long getNewApprover() {
		return this.newApprover;
	}

	public void setNewApprover(Long newApprover) {
		this.newApprover = newApprover;
		if(newApprover != null){
			putQueryParameter("NewApprover", newApprover.toString());
		}
	}

	public Long getApprovalNodeId() {
		return this.approvalNodeId;
	}

	public void setApprovalNodeId(Long approvalNodeId) {
		this.approvalNodeId = approvalNodeId;
		if(approvalNodeId != null){
			putQueryParameter("ApprovalNodeId", approvalNodeId.toString());
		}
	}

	public Long getOldApprover() {
		return this.oldApprover;
	}

	public void setOldApprover(Long oldApprover) {
		this.oldApprover = oldApprover;
		if(oldApprover != null){
			putQueryParameter("OldApprover", oldApprover.toString());
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public String getApprovalNodePos() {
		return this.approvalNodePos;
	}

	public void setApprovalNodePos(String approvalNodePos) {
		this.approvalNodePos = approvalNodePos;
		if(approvalNodePos != null){
			putQueryParameter("ApprovalNodePos", approvalNodePos);
		}
	}

	@Override
	public Class<ApproveOrderResponse> getResponseClass() {
		return ApproveOrderResponse.class;
	}

}
