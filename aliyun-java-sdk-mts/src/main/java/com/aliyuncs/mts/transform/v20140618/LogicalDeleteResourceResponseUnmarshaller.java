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

import com.aliyuncs.mts.model.v20140618.LogicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class LogicalDeleteResourceResponseUnmarshaller {

	public static LogicalDeleteResourceResponse unmarshall(LogicalDeleteResourceResponse logicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		logicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("LogicalDeleteResourceResponse.GmtWakeup"));
		logicalDeleteResourceResponse.setHid(_ctx.longValue("LogicalDeleteResourceResponse.Hid"));
		logicalDeleteResourceResponse.setInvoker(_ctx.stringValue("LogicalDeleteResourceResponse.Invoker"));
		logicalDeleteResourceResponse.setMessage(_ctx.stringValue("LogicalDeleteResourceResponse.Message"));
		logicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("LogicalDeleteResourceResponse.TaskIdentifier"));
		logicalDeleteResourceResponse.setTaskExtraData(_ctx.stringValue("LogicalDeleteResourceResponse.TaskExtraData"));
		logicalDeleteResourceResponse.setCountry(_ctx.stringValue("LogicalDeleteResourceResponse.Country"));
		logicalDeleteResourceResponse.setPk(_ctx.stringValue("LogicalDeleteResourceResponse.Pk"));
		logicalDeleteResourceResponse.setBid(_ctx.stringValue("LogicalDeleteResourceResponse.Bid"));
		logicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("LogicalDeleteResourceResponse.Success"));
		logicalDeleteResourceResponse.setInterrupt(_ctx.booleanValue("LogicalDeleteResourceResponse.Interrupt"));
	 
	 	return logicalDeleteResourceResponse;
	}
}