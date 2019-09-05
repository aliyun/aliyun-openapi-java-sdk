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

import com.aliyuncs.ccc.model.v20170705.SimpleDialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SimpleDialResponseUnmarshaller {

	public static SimpleDialResponse unmarshall(SimpleDialResponse simpleDialResponse, UnmarshallerContext _ctx) {
		
		simpleDialResponse.setRequestId(_ctx.stringValue("SimpleDialResponse.RequestId"));
		simpleDialResponse.setSuccess(_ctx.booleanValue("SimpleDialResponse.Success"));
		simpleDialResponse.setCode(_ctx.stringValue("SimpleDialResponse.Code"));
		simpleDialResponse.setMessage(_ctx.stringValue("SimpleDialResponse.Message"));
		simpleDialResponse.setHttpStatusCode(_ctx.integerValue("SimpleDialResponse.HttpStatusCode"));
		simpleDialResponse.setStatusCode(_ctx.stringValue("SimpleDialResponse.StatusCode"));
		simpleDialResponse.setStatusDesc(_ctx.stringValue("SimpleDialResponse.StatusDesc"));
		simpleDialResponse.setTaskId(_ctx.stringValue("SimpleDialResponse.TaskId"));
		simpleDialResponse.setTimeStamp(_ctx.stringValue("SimpleDialResponse.TimeStamp"));
	 
	 	return simpleDialResponse;
	}
}