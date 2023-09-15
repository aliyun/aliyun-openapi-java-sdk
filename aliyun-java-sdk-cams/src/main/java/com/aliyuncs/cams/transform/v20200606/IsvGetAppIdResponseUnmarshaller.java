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

import com.aliyuncs.cams.model.v20200606.IsvGetAppIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class IsvGetAppIdResponseUnmarshaller {

	public static IsvGetAppIdResponse unmarshall(IsvGetAppIdResponse isvGetAppIdResponse, UnmarshallerContext _ctx) {
		
		isvGetAppIdResponse.setRequestId(_ctx.stringValue("IsvGetAppIdResponse.RequestId"));
		isvGetAppIdResponse.setCode(_ctx.stringValue("IsvGetAppIdResponse.Code"));
		isvGetAppIdResponse.setMessage(_ctx.stringValue("IsvGetAppIdResponse.Message"));
		isvGetAppIdResponse.setAppId(_ctx.stringValue("IsvGetAppIdResponse.AppId"));
		isvGetAppIdResponse.setAccessDeniedDetail(_ctx.stringValue("IsvGetAppIdResponse.AccessDeniedDetail"));
	 
	 	return isvGetAppIdResponse;
	}
}