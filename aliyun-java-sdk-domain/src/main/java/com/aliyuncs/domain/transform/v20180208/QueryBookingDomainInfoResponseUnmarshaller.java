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

import com.aliyuncs.domain.model.v20180208.QueryBookingDomainInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBookingDomainInfoResponseUnmarshaller {

	public static QueryBookingDomainInfoResponse unmarshall(QueryBookingDomainInfoResponse queryBookingDomainInfoResponse, UnmarshallerContext context) {
		
		queryBookingDomainInfoResponse.setRequestId(context.stringValue("QueryBookingDomainInfoResponse.RequestId"));
		queryBookingDomainInfoResponse.setAuctionId(context.integerValue("QueryBookingDomainInfoResponse.AuctionId"));
		queryBookingDomainInfoResponse.setPartnerType(context.stringValue("QueryBookingDomainInfoResponse.PartnerType"));
		queryBookingDomainInfoResponse.setMaxBid(context.floatValue("QueryBookingDomainInfoResponse.MaxBid"));
		queryBookingDomainInfoResponse.setTransferInPrice(context.floatValue("QueryBookingDomainInfoResponse.TransferInPrice"));
		queryBookingDomainInfoResponse.setCurrency(context.stringValue("QueryBookingDomainInfoResponse.Currency"));
		queryBookingDomainInfoResponse.setBookEndTime(context.longValue("QueryBookingDomainInfoResponse.BookEndTime"));
	 
	 	return queryBookingDomainInfoResponse;
	}
}