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

package com.aliyuncs.xtrace.transform.v20190808;

import com.aliyuncs.xtrace.model.v20190808.GetTokenResponse;
import com.aliyuncs.xtrace.model.v20190808.GetTokenResponse.Token;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTokenResponseUnmarshaller {

	public static GetTokenResponse unmarshall(GetTokenResponse getTokenResponse, UnmarshallerContext _ctx) {
		
		getTokenResponse.setRequestId(_ctx.stringValue("GetTokenResponse.RequestId"));

		Token token = new Token();
		token.setDomain(_ctx.stringValue("GetTokenResponse.Token.Domain"));
		token.setLicenseKey(_ctx.stringValue("GetTokenResponse.Token.LicenseKey"));
		token.setPid(_ctx.stringValue("GetTokenResponse.Token.Pid"));
		token.setInternalDomain(_ctx.stringValue("GetTokenResponse.Token.InternalDomain"));
		getTokenResponse.setToken(token);
	 
	 	return getTokenResponse;
	}
}