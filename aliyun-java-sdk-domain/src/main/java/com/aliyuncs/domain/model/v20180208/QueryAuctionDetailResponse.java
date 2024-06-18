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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180208.QueryAuctionDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAuctionDetailResponse extends AcsResponse {

	private String status;

	private Boolean reserveMet;

	private Float highBid;

	private Long deliveryTime;

	private Float transferInPrice;

	private Float nextValidBid;

	private String produceStatus;

	private String highBidder;

	private String bookedPartner;

	private String currency;

	private String domainName;

	private Float yourCurrentBid;

	private String failCode;

	private Long auctionEndTime;

	private Long bookEndTime;

	private Long payEndTime;

	private String payStatus;

	private String requestId;

	private Float yourMaxBid;

	private Float payPrice;

	private String auctionId;

	private String partnerType;

	private String domainType;

	private Float reservePrice;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getReserveMet() {
		return this.reserveMet;
	}

	public void setReserveMet(Boolean reserveMet) {
		this.reserveMet = reserveMet;
	}

	public Float getHighBid() {
		return this.highBid;
	}

	public void setHighBid(Float highBid) {
		this.highBid = highBid;
	}

	public Long getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(Long deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Float getTransferInPrice() {
		return this.transferInPrice;
	}

	public void setTransferInPrice(Float transferInPrice) {
		this.transferInPrice = transferInPrice;
	}

	public Float getNextValidBid() {
		return this.nextValidBid;
	}

	public void setNextValidBid(Float nextValidBid) {
		this.nextValidBid = nextValidBid;
	}

	public String getProduceStatus() {
		return this.produceStatus;
	}

	public void setProduceStatus(String produceStatus) {
		this.produceStatus = produceStatus;
	}

	public String getHighBidder() {
		return this.highBidder;
	}

	public void setHighBidder(String highBidder) {
		this.highBidder = highBidder;
	}

	public String getBookedPartner() {
		return this.bookedPartner;
	}

	public void setBookedPartner(String bookedPartner) {
		this.bookedPartner = bookedPartner;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public Float getYourCurrentBid() {
		return this.yourCurrentBid;
	}

	public void setYourCurrentBid(Float yourCurrentBid) {
		this.yourCurrentBid = yourCurrentBid;
	}

	public String getFailCode() {
		return this.failCode;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public Long getAuctionEndTime() {
		return this.auctionEndTime;
	}

	public void setAuctionEndTime(Long auctionEndTime) {
		this.auctionEndTime = auctionEndTime;
	}

	public Long getBookEndTime() {
		return this.bookEndTime;
	}

	public void setBookEndTime(Long bookEndTime) {
		this.bookEndTime = bookEndTime;
	}

	public Long getPayEndTime() {
		return this.payEndTime;
	}

	public void setPayEndTime(Long payEndTime) {
		this.payEndTime = payEndTime;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Float getYourMaxBid() {
		return this.yourMaxBid;
	}

	public void setYourMaxBid(Float yourMaxBid) {
		this.yourMaxBid = yourMaxBid;
	}

	public Float getPayPrice() {
		return this.payPrice;
	}

	public void setPayPrice(Float payPrice) {
		this.payPrice = payPrice;
	}

	public String getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
	}

	public String getPartnerType() {
		return this.partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public Float getReservePrice() {
		return this.reservePrice;
	}

	public void setReservePrice(Float reservePrice) {
		this.reservePrice = reservePrice;
	}

	@Override
	public QueryAuctionDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryAuctionDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
