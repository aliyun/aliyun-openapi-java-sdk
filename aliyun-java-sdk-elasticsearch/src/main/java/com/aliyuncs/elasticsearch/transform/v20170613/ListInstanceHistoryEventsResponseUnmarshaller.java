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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceHistoryEventsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceHistoryEventsResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListInstanceHistoryEventsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceHistoryEventsResponseUnmarshaller {

	public static ListInstanceHistoryEventsResponse unmarshall(ListInstanceHistoryEventsResponse listInstanceHistoryEventsResponse, UnmarshallerContext _ctx) {
		
		listInstanceHistoryEventsResponse.setRequestId(_ctx.stringValue("ListInstanceHistoryEventsResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.longValue("ListInstanceHistoryEventsResponse.Headers.X-Total-Count"));
		headers.setXTotalFailed(_ctx.longValue("ListInstanceHistoryEventsResponse.Headers.X-Total-Failed"));
		headers.setXTotalSuccess(_ctx.longValue("ListInstanceHistoryEventsResponse.Headers.X-Total-Success"));
		listInstanceHistoryEventsResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceHistoryEventsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setEventCreateTime(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].eventCreateTime"));
			resultItem.setEventCycleStatus(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].eventCycleStatus"));
			resultItem.setEventExecuteTime(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].eventExecuteTime"));
			resultItem.setEventFinashTime(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].eventFinashTime"));
			resultItem.setEventLevel(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].eventLevel"));
			resultItem.setInstanceId(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].instanceId"));
			resultItem.setNodeIP(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].nodeIP"));
			resultItem.setEventType(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].eventType"));
			resultItem.setRegionId(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].regionId"));
			resultItem.setEcsId(_ctx.stringValue("ListInstanceHistoryEventsResponse.Result["+ i +"].ecsId"));

			result.add(resultItem);
		}
		listInstanceHistoryEventsResponse.setResult(result);
	 
	 	return listInstanceHistoryEventsResponse;
	}
}