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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetIdentityRegistrationByCustomerRequest extends RpcAcsRequest<GetIdentityRegistrationByCustomerResponse> {
	   

	private String customerId;
	public GetIdentityRegistrationByCustomerRequest() {
		super("account-crm", "2016-06-06", "GetIdentityRegistrationByCustomer");
		setMethod(MethodType.POST);
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId);
		}
	}

	@Override
	public Class<GetIdentityRegistrationByCustomerResponse> getResponseClass() {
		return GetIdentityRegistrationByCustomerResponse.class;
	}

}
