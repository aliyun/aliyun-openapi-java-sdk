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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainByCertificateRequest extends RpcAcsRequest<DescribeLiveDomainByCertificateResponse> {
	   

	private Long ownerId;

	private Boolean sSLStatus;

	private String sSLPub;
	public DescribeLiveDomainByCertificateRequest() {
		super("live", "2016-11-01", "DescribeLiveDomainByCertificate", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getSSLStatus() {
		return this.sSLStatus;
	}

	public void setSSLStatus(Boolean sSLStatus) {
		this.sSLStatus = sSLStatus;
		if(sSLStatus != null){
			putQueryParameter("SSLStatus", sSLStatus.toString());
		}
	}

	public String getSSLPub() {
		return this.sSLPub;
	}

	public void setSSLPub(String sSLPub) {
		this.sSLPub = sSLPub;
		if(sSLPub != null){
			putQueryParameter("SSLPub", sSLPub);
		}
	}

	@Override
	public Class<DescribeLiveDomainByCertificateResponse> getResponseClass() {
		return DescribeLiveDomainByCertificateResponse.class;
	}

}
