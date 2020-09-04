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

package com.aliyuncs.aiworkspace.transform.v20200814;

import com.aliyuncs.aiworkspace.model.v20200814.GetAdminPermissionResponse;
import com.aliyuncs.aiworkspace.model.v20200814.GetAdminPermissionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdminPermissionResponseUnmarshaller {

	public static GetAdminPermissionResponse unmarshall(GetAdminPermissionResponse getAdminPermissionResponse, UnmarshallerContext _ctx) {
		
		getAdminPermissionResponse.setRequestId(_ctx.stringValue("GetAdminPermissionResponse.RequestId"));
		getAdminPermissionResponse.setCode(_ctx.stringValue("GetAdminPermissionResponse.Code"));
		getAdminPermissionResponse.setMessage(_ctx.stringValue("GetAdminPermissionResponse.Message"));

		Data data = new Data();
		data.setPermissionCode(_ctx.stringValue("GetAdminPermissionResponse.Data.PermissionCode"));
		data.setPermissionDescription(_ctx.stringValue("GetAdminPermissionResponse.Data.PermissionDescription"));
		getAdminPermissionResponse.setData(data);
	 
	 	return getAdminPermissionResponse;
	}
}