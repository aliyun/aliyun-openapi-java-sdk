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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateServiceLinkedRoleForProductRequest extends RpcAcsRequest<CreateServiceLinkedRoleForProductResponse> {
	   

	private String productName;
	public CreateServiceLinkedRoleForProductRequest() {
		super("eventbridge", "2020-04-01", "CreateServiceLinkedRoleForProduct");
		setMethod(MethodType.POST);
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	@Override
	public Class<CreateServiceLinkedRoleForProductResponse> getResponseClass() {
		return CreateServiceLinkedRoleForProductResponse.class;
	}

}
