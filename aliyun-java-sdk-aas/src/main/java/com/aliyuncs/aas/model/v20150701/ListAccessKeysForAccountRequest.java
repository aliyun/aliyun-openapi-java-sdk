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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListAccessKeysForAccountRequest extends RpcAcsRequest<ListAccessKeysForAccountResponse> {
	
	public ListAccessKeysForAccountRequest() {
		super("Aas", "2015-07-01", "ListAccessKeysForAccount");
	}

	private String aKType;

	private String aKStatus;

	private String pK;

	public String getAKType() {
		return this.aKType;
	}

	public void setAKType(String aKType) {
		this.aKType = aKType;
		if(aKType != null){
			putQueryParameter("AKType", aKType);
		}
	}

	public String getAKStatus() {
		return this.aKStatus;
	}

	public void setAKStatus(String aKStatus) {
		this.aKStatus = aKStatus;
		if(aKStatus != null){
			putQueryParameter("AKStatus", aKStatus);
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
	public Class<ListAccessKeysForAccountResponse> getResponseClass() {
		return ListAccessKeysForAccountResponse.class;
	}

}
