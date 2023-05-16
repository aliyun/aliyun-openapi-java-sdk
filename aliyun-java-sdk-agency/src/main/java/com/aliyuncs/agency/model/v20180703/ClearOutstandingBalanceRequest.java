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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ClearOutstandingBalanceRequest extends RpcAcsRequest<ClearOutstandingBalanceResponse> {
	   

	private Long aliyunPk;

	private String debtQuota;

	private Long endUserPk;
	public ClearOutstandingBalanceRequest() {
		super("Agency", "2018-07-03", "ClearOutstandingBalance", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk.toString());
		}
	}

	public String getDebtQuota() {
		return this.debtQuota;
	}

	public void setDebtQuota(String debtQuota) {
		this.debtQuota = debtQuota;
		if(debtQuota != null){
			putQueryParameter("DebtQuota", debtQuota);
		}
	}

	public Long getEndUserPk() {
		return this.endUserPk;
	}

	public void setEndUserPk(Long endUserPk) {
		this.endUserPk = endUserPk;
		if(endUserPk != null){
			putQueryParameter("EndUserPk", endUserPk.toString());
		}
	}

	@Override
	public Class<ClearOutstandingBalanceResponse> getResponseClass() {
		return ClearOutstandingBalanceResponse.class;
	}

}
