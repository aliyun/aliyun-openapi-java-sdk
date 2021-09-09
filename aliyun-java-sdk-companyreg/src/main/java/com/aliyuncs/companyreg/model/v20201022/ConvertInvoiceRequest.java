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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConvertInvoiceRequest extends RpcAcsRequest<ConvertInvoiceResponse> {
	   

	private Boolean isFee;

	private String shellMethod;

	private String kind;

	private String use;

	private String thirdKey;

	private String payer;

	private String secondKey;

	private String payMethod;

	private String buyMethod;

	private String fixedAssetType;

	private String firstKey;

	private String bizId;

	private Long id;

	private String buyTarget;
	public ConvertInvoiceRequest() {
		super("companyreg", "2020-10-22", "ConvertInvoice", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsFee() {
		return this.isFee;
	}

	public void setIsFee(Boolean isFee) {
		this.isFee = isFee;
		if(isFee != null){
			putQueryParameter("IsFee", isFee.toString());
		}
	}

	public String getShellMethod() {
		return this.shellMethod;
	}

	public void setShellMethod(String shellMethod) {
		this.shellMethod = shellMethod;
		if(shellMethod != null){
			putQueryParameter("ShellMethod", shellMethod);
		}
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
		if(kind != null){
			putQueryParameter("Kind", kind);
		}
	}

	public String getUse() {
		return this.use;
	}

	public void setUse(String use) {
		this.use = use;
		if(use != null){
			putQueryParameter("Use", use);
		}
	}

	public String getThirdKey() {
		return this.thirdKey;
	}

	public void setThirdKey(String thirdKey) {
		this.thirdKey = thirdKey;
		if(thirdKey != null){
			putQueryParameter("ThirdKey", thirdKey);
		}
	}

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
		if(payer != null){
			putQueryParameter("Payer", payer);
		}
	}

	public String getSecondKey() {
		return this.secondKey;
	}

	public void setSecondKey(String secondKey) {
		this.secondKey = secondKey;
		if(secondKey != null){
			putQueryParameter("SecondKey", secondKey);
		}
	}

	public String getPayMethod() {
		return this.payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
		if(payMethod != null){
			putQueryParameter("PayMethod", payMethod);
		}
	}

	public String getBuyMethod() {
		return this.buyMethod;
	}

	public void setBuyMethod(String buyMethod) {
		this.buyMethod = buyMethod;
		if(buyMethod != null){
			putQueryParameter("BuyMethod", buyMethod);
		}
	}

	public String getFixedAssetType() {
		return this.fixedAssetType;
	}

	public void setFixedAssetType(String fixedAssetType) {
		this.fixedAssetType = fixedAssetType;
		if(fixedAssetType != null){
			putQueryParameter("FixedAssetType", fixedAssetType);
		}
	}

	public String getFirstKey() {
		return this.firstKey;
	}

	public void setFirstKey(String firstKey) {
		this.firstKey = firstKey;
		if(firstKey != null){
			putQueryParameter("FirstKey", firstKey);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getBuyTarget() {
		return this.buyTarget;
	}

	public void setBuyTarget(String buyTarget) {
		this.buyTarget = buyTarget;
		if(buyTarget != null){
			putQueryParameter("BuyTarget", buyTarget);
		}
	}

	@Override
	public Class<ConvertInvoiceResponse> getResponseClass() {
		return ConvertInvoiceResponse.class;
	}

}
