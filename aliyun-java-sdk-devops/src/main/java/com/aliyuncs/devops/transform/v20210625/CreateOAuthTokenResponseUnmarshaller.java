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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.CreateOAuthTokenResponse;
import com.aliyuncs.devops.model.v20210625.CreateOAuthTokenResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOAuthTokenResponseUnmarshaller {

	public static CreateOAuthTokenResponse unmarshall(CreateOAuthTokenResponse createOAuthTokenResponse, UnmarshallerContext _ctx) {
		
		createOAuthTokenResponse.setErrorMessage(_ctx.stringValue("CreateOAuthTokenResponse.errorMessage"));
		createOAuthTokenResponse.setRequestId(_ctx.stringValue("CreateOAuthTokenResponse.requestId"));
		createOAuthTokenResponse.setErrorCode(_ctx.stringValue("CreateOAuthTokenResponse.errorCode"));
		createOAuthTokenResponse.setSuccess(_ctx.stringValue("CreateOAuthTokenResponse.success"));

		Result result = new Result();
		result.setAccessToken(_ctx.stringValue("CreateOAuthTokenResponse.result.accessToken"));
		result.setScope(_ctx.stringValue("CreateOAuthTokenResponse.result.scope"));
		result.setTokenType(_ctx.stringValue("CreateOAuthTokenResponse.result.tokenType"));
		result.setId(_ctx.stringValue("CreateOAuthTokenResponse.result.id"));
		createOAuthTokenResponse.setResult(result);
	 
	 	return createOAuthTokenResponse;
	}
}