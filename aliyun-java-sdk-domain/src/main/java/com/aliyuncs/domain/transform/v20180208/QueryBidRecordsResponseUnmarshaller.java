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

import com.aliyuncs.domain.model.v20180208.QueryBidRecordsResponse;
import com.aliyuncs.domain.model.v20180208.QueryBidRecordsResponse.BidRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBidRecordsResponseUnmarshaller {

	public static QueryBidRecordsResponse unmarshall(QueryBidRecordsResponse queryBidRecordsResponse, UnmarshallerContext context) {
		
		queryBidRecordsResponse.setRequestId(context.stringValue("QueryBidRecordsResponse.RequestId"));
		queryBidRecordsResponse.setTotalItemNum(context.integerValue("QueryBidRecordsResponse.TotalItemNum"));
		queryBidRecordsResponse.setCurrentPageNum(context.integerValue("QueryBidRecordsResponse.CurrentPageNum"));
		queryBidRecordsResponse.setPageSize(context.integerValue("QueryBidRecordsResponse.PageSize"));
		queryBidRecordsResponse.setTotalPageNum(context.integerValue("QueryBidRecordsResponse.TotalPageNum"));

		List<BidRecord> data = new ArrayList<BidRecord>();
		for (int i = 0; i < context.lengthValue("QueryBidRecordsResponse.Data.Length"); i++) {
			BidRecord bidRecord = new BidRecord();
			bidRecord.setDomainName(context.stringValue("QueryBidRecordsResponse.Data["+ i +"].DomainName"));
			bidRecord.setCurrency(context.stringValue("QueryBidRecordsResponse.Data["+ i +"].Currency"));
			bidRecord.setBid(context.floatValue("QueryBidRecordsResponse.Data["+ i +"].Bid"));
			bidRecord.setBidTime(context.longValue("QueryBidRecordsResponse.Data["+ i +"].BidTime"));
			bidRecord.setBidder(context.stringValue("QueryBidRecordsResponse.Data["+ i +"].Bidder"));

			data.add(bidRecord);
		}
		queryBidRecordsResponse.setData(data);
	 
	 	return queryBidRecordsResponse;
	}
}