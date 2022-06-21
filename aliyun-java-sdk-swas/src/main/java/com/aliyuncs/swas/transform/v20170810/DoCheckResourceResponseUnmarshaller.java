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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.DoCheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoCheckResourceResponseUnmarshaller {

	public static DoCheckResourceResponse unmarshall(DoCheckResourceResponse doCheckResourceResponse, UnmarshallerContext _ctx) {
		
		doCheckResourceResponse.setGmtWakeup(_ctx.stringValue("DoCheckResourceResponse.GmtWakeup"));
		doCheckResourceResponse.setHid(_ctx.longValue("DoCheckResourceResponse.Hid"));
		doCheckResourceResponse.setMessage(_ctx.stringValue("DoCheckResourceResponse.Message"));
		doCheckResourceResponse.setTaskIdentifier(_ctx.stringValue("DoCheckResourceResponse.TaskIdentifier"));
		doCheckResourceResponse.setSuccess(_ctx.booleanValue("DoCheckResourceResponse.Success"));
		doCheckResourceResponse.setUrl(_ctx.stringValue("DoCheckResourceResponse.Url"));
		doCheckResourceResponse.setInterrupt(_ctx.booleanValue("DoCheckResourceResponse.Interrupt"));
		doCheckResourceResponse.setInvoker(_ctx.stringValue("DoCheckResourceResponse.Invoker"));
		doCheckResourceResponse.setTaskExtraData(_ctx.stringValue("DoCheckResourceResponse.TaskExtraData"));
		doCheckResourceResponse.setCountry(_ctx.stringValue("DoCheckResourceResponse.Country"));
		doCheckResourceResponse.setPrompt(_ctx.stringValue("DoCheckResourceResponse.Prompt"));
		doCheckResourceResponse.setLevel(_ctx.longValue("DoCheckResourceResponse.Level"));
		doCheckResourceResponse.setPk(_ctx.stringValue("DoCheckResourceResponse.Pk"));
		doCheckResourceResponse.setBid(_ctx.stringValue("DoCheckResourceResponse.Bid"));
	 
	 	return doCheckResourceResponse;
	}
}