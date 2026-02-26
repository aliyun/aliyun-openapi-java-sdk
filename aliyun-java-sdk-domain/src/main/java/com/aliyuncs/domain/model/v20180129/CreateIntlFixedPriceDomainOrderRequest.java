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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIntlFixedPriceDomainOrderRequest extends RpcAcsRequest<CreateIntlFixedPriceDomainOrderResponse> {
	   

	private Boolean autoPay;

	private Long contactId;

	private Long expectedPrice;

	private String domain;
	public CreateIntlFixedPriceDomainOrderRequest() {
		super("Domain", "2018-01-29", "CreateIntlFixedPriceDomainOrder", "domain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Long getContactId() {
		return this.contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
		if(contactId != null){
			putQueryParameter("ContactId", contactId.toString());
		}
	}

	public Long getExpectedPrice() {
		return this.expectedPrice;
	}

	public void setExpectedPrice(Long expectedPrice) {
		this.expectedPrice = expectedPrice;
		if(expectedPrice != null){
			putQueryParameter("ExpectedPrice", expectedPrice.toString());
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	@Override
	public Class<CreateIntlFixedPriceDomainOrderResponse> getResponseClass() {
		return CreateIntlFixedPriceDomainOrderResponse.class;
	}

}
