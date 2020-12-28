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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.GetWebSocketTokenResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.GetWebSocketTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWebSocketTokenResponseUnmarshaller {

	public static GetWebSocketTokenResponse unmarshall(GetWebSocketTokenResponse getWebSocketTokenResponse, UnmarshallerContext _ctx) {
		
		getWebSocketTokenResponse.setRequestId(_ctx.stringValue("GetWebSocketTokenResponse.RequestId"));
		getWebSocketTokenResponse.setErrorCode(_ctx.integerValue("GetWebSocketTokenResponse.ErrorCode"));
		getWebSocketTokenResponse.setMessage(_ctx.stringValue("GetWebSocketTokenResponse.Message"));
		getWebSocketTokenResponse.setSuccess(_ctx.booleanValue("GetWebSocketTokenResponse.Success"));

		Data data = new Data();
		data.setAuthWsUrl(_ctx.stringValue("GetWebSocketTokenResponse.Data.AuthWsUrl"));
		data.setToken(_ctx.stringValue("GetWebSocketTokenResponse.Data.Token"));
		data.setWsOuterReConnTime(_ctx.stringValue("GetWebSocketTokenResponse.Data.WsOuterReConnTime"));
		getWebSocketTokenResponse.setData(data);
	 
	 	return getWebSocketTokenResponse;
	}
}