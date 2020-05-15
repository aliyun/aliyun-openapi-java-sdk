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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.GenerateTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateTokenResponseUnmarshaller {

	public static GenerateTokenResponse unmarshall(GenerateTokenResponse generateTokenResponse, UnmarshallerContext _ctx) {
		
		generateTokenResponse.setRequestId(_ctx.stringValue("GenerateTokenResponse.RequestId"));
		generateTokenResponse.setSuccess(_ctx.booleanValue("GenerateTokenResponse.Success"));
		generateTokenResponse.setCode(_ctx.stringValue("GenerateTokenResponse.Code"));
		generateTokenResponse.setMessage(_ctx.stringValue("GenerateTokenResponse.Message"));
		generateTokenResponse.setToken(_ctx.stringValue("GenerateTokenResponse.Token"));
	 
	 	return generateTokenResponse;
	}
}