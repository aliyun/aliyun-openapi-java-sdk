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

import com.aliyuncs.sofa.model.v20190815.QueryTSJobItemByNameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSJobItemByNameResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSJobItemByNameResponseUnmarshaller {

	public static QueryTSJobItemByNameResponse unmarshall(QueryTSJobItemByNameResponse queryTSJobItemByNameResponse, UnmarshallerContext _ctx) {
		
		queryTSJobItemByNameResponse.setRequestId(_ctx.stringValue("QueryTSJobItemByNameResponse.RequestId"));
		queryTSJobItemByNameResponse.setResultCode(_ctx.stringValue("QueryTSJobItemByNameResponse.ResultCode"));
		queryTSJobItemByNameResponse.setResultMessage(_ctx.stringValue("QueryTSJobItemByNameResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSJobItemByNameResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setApp(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].App"));
			dataItem.setCron(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Cron"));
			dataItem.setDes(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Des"));
			dataItem.setFailHandleStrategy(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].FailHandleStrategy"));
			dataItem.setId(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Id"));
			dataItem.setInstanceId(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].InstanceId"));
			dataItem.setInvokeType(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].InvokeType"));
			dataItem.setJobItemId(_ctx.longValue("QueryTSJobItemByNameResponse.Data["+ i +"].JobItemId"));
			dataItem.setMisfireStrategy(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].MisfireStrategy"));
			dataItem.setName(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Name"));
			dataItem.setRouteStrategy(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].RouteStrategy"));
			dataItem.setSofarouterGroup(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].SofarouterGroup"));
			dataItem.setTimeout(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Timeout"));
			dataItem.setTimeUnit(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].TimeUnit"));
			dataItem.setTimeZone(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].TimeZone"));
			dataItem.setTriggerMode(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].TriggerMode"));
			dataItem.setTriggerType(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].TriggerType"));
			dataItem.setType(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Type"));
			dataItem.setZone(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Zone"));

			List<String> handlers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryTSJobItemByNameResponse.Data["+ i +"].Handlers.Length"); j++) {
				handlers.add(_ctx.stringValue("QueryTSJobItemByNameResponse.Data["+ i +"].Handlers["+ j +"]"));
			}
			dataItem.setHandlers(handlers);

			data.add(dataItem);
		}
		queryTSJobItemByNameResponse.setData(data);
	 
	 	return queryTSJobItemByNameResponse;
	}
}