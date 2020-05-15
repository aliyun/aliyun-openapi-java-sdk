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

import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceStepsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSExecuteInstanceStepsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSExecuteInstanceStepsResponseUnmarshaller {

	public static QueryTSExecuteInstanceStepsResponse unmarshall(QueryTSExecuteInstanceStepsResponse queryTSExecuteInstanceStepsResponse, UnmarshallerContext _ctx) {
		
		queryTSExecuteInstanceStepsResponse.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.RequestId"));
		queryTSExecuteInstanceStepsResponse.setResultCode(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.ResultCode"));
		queryTSExecuteInstanceStepsResponse.setResultMessage(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSExecuteInstanceStepsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setConsume(_ctx.longValue("QueryTSExecuteInstanceStepsResponse.Data["+ i +"].Consume"));
			dataItem.setGmtBegin(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.Data["+ i +"].GmtBegin"));
			dataItem.setGmtEnd(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.Data["+ i +"].GmtEnd"));
			dataItem.setHandler(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.Data["+ i +"].Handler"));
			dataItem.setRequestId(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.Data["+ i +"].RequestId"));
			dataItem.setSharding(_ctx.longValue("QueryTSExecuteInstanceStepsResponse.Data["+ i +"].Sharding"));
			dataItem.setStatus(_ctx.stringValue("QueryTSExecuteInstanceStepsResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		queryTSExecuteInstanceStepsResponse.setData(data);
	 
	 	return queryTSExecuteInstanceStepsResponse;
	}
}