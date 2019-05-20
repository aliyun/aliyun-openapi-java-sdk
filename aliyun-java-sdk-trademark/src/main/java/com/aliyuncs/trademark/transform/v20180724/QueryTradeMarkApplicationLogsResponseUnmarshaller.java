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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationLogsResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeMarkApplicationLogsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeMarkApplicationLogsResponseUnmarshaller {

	public static QueryTradeMarkApplicationLogsResponse unmarshall(QueryTradeMarkApplicationLogsResponse queryTradeMarkApplicationLogsResponse, UnmarshallerContext context) {
		
		queryTradeMarkApplicationLogsResponse.setRequestId(context.stringValue("QueryTradeMarkApplicationLogsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("QueryTradeMarkApplicationLogsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBizId(context.stringValue("QueryTradeMarkApplicationLogsResponse.Data["+ i +"].BizId"));
			dataItem.setNote(context.stringValue("QueryTradeMarkApplicationLogsResponse.Data["+ i +"].Note"));
			dataItem.setOperateType(context.integerValue("QueryTradeMarkApplicationLogsResponse.Data["+ i +"].OperateType"));
			dataItem.setOperateTime(context.longValue("QueryTradeMarkApplicationLogsResponse.Data["+ i +"].OperateTime"));
			dataItem.setBizStatus(context.integerValue("QueryTradeMarkApplicationLogsResponse.Data["+ i +"].BizStatus"));

			data.add(dataItem);
		}
		queryTradeMarkApplicationLogsResponse.setData(data);
	 
	 	return queryTradeMarkApplicationLogsResponse;
	}
}