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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.RestartInstancesResponse;
import com.aliyuncs.sae.model.v20190506.RestartInstancesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartInstancesResponseUnmarshaller {

	public static RestartInstancesResponse unmarshall(RestartInstancesResponse restartInstancesResponse, UnmarshallerContext _ctx) {
		
		restartInstancesResponse.setRequestId(_ctx.stringValue("RestartInstancesResponse.RequestId"));
		restartInstancesResponse.setCode(_ctx.stringValue("RestartInstancesResponse.Code"));
		restartInstancesResponse.setSuccess(_ctx.booleanValue("RestartInstancesResponse.Success"));
		restartInstancesResponse.setErrorCode(_ctx.stringValue("RestartInstancesResponse.ErrorCode"));
		restartInstancesResponse.setMessage(_ctx.stringValue("RestartInstancesResponse.Message"));
		restartInstancesResponse.setTraceId(_ctx.stringValue("RestartInstancesResponse.TraceId"));

		Data data = new Data();
		data.setChangeOrderId(_ctx.stringValue("RestartInstancesResponse.Data.ChangeOrderId"));
		restartInstancesResponse.setData(data);
	 
	 	return restartInstancesResponse;
	}
}