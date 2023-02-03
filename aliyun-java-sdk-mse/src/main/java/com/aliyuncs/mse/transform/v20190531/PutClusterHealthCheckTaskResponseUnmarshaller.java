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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.PutClusterHealthCheckTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutClusterHealthCheckTaskResponseUnmarshaller {

	public static PutClusterHealthCheckTaskResponse unmarshall(PutClusterHealthCheckTaskResponse putClusterHealthCheckTaskResponse, UnmarshallerContext _ctx) {
		
		putClusterHealthCheckTaskResponse.setRequestId(_ctx.stringValue("PutClusterHealthCheckTaskResponse.RequestId"));
		putClusterHealthCheckTaskResponse.setSuccess(_ctx.booleanValue("PutClusterHealthCheckTaskResponse.Success"));
		putClusterHealthCheckTaskResponse.setCode(_ctx.integerValue("PutClusterHealthCheckTaskResponse.Code"));
		putClusterHealthCheckTaskResponse.setErrorCode(_ctx.stringValue("PutClusterHealthCheckTaskResponse.ErrorCode"));
		putClusterHealthCheckTaskResponse.setHttpStatusCode(_ctx.integerValue("PutClusterHealthCheckTaskResponse.HttpStatusCode"));
		putClusterHealthCheckTaskResponse.setMessage(_ctx.stringValue("PutClusterHealthCheckTaskResponse.Message"));
		putClusterHealthCheckTaskResponse.setDynamicCode(_ctx.stringValue("PutClusterHealthCheckTaskResponse.DynamicCode"));
		putClusterHealthCheckTaskResponse.setDynamicMessage(_ctx.stringValue("PutClusterHealthCheckTaskResponse.DynamicMessage"));
		putClusterHealthCheckTaskResponse.setData(_ctx.booleanValue("PutClusterHealthCheckTaskResponse.Data"));
	 
	 	return putClusterHealthCheckTaskResponse;
	}
}