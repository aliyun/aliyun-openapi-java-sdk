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

	public static PhysicalDeleteResourceResponse unmarshall(PhysicalDeleteResourceResponse physicalDeleteResourceResponse, UnmarshallerContext context) {
		
		physicalDeleteResourceResponse.setInterrupt(context.booleanValue("PhysicalDeleteResourceResponse.Interrupt"));
		physicalDeleteResourceResponse.setInvoker(context.stringValue("PhysicalDeleteResourceResponse.Invoker"));
		physicalDeleteResourceResponse.setPk(context.stringValue("PhysicalDeleteResourceResponse.Pk"));
		physicalDeleteResourceResponse.setBid(context.stringValue("PhysicalDeleteResourceResponse.Bid"));
		physicalDeleteResourceResponse.setHid(context.longValue("PhysicalDeleteResourceResponse.Hid"));
		physicalDeleteResourceResponse.setCountry(context.stringValue("PhysicalDeleteResourceResponse.Country"));
		physicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("PhysicalDeleteResourceResponse.TaskIdentifier"));
		physicalDeleteResourceResponse.setTaskExtraData(context.stringValue("PhysicalDeleteResourceResponse.TaskExtraData"));
		physicalDeleteResourceResponse.setGmtWakeup(context.stringValue("PhysicalDeleteResourceResponse.GmtWakeup"));
		physicalDeleteResourceResponse.setSuccess(context.booleanValue("PhysicalDeleteResourceResponse.Success"));
		physicalDeleteResourceResponse.setMessage(context.stringValue("PhysicalDeleteResourceResponse.Message"));
	 
	 	return physicalDeleteResourceResponse;
	}
}