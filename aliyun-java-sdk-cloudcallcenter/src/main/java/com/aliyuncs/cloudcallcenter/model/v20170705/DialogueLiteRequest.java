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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DialogueLiteRequest extends RpcAcsRequest<DialogueLiteResponse> {
	
	public DialogueLiteRequest() {
		super("CloudCallCenter", "2017-07-05", "DialogueLite", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String vendorParams;

	private String callType;

	private String utterance;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getVendorParams() {
		return this.vendorParams;
	}

	public void setVendorParams(String vendorParams) {
		this.vendorParams = vendorParams;
		if(vendorParams != null){
			putQueryParameter("VendorParams", vendorParams);
		}
	}

	public String getCallType() {
		return this.callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
		if(callType != null){
			putQueryParameter("CallType", callType);
		}
	}

	public String getUtterance() {
		return this.utterance;
	}

	public void setUtterance(String utterance) {
		this.utterance = utterance;
		if(utterance != null){
			putQueryParameter("Utterance", utterance);
		}
	}

	@Override
	public Class<DialogueLiteResponse> getResponseClass() {
		return DialogueLiteResponse.class;
	}

}
