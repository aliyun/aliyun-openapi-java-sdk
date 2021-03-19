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
public class CreateCasCertificateRequest extends RpcAcsRequest<CreateCasCertificateResponse> {
	   

	private String certificate;

	private String privateKey;

	private Long certType;

	private String name;

	private String zoneId;

	private String paasRegionId;

	private String workspaceId;
	public CreateCasCertificateRequest() {
		super("SOFA", "2019-08-15", "CreateCasCertificate", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
		if(certificate != null){
			putBodyParameter("Certificate", certificate);
		}
	}

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		if(privateKey != null){
			putBodyParameter("PrivateKey", privateKey);
		}
	}

	public Long getCertType() {
		return this.certType;
	}

	public void setCertType(Long certType) {
		this.certType = certType;
		if(certType != null){
			putBodyParameter("CertType", certType.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("ZoneId", zoneId);
		}
	}

	public String getPaasRegionId() {
		return this.paasRegionId;
	}

	public void setPaasRegionId(String paasRegionId) {
		this.paasRegionId = paasRegionId;
		if(paasRegionId != null){
			putBodyParameter("PaasRegionId", paasRegionId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<CreateCasCertificateResponse> getResponseClass() {
		return CreateCasCertificateResponse.class;
	}

}
