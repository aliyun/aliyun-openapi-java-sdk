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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyBindAccountRequest extends RpcAcsRequest<ModifyBindAccountResponse> {
	   

	private String cloudCode;

	private String accountId;

	private String accountName;

	private Long bindId;

	private String accessId;
	public ModifyBindAccountRequest() {
		super("cloud-siem", "2022-06-16", "ModifyBindAccount", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getCloudCode() {
		return this.cloudCode;
	}

	public void setCloudCode(String cloudCode) {
		this.cloudCode = cloudCode;
		if(cloudCode != null){
			putBodyParameter("CloudCode", cloudCode);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("AccountId", accountId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putBodyParameter("AccountName", accountName);
		}
	}

	public Long getBindId() {
		return this.bindId;
	}

	public void setBindId(Long bindId) {
		this.bindId = bindId;
		if(bindId != null){
			putBodyParameter("BindId", bindId.toString());
		}
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putBodyParameter("AccessId", accessId);
		}
	}

	@Override
	public Class<ModifyBindAccountResponse> getResponseClass() {
		return ModifyBindAccountResponse.class;
	}

}
