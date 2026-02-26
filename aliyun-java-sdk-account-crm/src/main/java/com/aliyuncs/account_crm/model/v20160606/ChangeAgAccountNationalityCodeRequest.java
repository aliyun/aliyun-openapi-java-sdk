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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ChangeAgAccountNationalityCodeRequest extends RpcAcsRequest<ChangeAgAccountNationalityCodeResponse> {
	   

	private String nationalityCode;

	private String mpk;

	private String appName;

	private String pK;
	public ChangeAgAccountNationalityCodeRequest() {
		super("account-crm", "2016-06-06", "ChangeAgAccountNationalityCode");
		setMethod(MethodType.POST);
	}

	public String getNationalityCode() {
		return this.nationalityCode;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
		if(nationalityCode != null){
			putQueryParameter("NationalityCode", nationalityCode);
		}
	}

	public String getMpk() {
		return this.mpk;
	}

	public void setMpk(String mpk) {
		this.mpk = mpk;
		if(mpk != null){
			putQueryParameter("Mpk", mpk);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	@Override
	public Class<ChangeAgAccountNationalityCodeResponse> getResponseClass() {
		return ChangeAgAccountNationalityCodeResponse.class;
	}

}
