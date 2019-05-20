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
public class CreatePrivacyNumberPoolRequest extends RpcAcsRequest<CreatePrivacyNumberPoolResponse> {
	
	public CreatePrivacyNumberPoolRequest() {
		super("CloudCallCenter", "2017-07-05", "CreatePrivacyNumberPool", "CloudCallCenter", "innerAPI");
	}

	private String providerId;

	private String bizId;

	private String name;

	private String type;

	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
		if(providerId != null){
			putQueryParameter("ProviderId", providerId);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	@Override
	public Class<CreatePrivacyNumberPoolResponse> getResponseClass() {
		return CreatePrivacyNumberPoolResponse.class;
	}

}
