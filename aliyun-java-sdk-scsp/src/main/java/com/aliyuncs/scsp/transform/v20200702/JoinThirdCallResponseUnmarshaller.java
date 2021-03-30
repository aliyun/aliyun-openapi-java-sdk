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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.JoinThirdCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinThirdCallResponseUnmarshaller {

	public static JoinThirdCallResponse unmarshall(JoinThirdCallResponse joinThirdCallResponse, UnmarshallerContext _ctx) {
		
		joinThirdCallResponse.setRequestId(_ctx.stringValue("JoinThirdCallResponse.RequestId"));
		joinThirdCallResponse.setMessage(_ctx.stringValue("JoinThirdCallResponse.Message"));
		joinThirdCallResponse.setCode(_ctx.stringValue("JoinThirdCallResponse.Code"));
		joinThirdCallResponse.setSuccess(_ctx.booleanValue("JoinThirdCallResponse.Success"));
	 
	 	return joinThirdCallResponse;
	}
}