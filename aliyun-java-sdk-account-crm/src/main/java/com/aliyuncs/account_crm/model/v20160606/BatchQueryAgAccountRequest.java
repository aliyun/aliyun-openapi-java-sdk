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
public class BatchQueryAgAccountRequest extends RpcAcsRequest<BatchQueryAgAccountResponse> {
	   

	private String mpk;

	private String pkList;
	public BatchQueryAgAccountRequest() {
		super("account-crm", "2016-06-06", "BatchQueryAgAccount");
		setMethod(MethodType.POST);
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

	public String getPkList() {
		return this.pkList;
	}

	public void setPkList(String pkList) {
		this.pkList = pkList;
		if(pkList != null){
			putQueryParameter("PkList", pkList);
		}
	}

	@Override
	public Class<BatchQueryAgAccountResponse> getResponseClass() {
		return BatchQueryAgAccountResponse.class;
	}

}
