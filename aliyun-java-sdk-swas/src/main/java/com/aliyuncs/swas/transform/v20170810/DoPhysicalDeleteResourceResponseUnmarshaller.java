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

import com.aliyuncs.swas.model.v20170810.DoPhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoPhysicalDeleteResourceResponseUnmarshaller {

	public static DoPhysicalDeleteResourceResponse unmarshall(DoPhysicalDeleteResourceResponse doPhysicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		doPhysicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("DoPhysicalDeleteResourceResponse.GmtWakeup"));
		doPhysicalDeleteResourceResponse.setHid(_ctx.longValue("DoPhysicalDeleteResourceResponse.Hid"));
		doPhysicalDeleteResourceResponse.setInvoker(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Invoker"));
		doPhysicalDeleteResourceResponse.setMessage(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Message"));
		doPhysicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("DoPhysicalDeleteResourceResponse.TaskIdentifier"));
		doPhysicalDeleteResourceResponse.setTaskExtraData(_ctx.stringValue("DoPhysicalDeleteResourceResponse.TaskExtraData"));
		doPhysicalDeleteResourceResponse.setCountry(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Country"));
		doPhysicalDeleteResourceResponse.setPk(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Pk"));
		doPhysicalDeleteResourceResponse.setBid(_ctx.stringValue("DoPhysicalDeleteResourceResponse.Bid"));
		doPhysicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("DoPhysicalDeleteResourceResponse.Success"));
		doPhysicalDeleteResourceResponse.setInterrupt(_ctx.booleanValue("DoPhysicalDeleteResourceResponse.Interrupt"));
	 
	 	return doPhysicalDeleteResourceResponse;
	}
}