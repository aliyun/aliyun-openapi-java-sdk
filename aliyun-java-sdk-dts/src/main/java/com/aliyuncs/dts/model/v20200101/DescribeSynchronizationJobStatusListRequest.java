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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSynchronizationJobStatusListRequest extends RpcAcsRequest<DescribeSynchronizationJobStatusListResponse> {
	   

	private String clientToken;

	private String ownerId;

	private String synchronizationJobIdListJsonStr;

	private String accountId;
	public DescribeSynchronizationJobStatusListRequest() {
		super("Dts", "2020-01-01", "DescribeSynchronizationJobStatusList", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getSynchronizationJobIdListJsonStr() {
		return this.synchronizationJobIdListJsonStr;
	}

	public void setSynchronizationJobIdListJsonStr(String synchronizationJobIdListJsonStr) {
		this.synchronizationJobIdListJsonStr = synchronizationJobIdListJsonStr;
		if(synchronizationJobIdListJsonStr != null){
			putQueryParameter("SynchronizationJobIdListJsonStr", synchronizationJobIdListJsonStr);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	@Override
	public Class<DescribeSynchronizationJobStatusListResponse> getResponseClass() {
		return DescribeSynchronizationJobStatusListResponse.class;
	}

}
