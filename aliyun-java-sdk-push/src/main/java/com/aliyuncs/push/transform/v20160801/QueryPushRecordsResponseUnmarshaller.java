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

import com.aliyuncs.push.model.v20160801.QueryPushRecordsResponse;
import com.aliyuncs.push.model.v20160801.QueryPushRecordsResponse.PushInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushRecordsResponseUnmarshaller {

	public static QueryPushRecordsResponse unmarshall(QueryPushRecordsResponse queryPushRecordsResponse, UnmarshallerContext _ctx) {
		
		queryPushRecordsResponse.setRequestId(_ctx.stringValue("QueryPushRecordsResponse.RequestId"));
		queryPushRecordsResponse.setNextToken(_ctx.stringValue("QueryPushRecordsResponse.NextToken"));
		queryPushRecordsResponse.setPageSize(_ctx.integerValue("QueryPushRecordsResponse.PageSize"));
		queryPushRecordsResponse.setPage(_ctx.integerValue("QueryPushRecordsResponse.Page"));
		queryPushRecordsResponse.setTotal(_ctx.integerValue("QueryPushRecordsResponse.Total"));

		List<PushInfo> pushInfos = new ArrayList<PushInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryPushRecordsResponse.PushInfos.Length"); i++) {
			PushInfo pushInfo = new PushInfo();
			pushInfo.setAppKey(_ctx.longValue("QueryPushRecordsResponse.PushInfos["+ i +"].AppKey"));
			pushInfo.setMessageId(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].MessageId"));
			pushInfo.setPushType(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].PushType"));
			pushInfo.setDeviceType(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].DeviceType"));
			pushInfo.setTarget(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].Target"));
			pushInfo.setSource(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].Source"));
			pushInfo.setPushTime(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].PushTime"));
			pushInfo.setTitle(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].Title"));
			pushInfo.setBody(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].Body"));
			pushInfo.setStatus(_ctx.stringValue("QueryPushRecordsResponse.PushInfos["+ i +"].Status"));

			pushInfos.add(pushInfo);
		}
		queryPushRecordsResponse.setPushInfos(pushInfos);
	 
	 	return queryPushRecordsResponse;
	}
}