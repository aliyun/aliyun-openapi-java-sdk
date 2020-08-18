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

package com.aliyuncs.mhub.model.v20170825;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mhub.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyCertRequest extends RpcAcsRequest<VerifyCertResponse> {
	   

	private Boolean isCommit;

	private String encodedCert;

	private String bundleId;

	private String certMode;

	private String password;

	private Long appKey;
	public VerifyCertRequest() {
		super("Mhub", "2017-08-25", "VerifyCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsCommit() {
		return this.isCommit;
	}

	public void setIsCommit(Boolean isCommit) {
		this.isCommit = isCommit;
		if(isCommit != null){
			putQueryParameter("IsCommit", isCommit.toString());
		}
	}

	public String getEncodedCert() {
		return this.encodedCert;
	}

	public void setEncodedCert(String encodedCert) {
		this.encodedCert = encodedCert;
		if(encodedCert != null){
			putQueryParameter("EncodedCert", encodedCert);
		}
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putQueryParameter("BundleId", bundleId);
		}
	}

	public String getCertMode() {
		return this.certMode;
	}

	public void setCertMode(String certMode) {
		this.certMode = certMode;
		if(certMode != null){
			putQueryParameter("CertMode", certMode);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey.toString());
		}
	}

	@Override
	public Class<VerifyCertResponse> getResponseClass() {
		return VerifyCertResponse.class;
	}

}
