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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180208.QueryAuctionsResponse;
import com.aliyuncs.domain.model.v20180208.QueryAuctionsResponse.AuctionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAuctionsResponseUnmarshaller {

	public static QueryAuctionsResponse unmarshall(QueryAuctionsResponse queryAuctionsResponse, UnmarshallerContext context) {
		
		queryAuctionsResponse.setRequestId(context.stringValue("QueryAuctionsResponse.RequestId"));
		queryAuctionsResponse.setTotalItemNum(context.integerValue("QueryAuctionsResponse.TotalItemNum"));
		queryAuctionsResponse.setCurrentPageNum(context.integerValue("QueryAuctionsResponse.CurrentPageNum"));
		queryAuctionsResponse.setPageSize(context.integerValue("QueryAuctionsResponse.PageSize"));
		queryAuctionsResponse.setTotalPageNum(context.integerValue("QueryAuctionsResponse.TotalPageNum"));

		List<AuctionDetail> data = new ArrayList<AuctionDetail>();
		for (int i = 0; i < context.lengthValue("QueryAuctionsResponse.Data.Length"); i++) {
			AuctionDetail auctionDetail = new AuctionDetail();
			auctionDetail.setDomainName(context.stringValue("QueryAuctionsResponse.Data["+ i +"].DomainName"));
			auctionDetail.setAuctionId(context.stringValue("QueryAuctionsResponse.Data["+ i +"].AuctionId"));
			auctionDetail.setDomainType(context.stringValue("QueryAuctionsResponse.Data["+ i +"].DomainType"));
			auctionDetail.setBookedPartner(context.stringValue("QueryAuctionsResponse.Data["+ i +"].BookedPartner"));
			auctionDetail.setPartnerType(context.stringValue("QueryAuctionsResponse.Data["+ i +"].PartnerType"));
			auctionDetail.setCurrency(context.stringValue("QueryAuctionsResponse.Data["+ i +"].Currency"));
			auctionDetail.setYourCurrentBid(context.floatValue("QueryAuctionsResponse.Data["+ i +"].YourCurrentBid"));
			auctionDetail.setYourMaxBid(context.floatValue("QueryAuctionsResponse.Data["+ i +"].YourMaxBid"));
			auctionDetail.setHighBid(context.floatValue("QueryAuctionsResponse.Data["+ i +"].HighBid"));
			auctionDetail.setNextValidBid(context.floatValue("QueryAuctionsResponse.Data["+ i +"].NextValidBid"));
			auctionDetail.setReserveMet(context.booleanValue("QueryAuctionsResponse.Data["+ i +"].ReserveMet"));
			auctionDetail.setTransferInPrice(context.floatValue("QueryAuctionsResponse.Data["+ i +"].TransferInPrice"));
			auctionDetail.setPayPrice(context.floatValue("QueryAuctionsResponse.Data["+ i +"].PayPrice"));
			auctionDetail.setHighBidder(context.stringValue("QueryAuctionsResponse.Data["+ i +"].HighBidder"));
			auctionDetail.setStatus(context.stringValue("QueryAuctionsResponse.Data["+ i +"].Status"));
			auctionDetail.setPayStatus(context.stringValue("QueryAuctionsResponse.Data["+ i +"].PayStatus"));
			auctionDetail.setProduceStatus(context.stringValue("QueryAuctionsResponse.Data["+ i +"].ProduceStatus"));
			auctionDetail.setAuctionEndTime(context.longValue("QueryAuctionsResponse.Data["+ i +"].AuctionEndTime"));
			auctionDetail.setBookEndTime(context.longValue("QueryAuctionsResponse.Data["+ i +"].BookEndTime"));
			auctionDetail.setPayEndTime(context.longValue("QueryAuctionsResponse.Data["+ i +"].PayEndTime"));
			auctionDetail.setDeliveryTime(context.longValue("QueryAuctionsResponse.Data["+ i +"].DeliveryTime"));
			auctionDetail.setFailCode(context.stringValue("QueryAuctionsResponse.Data["+ i +"].FailCode"));

			data.add(auctionDetail);
		}
		queryAuctionsResponse.setData(data);
	 
	 	return queryAuctionsResponse;
	}
}