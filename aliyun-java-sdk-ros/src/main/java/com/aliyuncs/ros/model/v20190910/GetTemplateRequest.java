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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateRequest extends RpcAcsRequest<GetTemplateResponse> {
	   

	private String stackId;

	private String templateId;

	private String changeSetId;
	public GetTemplateRequest() {
		super("ROS", "2019-09-10", "GetTemplate", "ROS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getChangeSetId() {
		return this.changeSetId;
	}

	public void setChangeSetId(String changeSetId) {
		this.changeSetId = changeSetId;
		if(changeSetId != null){
			putQueryParameter("ChangeSetId", changeSetId);
		}
	}

	@Override
	public Class<GetTemplateResponse> getResponseClass() {
		return GetTemplateResponse.class;
	}

}
