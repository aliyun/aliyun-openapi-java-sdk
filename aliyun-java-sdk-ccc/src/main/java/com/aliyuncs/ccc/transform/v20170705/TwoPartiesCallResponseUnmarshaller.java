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

import com.aliyuncs.ccc.model.v20170705.TwoPartiesCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TwoPartiesCallResponseUnmarshaller {

	public static TwoPartiesCallResponse unmarshall(TwoPartiesCallResponse twoPartiesCallResponse, UnmarshallerContext context) {
		
		twoPartiesCallResponse.setRequestId(context.stringValue("TwoPartiesCallResponse.RequestId"));
		twoPartiesCallResponse.setSuccess(context.booleanValue("TwoPartiesCallResponse.Success"));
		twoPartiesCallResponse.setCode(context.stringValue("TwoPartiesCallResponse.Code"));
		twoPartiesCallResponse.setMessage(context.stringValue("TwoPartiesCallResponse.Message"));
		twoPartiesCallResponse.setHttpStatusCode(context.integerValue("TwoPartiesCallResponse.HttpStatusCode"));
		twoPartiesCallResponse.setStatusCode(context.stringValue("TwoPartiesCallResponse.StatusCode"));
		twoPartiesCallResponse.setStatusDesc(context.stringValue("TwoPartiesCallResponse.StatusDesc"));
		twoPartiesCallResponse.setTaskId(context.stringValue("TwoPartiesCallResponse.TaskId"));
		twoPartiesCallResponse.setTimeStamp(context.stringValue("TwoPartiesCallResponse.TimeStamp"));
	 
	 	return twoPartiesCallResponse;
	}
}