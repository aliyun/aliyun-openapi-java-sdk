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
public class UpdateResourceRuleRequest extends RoaAcsRequest<UpdateResourceRuleResponse> {
	   

	private String body;

	private String resourceRuleId;
	public UpdateResourceRuleRequest() {
		super("PaiRecService", "2022-12-13", "UpdateResourceRule");
		setUriPattern("/api/v1/resourcerules/[ResourceRuleId]");
		setMethod(MethodType.PUT);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
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

	@Override
	public Class<UpdateResourceRuleResponse> getResponseClass() {
		return UpdateResourceRuleResponse.class;
	}

}
