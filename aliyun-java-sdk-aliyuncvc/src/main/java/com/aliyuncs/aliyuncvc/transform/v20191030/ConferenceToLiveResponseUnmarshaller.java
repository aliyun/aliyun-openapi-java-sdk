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

import com.aliyuncs.aliyuncvc.model.v20191030.ConferenceToLiveResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.ConferenceToLiveResponse.LiveInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConferenceToLiveResponseUnmarshaller {

	public static ConferenceToLiveResponse unmarshall(ConferenceToLiveResponse conferenceToLiveResponse, UnmarshallerContext _ctx) {
		
		conferenceToLiveResponse.setRequestId(_ctx.stringValue("ConferenceToLiveResponse.RequestId"));
		conferenceToLiveResponse.setErrorCode(_ctx.integerValue("ConferenceToLiveResponse.ErrorCode"));
		conferenceToLiveResponse.setMessage(_ctx.stringValue("ConferenceToLiveResponse.Message"));
		conferenceToLiveResponse.setSuccess(_ctx.booleanValue("ConferenceToLiveResponse.Success"));

		LiveInfo liveInfo = new LiveInfo();
		liveInfo.setLiveUUID(_ctx.stringValue("ConferenceToLiveResponse.LiveInfo.LiveUUID"));
		conferenceToLiveResponse.setLiveInfo(liveInfo);
	 
	 	return conferenceToLiveResponse;
	}
}