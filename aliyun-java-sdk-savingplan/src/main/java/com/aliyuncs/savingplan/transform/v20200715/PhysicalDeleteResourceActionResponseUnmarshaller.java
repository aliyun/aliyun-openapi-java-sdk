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

import com.aliyuncs.savingplan.model.v20200715.PhysicalDeleteResourceActionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhysicalDeleteResourceActionResponseUnmarshaller {

	public static PhysicalDeleteResourceActionResponse unmarshall(PhysicalDeleteResourceActionResponse physicalDeleteResourceActionResponse, UnmarshallerContext _ctx) {
		
		physicalDeleteResourceActionResponse.setInvoker(_ctx.stringValue("PhysicalDeleteResourceActionResponse.Invoker"));
		physicalDeleteResourceActionResponse.setPk(_ctx.stringValue("PhysicalDeleteResourceActionResponse.Pk"));
		physicalDeleteResourceActionResponse.setGmtWakeup(_ctx.stringValue("PhysicalDeleteResourceActionResponse.GmtWakeup"));
		physicalDeleteResourceActionResponse.setSuccess(_ctx.booleanValue("PhysicalDeleteResourceActionResponse.Success"));
		physicalDeleteResourceActionResponse.setHid(_ctx.longValue("PhysicalDeleteResourceActionResponse.Hid"));
		physicalDeleteResourceActionResponse.setMessage(_ctx.stringValue("PhysicalDeleteResourceActionResponse.Message"));
		physicalDeleteResourceActionResponse.setCountry(_ctx.stringValue("PhysicalDeleteResourceActionResponse.Country"));
		physicalDeleteResourceActionResponse.setInterrupt(_ctx.booleanValue("PhysicalDeleteResourceActionResponse.Interrupt"));
		physicalDeleteResourceActionResponse.setTaskExtraData(_ctx.stringValue("PhysicalDeleteResourceActionResponse.TaskExtraData"));
		physicalDeleteResourceActionResponse.setBid(_ctx.stringValue("PhysicalDeleteResourceActionResponse.Bid"));
		physicalDeleteResourceActionResponse.setTaskIdentifier(_ctx.stringValue("PhysicalDeleteResourceActionResponse.TaskIdentifier"));
	 
	 	return physicalDeleteResourceActionResponse;
	}
}