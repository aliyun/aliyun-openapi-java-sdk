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

import com.aliyuncs.dypnsapi.model.v20170525.SendSmsVerifyCodeResponse;
import com.aliyuncs.dypnsapi.model.v20170525.SendSmsVerifyCodeResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendSmsVerifyCodeResponseUnmarshaller {

	public static SendSmsVerifyCodeResponse unmarshall(SendSmsVerifyCodeResponse sendSmsVerifyCodeResponse, UnmarshallerContext _ctx) {
		
		sendSmsVerifyCodeResponse.setAccessDeniedDetail(_ctx.stringValue("SendSmsVerifyCodeResponse.AccessDeniedDetail"));
		sendSmsVerifyCodeResponse.setMessage(_ctx.stringValue("SendSmsVerifyCodeResponse.Message"));
		sendSmsVerifyCodeResponse.setCode(_ctx.stringValue("SendSmsVerifyCodeResponse.Code"));
		sendSmsVerifyCodeResponse.setSuccess(_ctx.booleanValue("SendSmsVerifyCodeResponse.Success"));

		Model model = new Model();
		model.setVerifyCode(_ctx.stringValue("SendSmsVerifyCodeResponse.Model.VerifyCode"));
		model.setRequestId(_ctx.stringValue("SendSmsVerifyCodeResponse.Model.RequestId"));
		model.setOutId(_ctx.stringValue("SendSmsVerifyCodeResponse.Model.OutId"));
		model.setBizId(_ctx.stringValue("SendSmsVerifyCodeResponse.Model.BizId"));
		sendSmsVerifyCodeResponse.setModel(model);
	 
	 	return sendSmsVerifyCodeResponse;
	}
}