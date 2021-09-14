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

package com.aliyuncs.emas_dmp.model.v20210402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_dmp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushTargetAudienceRequest extends RpcAcsRequest<PushTargetAudienceResponse> {
	   

	private String accountId;

	private String taIds;
	public PushTargetAudienceRequest() {
		super("emas-dmp", "2021-04-02", "PushTargetAudience");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getTaIds() {
		return this.taIds;
	}

	public void setTaIds(String taIds) {
		this.taIds = taIds;
		if(taIds != null){
			putBodyParameter("TaIds", taIds);
		}
	}

	@Override
	public Class<PushTargetAudienceResponse> getResponseClass() {
		return PushTargetAudienceResponse.class;
	}

}
