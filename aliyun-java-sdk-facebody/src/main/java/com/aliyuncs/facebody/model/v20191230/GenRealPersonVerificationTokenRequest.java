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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenRealPersonVerificationTokenRequest extends RpcAcsRequest<GenRealPersonVerificationTokenResponse> {
	   

	private String certificateNumber;

	private String certificateName;

	private String metaInfo;
	public GenRealPersonVerificationTokenRequest() {
		super("facebody", "2019-12-30", "GenRealPersonVerificationToken", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCertificateNumber() {
		return this.certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
		if(certificateNumber != null){
			putBodyParameter("CertificateNumber", certificateNumber);
		}
	}

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
		if(certificateName != null){
			putBodyParameter("CertificateName", certificateName);
		}
	}

	public String getMetaInfo() {
		return this.metaInfo;
	}

	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
		if(metaInfo != null){
			putBodyParameter("MetaInfo", metaInfo);
		}
	}

	@Override
	public Class<GenRealPersonVerificationTokenResponse> getResponseClass() {
		return GenRealPersonVerificationTokenResponse.class;
	}

}
