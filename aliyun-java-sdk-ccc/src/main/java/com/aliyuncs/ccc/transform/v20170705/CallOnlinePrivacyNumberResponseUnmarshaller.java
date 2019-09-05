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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.CallOnlinePrivacyNumberResponse;
import com.aliyuncs.ccc.model.v20170705.CallOnlinePrivacyNumberResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CallOnlinePrivacyNumberResponseUnmarshaller {

	public static CallOnlinePrivacyNumberResponse unmarshall(CallOnlinePrivacyNumberResponse callOnlinePrivacyNumberResponse, UnmarshallerContext _ctx) {
		
		callOnlinePrivacyNumberResponse.setRequestId(_ctx.stringValue("CallOnlinePrivacyNumberResponse.RequestId"));
		callOnlinePrivacyNumberResponse.setSuccess(_ctx.booleanValue("CallOnlinePrivacyNumberResponse.Success"));
		callOnlinePrivacyNumberResponse.setCode(_ctx.stringValue("CallOnlinePrivacyNumberResponse.Code"));
		callOnlinePrivacyNumberResponse.setMessage(_ctx.stringValue("CallOnlinePrivacyNumberResponse.Message"));
		callOnlinePrivacyNumberResponse.setHttpStatusCode(_ctx.integerValue("CallOnlinePrivacyNumberResponse.HttpStatusCode"));

		Data data = new Data();
		data.setStatusCode(_ctx.stringValue("CallOnlinePrivacyNumberResponse.Data.StatusCode"));
		data.setDateCreated(_ctx.stringValue("CallOnlinePrivacyNumberResponse.Data.DateCreated"));
		data.setRepresent(_ctx.stringValue("CallOnlinePrivacyNumberResponse.Data.Represent"));
		data.setTelX(_ctx.stringValue("CallOnlinePrivacyNumberResponse.Data.TelX"));
		data.setCallId(_ctx.stringValue("CallOnlinePrivacyNumberResponse.Data.CallId"));
		callOnlinePrivacyNumberResponse.setData(data);
	 
	 	return callOnlinePrivacyNumberResponse;
	}
}