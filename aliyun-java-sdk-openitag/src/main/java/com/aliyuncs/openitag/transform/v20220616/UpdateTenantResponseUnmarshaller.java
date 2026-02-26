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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.UpdateTenantResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTenantResponseUnmarshaller {

	public static UpdateTenantResponse unmarshall(UpdateTenantResponse updateTenantResponse, UnmarshallerContext _ctx) {
		
		updateTenantResponse.setRequestId(_ctx.stringValue("UpdateTenantResponse.RequestId"));
		updateTenantResponse.setCode(_ctx.integerValue("UpdateTenantResponse.Code"));
		updateTenantResponse.setMessage(_ctx.stringValue("UpdateTenantResponse.Message"));
		updateTenantResponse.setDetails(_ctx.stringValue("UpdateTenantResponse.Details"));
		updateTenantResponse.setSuccess(_ctx.booleanValue("UpdateTenantResponse.Success"));
		updateTenantResponse.setErrorCode(_ctx.stringValue("UpdateTenantResponse.ErrorCode"));
	 
	 	return updateTenantResponse;
	}
}