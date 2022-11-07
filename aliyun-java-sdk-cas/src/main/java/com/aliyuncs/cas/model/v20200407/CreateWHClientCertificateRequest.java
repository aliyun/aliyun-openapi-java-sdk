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

package com.aliyuncs.cas.model.v20200407;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateWHClientCertificateRequest extends RpcAcsRequest<CreateWHClientCertificateResponse> {
	   

	private String csr;

	private String commonName;

	private String sanValue;

	private String algorithm;

	private Long afterTime;

	private Long sanType;

	private Long days;

	private Long beforeTime;

	private String parentIdentifier;
	public CreateWHClientCertificateRequest() {
		super("cas", "2020-04-07", "CreateWHClientCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCsr() {
		return this.csr;
	}

	public void setCsr(String csr) {
		this.csr = csr;
		if(csr != null){
			putQueryParameter("Csr", csr);
		}
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
		if(commonName != null){
			putQueryParameter("CommonName", commonName);
		}
	}

	public String getSanValue() {
		return this.sanValue;
	}

	public void setSanValue(String sanValue) {
		this.sanValue = sanValue;
		if(sanValue != null){
			putQueryParameter("SanValue", sanValue);
		}
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		if(algorithm != null){
			putQueryParameter("Algorithm", algorithm);
		}
	}

	public Long getAfterTime() {
		return this.afterTime;
	}

	public void setAfterTime(Long afterTime) {
		this.afterTime = afterTime;
		if(afterTime != null){
			putQueryParameter("AfterTime", afterTime.toString());
		}
	}

	public Long getSanType() {
		return this.sanType;
	}

	public void setSanType(Long sanType) {
		this.sanType = sanType;
		if(sanType != null){
			putQueryParameter("SanType", sanType.toString());
		}
	}

	public Long getDays() {
		return this.days;
	}

	public void setDays(Long days) {
		this.days = days;
		if(days != null){
			putQueryParameter("Days", days.toString());
		}
	}

	public Long getBeforeTime() {
		return this.beforeTime;
	}

	public void setBeforeTime(Long beforeTime) {
		this.beforeTime = beforeTime;
		if(beforeTime != null){
			putQueryParameter("BeforeTime", beforeTime.toString());
		}
	}

	public String getParentIdentifier() {
		return this.parentIdentifier;
	}

	public void setParentIdentifier(String parentIdentifier) {
		this.parentIdentifier = parentIdentifier;
		if(parentIdentifier != null){
			putQueryParameter("ParentIdentifier", parentIdentifier);
		}
	}

	@Override
	public Class<CreateWHClientCertificateResponse> getResponseClass() {
		return CreateWHClientCertificateResponse.class;
	}

}
