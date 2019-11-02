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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.GetRtcTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRtcTokenResponseUnmarshaller {

	public static GetRtcTokenResponse unmarshall(GetRtcTokenResponse getRtcTokenResponse, UnmarshallerContext _ctx) {
		
		getRtcTokenResponse.setRequestId(_ctx.stringValue("GetRtcTokenResponse.RequestId"));
		getRtcTokenResponse.setModule(_ctx.stringValue("GetRtcTokenResponse.Module"));
		getRtcTokenResponse.setCode(_ctx.stringValue("GetRtcTokenResponse.Code"));
		getRtcTokenResponse.setMessage(_ctx.stringValue("GetRtcTokenResponse.Message"));
	 
	 	return getRtcTokenResponse;
	}
}