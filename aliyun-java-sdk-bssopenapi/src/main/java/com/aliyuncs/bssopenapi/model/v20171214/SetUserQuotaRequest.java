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
public class SetUserQuotaRequest extends RpcAcsRequest<SetUserQuotaResponse> {
	
	public SetUserQuotaRequest() {
		super("BssOpenApi", "2017-12-14", "SetUserQuota");
	}

	private Long uid;

	private String amount;

	private String outBizId;

	private String currency;

	private String bid;

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount);
		}
	}

	public String getOutBizId() {
		return this.outBizId;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
		if(outBizId != null){
			putQueryParameter("OutBizId", outBizId);
		}
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
		if(currency != null){
			putQueryParameter("Currency", currency);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	@Override
	public Class<SetUserQuotaResponse> getResponseClass() {
		return SetUserQuotaResponse.class;
	}

}
