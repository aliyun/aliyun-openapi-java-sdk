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

import com.aliyuncs.opensearch.model.v20171225.UpdateFunctionDefaultInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFunctionDefaultInstanceResponseUnmarshaller {

	public static UpdateFunctionDefaultInstanceResponse unmarshall(UpdateFunctionDefaultInstanceResponse updateFunctionDefaultInstanceResponse, UnmarshallerContext _ctx) {
		
		updateFunctionDefaultInstanceResponse.setRequestId(_ctx.stringValue("UpdateFunctionDefaultInstanceResponse.RequestId"));
		updateFunctionDefaultInstanceResponse.setStatus(_ctx.stringValue("UpdateFunctionDefaultInstanceResponse.Status"));
		updateFunctionDefaultInstanceResponse.setHttpCode(_ctx.longValue("UpdateFunctionDefaultInstanceResponse.HttpCode"));
		updateFunctionDefaultInstanceResponse.setMessage(_ctx.stringValue("UpdateFunctionDefaultInstanceResponse.Message"));
		updateFunctionDefaultInstanceResponse.setCode(_ctx.stringValue("UpdateFunctionDefaultInstanceResponse.Code"));
		updateFunctionDefaultInstanceResponse.setLatency(_ctx.longValue("UpdateFunctionDefaultInstanceResponse.Latency"));
	 
	 	return updateFunctionDefaultInstanceResponse;
	}
}