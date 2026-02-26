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

package com.aliyuncs.lingmou.transform.v20250527;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lingmou.model.v20250527.CloseChatInstanceSessionsResponse;
import com.aliyuncs.lingmou.model.v20250527.CloseChatInstanceSessionsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseChatInstanceSessionsResponseUnmarshaller {

	public static CloseChatInstanceSessionsResponse unmarshall(CloseChatInstanceSessionsResponse closeChatInstanceSessionsResponse, UnmarshallerContext _ctx) {
		
		closeChatInstanceSessionsResponse.setRequestId(_ctx.stringValue("CloseChatInstanceSessionsResponse.requestId"));
		closeChatInstanceSessionsResponse.setSuccess(_ctx.booleanValue("CloseChatInstanceSessionsResponse.success"));
		closeChatInstanceSessionsResponse.setCode(_ctx.stringValue("CloseChatInstanceSessionsResponse.code"));
		closeChatInstanceSessionsResponse.setMessage(_ctx.stringValue("CloseChatInstanceSessionsResponse.message"));
		closeChatInstanceSessionsResponse.setHttpStatusCode(_ctx.integerValue("CloseChatInstanceSessionsResponse.httpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CloseChatInstanceSessionsResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSessionId(_ctx.stringValue("CloseChatInstanceSessionsResponse.data["+ i +"].sessionId"));
			dataItem.setMainAccountId(_ctx.longValue("CloseChatInstanceSessionsResponse.data["+ i +"].mainAccountId"));
			dataItem.setCreatedAt(_ctx.longValue("CloseChatInstanceSessionsResponse.data["+ i +"].createdAt"));

			data.add(dataItem);
		}
		closeChatInstanceSessionsResponse.setData(data);
	 
	 	return closeChatInstanceSessionsResponse;
	}
}