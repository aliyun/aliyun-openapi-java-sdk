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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddPhoneNumbersRequest extends RpcAcsRequest<AddPhoneNumbersResponse> {
	   

	private String contactFlowId;

	private String usage;

	private String numberGroupId;

	private String numberList;

	private String instanceId;
	public AddPhoneNumbersRequest() {
		super("CCC", "2020-07-01", "AddPhoneNumbers", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactFlowId() {
		return this.contactFlowId;
	}

	public void setContactFlowId(String contactFlowId) {
		this.contactFlowId = contactFlowId;
		if(contactFlowId != null){
			putQueryParameter("ContactFlowId", contactFlowId);
		}
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
		if(usage != null){
			putQueryParameter("Usage", usage);
		}
	}

	public String getNumberGroupId() {
		return this.numberGroupId;
	}

	public void setNumberGroupId(String numberGroupId) {
		this.numberGroupId = numberGroupId;
		if(numberGroupId != null){
			putQueryParameter("NumberGroupId", numberGroupId);
		}
	}

	public String getNumberList() {
		return this.numberList;
	}

	public void setNumberList(String numberList) {
		this.numberList = numberList;
		if(numberList != null){
			putQueryParameter("NumberList", numberList);
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

	@Override
	public Class<AddPhoneNumbersResponse> getResponseClass() {
		return AddPhoneNumbersResponse.class;
	}

}
