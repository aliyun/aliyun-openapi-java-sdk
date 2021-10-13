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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idaas_doraemon.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FetchAccessTokenRequest extends RpcAcsRequest<FetchAccessTokenResponse> {
	   

	private String xClientIp;

	private String mobileExtendParamsJsonSign;

	private String serverExtendParamsJson;

	private String mobileExtendParamsJson;

	private String applicationExternalId;
	public FetchAccessTokenRequest() {
		super("idaas-doraemon", "2021-05-20", "FetchAccessToken");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getXClientIp() {
		return this.xClientIp;
	}

	public void setXClientIp(String xClientIp) {
		this.xClientIp = xClientIp;
		if(xClientIp != null){
			putQueryParameter("XClientIp", xClientIp);
		}
	}

	public String getMobileExtendParamsJsonSign() {
		return this.mobileExtendParamsJsonSign;
	}

	public void setMobileExtendParamsJsonSign(String mobileExtendParamsJsonSign) {
		this.mobileExtendParamsJsonSign = mobileExtendParamsJsonSign;
		if(mobileExtendParamsJsonSign != null){
			putQueryParameter("MobileExtendParamsJsonSign", mobileExtendParamsJsonSign);
		}
	}

	public String getServerExtendParamsJson() {
		return this.serverExtendParamsJson;
	}

	public void setServerExtendParamsJson(String serverExtendParamsJson) {
		this.serverExtendParamsJson = serverExtendParamsJson;
		if(serverExtendParamsJson != null){
			putQueryParameter("ServerExtendParamsJson", serverExtendParamsJson);
		}
	}

	public String getMobileExtendParamsJson() {
		return this.mobileExtendParamsJson;
	}

	public void setMobileExtendParamsJson(String mobileExtendParamsJson) {
		this.mobileExtendParamsJson = mobileExtendParamsJson;
		if(mobileExtendParamsJson != null){
			putQueryParameter("MobileExtendParamsJson", mobileExtendParamsJson);
		}
	}

	public String getApplicationExternalId() {
		return this.applicationExternalId;
	}

	public void setApplicationExternalId(String applicationExternalId) {
		this.applicationExternalId = applicationExternalId;
		if(applicationExternalId != null){
			putQueryParameter("ApplicationExternalId", applicationExternalId);
		}
	}

	@Override
	public Class<FetchAccessTokenResponse> getResponseClass() {
		return FetchAccessTokenResponse.class;
	}

}
