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

import com.aliyuncs.domain.model.v20180208.QueryBrokerDemandRecordResponse;
import com.aliyuncs.domain.model.v20180208.QueryBrokerDemandRecordResponse.BrokerDemandRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBrokerDemandRecordResponseUnmarshaller {

	public static QueryBrokerDemandRecordResponse unmarshall(QueryBrokerDemandRecordResponse queryBrokerDemandRecordResponse, UnmarshallerContext _ctx) {
		
		queryBrokerDemandRecordResponse.setRequestId(_ctx.stringValue("QueryBrokerDemandRecordResponse.RequestId"));
		queryBrokerDemandRecordResponse.setTotalItemNum(_ctx.integerValue("QueryBrokerDemandRecordResponse.TotalItemNum"));
		queryBrokerDemandRecordResponse.setCurrentPageNum(_ctx.integerValue("QueryBrokerDemandRecordResponse.CurrentPageNum"));
		queryBrokerDemandRecordResponse.setPageSize(_ctx.integerValue("QueryBrokerDemandRecordResponse.PageSize"));
		queryBrokerDemandRecordResponse.setTotalPageNum(_ctx.integerValue("QueryBrokerDemandRecordResponse.TotalPageNum"));

		List<BrokerDemandRecord> data = new ArrayList<BrokerDemandRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryBrokerDemandRecordResponse.Data.Length"); i++) {
			BrokerDemandRecord brokerDemandRecord = new BrokerDemandRecord();
			brokerDemandRecord.setBizId(_ctx.stringValue("QueryBrokerDemandRecordResponse.Data["+ i +"].BizId"));
			brokerDemandRecord.setDescription(_ctx.stringValue("QueryBrokerDemandRecordResponse.Data["+ i +"].Description"));
			brokerDemandRecord.setCreateTime(_ctx.longValue("QueryBrokerDemandRecordResponse.Data["+ i +"].CreateTime"));

			data.add(brokerDemandRecord);
		}
		queryBrokerDemandRecordResponse.setData(data);
	 
	 	return queryBrokerDemandRecordResponse;
	}
}