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
public class RenewCertificateOrderForPackageRequestRequest extends RpcAcsRequest<RenewCertificateOrderForPackageRequestResponse> {
	   

	private String csr;

	private Long orderId;
	public RenewCertificateOrderForPackageRequestRequest() {
		super("cas", "2020-04-07", "RenewCertificateOrderForPackageRequest", "cas");
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

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	@Override
	public Class<RenewCertificateOrderForPackageRequestResponse> getResponseClass() {
		return RenewCertificateOrderForPackageRequestResponse.class;
	}

}
