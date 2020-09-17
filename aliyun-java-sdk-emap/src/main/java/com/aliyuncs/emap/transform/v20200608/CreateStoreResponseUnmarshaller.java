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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.CreateStoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStoreResponseUnmarshaller {

	public static CreateStoreResponse unmarshall(CreateStoreResponse createStoreResponse, UnmarshallerContext _ctx) {
		
		createStoreResponse.setRequestId(_ctx.stringValue("CreateStoreResponse.RequestId"));
		createStoreResponse.setMessage(_ctx.stringValue("CreateStoreResponse.Message"));
		createStoreResponse.setErrorCode(_ctx.stringValue("CreateStoreResponse.ErrorCode"));
		createStoreResponse.setErrorMessage(_ctx.stringValue("CreateStoreResponse.ErrorMessage"));
		createStoreResponse.setDynamicMessage(_ctx.stringValue("CreateStoreResponse.DynamicMessage"));
		createStoreResponse.setSuccess(_ctx.booleanValue("CreateStoreResponse.Success"));
		createStoreResponse.setDynamicCode(_ctx.stringValue("CreateStoreResponse.DynamicCode"));
		createStoreResponse.setCode(_ctx.stringValue("CreateStoreResponse.Code"));
	 
	 	return createStoreResponse;
	}
}