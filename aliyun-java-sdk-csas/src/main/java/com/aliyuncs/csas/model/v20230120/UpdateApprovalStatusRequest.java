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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateApprovalStatusRequest extends RpcAcsRequest<UpdateApprovalStatusResponse> {
	   

	private String approvalId;

	private String status;
	public UpdateApprovalStatusRequest() {
		super("csas", "2023-01-20", "UpdateApprovalStatus");
		setMethod(MethodType.POST);
	}

	public String getApprovalId() {
		return this.approvalId;
	}

	public void setApprovalId(String approvalId) {
		this.approvalId = approvalId;
		if(approvalId != null){
			putQueryParameter("ApprovalId", approvalId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<UpdateApprovalStatusResponse> getResponseClass() {
		return UpdateApprovalStatusResponse.class;
	}

}
