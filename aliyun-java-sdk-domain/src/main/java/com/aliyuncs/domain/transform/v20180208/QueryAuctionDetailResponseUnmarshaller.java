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

package com.aliyuncs.domain.transform.v20180208;

import com.aliyuncs.domain.model.v20180208.QueryAuctionDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAuctionDetailResponseUnmarshaller {

	public static QueryAuctionDetailResponse unmarshall(QueryAuctionDetailResponse queryAuctionDetailResponse, UnmarshallerContext _ctx) {
		
		queryAuctionDetailResponse.setRequestId(_ctx.stringValue("QueryAuctionDetailResponse.RequestId"));
		queryAuctionDetailResponse.setDomainName(_ctx.stringValue("QueryAuctionDetailResponse.DomainName"));
		queryAuctionDetailResponse.setAuctionId(_ctx.stringValue("QueryAuctionDetailResponse.AuctionId"));
		queryAuctionDetailResponse.setDomainType(_ctx.stringValue("QueryAuctionDetailResponse.DomainType"));
		queryAuctionDetailResponse.setBookedPartner(_ctx.stringValue("QueryAuctionDetailResponse.BookedPartner"));
		queryAuctionDetailResponse.setPartnerType(_ctx.stringValue("QueryAuctionDetailResponse.PartnerType"));
		queryAuctionDetailResponse.setCurrency(_ctx.stringValue("QueryAuctionDetailResponse.Currency"));
		queryAuctionDetailResponse.setYourCurrentBid(_ctx.floatValue("QueryAuctionDetailResponse.YourCurrentBid"));
		queryAuctionDetailResponse.setYourMaxBid(_ctx.floatValue("QueryAuctionDetailResponse.YourMaxBid"));
		queryAuctionDetailResponse.setHighBid(_ctx.floatValue("QueryAuctionDetailResponse.HighBid"));
		queryAuctionDetailResponse.setNextValidBid(_ctx.floatValue("QueryAuctionDetailResponse.NextValidBid"));
		queryAuctionDetailResponse.setReserveMet(_ctx.booleanValue("QueryAuctionDetailResponse.ReserveMet"));
		queryAuctionDetailResponse.setTransferInPrice(_ctx.floatValue("QueryAuctionDetailResponse.TransferInPrice"));
		queryAuctionDetailResponse.setPayPrice(_ctx.floatValue("QueryAuctionDetailResponse.PayPrice"));
		queryAuctionDetailResponse.setHighBidder(_ctx.stringValue("QueryAuctionDetailResponse.HighBidder"));
		queryAuctionDetailResponse.setStatus(_ctx.stringValue("QueryAuctionDetailResponse.Status"));
		queryAuctionDetailResponse.setPayStatus(_ctx.stringValue("QueryAuctionDetailResponse.PayStatus"));
		queryAuctionDetailResponse.setProduceStatus(_ctx.stringValue("QueryAuctionDetailResponse.ProduceStatus"));
		queryAuctionDetailResponse.setAuctionEndTime(_ctx.longValue("QueryAuctionDetailResponse.AuctionEndTime"));
		queryAuctionDetailResponse.setBookEndTime(_ctx.longValue("QueryAuctionDetailResponse.BookEndTime"));
		queryAuctionDetailResponse.setPayEndTime(_ctx.longValue("QueryAuctionDetailResponse.PayEndTime"));
		queryAuctionDetailResponse.setDeliveryTime(_ctx.longValue("QueryAuctionDetailResponse.DeliveryTime"));
		queryAuctionDetailResponse.setFailCode(_ctx.stringValue("QueryAuctionDetailResponse.FailCode"));
	 
	 	return queryAuctionDetailResponse;
	}
}