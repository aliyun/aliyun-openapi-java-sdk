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
public class SetCacheOperateSyncRequest extends RpcAcsRequest<SetCacheOperateSyncResponse> {
	   

	private Integer exceptVersion;

	private Integer expireSeconds;

	private String valueString;

	private String setType;

	private String valueClazz;

	private String key;
	public SetCacheOperateSyncRequest() {
		super("account-crm", "2016-06-06", "SetCacheOperateSync");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getExceptVersion() {
		return this.exceptVersion;
	}

	public void setExceptVersion(Integer exceptVersion) {
		this.exceptVersion = exceptVersion;
		if(exceptVersion != null){
			putQueryParameter("ExceptVersion", exceptVersion.toString());
		}
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

	public String getValueString() {
		return this.valueString;
	}

	public void setValueString(String valueString) {
		this.valueString = valueString;
		if(valueString != null){
			putQueryParameter("ValueString", valueString);
		}
	}

	public String getSetType() {
		return this.setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
		if(setType != null){
			putQueryParameter("SetType", setType);
		}
	}

	public String getValueClazz() {
		return this.valueClazz;
	}

	public void setValueClazz(String valueClazz) {
		this.valueClazz = valueClazz;
		if(valueClazz != null){
			putQueryParameter("ValueClazz", valueClazz);
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
	public Class<SetCacheOperateSyncResponse> getResponseClass() {
		return SetCacheOperateSyncResponse.class;
	}

}
