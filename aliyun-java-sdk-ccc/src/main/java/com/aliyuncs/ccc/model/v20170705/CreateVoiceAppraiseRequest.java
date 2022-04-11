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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVoiceAppraiseRequest extends RpcAcsRequest<CreateVoiceAppraiseResponse> {
	   

	private Boolean isAppraise;

	private String content;

	private String instanceId;

	private String contactFlowVersionId;
	public CreateVoiceAppraiseRequest() {
		super("CCC", "2017-07-05", "CreateVoiceAppraise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsAppraise() {
		return this.isAppraise;
	}

	public void setIsAppraise(Boolean isAppraise) {
		this.isAppraise = isAppraise;
		if(isAppraise != null){
			putQueryParameter("IsAppraise", isAppraise.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
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

	public String getContactFlowVersionId() {
		return this.contactFlowVersionId;
	}

	public void setContactFlowVersionId(String contactFlowVersionId) {
		this.contactFlowVersionId = contactFlowVersionId;
		if(contactFlowVersionId != null){
			putQueryParameter("ContactFlowVersionId", contactFlowVersionId);
		}
	}

	@Override
	public Class<CreateVoiceAppraiseResponse> getResponseClass() {
		return CreateVoiceAppraiseResponse.class;
	}

}
