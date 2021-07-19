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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.QueryMeetingMemberActionResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.QueryMeetingMemberActionResponse.ErrorCodeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMeetingMemberActionResponseUnmarshaller {

	public static QueryMeetingMemberActionResponse unmarshall(QueryMeetingMemberActionResponse queryMeetingMemberActionResponse, UnmarshallerContext _ctx) {
		
		queryMeetingMemberActionResponse.setRequestId(_ctx.stringValue("QueryMeetingMemberActionResponse.RequestId"));
		queryMeetingMemberActionResponse.setMessage(_ctx.stringValue("QueryMeetingMemberActionResponse.Message"));
		queryMeetingMemberActionResponse.setMeetingStatus(_ctx.integerValue("QueryMeetingMemberActionResponse.MeetingStatus"));
		queryMeetingMemberActionResponse.setVideoStatus(_ctx.integerValue("QueryMeetingMemberActionResponse.VideoStatus"));
		queryMeetingMemberActionResponse.setAudioStatus(_ctx.integerValue("QueryMeetingMemberActionResponse.AudioStatus"));
		queryMeetingMemberActionResponse.setErrorCodeCount(_ctx.longValue("QueryMeetingMemberActionResponse.ErrorCodeCount"));
		queryMeetingMemberActionResponse.setErrorCode(_ctx.integerValue("QueryMeetingMemberActionResponse.ErrorCode"));
		queryMeetingMemberActionResponse.setSuccess(_ctx.booleanValue("QueryMeetingMemberActionResponse.Success"));

		List<ErrorCodeListItem> errorCodeList = new ArrayList<ErrorCodeListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMeetingMemberActionResponse.ErrorCodeList.Length"); i++) {
			ErrorCodeListItem errorCodeListItem = new ErrorCodeListItem();
			errorCodeListItem.setErrorCodeCount(_ctx.longValue("QueryMeetingMemberActionResponse.ErrorCodeList["+ i +"].ErrorCodeCount"));
			errorCodeListItem.setTime(_ctx.longValue("QueryMeetingMemberActionResponse.ErrorCodeList["+ i +"].Time"));

			errorCodeList.add(errorCodeListItem);
		}
		queryMeetingMemberActionResponse.setErrorCodeList(errorCodeList);
	 
	 	return queryMeetingMemberActionResponse;
	}
}