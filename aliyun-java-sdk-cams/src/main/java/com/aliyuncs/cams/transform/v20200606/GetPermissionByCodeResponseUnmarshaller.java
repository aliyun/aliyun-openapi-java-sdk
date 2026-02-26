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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.GetPermissionByCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPermissionByCodeResponseUnmarshaller {

	public static GetPermissionByCodeResponse unmarshall(GetPermissionByCodeResponse getPermissionByCodeResponse, UnmarshallerContext _ctx) {
		
		getPermissionByCodeResponse.setRequestId(_ctx.stringValue("GetPermissionByCodeResponse.RequestId"));
		getPermissionByCodeResponse.setCode(_ctx.stringValue("GetPermissionByCodeResponse.Code"));
		getPermissionByCodeResponse.setMessage(_ctx.stringValue("GetPermissionByCodeResponse.Message"));
	 
	 	return getPermissionByCodeResponse;
	}
}