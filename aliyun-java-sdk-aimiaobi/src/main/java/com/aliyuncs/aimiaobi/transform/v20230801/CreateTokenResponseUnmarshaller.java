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

package com.aliyuncs.aimiaobi.transform.v20230801;

import com.aliyuncs.aimiaobi.model.v20230801.CreateTokenResponse;
import com.aliyuncs.aimiaobi.model.v20230801.CreateTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTokenResponseUnmarshaller {

	public static CreateTokenResponse unmarshall(CreateTokenResponse createTokenResponse, UnmarshallerContext _ctx) {
		
		createTokenResponse.setRequestId(_ctx.stringValue("CreateTokenResponse.RequestId"));
		createTokenResponse.setSuccess(_ctx.booleanValue("CreateTokenResponse.Success"));
		createTokenResponse.setCode(_ctx.stringValue("CreateTokenResponse.Code"));
		createTokenResponse.setMessage(_ctx.stringValue("CreateTokenResponse.Message"));
		createTokenResponse.setHttpStatusCode(_ctx.integerValue("CreateTokenResponse.HttpStatusCode"));

		Data data = new Data();
		data.setToken(_ctx.stringValue("CreateTokenResponse.Data.Token"));
		data.setExpiredTime(_ctx.longValue("CreateTokenResponse.Data.ExpiredTime"));
		createTokenResponse.setData(data);
	 
	 	return createTokenResponse;
	}
}