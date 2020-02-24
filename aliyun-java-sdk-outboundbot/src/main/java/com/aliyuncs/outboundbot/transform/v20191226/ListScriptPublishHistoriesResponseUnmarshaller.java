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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListScriptPublishHistoriesResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListScriptPublishHistoriesResponse.ScriptPublishHistories;
import com.aliyuncs.outboundbot.model.v20191226.ListScriptPublishHistoriesResponse.ScriptPublishHistories.PublishHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScriptPublishHistoriesResponseUnmarshaller {

	public static ListScriptPublishHistoriesResponse unmarshall(ListScriptPublishHistoriesResponse listScriptPublishHistoriesResponse, UnmarshallerContext _ctx) {
		
		listScriptPublishHistoriesResponse.setRequestId(_ctx.stringValue("ListScriptPublishHistoriesResponse.RequestId"));
		listScriptPublishHistoriesResponse.setSuccess(_ctx.booleanValue("ListScriptPublishHistoriesResponse.Success"));
		listScriptPublishHistoriesResponse.setCode(_ctx.stringValue("ListScriptPublishHistoriesResponse.Code"));
		listScriptPublishHistoriesResponse.setMessage(_ctx.stringValue("ListScriptPublishHistoriesResponse.Message"));
		listScriptPublishHistoriesResponse.setHttpStatusCode(_ctx.integerValue("ListScriptPublishHistoriesResponse.HttpStatusCode"));

		ScriptPublishHistories scriptPublishHistories = new ScriptPublishHistories();
		scriptPublishHistories.setTotalCount(_ctx.integerValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.TotalCount"));
		scriptPublishHistories.setPageNumber(_ctx.integerValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.PageNumber"));
		scriptPublishHistories.setPageSize(_ctx.integerValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.PageSize"));

		List<PublishHistory> list = new ArrayList<PublishHistory>();
		for (int i = 0; i < _ctx.lengthValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.List.Length"); i++) {
			PublishHistory publishHistory = new PublishHistory();
			publishHistory.setInstanceId(_ctx.stringValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.List["+ i +"].InstanceId"));
			publishHistory.setScriptId(_ctx.stringValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.List["+ i +"].ScriptId"));
			publishHistory.setScriptVersion(_ctx.stringValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.List["+ i +"].ScriptVersion"));
			publishHistory.setDescription(_ctx.stringValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.List["+ i +"].Description"));
			publishHistory.setPublishTime(_ctx.longValue("ListScriptPublishHistoriesResponse.ScriptPublishHistories.List["+ i +"].PublishTime"));

			list.add(publishHistory);
		}
		scriptPublishHistories.setList(list);
		listScriptPublishHistoriesResponse.setScriptPublishHistories(scriptPublishHistories);
	 
	 	return listScriptPublishHistoriesResponse;
	}
}