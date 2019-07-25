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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.DoPhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoPhysicalDeleteResourceResponseUnmarshaller {

	public static DoPhysicalDeleteResourceResponse unmarshall(DoPhysicalDeleteResourceResponse doPhysicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		doPhysicalDeleteResourceResponse.setInterrupt(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Interrupt"));
		doPhysicalDeleteResourceResponse.setInvoker(_ctx.longValue("DoPhysicalDeleteResourceResponse.Invoker"));
		doPhysicalDeleteResourceResponse.setPk(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Pk"));
		doPhysicalDeleteResourceResponse.setBid(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Bid"));
		doPhysicalDeleteResourceResponse.setHid(_ctx.longValue("DoPhysicalDeleteResourceResponse.Hid"));
		doPhysicalDeleteResourceResponse.setCountry(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Country"));
		doPhysicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("DoPhysicalDeleteResourceResponse.TaskIdentifier"));
		doPhysicalDeleteResourceResponse.setTaskIdentifier1(_ctx.stringValue("DoPhysicalDeleteResourceResponse.TaskIdentifier"));
		doPhysicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("DoPhysicalDeleteResourceResponse.GmtWakeup"));
		doPhysicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("DoPhysicalDeleteResourceResponse.Success"));
		doPhysicalDeleteResourceResponse.setMessage(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Message"));
		doPhysicalDeleteResourceResponse.setLevel(_ctx.longValue("DoPhysicalDeleteResourceResponse.Level"));
		doPhysicalDeleteResourceResponse.setPrompt(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Prompt"));
	 
	 	return doPhysicalDeleteResourceResponse;
	}
}