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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.UpdateFunctionInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFunctionInstanceResponseUnmarshaller {

	public static UpdateFunctionInstanceResponse unmarshall(UpdateFunctionInstanceResponse updateFunctionInstanceResponse, UnmarshallerContext _ctx) {
		
		updateFunctionInstanceResponse.setRequestId(_ctx.stringValue("UpdateFunctionInstanceResponse.RequestId"));
		updateFunctionInstanceResponse.setStatus(_ctx.stringValue("UpdateFunctionInstanceResponse.Status"));
		updateFunctionInstanceResponse.setHttpCode(_ctx.longValue("UpdateFunctionInstanceResponse.HttpCode"));
		updateFunctionInstanceResponse.setMessage(_ctx.stringValue("UpdateFunctionInstanceResponse.Message"));
		updateFunctionInstanceResponse.setCode(_ctx.stringValue("UpdateFunctionInstanceResponse.Code"));
		updateFunctionInstanceResponse.setLatency(_ctx.longValue("UpdateFunctionInstanceResponse.Latency"));
	 
	 	return updateFunctionInstanceResponse;
	}
}