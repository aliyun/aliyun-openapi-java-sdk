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

package com.aliyuncs.push.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.QueryPushListResponse;
import com.aliyuncs.push.model.v20160801.QueryPushListResponse.PushMessageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushListResponseUnmarshaller {

	public static QueryPushListResponse unmarshall(QueryPushListResponse queryPushListResponse, UnmarshallerContext _ctx) {
		
		queryPushListResponse.setRequestId(_ctx.stringValue("QueryPushListResponse.RequestId"));
		queryPushListResponse.setHasNext(_ctx.booleanValue("QueryPushListResponse.HasNext"));
		queryPushListResponse.setPage(_ctx.integerValue("QueryPushListResponse.Page"));
		queryPushListResponse.setPageSize(_ctx.integerValue("QueryPushListResponse.PageSize"));

		List<PushMessageInfo> pushMessageInfos = new ArrayList<PushMessageInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryPushListResponse.PushMessageInfos.Length"); i++) {
			PushMessageInfo pushMessageInfo = new PushMessageInfo();
			pushMessageInfo.setAppKey(_ctx.longValue("QueryPushListResponse.PushMessageInfos["+ i +"].AppKey"));
			pushMessageInfo.setAppName(_ctx.stringValue("QueryPushListResponse.PushMessageInfos["+ i +"].AppName"));
			pushMessageInfo.setMessageId(_ctx.stringValue("QueryPushListResponse.PushMessageInfos["+ i +"].MessageId"));
			pushMessageInfo.setType(_ctx.stringValue("QueryPushListResponse.PushMessageInfos["+ i +"].Type"));
			pushMessageInfo.setDeviceType(_ctx.stringValue("QueryPushListResponse.PushMessageInfos["+ i +"].DeviceType"));
			pushMessageInfo.setPushTime(_ctx.stringValue("QueryPushListResponse.PushMessageInfos["+ i +"].PushTime"));
			pushMessageInfo.setTitle(_ctx.stringValue("QueryPushListResponse.PushMessageInfos["+ i +"].Title"));
			pushMessageInfo.setBody(_ctx.stringValue("QueryPushListResponse.PushMessageInfos["+ i +"].Body"));

			pushMessageInfos.add(pushMessageInfo);
		}
		queryPushListResponse.setPushMessageInfos(pushMessageInfos);
	 
	 	return queryPushListResponse;
	}
}