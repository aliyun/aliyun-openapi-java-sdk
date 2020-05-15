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

import com.aliyuncs.mse.model.v20190531.RetryClusterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryClusterResponseUnmarshaller {

	public static RetryClusterResponse unmarshall(RetryClusterResponse retryClusterResponse, UnmarshallerContext _ctx) {
		
		retryClusterResponse.setRequestId(_ctx.stringValue("RetryClusterResponse.RequestId"));
		retryClusterResponse.setSuccess(_ctx.booleanValue("RetryClusterResponse.Success"));
		retryClusterResponse.setMessage(_ctx.stringValue("RetryClusterResponse.Message"));
		retryClusterResponse.setErrorCode(_ctx.stringValue("RetryClusterResponse.ErrorCode"));
	 
	 	return retryClusterResponse;
	}
}