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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.UpdateStoreConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateStoreConfigResponseUnmarshaller {

	public static UpdateStoreConfigResponse unmarshall(UpdateStoreConfigResponse updateStoreConfigResponse, UnmarshallerContext _ctx) {
		
		updateStoreConfigResponse.setRequestId(_ctx.stringValue("UpdateStoreConfigResponse.RequestId"));
		updateStoreConfigResponse.setErrorMessage(_ctx.stringValue("UpdateStoreConfigResponse.ErrorMessage"));
		updateStoreConfigResponse.setErrorCode(_ctx.stringValue("UpdateStoreConfigResponse.ErrorCode"));
		updateStoreConfigResponse.setMessage(_ctx.stringValue("UpdateStoreConfigResponse.Message"));
		updateStoreConfigResponse.setDynamicCode(_ctx.stringValue("UpdateStoreConfigResponse.DynamicCode"));
		updateStoreConfigResponse.setCode(_ctx.stringValue("UpdateStoreConfigResponse.Code"));
		updateStoreConfigResponse.setDynamicMessage(_ctx.stringValue("UpdateStoreConfigResponse.DynamicMessage"));
		updateStoreConfigResponse.setSuccess(_ctx.booleanValue("UpdateStoreConfigResponse.Success"));
	 
	 	return updateStoreConfigResponse;
	}
}