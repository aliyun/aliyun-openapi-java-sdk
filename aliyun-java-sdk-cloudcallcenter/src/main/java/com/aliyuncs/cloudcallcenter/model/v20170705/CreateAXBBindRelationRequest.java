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
public class CreateAXBBindRelationRequest extends RpcAcsRequest<CreateAXBBindRelationResponse> {
	
	public CreateAXBBindRelationRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateAXBBindRelation", "CloudCallCenter", "innerAPI");
	}

	private String poolName;

	private String providerId;

	private String extra;

	private String bizId;

	private String poolId;

	private String phoneNumber;

	private String type;

	public String getPoolName() {
		return this.poolName;
	}

	public void setPoolName(String poolName) {
		this.poolName = poolName;
		if(poolName != null){
			putQueryParameter("PoolName", poolName);
		}
	}

	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
		if(providerId != null){
			putQueryParameter("ProviderId", providerId);
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putQueryParameter("Extra", extra);
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

	public String getPoolId() {
		return this.poolId;
	}

	public void setPoolId(String poolId) {
		this.poolId = poolId;
		if(poolId != null){
			putQueryParameter("PoolId", poolId);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
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
	public Class<CreateAXBBindRelationResponse> getResponseClass() {
		return CreateAXBBindRelationResponse.class;
	}

}
