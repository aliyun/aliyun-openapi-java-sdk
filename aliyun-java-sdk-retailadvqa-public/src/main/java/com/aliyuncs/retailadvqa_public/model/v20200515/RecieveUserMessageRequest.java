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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RecieveUserMessageRequest extends RpcAcsRequest<RecieveUserMessageResponse> {
	   

	private String organizationId;

	private String accessId;

	private String customerMessageModelListStr;
	public RecieveUserMessageRequest() {
		super("retailadvqa-public", "2020-05-15", "RecieveUserMessage");
		setMethod(MethodType.POST);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("OrganizationId", organizationId);
		}
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getCustomerMessageModelListStr() {
		return this.customerMessageModelListStr;
	}

	public void setCustomerMessageModelListStr(String customerMessageModelListStr) {
		this.customerMessageModelListStr = customerMessageModelListStr;
		if(customerMessageModelListStr != null){
			putBodyParameter("CustomerMessageModelListStr", customerMessageModelListStr);
		}
	}

	@Override
	public Class<RecieveUserMessageResponse> getResponseClass() {
		return RecieveUserMessageResponse.class;
	}

}
