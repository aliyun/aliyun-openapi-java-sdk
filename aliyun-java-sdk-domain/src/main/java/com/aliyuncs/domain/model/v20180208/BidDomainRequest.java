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
public class BidDomainRequest extends RpcAcsRequest<BidDomainResponse> {
	   

	private String auctionId;

	private Float maxBid;

	private String currency;
	public BidDomainRequest() {
		super("Domain", "2018-02-08", "BidDomain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
		if(auctionId != null){
			putBodyParameter("AuctionId", auctionId);
		}
	}

	public Float getMaxBid() {
		return this.maxBid;
	}

	public void setMaxBid(Float maxBid) {
		this.maxBid = maxBid;
		if(maxBid != null){
			putBodyParameter("MaxBid", maxBid.toString());
		}
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
		if(currency != null){
			putBodyParameter("Currency", currency);
		}
	}

	@Override
	public Class<BidDomainResponse> getResponseClass() {
		return BidDomainResponse.class;
	}

}
