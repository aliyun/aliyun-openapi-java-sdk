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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ComplementTrademarkApplicationRequest extends RpcAcsRequest<ComplementTrademarkApplicationResponse> {
	   

	private String trademarkComment;

	private String orderData;

	private String source;

	private String materialId;

	private String authorizationOssKey;

	private String trademarkIconOssKey;

	private String trademarkName;

	private Boolean isBlackIcon;

	private String trademarkNameType;

	private String bizId;

	private String agreementId;

	private Integer trademarkType;
	public ComplementTrademarkApplicationRequest() {
		super("Trademark", "2019-09-02", "ComplementTrademarkApplication");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTrademarkComment() {
		return this.trademarkComment;
	}

	public void setTrademarkComment(String trademarkComment) {
		this.trademarkComment = trademarkComment;
		if(trademarkComment != null){
			putQueryParameter("TrademarkComment", trademarkComment);
		}
	}

	public String getOrderData() {
		return this.orderData;
	}

	public void setOrderData(String orderData) {
		this.orderData = orderData;
		if(orderData != null){
			putQueryParameter("OrderData", orderData);
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

	public String getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putQueryParameter("MaterialId", materialId);
		}
	}

	public String getAuthorizationOssKey() {
		return this.authorizationOssKey;
	}

	public void setAuthorizationOssKey(String authorizationOssKey) {
		this.authorizationOssKey = authorizationOssKey;
		if(authorizationOssKey != null){
			putQueryParameter("AuthorizationOssKey", authorizationOssKey);
		}
	}

	public String getTrademarkIconOssKey() {
		return this.trademarkIconOssKey;
	}

	public void setTrademarkIconOssKey(String trademarkIconOssKey) {
		this.trademarkIconOssKey = trademarkIconOssKey;
		if(trademarkIconOssKey != null){
			putQueryParameter("TrademarkIconOssKey", trademarkIconOssKey);
		}
	}

	public String getTrademarkName() {
		return this.trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
		if(trademarkName != null){
			putQueryParameter("TrademarkName", trademarkName);
		}
	}

	public Boolean getIsBlackIcon() {
		return this.isBlackIcon;
	}

	public void setIsBlackIcon(Boolean isBlackIcon) {
		this.isBlackIcon = isBlackIcon;
		if(isBlackIcon != null){
			putQueryParameter("IsBlackIcon", isBlackIcon.toString());
		}
	}

	public String getTrademarkNameType() {
		return this.trademarkNameType;
	}

	public void setTrademarkNameType(String trademarkNameType) {
		this.trademarkNameType = trademarkNameType;
		if(trademarkNameType != null){
			putQueryParameter("TrademarkNameType", trademarkNameType);
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

	public String getAgreementId() {
		return this.agreementId;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
		if(agreementId != null){
			putQueryParameter("AgreementId", agreementId);
		}
	}

	public Integer getTrademarkType() {
		return this.trademarkType;
	}

	public void setTrademarkType(Integer trademarkType) {
		this.trademarkType = trademarkType;
		if(trademarkType != null){
			putQueryParameter("TrademarkType", trademarkType.toString());
		}
	}

	@Override
	public Class<ComplementTrademarkApplicationResponse> getResponseClass() {
		return ComplementTrademarkApplicationResponse.class;
	}

}
