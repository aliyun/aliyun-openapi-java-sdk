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

	public static TwoPartiesCallResponse unmarshall(TwoPartiesCallResponse twoPartiesCallResponse, UnmarshallerContext _ctx) {
		
		twoPartiesCallResponse.setRequestId(_ctx.stringValue("TwoPartiesCallResponse.RequestId"));
		twoPartiesCallResponse.setSuccess(_ctx.booleanValue("TwoPartiesCallResponse.Success"));
		twoPartiesCallResponse.setCode(_ctx.stringValue("TwoPartiesCallResponse.Code"));
		twoPartiesCallResponse.setMessage(_ctx.stringValue("TwoPartiesCallResponse.Message"));
		twoPartiesCallResponse.setHttpStatusCode(_ctx.integerValue("TwoPartiesCallResponse.HttpStatusCode"));
		twoPartiesCallResponse.setStatusCode(_ctx.stringValue("TwoPartiesCallResponse.StatusCode"));
		twoPartiesCallResponse.setStatusDesc(_ctx.stringValue("TwoPartiesCallResponse.StatusDesc"));
		twoPartiesCallResponse.setTaskId(_ctx.stringValue("TwoPartiesCallResponse.TaskId"));
		twoPartiesCallResponse.setTimeStamp(_ctx.stringValue("TwoPartiesCallResponse.TimeStamp"));
	 
	 	return twoPartiesCallResponse;
	}
}