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
public class ChangeResellerConsumeAmountRequest extends RpcAcsRequest<ChangeResellerConsumeAmountResponse> {
	
	public ChangeResellerConsumeAmountRequest() {
		super("BssOpenApi", "2017-12-14", "ChangeResellerConsumeAmount");
	}

	private String adjustType;

	private String amount;

	private String outBizId;

	private String extendMap;

	private String currency;

	private String source;

	private Long ownerId;

	private String businessType;

	public String getAdjustType() {
		return this.adjustType;
	}

	public void setAdjustType(String adjustType) {
		this.adjustType = adjustType;
		if(adjustType != null){
			putQueryParameter("AdjustType", adjustType);
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

	public String getExtendMap() {
		return this.extendMap;
	}

	public void setExtendMap(String extendMap) {
		this.extendMap = extendMap;
		if(extendMap != null){
			putQueryParameter("ExtendMap", extendMap);
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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
	public Class<ChangeResellerConsumeAmountResponse> getResponseClass() {
		return ChangeResellerConsumeAmountResponse.class;
	}

}
