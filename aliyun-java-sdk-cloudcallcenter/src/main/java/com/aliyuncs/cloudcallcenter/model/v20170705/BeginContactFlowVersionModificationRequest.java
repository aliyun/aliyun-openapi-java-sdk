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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BeginContactFlowVersionModificationRequest extends RpcAcsRequest<BeginContactFlowVersionModificationResponse> {
	
	public BeginContactFlowVersionModificationRequest() {
		super("CloudCallCenter", "2017-07-05", "BeginContactFlowVersionModification", "CloudCallCenter", "innerAPI");
		setMethod(MethodType.POST);
	}

	private String contactFlowId;

	private String instanceId;

	public String getContactFlowId() {
		return this.contactFlowId;
	}

	public void setContactFlowId(String contactFlowId) {
		this.contactFlowId = contactFlowId;
		if(contactFlowId != null){
			putBodyParameter("ContactFlowId", contactFlowId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<BeginContactFlowVersionModificationResponse> getResponseClass() {
		return BeginContactFlowVersionModificationResponse.class;
	}

}
