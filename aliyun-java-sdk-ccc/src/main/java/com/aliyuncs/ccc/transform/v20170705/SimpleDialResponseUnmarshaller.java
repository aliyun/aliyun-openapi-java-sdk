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

	public static SimpleDialResponse unmarshall(SimpleDialResponse simpleDialResponse, UnmarshallerContext context) {
		
		simpleDialResponse.setRequestId(context.stringValue("SimpleDialResponse.RequestId"));
		simpleDialResponse.setSuccess(context.booleanValue("SimpleDialResponse.Success"));
		simpleDialResponse.setCode(context.stringValue("SimpleDialResponse.Code"));
		simpleDialResponse.setMessage(context.stringValue("SimpleDialResponse.Message"));
		simpleDialResponse.setHttpStatusCode(context.integerValue("SimpleDialResponse.HttpStatusCode"));
		simpleDialResponse.setStatusCode(context.stringValue("SimpleDialResponse.StatusCode"));
		simpleDialResponse.setStatusDesc(context.stringValue("SimpleDialResponse.StatusDesc"));
		simpleDialResponse.setTaskId(context.stringValue("SimpleDialResponse.TaskId"));
		simpleDialResponse.setTimeStamp(context.stringValue("SimpleDialResponse.TimeStamp"));
	 
	 	return simpleDialResponse;
	}
}