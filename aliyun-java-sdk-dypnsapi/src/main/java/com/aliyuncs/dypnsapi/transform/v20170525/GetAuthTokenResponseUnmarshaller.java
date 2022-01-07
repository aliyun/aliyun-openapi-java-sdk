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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.GetAuthTokenResponse;
import com.aliyuncs.dypnsapi.model.v20170525.GetAuthTokenResponse.TokenInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuthTokenResponseUnmarshaller {

	public static GetAuthTokenResponse unmarshall(GetAuthTokenResponse getAuthTokenResponse, UnmarshallerContext _ctx) {
		
		getAuthTokenResponse.setRequestId(_ctx.stringValue("GetAuthTokenResponse.RequestId"));
		getAuthTokenResponse.setCode(_ctx.stringValue("GetAuthTokenResponse.Code"));
		getAuthTokenResponse.setMessage(_ctx.stringValue("GetAuthTokenResponse.Message"));

		TokenInfo tokenInfo = new TokenInfo();
		tokenInfo.setJwtToken(_ctx.stringValue("GetAuthTokenResponse.TokenInfo.JwtToken"));
		tokenInfo.setAccessToken(_ctx.stringValue("GetAuthTokenResponse.TokenInfo.AccessToken"));
		getAuthTokenResponse.setTokenInfo(tokenInfo);
	 
	 	return getAuthTokenResponse;
	}
}