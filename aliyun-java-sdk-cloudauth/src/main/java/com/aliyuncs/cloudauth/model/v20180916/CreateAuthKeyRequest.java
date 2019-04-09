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

package com.aliyuncs.cloudauth.model.v20180916;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateAuthKeyRequest extends RpcAcsRequest<CreateAuthKeyResponse> {
	
	public CreateAuthKeyRequest() {
		super("Cloudauth", "2018-09-16", "CreateAuthKey", "cloudauth");
	}

	private String bizType;

	private String userDeviceId;

	private String sourceIp;

	private Boolean test;

	private Integer authYears;

	private String lang;

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getUserDeviceId() {
		return this.userDeviceId;
	}

	public void setUserDeviceId(String userDeviceId) {
		this.userDeviceId = userDeviceId;
		if(userDeviceId != null){
			putQueryParameter("UserDeviceId", userDeviceId);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Boolean getTest() {
		return this.test;
	}

	public void setTest(Boolean test) {
		this.test = test;
		if(test != null){
			putQueryParameter("Test", test.toString());
		}
	}

	public Integer getAuthYears() {
		return this.authYears;
	}

	public void setAuthYears(Integer authYears) {
		this.authYears = authYears;
		if(authYears != null){
			putQueryParameter("AuthYears", authYears.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<CreateAuthKeyResponse> getResponseClass() {
		return CreateAuthKeyResponse.class;
	}

}
