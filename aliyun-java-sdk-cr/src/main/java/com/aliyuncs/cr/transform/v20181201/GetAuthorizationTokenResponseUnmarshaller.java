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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetAuthorizationTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuthorizationTokenResponseUnmarshaller {

	public static GetAuthorizationTokenResponse unmarshall(GetAuthorizationTokenResponse getAuthorizationTokenResponse, UnmarshallerContext _ctx) {
		
		getAuthorizationTokenResponse.setRequestId(_ctx.stringValue("GetAuthorizationTokenResponse.RequestId"));
		getAuthorizationTokenResponse.setIsSuccess(_ctx.booleanValue("GetAuthorizationTokenResponse.IsSuccess"));
		getAuthorizationTokenResponse.setCode(_ctx.stringValue("GetAuthorizationTokenResponse.Code"));
		getAuthorizationTokenResponse.setTempUsername(_ctx.stringValue("GetAuthorizationTokenResponse.TempUsername"));
		getAuthorizationTokenResponse.setAuthorizationToken(_ctx.stringValue("GetAuthorizationTokenResponse.AuthorizationToken"));
		getAuthorizationTokenResponse.setExpireTime(_ctx.longValue("GetAuthorizationTokenResponse.ExpireTime"));
	 
	 	return getAuthorizationTokenResponse;
	}
}