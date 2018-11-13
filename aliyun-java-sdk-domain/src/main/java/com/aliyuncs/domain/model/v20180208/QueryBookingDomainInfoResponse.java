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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180208.QueryBookingDomainInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBookingDomainInfoResponse extends AcsResponse {

	private String requestId;

	private Integer auctionId;

	private String partnerType;

	private Float maxBid;

	private Float transferInPrice;

	private String currency;

	private Long bookEndTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(Integer auctionId) {
		this.auctionId = auctionId;
	}

	public String getPartnerType() {
		return this.partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public Float getMaxBid() {
		return this.maxBid;
	}

	public void setMaxBid(Float maxBid) {
		this.maxBid = maxBid;
	}

	public Float getTransferInPrice() {
		return this.transferInPrice;
	}

	public void setTransferInPrice(Float transferInPrice) {
		this.transferInPrice = transferInPrice;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getBookEndTime() {
		return this.bookEndTime;
	}

	public void setBookEndTime(Long bookEndTime) {
		this.bookEndTime = bookEndTime;
	}

	@Override
	public QueryBookingDomainInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryBookingDomainInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
