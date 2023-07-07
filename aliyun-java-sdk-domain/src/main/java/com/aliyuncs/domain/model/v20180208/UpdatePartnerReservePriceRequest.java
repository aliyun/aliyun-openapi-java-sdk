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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdatePartnerReservePriceRequest extends RpcAcsRequest<UpdatePartnerReservePriceResponse> {
	   

	private String partnerType;

	private String domainName;

	private Integer biddingId;

	private Double reservePrice;
	public UpdatePartnerReservePriceRequest() {
		super("Domain", "2018-02-08", "UpdatePartnerReservePrice");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPartnerType() {
		return this.partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
		if(partnerType != null){
			putBodyParameter("PartnerType", partnerType);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	public Integer getBiddingId() {
		return this.biddingId;
	}

	public void setBiddingId(Integer biddingId) {
		this.biddingId = biddingId;
		if(biddingId != null){
			putBodyParameter("BiddingId", biddingId.toString());
		}
	}

	public Double getReservePrice() {
		return this.reservePrice;
	}

	public void setReservePrice(Double reservePrice) {
		this.reservePrice = reservePrice;
		if(reservePrice != null){
			putBodyParameter("ReservePrice", reservePrice.toString());
		}
	}

	@Override
	public Class<UpdatePartnerReservePriceResponse> getResponseClass() {
		return UpdatePartnerReservePriceResponse.class;
	}

}
