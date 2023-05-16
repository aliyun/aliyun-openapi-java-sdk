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

package com.aliyuncs.agency.model.v20210425;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCustomerRequest extends RpcAcsRequest<CreateCustomerResponse> {
	   

	private String nation;

	private String customerTrade;

	private String customerSource;

	private String customerName;

	private String customerSubTrade;
	public CreateCustomerRequest() {
		super("Agency", "2021-04-25", "CreateCustomer", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
		if(nation != null){
			putQueryParameter("Nation", nation);
		}
	}

	public String getCustomerTrade() {
		return this.customerTrade;
	}

	public void setCustomerTrade(String customerTrade) {
		this.customerTrade = customerTrade;
		if(customerTrade != null){
			putQueryParameter("CustomerTrade", customerTrade);
		}
	}

	public String getCustomerSource() {
		return this.customerSource;
	}

	public void setCustomerSource(String customerSource) {
		this.customerSource = customerSource;
		if(customerSource != null){
			putQueryParameter("CustomerSource", customerSource);
		}
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		if(customerName != null){
			putQueryParameter("CustomerName", customerName);
		}
	}

	public String getCustomerSubTrade() {
		return this.customerSubTrade;
	}

	public void setCustomerSubTrade(String customerSubTrade) {
		this.customerSubTrade = customerSubTrade;
		if(customerSubTrade != null){
			putQueryParameter("CustomerSubTrade", customerSubTrade);
		}
	}

	@Override
	public Class<CreateCustomerResponse> getResponseClass() {
		return CreateCustomerResponse.class;
	}

}
