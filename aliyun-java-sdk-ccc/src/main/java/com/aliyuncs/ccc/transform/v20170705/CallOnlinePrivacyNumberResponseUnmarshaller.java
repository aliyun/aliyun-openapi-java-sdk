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

	public static CallOnlinePrivacyNumberResponse unmarshall(CallOnlinePrivacyNumberResponse callOnlinePrivacyNumberResponse, UnmarshallerContext context) {
		
		callOnlinePrivacyNumberResponse.setRequestId(context.stringValue("CallOnlinePrivacyNumberResponse.RequestId"));
		callOnlinePrivacyNumberResponse.setSuccess(context.booleanValue("CallOnlinePrivacyNumberResponse.Success"));
		callOnlinePrivacyNumberResponse.setCode(context.stringValue("CallOnlinePrivacyNumberResponse.Code"));
		callOnlinePrivacyNumberResponse.setMessage(context.stringValue("CallOnlinePrivacyNumberResponse.Message"));
		callOnlinePrivacyNumberResponse.setHttpStatusCode(context.integerValue("CallOnlinePrivacyNumberResponse.HttpStatusCode"));

		Data data = new Data();
		data.setStatusCode(context.stringValue("CallOnlinePrivacyNumberResponse.Data.StatusCode"));
		data.setDateCreated(context.stringValue("CallOnlinePrivacyNumberResponse.Data.DateCreated"));
		data.setRepresent(context.stringValue("CallOnlinePrivacyNumberResponse.Data.Represent"));
		data.setTelX(context.stringValue("CallOnlinePrivacyNumberResponse.Data.TelX"));
		data.setCallId(context.stringValue("CallOnlinePrivacyNumberResponse.Data.CallId"));
		callOnlinePrivacyNumberResponse.setData(data);
	 
	 	return callOnlinePrivacyNumberResponse;
	}
}