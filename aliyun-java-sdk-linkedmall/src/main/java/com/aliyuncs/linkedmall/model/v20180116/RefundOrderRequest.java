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
public class RefundOrderRequest extends RpcAcsRequest<RefundOrderResponse> {
	   

	private String extInfo;

	private String tradeNo;

	private String refundReason;

	private String outRequestNo;

	private String refundRoyaltyParameters;

	private String merchantId;

	private String refundAmount;

	private String outTradeNo;
	public RefundOrderRequest() {
		super("linkedmall", "2018-01-16", "RefundOrder", "linkedmall");
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

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
		if(tradeNo != null){
			putBodyParameter("TradeNo", tradeNo);
		}
	}

	public String getRefundReason() {
		return this.refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
		if(refundReason != null){
			putBodyParameter("RefundReason", refundReason);
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

	public String getRefundRoyaltyParameters() {
		return this.refundRoyaltyParameters;
	}

	public void setRefundRoyaltyParameters(String refundRoyaltyParameters) {
		this.refundRoyaltyParameters = refundRoyaltyParameters;
		if(refundRoyaltyParameters != null){
			putBodyParameter("RefundRoyaltyParameters", refundRoyaltyParameters);
		}
	}

	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
		if(merchantId != null){
			putBodyParameter("MerchantId", merchantId);
		}
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
		if(refundAmount != null){
			putBodyParameter("RefundAmount", refundAmount);
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
	public Class<RefundOrderResponse> getResponseClass() {
		return RefundOrderResponse.class;
	}

}
