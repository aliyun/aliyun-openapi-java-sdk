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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyAppInstanceSpecRequest extends RpcAcsRequest<ModifyAppInstanceSpecResponse> {
	   

	private String deployArea;

	private String clientToken;

	private String extend;

	private String bizId;

	private String siteVersion;

	private String applicationType;

	private String paymentType;
	public ModifyAppInstanceSpecRequest() {
		super("WebsiteBuild", "2025-04-29", "ModifyAppInstanceSpec");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDeployArea() {
		return this.deployArea;
	}

	public void setDeployArea(String deployArea) {
		this.deployArea = deployArea;
		if(deployArea != null){
			putQueryParameter("DeployArea", deployArea);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
		if(extend != null){
			putQueryParameter("Extend", extend);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getSiteVersion() {
		return this.siteVersion;
	}

	public void setSiteVersion(String siteVersion) {
		this.siteVersion = siteVersion;
		if(siteVersion != null){
			putQueryParameter("SiteVersion", siteVersion);
		}
	}

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putQueryParameter("ApplicationType", applicationType);
		}
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
		if(paymentType != null){
			putQueryParameter("PaymentType", paymentType);
		}
	}

	@Override
	public Class<ModifyAppInstanceSpecResponse> getResponseClass() {
		return ModifyAppInstanceSpecResponse.class;
	}

}
