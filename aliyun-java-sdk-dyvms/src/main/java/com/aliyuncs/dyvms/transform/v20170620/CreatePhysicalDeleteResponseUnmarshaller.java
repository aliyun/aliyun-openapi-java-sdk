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

import com.aliyuncs.dyvms.model.v20170620.CreatePhysicalDeleteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePhysicalDeleteResponseUnmarshaller {

	public static CreatePhysicalDeleteResponse unmarshall(CreatePhysicalDeleteResponse createPhysicalDeleteResponse, UnmarshallerContext _ctx) {
		
		createPhysicalDeleteResponse.setInterrupt(_ctx.booleanValue("CreatePhysicalDeleteResponse.Interrupt"));
		createPhysicalDeleteResponse.setInvoker(_ctx.stringValue("CreatePhysicalDeleteResponse.Invoker"));
		createPhysicalDeleteResponse.setPk(_ctx.stringValue("CreatePhysicalDeleteResponse.Pk"));
		createPhysicalDeleteResponse.setBid(_ctx.stringValue("CreatePhysicalDeleteResponse.Bid"));
		createPhysicalDeleteResponse.setHid(_ctx.longValue("CreatePhysicalDeleteResponse.Hid"));
		createPhysicalDeleteResponse.setCountry(_ctx.stringValue("CreatePhysicalDeleteResponse.Country"));
		createPhysicalDeleteResponse.setTaskIdentifier(_ctx.stringValue("CreatePhysicalDeleteResponse.TaskIdentifier"));
		createPhysicalDeleteResponse.setTaskExtraData(_ctx.stringValue("CreatePhysicalDeleteResponse.TaskExtraData"));
		createPhysicalDeleteResponse.setGmtWakeup(_ctx.stringValue("CreatePhysicalDeleteResponse.GmtWakeup"));
		createPhysicalDeleteResponse.setSuccess(_ctx.booleanValue("CreatePhysicalDeleteResponse.Success"));
		createPhysicalDeleteResponse.setMessage(_ctx.stringValue("CreatePhysicalDeleteResponse.Message"));
	 
	 	return createPhysicalDeleteResponse;
	}
}