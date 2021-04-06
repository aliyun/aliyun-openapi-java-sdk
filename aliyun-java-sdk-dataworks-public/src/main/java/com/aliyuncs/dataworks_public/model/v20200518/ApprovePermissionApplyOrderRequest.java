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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApprovePermissionApplyOrderRequest extends RpcAcsRequest<ApprovePermissionApplyOrderResponse> {
	   

	private String flowId;

	private String approveComment;

	private Integer approveAction;
	public ApprovePermissionApplyOrderRequest() {
		super("dataworks-public", "2020-05-18", "ApprovePermissionApplyOrder");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
		if(flowId != null){
			putQueryParameter("FlowId", flowId);
		}
	}

	public String getApproveComment() {
		return this.approveComment;
	}

	public void setApproveComment(String approveComment) {
		this.approveComment = approveComment;
		if(approveComment != null){
			putQueryParameter("ApproveComment", approveComment);
		}
	}

	public Integer getApproveAction() {
		return this.approveAction;
	}

	public void setApproveAction(Integer approveAction) {
		this.approveAction = approveAction;
		if(approveAction != null){
			putQueryParameter("ApproveAction", approveAction.toString());
		}
	}

	@Override
	public Class<ApprovePermissionApplyOrderResponse> getResponseClass() {
		return ApprovePermissionApplyOrderResponse.class;
	}

}
