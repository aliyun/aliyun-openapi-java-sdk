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

package com.aliyuncs.savingplan.transform.v20200715;

import com.aliyuncs.savingplan.model.v20200715.CheckResourceActionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourceActionResponseUnmarshaller {

	public static CheckResourceActionResponse unmarshall(CheckResourceActionResponse checkResourceActionResponse, UnmarshallerContext _ctx) {
		
		checkResourceActionResponse.setInvoker(_ctx.stringValue("CheckResourceActionResponse.Invoker"));
		checkResourceActionResponse.setPk(_ctx.stringValue("CheckResourceActionResponse.Pk"));
		checkResourceActionResponse.setSuccess(_ctx.booleanValue("CheckResourceActionResponse.Success"));
		checkResourceActionResponse.setGmtWakeup(_ctx.stringValue("CheckResourceActionResponse.GmtWakeup"));
		checkResourceActionResponse.setMessage(_ctx.stringValue("CheckResourceActionResponse.Message"));
		checkResourceActionResponse.setUrl(_ctx.stringValue("CheckResourceActionResponse.Url"));
		checkResourceActionResponse.setTaskExtraData(_ctx.stringValue("CheckResourceActionResponse.TaskExtraData"));
		checkResourceActionResponse.setBid(_ctx.stringValue("CheckResourceActionResponse.Bid"));
		checkResourceActionResponse.setPrompt(_ctx.stringValue("CheckResourceActionResponse.Prompt"));
		checkResourceActionResponse.setTaskIdentifier(_ctx.stringValue("CheckResourceActionResponse.TaskIdentifier"));
		checkResourceActionResponse.setHid(_ctx.longValue("CheckResourceActionResponse.Hid"));
		checkResourceActionResponse.setCountry(_ctx.stringValue("CheckResourceActionResponse.Country"));
		checkResourceActionResponse.setInterrupt(_ctx.booleanValue("CheckResourceActionResponse.Interrupt"));
		checkResourceActionResponse.setLevel(_ctx.longValue("CheckResourceActionResponse.Level"));
	 
	 	return checkResourceActionResponse;
	}
}