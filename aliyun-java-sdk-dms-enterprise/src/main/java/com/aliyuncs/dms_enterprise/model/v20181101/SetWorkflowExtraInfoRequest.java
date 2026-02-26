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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetWorkflowExtraInfoRequest extends RpcAcsRequest<SetWorkflowExtraInfoResponse> {
	   

	private String thirdpartyWorkflowComment;

	private Boolean renderAgree;

	private Long tid;

	private Long workflowInstanceId;

	private Boolean renderCancel;

	private Boolean renderAddApprovalNode;

	private Boolean renderTransfer;

	private Boolean renderReject;

	private String thirdpartyWorkflowUrl;
	public SetWorkflowExtraInfoRequest() {
		super("dms-enterprise", "2018-11-01", "SetWorkflowExtraInfo", "dms-enterprise");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getThirdpartyWorkflowComment() {
		return this.thirdpartyWorkflowComment;
	}

	public void setThirdpartyWorkflowComment(String thirdpartyWorkflowComment) {
		this.thirdpartyWorkflowComment = thirdpartyWorkflowComment;
		if(thirdpartyWorkflowComment != null){
			putQueryParameter("ThirdpartyWorkflowComment", thirdpartyWorkflowComment);
		}
	}

	public Boolean getRenderAgree() {
		return this.renderAgree;
	}

	public void setRenderAgree(Boolean renderAgree) {
		this.renderAgree = renderAgree;
		if(renderAgree != null){
			putQueryParameter("RenderAgree", renderAgree.toString());
		}
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

	public Boolean getRenderCancel() {
		return this.renderCancel;
	}

	public void setRenderCancel(Boolean renderCancel) {
		this.renderCancel = renderCancel;
		if(renderCancel != null){
			putQueryParameter("RenderCancel", renderCancel.toString());
		}
	}

	public Boolean getRenderAddApprovalNode() {
		return this.renderAddApprovalNode;
	}

	public void setRenderAddApprovalNode(Boolean renderAddApprovalNode) {
		this.renderAddApprovalNode = renderAddApprovalNode;
		if(renderAddApprovalNode != null){
			putQueryParameter("RenderAddApprovalNode", renderAddApprovalNode.toString());
		}
	}

	public Boolean getRenderTransfer() {
		return this.renderTransfer;
	}

	public void setRenderTransfer(Boolean renderTransfer) {
		this.renderTransfer = renderTransfer;
		if(renderTransfer != null){
			putQueryParameter("RenderTransfer", renderTransfer.toString());
		}
	}

	public Boolean getRenderReject() {
		return this.renderReject;
	}

	public void setRenderReject(Boolean renderReject) {
		this.renderReject = renderReject;
		if(renderReject != null){
			putQueryParameter("RenderReject", renderReject.toString());
		}
	}

	public String getThirdpartyWorkflowUrl() {
		return this.thirdpartyWorkflowUrl;
	}

	public void setThirdpartyWorkflowUrl(String thirdpartyWorkflowUrl) {
		this.thirdpartyWorkflowUrl = thirdpartyWorkflowUrl;
		if(thirdpartyWorkflowUrl != null){
			putQueryParameter("ThirdpartyWorkflowUrl", thirdpartyWorkflowUrl);
		}
	}

	@Override
	public Class<SetWorkflowExtraInfoResponse> getResponseClass() {
		return SetWorkflowExtraInfoResponse.class;
	}

}
