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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.RestartFileSharesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartFileSharesResponseUnmarshaller {

	public static RestartFileSharesResponse unmarshall(RestartFileSharesResponse restartFileSharesResponse, UnmarshallerContext _ctx) {
		
		restartFileSharesResponse.setRequestId(_ctx.stringValue("RestartFileSharesResponse.RequestId"));
		restartFileSharesResponse.setSuccess(_ctx.booleanValue("RestartFileSharesResponse.Success"));
		restartFileSharesResponse.setCode(_ctx.stringValue("RestartFileSharesResponse.Code"));
		restartFileSharesResponse.setMessage(_ctx.stringValue("RestartFileSharesResponse.Message"));
		restartFileSharesResponse.setTaskId(_ctx.stringValue("RestartFileSharesResponse.TaskId"));
	 
	 	return restartFileSharesResponse;
	}
}