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

import com.aliyuncs.live.model.v20161101.ListRtcMPUEventSubRecordResponse;
import com.aliyuncs.live.model.v20161101.ListRtcMPUEventSubRecordResponse.SubInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRtcMPUEventSubRecordResponseUnmarshaller {

	public static ListRtcMPUEventSubRecordResponse unmarshall(ListRtcMPUEventSubRecordResponse listRtcMPUEventSubRecordResponse, UnmarshallerContext _ctx) {
		
		listRtcMPUEventSubRecordResponse.setRequestId(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.RequestId"));
		listRtcMPUEventSubRecordResponse.setCount(_ctx.longValue("ListRtcMPUEventSubRecordResponse.Count"));
		listRtcMPUEventSubRecordResponse.setHasMore(_ctx.booleanValue("ListRtcMPUEventSubRecordResponse.HasMore"));

		List<SubInfo> logs = new ArrayList<SubInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListRtcMPUEventSubRecordResponse.Logs.Length"); i++) {
			SubInfo subInfo = new SubInfo();
			subInfo.setAppId(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].AppId"));
			subInfo.setSubId(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].SubId"));
			subInfo.setMsgId(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].MsgId"));
			subInfo.setData(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].Data"));
			subInfo.setTime(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].Time"));
			subInfo.setCost(_ctx.longValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].Cost"));
			subInfo.setCallbackUrl(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].CallbackUrl"));
			subInfo.setHTTPCode(_ctx.stringValue("ListRtcMPUEventSubRecordResponse.Logs["+ i +"].HTTPCode"));

			logs.add(subInfo);
		}
		listRtcMPUEventSubRecordResponse.setLogs(logs);
	 
	 	return listRtcMPUEventSubRecordResponse;
	}
}