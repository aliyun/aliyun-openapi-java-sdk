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

import com.aliyuncs.dypnsapi.model.v20170525.CheckSmsVerifyCodeResponse;
import com.aliyuncs.dypnsapi.model.v20170525.CheckSmsVerifyCodeResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckSmsVerifyCodeResponseUnmarshaller {

	public static CheckSmsVerifyCodeResponse unmarshall(CheckSmsVerifyCodeResponse checkSmsVerifyCodeResponse, UnmarshallerContext _ctx) {
		
		checkSmsVerifyCodeResponse.setAccessDeniedDetail(_ctx.stringValue("CheckSmsVerifyCodeResponse.AccessDeniedDetail"));
		checkSmsVerifyCodeResponse.setMessage(_ctx.stringValue("CheckSmsVerifyCodeResponse.Message"));
		checkSmsVerifyCodeResponse.setCode(_ctx.stringValue("CheckSmsVerifyCodeResponse.Code"));
		checkSmsVerifyCodeResponse.setSuccess(_ctx.booleanValue("CheckSmsVerifyCodeResponse.Success"));

		Model model = new Model();
		model.setOutId(_ctx.stringValue("CheckSmsVerifyCodeResponse.Model.OutId"));
		model.setVerifyResult(_ctx.stringValue("CheckSmsVerifyCodeResponse.Model.VerifyResult"));
		checkSmsVerifyCodeResponse.setModel(model);
	 
	 	return checkSmsVerifyCodeResponse;
	}
}