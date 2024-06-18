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

package com.aliyuncs.domain.model.v20180208;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitPurchaseInfoRequest extends RpcAcsRequest<SubmitPurchaseInfoResponse> {
	   

	private List<String> purchaseProofss;

	private Double purchasePrice;

	private String purchaseCurrency;

	private String bizId;
	public SubmitPurchaseInfoRequest() {
		super("Domain", "2018-02-08", "SubmitPurchaseInfo", "domain");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getPurchaseProofss() {
		return this.purchaseProofss;
	}

	public void setPurchaseProofss(List<String> purchaseProofss) {
		this.purchaseProofss = purchaseProofss;	
		if (purchaseProofss != null) {
			for (int i = 0; i < purchaseProofss.size(); i++) {
				putBodyParameter("PurchaseProofs." + (i + 1) , purchaseProofss.get(i));
			}
		}	
	}

	public Double getPurchasePrice() {
		return this.purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
		if(purchasePrice != null){
			putBodyParameter("PurchasePrice", purchasePrice.toString());
		}
	}

	public String getPurchaseCurrency() {
		return this.purchaseCurrency;
	}

	public void setPurchaseCurrency(String purchaseCurrency) {
		this.purchaseCurrency = purchaseCurrency;
		if(purchaseCurrency != null){
			putBodyParameter("PurchaseCurrency", purchaseCurrency);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	@Override
	public Class<SubmitPurchaseInfoResponse> getResponseClass() {
		return SubmitPurchaseInfoResponse.class;
	}

}
