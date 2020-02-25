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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderIdByPayIdRequest extends RpcAcsRequest<QueryOrderIdByPayIdResponse> {
	   

	private String thirdPartyUserId;

	private String bizUid;

	private String paymentId;

	private String bizId;

	private String accountType;

	private Boolean useAnonymousTbAccount;
	public QueryOrderIdByPayIdRequest() {
		super("linkedmall", "2018-01-16", "QueryOrderIdByPayId");
		setMethod(MethodType.POST);
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}

	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
		if(thirdPartyUserId != null){
			putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
		}
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public String getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
		if(paymentId != null){
			putQueryParameter("PaymentId", paymentId);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
		}
	}

	public Boolean getUseAnonymousTbAccount() {
		return this.useAnonymousTbAccount;
	}

	public void setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
		this.useAnonymousTbAccount = useAnonymousTbAccount;
		if(useAnonymousTbAccount != null){
			putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount.toString());
		}
	}

	@Override
	public Class<QueryOrderIdByPayIdResponse> getResponseClass() {
		return QueryOrderIdByPayIdResponse.class;
	}

}
