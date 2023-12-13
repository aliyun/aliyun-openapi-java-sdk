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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListEventSubEventResponse;
import com.aliyuncs.live.model.v20161101.ListEventSubEventResponse.LogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventSubEventResponseUnmarshaller {

	public static ListEventSubEventResponse unmarshall(ListEventSubEventResponse listEventSubEventResponse, UnmarshallerContext _ctx) {
		
		listEventSubEventResponse.setRequestId(_ctx.stringValue("ListEventSubEventResponse.RequestId"));
		listEventSubEventResponse.setCount(_ctx.longValue("ListEventSubEventResponse.Count"));
		listEventSubEventResponse.setHasMore(_ctx.booleanValue("ListEventSubEventResponse.HasMore"));

		List<LogsItem> logs = new ArrayList<LogsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventSubEventResponse.Logs.Length"); i++) {
			LogsItem logsItem = new LogsItem();
			logsItem.setAppId(_ctx.stringValue("ListEventSubEventResponse.Logs["+ i +"].AppId"));
			logsItem.setSubId(_ctx.stringValue("ListEventSubEventResponse.Logs["+ i +"].SubId"));
			logsItem.setMessageId(_ctx.stringValue("ListEventSubEventResponse.Logs["+ i +"].MessageId"));
			logsItem.setData(_ctx.stringValue("ListEventSubEventResponse.Logs["+ i +"].Data"));
			logsItem.setCost(_ctx.integerValue("ListEventSubEventResponse.Logs["+ i +"].Cost"));
			logsItem.setTime(_ctx.stringValue("ListEventSubEventResponse.Logs["+ i +"].Time"));
			logsItem.setUrl(_ctx.stringValue("ListEventSubEventResponse.Logs["+ i +"].Url"));
			logsItem.setCode(_ctx.integerValue("ListEventSubEventResponse.Logs["+ i +"].Code"));

			logs.add(logsItem);
		}
		listEventSubEventResponse.setLogs(logs);
	 
	 	return listEventSubEventResponse;
	}
}