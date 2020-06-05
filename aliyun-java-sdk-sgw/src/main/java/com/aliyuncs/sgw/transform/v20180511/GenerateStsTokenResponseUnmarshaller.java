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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.GenerateStsTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateStsTokenResponseUnmarshaller {

	public static GenerateStsTokenResponse unmarshall(GenerateStsTokenResponse generateStsTokenResponse, UnmarshallerContext _ctx) {
		
		generateStsTokenResponse.setRequestId(_ctx.stringValue("GenerateStsTokenResponse.RequestId"));
		generateStsTokenResponse.setSuccess(_ctx.booleanValue("GenerateStsTokenResponse.Success"));
		generateStsTokenResponse.setCode(_ctx.stringValue("GenerateStsTokenResponse.Code"));
		generateStsTokenResponse.setMessage(_ctx.stringValue("GenerateStsTokenResponse.Message"));
		generateStsTokenResponse.setAccessKeyId(_ctx.stringValue("GenerateStsTokenResponse.AccessKeyId"));
		generateStsTokenResponse.setAccessKeySecret(_ctx.stringValue("GenerateStsTokenResponse.AccessKeySecret"));
		generateStsTokenResponse.setExpiration(_ctx.stringValue("GenerateStsTokenResponse.Expiration"));
		generateStsTokenResponse.setSecurityToken(_ctx.stringValue("GenerateStsTokenResponse.SecurityToken"));
		generateStsTokenResponse.setSupportBundleTarget(_ctx.stringValue("GenerateStsTokenResponse.SupportBundleTarget"));
		generateStsTokenResponse.setEnvironment(_ctx.stringValue("GenerateStsTokenResponse.Environment"));
	 
	 	return generateStsTokenResponse;
	}
}