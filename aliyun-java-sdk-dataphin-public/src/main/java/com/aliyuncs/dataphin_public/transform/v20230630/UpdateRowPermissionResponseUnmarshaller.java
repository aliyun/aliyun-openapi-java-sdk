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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.UpdateRowPermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRowPermissionResponseUnmarshaller {

	public static UpdateRowPermissionResponse unmarshall(UpdateRowPermissionResponse updateRowPermissionResponse, UnmarshallerContext _ctx) {
		
		updateRowPermissionResponse.setRequestId(_ctx.stringValue("UpdateRowPermissionResponse.RequestId"));
		updateRowPermissionResponse.setSuccess(_ctx.booleanValue("UpdateRowPermissionResponse.Success"));
		updateRowPermissionResponse.setHttpStatusCode(_ctx.integerValue("UpdateRowPermissionResponse.HttpStatusCode"));
		updateRowPermissionResponse.setCode(_ctx.stringValue("UpdateRowPermissionResponse.Code"));
		updateRowPermissionResponse.setMessage(_ctx.stringValue("UpdateRowPermissionResponse.Message"));
		updateRowPermissionResponse.setData(_ctx.booleanValue("UpdateRowPermissionResponse.Data"));
	 
	 	return updateRowPermissionResponse;
	}
}