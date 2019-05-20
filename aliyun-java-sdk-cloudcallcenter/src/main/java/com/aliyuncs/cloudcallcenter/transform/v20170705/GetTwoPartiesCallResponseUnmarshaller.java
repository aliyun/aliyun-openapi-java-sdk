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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetTwoPartiesCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTwoPartiesCallResponseUnmarshaller {

	public static GetTwoPartiesCallResponse unmarshall(GetTwoPartiesCallResponse getTwoPartiesCallResponse, UnmarshallerContext context) {
		
		getTwoPartiesCallResponse.setRequestId(context.stringValue("GetTwoPartiesCallResponse.RequestId"));
		getTwoPartiesCallResponse.setSuccess(context.booleanValue("GetTwoPartiesCallResponse.Success"));
		getTwoPartiesCallResponse.setCode(context.stringValue("GetTwoPartiesCallResponse.Code"));
		getTwoPartiesCallResponse.setMessage(context.stringValue("GetTwoPartiesCallResponse.Message"));
		getTwoPartiesCallResponse.setHttpStatusCode(context.integerValue("GetTwoPartiesCallResponse.HttpStatusCode"));
		getTwoPartiesCallResponse.setCaller(context.stringValue("GetTwoPartiesCallResponse.Caller"));
		getTwoPartiesCallResponse.setCalleeAgent(context.stringValue("GetTwoPartiesCallResponse.CalleeAgent"));
		getTwoPartiesCallResponse.setCalleeCustomer(context.stringValue("GetTwoPartiesCallResponse.CalleeCustomer"));
	 
	 	return getTwoPartiesCallResponse;
	}
}