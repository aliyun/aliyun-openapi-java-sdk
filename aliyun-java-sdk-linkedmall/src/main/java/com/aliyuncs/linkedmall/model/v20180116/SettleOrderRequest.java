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
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SettleOrderRequest extends RpcAcsRequest<SettleOrderResponse> {
	   

	private String extInfo;

	private String outRequestNo;

	private String tradeNo;

	private String royaltyParameters;

	private String outTradeNo;
	public SettleOrderRequest() {
		super("linkedmall", "2018-01-16", "SettleOrder", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putBodyParameter("ExtInfo", extInfo);
		}
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
		if(outRequestNo != null){
			putBodyParameter("OutRequestNo", outRequestNo);
		}
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
		if(tradeNo != null){
			putBodyParameter("TradeNo", tradeNo);
		}
	}

	public String getRoyaltyParameters() {
		return this.royaltyParameters;
	}

	public void setRoyaltyParameters(String royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
		if(royaltyParameters != null){
			putBodyParameter("RoyaltyParameters", royaltyParameters);
		}
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
		if(outTradeNo != null){
			putBodyParameter("OutTradeNo", outTradeNo);
		}
	}

	@Override
	public Class<SettleOrderResponse> getResponseClass() {
		return SettleOrderResponse.class;
	}

}
