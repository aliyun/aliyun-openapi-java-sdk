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

import com.aliyuncs.push.model.v20160801.ListPushRecordsResponse;
import com.aliyuncs.push.model.v20160801.ListPushRecordsResponse.PushMessageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPushRecordsResponseUnmarshaller {

	public static ListPushRecordsResponse unmarshall(ListPushRecordsResponse listPushRecordsResponse, UnmarshallerContext _ctx) {
		
		listPushRecordsResponse.setRequestId(_ctx.stringValue("ListPushRecordsResponse.RequestId"));
		listPushRecordsResponse.setTotal(_ctx.integerValue("ListPushRecordsResponse.Total"));
		listPushRecordsResponse.setPage(_ctx.integerValue("ListPushRecordsResponse.Page"));
		listPushRecordsResponse.setPageSize(_ctx.integerValue("ListPushRecordsResponse.PageSize"));

		List<PushMessageInfo> pushMessageInfos = new ArrayList<PushMessageInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPushRecordsResponse.PushMessageInfos.Length"); i++) {
			PushMessageInfo pushMessageInfo = new PushMessageInfo();
			pushMessageInfo.setAppKey(_ctx.longValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].AppKey"));
			pushMessageInfo.setAppName(_ctx.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].AppName"));
			pushMessageInfo.setMessageId(_ctx.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].MessageId"));
			pushMessageInfo.setType(_ctx.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].Type"));
			pushMessageInfo.setDeviceType(_ctx.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].DeviceType"));
			pushMessageInfo.setPushTime(_ctx.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].PushTime"));
			pushMessageInfo.setTitle(_ctx.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].Title"));
			pushMessageInfo.setBody(_ctx.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].Body"));

			pushMessageInfos.add(pushMessageInfo);
		}
		listPushRecordsResponse.setPushMessageInfos(pushMessageInfos);
	 
	 	return listPushRecordsResponse;
	}
}