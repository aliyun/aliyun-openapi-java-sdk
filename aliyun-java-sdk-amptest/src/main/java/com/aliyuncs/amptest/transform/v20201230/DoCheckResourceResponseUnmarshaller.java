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

package com.aliyuncs.amptest.transform.v20201230;

import com.aliyuncs.amptest.model.v20201230.DoCheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoCheckResourceResponseUnmarshaller {

	public static DoCheckResourceResponse unmarshall(DoCheckResourceResponse doCheckResourceResponse, UnmarshallerContext _ctx) {
		
		doCheckResourceResponse.setInvoker(_ctx.stringValue("DoCheckResourceResponse.Invoker"));
		doCheckResourceResponse.setPk(_ctx.stringValue("DoCheckResourceResponse.Pk"));
		doCheckResourceResponse.setGmtWakeup(_ctx.stringValue("DoCheckResourceResponse.GmtWakeup"));
		doCheckResourceResponse.setSuccess(_ctx.booleanValue("DoCheckResourceResponse.Success"));
		doCheckResourceResponse.setUrl(_ctx.stringValue("DoCheckResourceResponse.Url"));
		doCheckResourceResponse.setMessage(_ctx.stringValue("DoCheckResourceResponse.Message"));
		doCheckResourceResponse.setTaskExtraData(_ctx.stringValue("DoCheckResourceResponse.TaskExtraData"));
		doCheckResourceResponse.setBid(_ctx.stringValue("DoCheckResourceResponse.Bid"));
		doCheckResourceResponse.setPrompt(_ctx.stringValue("DoCheckResourceResponse.Prompt"));
		doCheckResourceResponse.setTaskIdentifier(_ctx.stringValue("DoCheckResourceResponse.TaskIdentifier"));
		doCheckResourceResponse.setHid(_ctx.longValue("DoCheckResourceResponse.Hid"));
		doCheckResourceResponse.setCountry(_ctx.stringValue("DoCheckResourceResponse.Country"));
		doCheckResourceResponse.setInterrupt(_ctx.booleanValue("DoCheckResourceResponse.Interrupt"));
		doCheckResourceResponse.setLevel(_ctx.longValue("DoCheckResourceResponse.Level"));
	 
	 	return doCheckResourceResponse;
	}
}