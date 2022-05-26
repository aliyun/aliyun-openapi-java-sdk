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
public class QueryEnterpriseInfoRequest extends RpcAcsRequest<QueryEnterpriseInfoResponse> {
	   

	private String enterpriseVersion;

	private String pK;

	private String havanaId;
	public QueryEnterpriseInfoRequest() {
		super("account-crm", "2016-06-06", "QueryEnterpriseInfo");
		setMethod(MethodType.POST);
	}

	public String getEnterpriseVersion() {
		return this.enterpriseVersion;
	}

	public void setEnterpriseVersion(String enterpriseVersion) {
		this.enterpriseVersion = enterpriseVersion;
		if(enterpriseVersion != null){
			putQueryParameter("EnterpriseVersion", enterpriseVersion);
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

	public String getHavanaId() {
		return this.havanaId;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
		if(havanaId != null){
			putQueryParameter("HavanaId", havanaId);
		}
	}

	@Override
	public Class<QueryEnterpriseInfoResponse> getResponseClass() {
		return QueryEnterpriseInfoResponse.class;
	}

}
