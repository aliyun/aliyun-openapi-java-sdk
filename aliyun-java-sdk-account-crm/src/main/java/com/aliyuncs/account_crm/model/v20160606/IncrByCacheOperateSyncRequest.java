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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class IncrByCacheOperateSyncRequest extends RpcAcsRequest<IncrByCacheOperateSyncResponse> {
	   

	private Integer expireSeconds;

	private Integer defaultValue;

	private Integer step;

	private String key;
	public IncrByCacheOperateSyncRequest() {
		super("account-crm", "2016-06-06", "IncrByCacheOperateSync");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getExpireSeconds() {
		return this.expireSeconds;
	}

	public void setExpireSeconds(Integer expireSeconds) {
		this.expireSeconds = expireSeconds;
		if(expireSeconds != null){
			putQueryParameter("ExpireSeconds", expireSeconds.toString());
		}
	}

	public Integer getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(Integer defaultValue) {
		this.defaultValue = defaultValue;
		if(defaultValue != null){
			putQueryParameter("DefaultValue", defaultValue.toString());
		}
	}

	public Integer getStep() {
		return this.step;
	}

	public void setStep(Integer step) {
		this.step = step;
		if(step != null){
			putQueryParameter("Step", step.toString());
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	@Override
	public Class<IncrByCacheOperateSyncResponse> getResponseClass() {
		return IncrByCacheOperateSyncResponse.class;
	}

}
