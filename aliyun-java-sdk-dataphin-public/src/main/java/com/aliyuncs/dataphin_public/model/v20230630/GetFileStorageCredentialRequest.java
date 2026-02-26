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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetFileStorageCredentialRequest extends RpcAcsRequest<GetFileStorageCredentialResponse> {
	   

	private Long opTenantId;

	private String purpose;

	private Boolean useVpcEndpoint;

	private Long projectId;
	public GetFileStorageCredentialRequest() {
		super("dataphin-public", "2023-06-30", "GetFileStorageCredential");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
		if(purpose != null){
			putQueryParameter("Purpose", purpose);
		}
	}

	public Boolean getUseVpcEndpoint() {
		return this.useVpcEndpoint;
	}

	public void setUseVpcEndpoint(Boolean useVpcEndpoint) {
		this.useVpcEndpoint = useVpcEndpoint;
		if(useVpcEndpoint != null){
			putQueryParameter("UseVpcEndpoint", useVpcEndpoint.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	@Override
	public Class<GetFileStorageCredentialResponse> getResponseClass() {
		return GetFileStorageCredentialResponse.class;
	}

}
