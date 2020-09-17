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

import com.aliyuncs.emap.model.v20200608.DeleteStoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteStoreResponseUnmarshaller {

	public static DeleteStoreResponse unmarshall(DeleteStoreResponse deleteStoreResponse, UnmarshallerContext _ctx) {
		
		deleteStoreResponse.setRequestId(_ctx.stringValue("DeleteStoreResponse.RequestId"));
		deleteStoreResponse.setMessage(_ctx.stringValue("DeleteStoreResponse.Message"));
		deleteStoreResponse.setErrorCode(_ctx.stringValue("DeleteStoreResponse.ErrorCode"));
		deleteStoreResponse.setErrorMessage(_ctx.stringValue("DeleteStoreResponse.ErrorMessage"));
		deleteStoreResponse.setDynamicMessage(_ctx.stringValue("DeleteStoreResponse.DynamicMessage"));
		deleteStoreResponse.setSuccess(_ctx.booleanValue("DeleteStoreResponse.Success"));
		deleteStoreResponse.setDynamicCode(_ctx.stringValue("DeleteStoreResponse.DynamicCode"));
		deleteStoreResponse.setCode(_ctx.stringValue("DeleteStoreResponse.Code"));
	 
	 	return deleteStoreResponse;
	}
}