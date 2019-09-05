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

import com.aliyuncs.ccc.model.v20170705.DialExResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DialExResponseUnmarshaller {

	public static DialExResponse unmarshall(DialExResponse dialExResponse, UnmarshallerContext _ctx) {
		
		dialExResponse.setRequestId(_ctx.stringValue("DialExResponse.RequestId"));
		dialExResponse.setSuccess(_ctx.booleanValue("DialExResponse.Success"));
		dialExResponse.setCode(_ctx.stringValue("DialExResponse.Code"));
		dialExResponse.setMessage(_ctx.stringValue("DialExResponse.Message"));
		dialExResponse.setHttpStatusCode(_ctx.integerValue("DialExResponse.HttpStatusCode"));
		dialExResponse.setStatusCode(_ctx.stringValue("DialExResponse.StatusCode"));
		dialExResponse.setStatusDesc(_ctx.stringValue("DialExResponse.StatusDesc"));
		dialExResponse.setTaskId(_ctx.stringValue("DialExResponse.TaskId"));
		dialExResponse.setTimeStamp(_ctx.stringValue("DialExResponse.TimeStamp"));
	 
	 	return dialExResponse;
	}
}