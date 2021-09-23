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

import com.aliyuncs.savingplan.model.v20200715.LogicalDeleteResourceActionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class LogicalDeleteResourceActionResponseUnmarshaller {

	public static LogicalDeleteResourceActionResponse unmarshall(LogicalDeleteResourceActionResponse logicalDeleteResourceActionResponse, UnmarshallerContext _ctx) {
		
		logicalDeleteResourceActionResponse.setInvoker(_ctx.stringValue("LogicalDeleteResourceActionResponse.Invoker"));
		logicalDeleteResourceActionResponse.setPk(_ctx.stringValue("LogicalDeleteResourceActionResponse.Pk"));
		logicalDeleteResourceActionResponse.setGmtWakeup(_ctx.stringValue("LogicalDeleteResourceActionResponse.GmtWakeup"));
		logicalDeleteResourceActionResponse.setSuccess(_ctx.booleanValue("LogicalDeleteResourceActionResponse.Success"));
		logicalDeleteResourceActionResponse.setHid(_ctx.longValue("LogicalDeleteResourceActionResponse.Hid"));
		logicalDeleteResourceActionResponse.setMessage(_ctx.stringValue("LogicalDeleteResourceActionResponse.Message"));
		logicalDeleteResourceActionResponse.setCountry(_ctx.stringValue("LogicalDeleteResourceActionResponse.Country"));
		logicalDeleteResourceActionResponse.setInterrupt(_ctx.booleanValue("LogicalDeleteResourceActionResponse.Interrupt"));
		logicalDeleteResourceActionResponse.setTaskExtraData(_ctx.stringValue("LogicalDeleteResourceActionResponse.TaskExtraData"));
		logicalDeleteResourceActionResponse.setBid(_ctx.stringValue("LogicalDeleteResourceActionResponse.Bid"));
		logicalDeleteResourceActionResponse.setTaskIdentifier(_ctx.stringValue("LogicalDeleteResourceActionResponse.TaskIdentifier"));
	 
	 	return logicalDeleteResourceActionResponse;
	}
}