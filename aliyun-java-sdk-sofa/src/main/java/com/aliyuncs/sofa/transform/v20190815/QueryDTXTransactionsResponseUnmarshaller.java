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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryDTXTransactionsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDTXTransactionsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDTXTransactionsResponseUnmarshaller {

	public static QueryDTXTransactionsResponse unmarshall(QueryDTXTransactionsResponse queryDTXTransactionsResponse, UnmarshallerContext _ctx) {
		
		queryDTXTransactionsResponse.setRequestId(_ctx.stringValue("QueryDTXTransactionsResponse.RequestId"));
		queryDTXTransactionsResponse.setResultCode(_ctx.stringValue("QueryDTXTransactionsResponse.ResultCode"));
		queryDTXTransactionsResponse.setResultMessage(_ctx.stringValue("QueryDTXTransactionsResponse.ResultMessage"));
		queryDTXTransactionsResponse.setCurrentPage(_ctx.longValue("QueryDTXTransactionsResponse.CurrentPage"));
		queryDTXTransactionsResponse.setPageSize(_ctx.longValue("QueryDTXTransactionsResponse.PageSize"));
		queryDTXTransactionsResponse.setSuccess(_ctx.booleanValue("QueryDTXTransactionsResponse.Success"));
		queryDTXTransactionsResponse.setTotal(_ctx.longValue("QueryDTXTransactionsResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDTXTransactionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBizType(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].BizType"));
			dataItem.setBusinessId(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].BusinessId"));
			dataItem.setEndTime(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].EndTime"));
			dataItem.setInitiatorIp(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].InitiatorIp"));
			dataItem.setInitiatorName(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].InitiatorName"));
			dataItem.setModifyTime(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].ModifyTime"));
			dataItem.setStartTime(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].StartTime"));
			dataItem.setStatus(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].Status"));
			dataItem.setTxId(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].TxId"));

			List<String> participatorIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryDTXTransactionsResponse.Data["+ i +"].ParticipatorIds.Length"); j++) {
				participatorIds.add(_ctx.stringValue("QueryDTXTransactionsResponse.Data["+ i +"].ParticipatorIds["+ j +"]"));
			}
			dataItem.setParticipatorIds(participatorIds);

			data.add(dataItem);
		}
		queryDTXTransactionsResponse.setData(data);
	 
	 	return queryDTXTransactionsResponse;
	}
}