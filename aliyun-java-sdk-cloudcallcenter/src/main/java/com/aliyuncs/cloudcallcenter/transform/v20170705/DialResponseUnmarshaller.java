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

import com.aliyuncs.cloudcallcenter.model.v20170705.DialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DialResponseUnmarshaller {

	public static DialResponse unmarshall(DialResponse dialResponse, UnmarshallerContext context) {
		
		dialResponse.setRequestId(context.stringValue("DialResponse.RequestId"));
		dialResponse.setSuccess(context.booleanValue("DialResponse.Success"));
		dialResponse.setCode(context.stringValue("DialResponse.Code"));
		dialResponse.setMessage(context.stringValue("DialResponse.Message"));
		dialResponse.setHttpStatusCode(context.integerValue("DialResponse.HttpStatusCode"));
		dialResponse.setStatusCode(context.stringValue("DialResponse.StatusCode"));
		dialResponse.setStatusDesc(context.stringValue("DialResponse.StatusDesc"));
		dialResponse.setTaskId(context.stringValue("DialResponse.TaskId"));
		dialResponse.setTimeStamp(context.stringValue("DialResponse.TimeStamp"));
	 
	 	return dialResponse;
	}
}