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

	public static QueryBidRecordsResponse unmarshall(QueryBidRecordsResponse queryBidRecordsResponse, UnmarshallerContext _ctx) {
		
		queryBidRecordsResponse.setRequestId(_ctx.stringValue("QueryBidRecordsResponse.RequestId"));
		queryBidRecordsResponse.setTotalItemNum(_ctx.integerValue("QueryBidRecordsResponse.TotalItemNum"));
		queryBidRecordsResponse.setCurrentPageNum(_ctx.integerValue("QueryBidRecordsResponse.CurrentPageNum"));
		queryBidRecordsResponse.setPageSize(_ctx.integerValue("QueryBidRecordsResponse.PageSize"));
		queryBidRecordsResponse.setTotalPageNum(_ctx.integerValue("QueryBidRecordsResponse.TotalPageNum"));

		List<BidRecord> data = new ArrayList<BidRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryBidRecordsResponse.Data.Length"); i++) {
			BidRecord bidRecord = new BidRecord();
			bidRecord.setDomainName(_ctx.stringValue("QueryBidRecordsResponse.Data["+ i +"].DomainName"));
			bidRecord.setCurrency(_ctx.stringValue("QueryBidRecordsResponse.Data["+ i +"].Currency"));
			bidRecord.setBid(_ctx.floatValue("QueryBidRecordsResponse.Data["+ i +"].Bid"));
			bidRecord.setBidTime(_ctx.longValue("QueryBidRecordsResponse.Data["+ i +"].BidTime"));
			bidRecord.setBidder(_ctx.stringValue("QueryBidRecordsResponse.Data["+ i +"].Bidder"));

			data.add(bidRecord);
		}
		queryBidRecordsResponse.setData(data);
	 
	 	return queryBidRecordsResponse;
	}
}