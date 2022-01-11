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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180208.QueryAuctionsResponse;
import com.aliyuncs.domain.model.v20180208.QueryAuctionsResponse.AuctionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAuctionsResponseUnmarshaller {

	public static QueryAuctionsResponse unmarshall(QueryAuctionsResponse queryAuctionsResponse, UnmarshallerContext _ctx) {
		
		queryAuctionsResponse.setRequestId(_ctx.stringValue("QueryAuctionsResponse.RequestId"));
		queryAuctionsResponse.setCurrentPageNum(_ctx.integerValue("QueryAuctionsResponse.CurrentPageNum"));
		queryAuctionsResponse.setTotalPageNum(_ctx.integerValue("QueryAuctionsResponse.TotalPageNum"));
		queryAuctionsResponse.setPageSize(_ctx.integerValue("QueryAuctionsResponse.PageSize"));
		queryAuctionsResponse.setTotalItemNum(_ctx.integerValue("QueryAuctionsResponse.TotalItemNum"));

		List<AuctionDetail> data = new ArrayList<AuctionDetail>();
		for (int i = 0; i < _ctx.lengthValue("QueryAuctionsResponse.Data.Length"); i++) {
			AuctionDetail auctionDetail = new AuctionDetail();
			auctionDetail.setStatus(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].Status"));
			auctionDetail.setReserveMet(_ctx.booleanValue("QueryAuctionsResponse.Data["+ i +"].ReserveMet"));
			auctionDetail.setHighBid(_ctx.floatValue("QueryAuctionsResponse.Data["+ i +"].HighBid"));
			auctionDetail.setDeliveryTime(_ctx.longValue("QueryAuctionsResponse.Data["+ i +"].DeliveryTime"));
			auctionDetail.setTransferInPrice(_ctx.floatValue("QueryAuctionsResponse.Data["+ i +"].TransferInPrice"));
			auctionDetail.setNextValidBid(_ctx.floatValue("QueryAuctionsResponse.Data["+ i +"].NextValidBid"));
			auctionDetail.setProduceStatus(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].ProduceStatus"));
			auctionDetail.setHighBidder(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].HighBidder"));
			auctionDetail.setBookedPartner(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].BookedPartner"));
			auctionDetail.setCurrency(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].Currency"));
			auctionDetail.setDomainName(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].DomainName"));
			auctionDetail.setYourCurrentBid(_ctx.floatValue("QueryAuctionsResponse.Data["+ i +"].YourCurrentBid"));
			auctionDetail.setFailCode(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].FailCode"));
			auctionDetail.setAuctionEndTime(_ctx.longValue("QueryAuctionsResponse.Data["+ i +"].AuctionEndTime"));
			auctionDetail.setBookEndTime(_ctx.longValue("QueryAuctionsResponse.Data["+ i +"].BookEndTime"));
			auctionDetail.setPayEndTime(_ctx.longValue("QueryAuctionsResponse.Data["+ i +"].PayEndTime"));
			auctionDetail.setPayStatus(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].PayStatus"));
			auctionDetail.setYourMaxBid(_ctx.floatValue("QueryAuctionsResponse.Data["+ i +"].YourMaxBid"));
			auctionDetail.setPayPrice(_ctx.floatValue("QueryAuctionsResponse.Data["+ i +"].PayPrice"));
			auctionDetail.setAuctionId(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].AuctionId"));
			auctionDetail.setPartnerType(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].PartnerType"));
			auctionDetail.setDomainType(_ctx.stringValue("QueryAuctionsResponse.Data["+ i +"].DomainType"));
			auctionDetail.setReserveMin(_ctx.longValue("QueryAuctionsResponse.Data["+ i +"].ReserveMin"));
			auctionDetail.setReserveMax(_ctx.longValue("QueryAuctionsResponse.Data["+ i +"].ReserveMax"));

			data.add(auctionDetail);
		}
		queryAuctionsResponse.setData(data);
	 
	 	return queryAuctionsResponse;
	}
}