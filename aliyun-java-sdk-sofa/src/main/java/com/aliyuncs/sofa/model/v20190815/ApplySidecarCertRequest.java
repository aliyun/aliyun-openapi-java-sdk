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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplySidecarCertRequest extends RpcAcsRequest<ApplySidecarCertResponse> {
	   

	private String certCsr;

	private String publicKey;

	private String instanceId;

	private String tenantName;
	public ApplySidecarCertRequest() {
		super("SOFA", "2019-08-15", "ApplySidecarCert", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCertCsr() {
		return this.certCsr;
	}

	public void setCertCsr(String certCsr) {
		this.certCsr = certCsr;
		if(certCsr != null){
			putBodyParameter("CertCsr", certCsr);
		}
	}

	public String getPublicKey() {
		return this.publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
		if(publicKey != null){
			putBodyParameter("PublicKey", publicKey);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	@Override
	public Class<ApplySidecarCertResponse> getResponseClass() {
		return ApplySidecarCertResponse.class;
	}

}
