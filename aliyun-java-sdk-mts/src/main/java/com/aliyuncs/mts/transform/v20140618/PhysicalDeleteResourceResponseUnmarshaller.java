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

import com.aliyuncs.mts.model.v20140618.PhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhysicalDeleteResourceResponseUnmarshaller {

	public static PhysicalDeleteResourceResponse unmarshall(PhysicalDeleteResourceResponse physicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		physicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("PhysicalDeleteResourceResponse.GmtWakeup"));
		physicalDeleteResourceResponse.setHid(_ctx.longValue("PhysicalDeleteResourceResponse.Hid"));
		physicalDeleteResourceResponse.setInvoker(_ctx.stringValue("PhysicalDeleteResourceResponse.Invoker"));
		physicalDeleteResourceResponse.setMessage(_ctx.stringValue("PhysicalDeleteResourceResponse.Message"));
		physicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("PhysicalDeleteResourceResponse.TaskIdentifier"));
		physicalDeleteResourceResponse.setTaskExtraData(_ctx.stringValue("PhysicalDeleteResourceResponse.TaskExtraData"));
		physicalDeleteResourceResponse.setCountry(_ctx.stringValue("PhysicalDeleteResourceResponse.Country"));
		physicalDeleteResourceResponse.setPk(_ctx.stringValue("PhysicalDeleteResourceResponse.Pk"));
		physicalDeleteResourceResponse.setBid(_ctx.stringValue("PhysicalDeleteResourceResponse.Bid"));
		physicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("PhysicalDeleteResourceResponse.Success"));
		physicalDeleteResourceResponse.setInterrupt(_ctx.booleanValue("PhysicalDeleteResourceResponse.Interrupt"));
	 
	 	return physicalDeleteResourceResponse;
	}
}