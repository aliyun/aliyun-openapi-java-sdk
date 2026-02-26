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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.AccountCheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AccountCheckResourceResponseUnmarshaller {

	public static AccountCheckResourceResponse unmarshall(AccountCheckResourceResponse accountCheckResourceResponse, UnmarshallerContext _ctx) {
		
		accountCheckResourceResponse.setInvoker(_ctx.stringValue("AccountCheckResourceResponse.Invoker"));
		accountCheckResourceResponse.setPk(_ctx.stringValue("AccountCheckResourceResponse.Pk"));
		accountCheckResourceResponse.setGmtWakeup(_ctx.stringValue("AccountCheckResourceResponse.GmtWakeup"));
		accountCheckResourceResponse.setSuccess(_ctx.booleanValue("AccountCheckResourceResponse.Success"));
		accountCheckResourceResponse.setUrl(_ctx.stringValue("AccountCheckResourceResponse.Url"));
		accountCheckResourceResponse.setMessage(_ctx.stringValue("AccountCheckResourceResponse.Message"));
		accountCheckResourceResponse.setTaskExtraData(_ctx.stringValue("AccountCheckResourceResponse.TaskExtraData"));
		accountCheckResourceResponse.setBid(_ctx.stringValue("AccountCheckResourceResponse.Bid"));
		accountCheckResourceResponse.setPrompt(_ctx.stringValue("AccountCheckResourceResponse.Prompt"));
		accountCheckResourceResponse.setTaskIdentifier(_ctx.stringValue("AccountCheckResourceResponse.TaskIdentifier"));
		accountCheckResourceResponse.setHid(_ctx.longValue("AccountCheckResourceResponse.Hid"));
		accountCheckResourceResponse.setCountry(_ctx.stringValue("AccountCheckResourceResponse.Country"));
		accountCheckResourceResponse.setInterrupt(_ctx.booleanValue("AccountCheckResourceResponse.Interrupt"));
		accountCheckResourceResponse.setLevel(_ctx.longValue("AccountCheckResourceResponse.Level"));
	 
	 	return accountCheckResourceResponse;
	}
}