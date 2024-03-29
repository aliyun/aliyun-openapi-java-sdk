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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.StopHanaDatabaseAsyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopHanaDatabaseAsyncResponseUnmarshaller {

	public static StopHanaDatabaseAsyncResponse unmarshall(StopHanaDatabaseAsyncResponse stopHanaDatabaseAsyncResponse, UnmarshallerContext _ctx) {
		
		stopHanaDatabaseAsyncResponse.setRequestId(_ctx.stringValue("StopHanaDatabaseAsyncResponse.RequestId"));
		stopHanaDatabaseAsyncResponse.setCode(_ctx.stringValue("StopHanaDatabaseAsyncResponse.Code"));
		stopHanaDatabaseAsyncResponse.setMessage(_ctx.stringValue("StopHanaDatabaseAsyncResponse.Message"));
		stopHanaDatabaseAsyncResponse.setTaskId(_ctx.stringValue("StopHanaDatabaseAsyncResponse.TaskId"));
		stopHanaDatabaseAsyncResponse.setSuccess(_ctx.booleanValue("StopHanaDatabaseAsyncResponse.Success"));
	 
	 	return stopHanaDatabaseAsyncResponse;
	}
}