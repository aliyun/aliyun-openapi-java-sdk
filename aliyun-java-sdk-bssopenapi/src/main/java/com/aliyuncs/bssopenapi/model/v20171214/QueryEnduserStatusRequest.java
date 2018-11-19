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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryEnduserStatusRequest extends RpcAcsRequest<QueryEnduserStatusResponse> {
	
	public QueryEnduserStatusRequest() {
		super("BssOpenApi", "2017-12-14", "QueryEnduserStatus");
	}

	private Long uid;

	private String primaryAccount;

	private String status;

	private String businessType;

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getPrimaryAccount() {
		return this.primaryAccount;
	}

	public void setPrimaryAccount(String primaryAccount) {
		this.primaryAccount = primaryAccount;
		if(primaryAccount != null){
			putQueryParameter("PrimaryAccount", primaryAccount);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
		if(businessType != null){
			putQueryParameter("BusinessType", businessType);
		}
	}

	@Override
	public Class<QueryEnduserStatusResponse> getResponseClass() {
		return QueryEnduserStatusResponse.class;
	}

}
