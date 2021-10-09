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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.RequestUserConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestUserConfigResponseUnmarshaller {

	public static RequestUserConfigResponse unmarshall(RequestUserConfigResponse requestUserConfigResponse, UnmarshallerContext _ctx) {
		
		requestUserConfigResponse.setRequestId(_ctx.stringValue("RequestUserConfigResponse.RequestId"));
		requestUserConfigResponse.setData(_ctx.stringValue("RequestUserConfigResponse.Data"));
		requestUserConfigResponse.setErrorMessage(_ctx.stringValue("RequestUserConfigResponse.ErrorMessage"));
		requestUserConfigResponse.setErrorCode(_ctx.stringValue("RequestUserConfigResponse.ErrorCode"));
		requestUserConfigResponse.setSuccess(_ctx.booleanValue("RequestUserConfigResponse.Success"));
	 
	 	return requestUserConfigResponse;
	}
}