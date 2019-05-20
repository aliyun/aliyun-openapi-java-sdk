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
public class CreateVoiceAppraiseRequest extends RpcAcsRequest<CreateVoiceAppraiseResponse> {
	
	public CreateVoiceAppraiseRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateVoiceAppraise", "CloudCallCenter", "innerAPI");
		setMethod(MethodType.POST);
	}

	private String instanceId;

	private String contactFlowVersionId;

	private Boolean isAppraise;

	private String content;

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

	@Override
	public Class<CreateVoiceAppraiseResponse> getResponseClass() {
		return CreateVoiceAppraiseResponse.class;
	}

}
