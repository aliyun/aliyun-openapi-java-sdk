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

package com.aliyuncs.emas_dmp_pre.model.v20210402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTargetAudienceRequest extends RpcAcsRequest<CreateTargetAudienceResponse> {
	   

	private String andsTagCondition;

	private String clientToken;

	private String conditions;

	private String orsTagCondition;

	private String notInsTagCondition;
	public CreateTargetAudienceRequest() {
		super("emas-dmp-pre", "2021-04-02", "CreateTargetAudience");
		setMethod(MethodType.POST);
	}

	public String getAndsTagCondition() {
		return this.andsTagCondition;
	}

	public void setAndsTagCondition(String andsTagCondition) {
		this.andsTagCondition = andsTagCondition;
		if(andsTagCondition != null){
			putBodyParameter("AndsTagCondition", andsTagCondition);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
		if(conditions != null){
			putBodyParameter("Conditions", conditions);
		}
	}

	public String getOrsTagCondition() {
		return this.orsTagCondition;
	}

	public void setOrsTagCondition(String orsTagCondition) {
		this.orsTagCondition = orsTagCondition;
		if(orsTagCondition != null){
			putBodyParameter("OrsTagCondition", orsTagCondition);
		}
	}

	public String getNotInsTagCondition() {
		return this.notInsTagCondition;
	}

	public void setNotInsTagCondition(String notInsTagCondition) {
		this.notInsTagCondition = notInsTagCondition;
		if(notInsTagCondition != null){
			putBodyParameter("NotInsTagCondition", notInsTagCondition);
		}
	}

	@Override
	public Class<CreateTargetAudienceResponse> getResponseClass() {
		return CreateTargetAudienceResponse.class;
	}

}
