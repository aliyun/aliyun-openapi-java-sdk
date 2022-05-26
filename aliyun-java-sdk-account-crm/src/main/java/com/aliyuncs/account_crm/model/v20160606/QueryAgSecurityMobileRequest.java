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
public class QueryAgSecurityMobileRequest extends RpcAcsRequest<QueryAgSecurityMobileResponse> {
	   

	private String appName;

	private String mpk;

	private String pk;

	private String agAccountType;
	public QueryAgSecurityMobileRequest() {
		super("account-crm", "2016-06-06", "QueryAgSecurityMobile");
		setMethod(MethodType.POST);
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

	public String getMpk() {
		return this.mpk;
	}

	public void setMpk(String mpk) {
		this.mpk = mpk;
		if(mpk != null){
			putQueryParameter("Mpk", mpk);
		}
	}

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk);
		}
	}

	public String getAgAccountType() {
		return this.agAccountType;
	}

	public void setAgAccountType(String agAccountType) {
		this.agAccountType = agAccountType;
		if(agAccountType != null){
			putQueryParameter("AgAccountType", agAccountType);
		}
	}

	@Override
	public Class<QueryAgSecurityMobileResponse> getResponseClass() {
		return QueryAgSecurityMobileResponse.class;
	}

}
