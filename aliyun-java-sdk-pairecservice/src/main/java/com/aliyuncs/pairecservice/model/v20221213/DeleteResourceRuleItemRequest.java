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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteResourceRuleItemRequest extends RoaAcsRequest<DeleteResourceRuleItemResponse> {
	   

	private String resourceRuleId;

	private String resourceRuleItemId;

	private String instanceId;
	public DeleteResourceRuleItemRequest() {
		super("PaiRecService", "2022-12-13", "DeleteResourceRuleItem");
		setUriPattern("/api/v1/resourcerules/[ResourceRuleId]/items/[ResourceRuleItemId]");
		setMethod(MethodType.DELETE);
	}

	public String getResourceRuleId() {
		return this.resourceRuleId;
	}

	public void setResourceRuleId(String resourceRuleId) {
		this.resourceRuleId = resourceRuleId;
		if(resourceRuleId != null){
			putPathParameter("ResourceRuleId", resourceRuleId);
		}
	}

	public String getResourceRuleItemId() {
		return this.resourceRuleItemId;
	}

	public void setResourceRuleItemId(String resourceRuleItemId) {
		this.resourceRuleItemId = resourceRuleItemId;
		if(resourceRuleItemId != null){
			putPathParameter("ResourceRuleItemId", resourceRuleItemId);
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
	public Class<DeleteResourceRuleItemResponse> getResponseClass() {
		return DeleteResourceRuleItemResponse.class;
	}

}
