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

import com.aliyuncs.hbr.model.v20170908.SendMobileVerifyCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendMobileVerifyCodeResponseUnmarshaller {

	public static SendMobileVerifyCodeResponse unmarshall(SendMobileVerifyCodeResponse sendMobileVerifyCodeResponse, UnmarshallerContext _ctx) {
		
		sendMobileVerifyCodeResponse.setRequestId(_ctx.stringValue("SendMobileVerifyCodeResponse.RequestId"));
		sendMobileVerifyCodeResponse.setSuccess(_ctx.booleanValue("SendMobileVerifyCodeResponse.Success"));
		sendMobileVerifyCodeResponse.setCode(_ctx.stringValue("SendMobileVerifyCodeResponse.Code"));
		sendMobileVerifyCodeResponse.setMessage(_ctx.stringValue("SendMobileVerifyCodeResponse.Message"));
	 
	 	return sendMobileVerifyCodeResponse;
	}
}