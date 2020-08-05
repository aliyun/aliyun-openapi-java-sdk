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
public class CreateWithholdTradeRequest extends RpcAcsRequest<CreateWithholdTradeResponse> {
	   

	private String extInfo;

	private String subject;

	private String settleMode;

	private String buyerId;

	private String body;

	private String outRequestNo;

	private String goodsDetail;

	private String totalAmount;

	private String merchantId;

	private String agreementNo;

	private String outTradeNo;
	public CreateWithholdTradeRequest() {
		super("linkedmall", "2018-01-16", "CreateWithholdTrade", "linkedmall");
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

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		if(subject != null){
			putBodyParameter("Subject", subject);
		}
	}

	public String getSettleMode() {
		return this.settleMode;
	}

	public void setSettleMode(String settleMode) {
		this.settleMode = settleMode;
		if(settleMode != null){
			putBodyParameter("SettleMode", settleMode);
		}
	}

	public String getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
		if(buyerId != null){
			putBodyParameter("BuyerId", buyerId);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("Body", body);
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

	public String getGoodsDetail() {
		return this.goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
		if(goodsDetail != null){
			putBodyParameter("GoodsDetail", goodsDetail);
		}
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
		if(totalAmount != null){
			putBodyParameter("TotalAmount", totalAmount);
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

	public String getAgreementNo() {
		return this.agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
		if(agreementNo != null){
			putBodyParameter("AgreementNo", agreementNo);
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
	public Class<CreateWithholdTradeResponse> getResponseClass() {
		return CreateWithholdTradeResponse.class;
	}

}
