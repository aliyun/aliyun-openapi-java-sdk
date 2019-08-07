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

import com.aliyuncs.mse.model.v20190531.UpdateConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateConfigResponseUnmarshaller {

	public static UpdateConfigResponse unmarshall(UpdateConfigResponse updateConfigResponse, UnmarshallerContext _ctx) {
		
		updateConfigResponse.setRequestId(_ctx.stringValue("UpdateConfigResponse.RequestId"));
		updateConfigResponse.setSuccess(_ctx.booleanValue("UpdateConfigResponse.Success"));
		updateConfigResponse.setMessage(_ctx.stringValue("UpdateConfigResponse.Message"));
		updateConfigResponse.setErrorCode(_ctx.stringValue("UpdateConfigResponse.ErrorCode"));
	 
	 	return updateConfigResponse;
	}
}