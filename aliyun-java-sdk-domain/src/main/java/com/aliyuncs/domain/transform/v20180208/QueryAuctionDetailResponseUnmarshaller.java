/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.transform.v20180208;

import com.aliyuncs.domain.model.v20180208.QueryAuctionDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAuctionDetailResponseUnmarshaller {

	public static QueryAuctionDetailResponse unmarshall(QueryAuctionDetailResponse queryAuctionDetailResponse, UnmarshallerContext context) {
		
		queryAuctionDetailResponse.setRequestId(context.stringValue("QueryAuctionDetailResponse.RequestId"));
		queryAuctionDetailResponse.setDomainName(context.stringValue("QueryAuctionDetailResponse.DomainName"));
		queryAuctionDetailResponse.setAuctionId(context.stringValue("QueryAuctionDetailResponse.AuctionId"));
		queryAuctionDetailResponse.setDomainType(context.stringValue("QueryAuctionDetailResponse.DomainType"));
		queryAuctionDetailResponse.setBookedPartner(context.stringValue("QueryAuctionDetailResponse.BookedPartner"));
		queryAuctionDetailResponse.setPartnerType(context.stringValue("QueryAuctionDetailResponse.PartnerType"));
		queryAuctionDetailResponse.setCurrency(context.stringValue("QueryAuctionDetailResponse.Currency"));
		queryAuctionDetailResponse.setYourCurrentBid(context.floatValue("QueryAuctionDetailResponse.YourCurrentBid"));
		queryAuctionDetailResponse.setYourMaxBid(context.floatValue("QueryAuctionDetailResponse.YourMaxBid"));
		queryAuctionDetailResponse.setHighBid(context.floatValue("QueryAuctionDetailResponse.HighBid"));
		queryAuctionDetailResponse.setNextValidBid(context.floatValue("QueryAuctionDetailResponse.NextValidBid"));
		queryAuctionDetailResponse.setReserveMet(context.booleanValue("QueryAuctionDetailResponse.ReserveMet"));
		queryAuctionDetailResponse.setTransferInPrice(context.floatValue("QueryAuctionDetailResponse.TransferInPrice"));
		queryAuctionDetailResponse.setPayPrice(context.floatValue("QueryAuctionDetailResponse.PayPrice"));
		queryAuctionDetailResponse.setHighBidder(context.stringValue("QueryAuctionDetailResponse.HighBidder"));
		queryAuctionDetailResponse.setStatus(context.stringValue("QueryAuctionDetailResponse.Status"));
		queryAuctionDetailResponse.setPayStatus(context.stringValue("QueryAuctionDetailResponse.PayStatus"));
		queryAuctionDetailResponse.setProduceStatus(context.stringValue("QueryAuctionDetailResponse.ProduceStatus"));
		queryAuctionDetailResponse.setAuctionEndTime(context.longValue("QueryAuctionDetailResponse.AuctionEndTime"));
		queryAuctionDetailResponse.setBookEndTime(context.longValue("QueryAuctionDetailResponse.BookEndTime"));
		queryAuctionDetailResponse.setPayEndTime(context.longValue("QueryAuctionDetailResponse.PayEndTime"));
		queryAuctionDetailResponse.setDeliveryTime(context.longValue("QueryAuctionDetailResponse.DeliveryTime"));
		queryAuctionDetailResponse.setFailCode(context.stringValue("QueryAuctionDetailResponse.FailCode"));
	 
	 	return queryAuctionDetailResponse;
	}
}