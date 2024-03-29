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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.SingleCallByTtsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SingleCallByTtsResponseUnmarshaller {

	public static SingleCallByTtsResponse unmarshall(SingleCallByTtsResponse singleCallByTtsResponse, UnmarshallerContext _ctx) {
		
		singleCallByTtsResponse.setRequestId(_ctx.stringValue("SingleCallByTtsResponse.RequestId"));
		singleCallByTtsResponse.setCode(_ctx.stringValue("SingleCallByTtsResponse.Code"));
		singleCallByTtsResponse.setMessage(_ctx.stringValue("SingleCallByTtsResponse.Message"));
		singleCallByTtsResponse.setCallId(_ctx.stringValue("SingleCallByTtsResponse.CallId"));
	 
	 	return singleCallByTtsResponse;
	}
}