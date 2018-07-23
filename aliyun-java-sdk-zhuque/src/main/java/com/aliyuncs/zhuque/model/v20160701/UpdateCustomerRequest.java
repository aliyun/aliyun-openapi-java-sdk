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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomerRequest extends RpcAcsRequest<UpdateCustomerResponse> {
	
	public UpdateCustomerRequest() {
		super("Zhuque", "2016-07-01", "UpdateCustomer");
	}

	private String customerType;

	private String userList;

	private String customerId;

	private String description;

	private String newCustomerId;

	private String customerName;

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
		if(customerType != null){
			putQueryParameter("CustomerType", customerType);
		}
	}

	public String getUserList() {
		return this.userList;
	}

	public void setUserList(String userList) {
		this.userList = userList;
		if(userList != null){
			putQueryParameter("UserList", userList);
		}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getNewCustomerId() {
		return this.newCustomerId;
	}

	public void setNewCustomerId(String newCustomerId) {
		this.newCustomerId = newCustomerId;
		if(newCustomerId != null){
			putQueryParameter("NewCustomerId", newCustomerId);
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

	@Override
	public Class<UpdateCustomerResponse> getResponseClass() {
		return UpdateCustomerResponse.class;
	}

}
