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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.CheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourceResponseUnmarshaller {

	public static CheckResourceResponse unmarshall(CheckResourceResponse checkResourceResponse, UnmarshallerContext _ctx) {
		
		checkResourceResponse.setInterrupt(_ctx.booleanValue("CheckResourceResponse.Interrupt"));
		checkResourceResponse.setInvoker(_ctx.stringValue("CheckResourceResponse.Invoker"));
		checkResourceResponse.setPk(_ctx.stringValue("CheckResourceResponse.Pk"));
		checkResourceResponse.setBid(_ctx.stringValue("CheckResourceResponse.Bid"));
		checkResourceResponse.setHid(_ctx.longValue("CheckResourceResponse.Hid"));
		checkResourceResponse.setCountry(_ctx.stringValue("CheckResourceResponse.Country"));
		checkResourceResponse.setTaskIdentifier(_ctx.stringValue("CheckResourceResponse.TaskIdentifier"));
		checkResourceResponse.setTaskExtraData(_ctx.stringValue("CheckResourceResponse.TaskExtraData"));
		checkResourceResponse.setGmtWakeup(_ctx.stringValue("CheckResourceResponse.GmtWakeup"));
		checkResourceResponse.setSuccess(_ctx.booleanValue("CheckResourceResponse.Success"));
		checkResourceResponse.setMessage(_ctx.stringValue("CheckResourceResponse.Message"));
		checkResourceResponse.setLevel(_ctx.longValue("CheckResourceResponse.Level"));
		checkResourceResponse.setUrl(_ctx.stringValue("CheckResourceResponse.Url"));
		checkResourceResponse.setPrompt(_ctx.stringValue("CheckResourceResponse.Prompt"));
	 
	 	return checkResourceResponse;
	}
}