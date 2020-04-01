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

import com.aliyuncs.cloudesl.model.v20200201.UpdateStoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateStoreResponseUnmarshaller {

	public static UpdateStoreResponse unmarshall(UpdateStoreResponse updateStoreResponse, UnmarshallerContext _ctx) {
		
		updateStoreResponse.setRequestId(_ctx.stringValue("UpdateStoreResponse.RequestId"));
		updateStoreResponse.setErrorMessage(_ctx.stringValue("UpdateStoreResponse.ErrorMessage"));
		updateStoreResponse.setErrorCode(_ctx.stringValue("UpdateStoreResponse.ErrorCode"));
		updateStoreResponse.setMessage(_ctx.stringValue("UpdateStoreResponse.Message"));
		updateStoreResponse.setDynamicCode(_ctx.stringValue("UpdateStoreResponse.DynamicCode"));
		updateStoreResponse.setCode(_ctx.stringValue("UpdateStoreResponse.Code"));
		updateStoreResponse.setDynamicMessage(_ctx.stringValue("UpdateStoreResponse.DynamicMessage"));
		updateStoreResponse.setSuccess(_ctx.booleanValue("UpdateStoreResponse.Success"));
	 
	 	return updateStoreResponse;
	}
}