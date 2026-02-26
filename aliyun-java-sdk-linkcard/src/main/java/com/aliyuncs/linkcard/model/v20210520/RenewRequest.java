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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RenewRequest extends RpcAcsRequest<RenewResponse> {
	   

	private String rechargeType;

	private String serialNo;

	private String iccid;

	private Integer buyNum;

	private String offerCode;

	private String apiProduct;

	private String apiRevision;
	public RenewRequest() {
		super("Linkcard", "2021-05-20", "Renew");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRechargeType() {
		return this.rechargeType;
	}

	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
		if(rechargeType != null){
			putQueryParameter("RechargeType", rechargeType);
		}
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putQueryParameter("SerialNo", serialNo);
		}
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public Integer getBuyNum() {
		return this.buyNum;
	}

	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
		if(buyNum != null){
			putQueryParameter("BuyNum", buyNum.toString());
		}
	}

	public String getOfferCode() {
		return this.offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
		if(offerCode != null){
			putQueryParameter("OfferCode", offerCode);
		}
	}

	public String getApiProduct() {
		return this.apiProduct;
	}

	public void setApiProduct(String apiProduct) {
		this.apiProduct = apiProduct;
		if(apiProduct != null){
			putBodyParameter("ApiProduct", apiProduct);
		}
	}

	public String getApiRevision() {
		return this.apiRevision;
	}

	public void setApiRevision(String apiRevision) {
		this.apiRevision = apiRevision;
		if(apiRevision != null){
			putBodyParameter("ApiRevision", apiRevision);
		}
	}

	@Override
	public Class<RenewResponse> getResponseClass() {
		return RenewResponse.class;
	}

}
