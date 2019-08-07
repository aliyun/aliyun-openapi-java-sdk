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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.FailbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FailbackResponseUnmarshaller {

	public static FailbackResponse unmarshall(FailbackResponse failbackResponse, UnmarshallerContext _ctx) {
		
		failbackResponse.setRequestId(_ctx.stringValue("FailbackResponse.RequestId"));
		failbackResponse.setSuccess(_ctx.booleanValue("FailbackResponse.Success"));
		failbackResponse.setCode(_ctx.stringValue("FailbackResponse.Code"));
		failbackResponse.setMessage(_ctx.stringValue("FailbackResponse.Message"));
		failbackResponse.setTaskId(_ctx.stringValue("FailbackResponse.TaskId"));
	 
	 	return failbackResponse;
	}
}