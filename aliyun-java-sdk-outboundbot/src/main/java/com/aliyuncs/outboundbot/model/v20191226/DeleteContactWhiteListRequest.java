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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteContactWhiteListRequest extends RpcAcsRequest<DeleteContactWhiteListResponse> {
	   

	private String operator;

	private String instanceId;

	private String contactWhiteListId;
	public DeleteContactWhiteListRequest() {
		super("OutboundBot", "2019-12-26", "DeleteContactWhiteList", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getContactWhiteListId() {
		return this.contactWhiteListId;
	}

	public void setContactWhiteListId(String contactWhiteListId) {
		this.contactWhiteListId = contactWhiteListId;
		if(contactWhiteListId != null){
			putQueryParameter("ContactWhiteListId", contactWhiteListId);
		}
	}

	@Override
	public Class<DeleteContactWhiteListResponse> getResponseClass() {
		return DeleteContactWhiteListResponse.class;
	}

}
