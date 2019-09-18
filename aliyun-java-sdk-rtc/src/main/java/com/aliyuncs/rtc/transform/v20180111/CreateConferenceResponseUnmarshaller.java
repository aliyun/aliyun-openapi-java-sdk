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

package com.aliyuncs.rtc.transform.v20180111;

import com.aliyuncs.rtc.model.v20180111.CreateConferenceResponse;
import com.aliyuncs.rtc.model.v20180111.CreateConferenceResponse.AuthInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConferenceResponseUnmarshaller {

	public static CreateConferenceResponse unmarshall(CreateConferenceResponse createConferenceResponse, UnmarshallerContext _ctx) {
		
		createConferenceResponse.setRequestId(_ctx.stringValue("CreateConferenceResponse.RequestId"));
		createConferenceResponse.setConferenceId(_ctx.stringValue("CreateConferenceResponse.ConferenceId"));

		AuthInfo authInfo = new AuthInfo();
		authInfo.setKey(_ctx.stringValue("CreateConferenceResponse.AuthInfo.Key"));
		authInfo.setNonce(_ctx.stringValue("CreateConferenceResponse.AuthInfo.Nonce"));
		authInfo.setTimestamp(_ctx.integerValue("CreateConferenceResponse.AuthInfo.Timestamp"));
		createConferenceResponse.setAuthInfo(authInfo);
	 
	 	return createConferenceResponse;
	}
}