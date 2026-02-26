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
public class AttachPolicy2ApprovalProcessRequest extends RpcAcsRequest<AttachPolicy2ApprovalProcessResponse> {
	   

	private String policyType;

	private String policyId;

	private String processId;
	public AttachPolicy2ApprovalProcessRequest() {
		super("csas", "2023-01-20", "AttachPolicy2ApprovalProcess");
		setMethod(MethodType.POST);
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
		if(policyType != null){
			putBodyParameter("PolicyType", policyType);
		}
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putBodyParameter("PolicyId", policyId);
		}
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
		if(processId != null){
			putBodyParameter("ProcessId", processId);
		}
	}

	@Override
	public Class<AttachPolicy2ApprovalProcessResponse> getResponseClass() {
		return AttachPolicy2ApprovalProcessResponse.class;
	}

}
