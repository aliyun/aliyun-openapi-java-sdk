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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.GenerateActivateCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateActivateCodeResponseUnmarshaller {

	public static GenerateActivateCodeResponse unmarshall(GenerateActivateCodeResponse generateActivateCodeResponse, UnmarshallerContext _ctx) {
		
		generateActivateCodeResponse.setRequestId(_ctx.stringValue("GenerateActivateCodeResponse.RequestId"));
		generateActivateCodeResponse.setSuccess(_ctx.booleanValue("GenerateActivateCodeResponse.Success"));
		generateActivateCodeResponse.setCode(_ctx.stringValue("GenerateActivateCodeResponse.Code"));
		generateActivateCodeResponse.setMessage(_ctx.stringValue("GenerateActivateCodeResponse.Message"));
		generateActivateCodeResponse.setActivationCode(_ctx.longValue("GenerateActivateCodeResponse.ActivationCode"));
	 
	 	return generateActivateCodeResponse;
	}
}