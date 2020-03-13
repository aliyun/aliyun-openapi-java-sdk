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

import com.aliyuncs.sofa.model.v20190815.QueryTSJobItemsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSJobItemsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSJobItemsResponseUnmarshaller {

	public static QueryTSJobItemsResponse unmarshall(QueryTSJobItemsResponse queryTSJobItemsResponse, UnmarshallerContext _ctx) {
		
		queryTSJobItemsResponse.setRequestId(_ctx.stringValue("QueryTSJobItemsResponse.RequestId"));
		queryTSJobItemsResponse.setResultCode(_ctx.stringValue("QueryTSJobItemsResponse.ResultCode"));
		queryTSJobItemsResponse.setResultMessage(_ctx.stringValue("QueryTSJobItemsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSJobItemsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setApp(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].App"));
			dataItem.setCron(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Cron"));
			dataItem.setDes(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Des"));
			dataItem.setFailHandleStrategy(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].FailHandleStrategy"));
			dataItem.setId(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Id"));
			dataItem.setInstanceId(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].InstanceId"));
			dataItem.setInvokeType(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].InvokeType"));
			dataItem.setJobItemId(_ctx.longValue("QueryTSJobItemsResponse.Data["+ i +"].JobItemId"));
			dataItem.setMisfireStrategy(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].MisfireStrategy"));
			dataItem.setName(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Name"));
			dataItem.setRouteStrategy(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].RouteStrategy"));
			dataItem.setSofarouterGroup(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].SofarouterGroup"));
			dataItem.setTimeout(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Timeout"));
			dataItem.setTimeUnit(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].TimeUnit"));
			dataItem.setTimeZone(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].TimeZone"));
			dataItem.setTriggerMode(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].TriggerMode"));
			dataItem.setTriggerType(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].TriggerType"));
			dataItem.setType(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Type"));
			dataItem.setZone(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Zone"));

			List<String> handlers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSJobItemsResponse.Data["+ i +"].Handlers.Length"); j++) {
				handlers.add(_ctx.stringValue("QueryTSJobItemsResponse.Data["+ i +"].Handlers["+ j +"]"));
			}
			dataItem.setHandlers(handlers);

			data.add(dataItem);
		}
		queryTSJobItemsResponse.setData(data);
	 
	 	return queryTSJobItemsResponse;
	}
}