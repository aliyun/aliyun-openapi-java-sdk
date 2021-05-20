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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.CheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourceResponseUnmarshaller {

	public static CheckResourceResponse unmarshall(CheckResourceResponse checkResourceResponse, UnmarshallerContext _ctx) {
		
		checkResourceResponse.setGmtWakeup(_ctx.stringValue("CheckResourceResponse.GmtWakeup"));
		checkResourceResponse.setHid(_ctx.longValue("CheckResourceResponse.Hid"));
		checkResourceResponse.setMessage(_ctx.stringValue("CheckResourceResponse.Message"));
		checkResourceResponse.setTaskIdentifier(_ctx.stringValue("CheckResourceResponse.TaskIdentifier"));
		checkResourceResponse.setSuccess(_ctx.booleanValue("CheckResourceResponse.Success"));
		checkResourceResponse.setUrl(_ctx.stringValue("CheckResourceResponse.Url"));
		checkResourceResponse.setInterrupt(_ctx.booleanValue("CheckResourceResponse.Interrupt"));
		checkResourceResponse.setInvoker(_ctx.stringValue("CheckResourceResponse.Invoker"));
		checkResourceResponse.setTaskExtraData(_ctx.stringValue("CheckResourceResponse.TaskExtraData"));
		checkResourceResponse.setCountry(_ctx.stringValue("CheckResourceResponse.Country"));
		checkResourceResponse.setPrompt(_ctx.stringValue("CheckResourceResponse.Prompt"));
		checkResourceResponse.setLevel(_ctx.longValue("CheckResourceResponse.Level"));
		checkResourceResponse.setPk(_ctx.stringValue("CheckResourceResponse.Pk"));
		checkResourceResponse.setBid(_ctx.stringValue("CheckResourceResponse.Bid"));
	 
	 	return checkResourceResponse;
	}
}