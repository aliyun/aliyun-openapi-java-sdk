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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.CreateLogicalDeleteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLogicalDeleteResponseUnmarshaller {

	public static CreateLogicalDeleteResponse unmarshall(CreateLogicalDeleteResponse createLogicalDeleteResponse, UnmarshallerContext _ctx) {
		
		createLogicalDeleteResponse.setInterrupt(_ctx.booleanValue("CreateLogicalDeleteResponse.Interrupt"));
		createLogicalDeleteResponse.setInvoker(_ctx.stringValue("CreateLogicalDeleteResponse.Invoker"));
		createLogicalDeleteResponse.setPk(_ctx.stringValue("CreateLogicalDeleteResponse.Pk"));
		createLogicalDeleteResponse.setBid(_ctx.stringValue("CreateLogicalDeleteResponse.Bid"));
		createLogicalDeleteResponse.setHid(_ctx.longValue("CreateLogicalDeleteResponse.Hid"));
		createLogicalDeleteResponse.setCountry(_ctx.stringValue("CreateLogicalDeleteResponse.Country"));
		createLogicalDeleteResponse.setTaskIdentifier(_ctx.stringValue("CreateLogicalDeleteResponse.TaskIdentifier"));
		createLogicalDeleteResponse.setTaskExtraData(_ctx.stringValue("CreateLogicalDeleteResponse.TaskExtraData"));
		createLogicalDeleteResponse.setGmtWakeup(_ctx.stringValue("CreateLogicalDeleteResponse.GmtWakeup"));
		createLogicalDeleteResponse.setSuccess(_ctx.booleanValue("CreateLogicalDeleteResponse.Success"));
		createLogicalDeleteResponse.setMessage(_ctx.stringValue("CreateLogicalDeleteResponse.Message"));
	 
	 	return createLogicalDeleteResponse;
	}
}