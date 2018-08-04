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

	public static LogicalDeleteResourceResponse unmarshall(LogicalDeleteResourceResponse logicalDeleteResourceResponse, UnmarshallerContext context) {
		
		logicalDeleteResourceResponse.setInterrupt(context.booleanValue("LogicalDeleteResourceResponse.Interrupt"));
		logicalDeleteResourceResponse.setInvoker(context.stringValue("LogicalDeleteResourceResponse.Invoker"));
		logicalDeleteResourceResponse.setPk(context.stringValue("LogicalDeleteResourceResponse.Pk"));
		logicalDeleteResourceResponse.setBid(context.stringValue("LogicalDeleteResourceResponse.Bid"));
		logicalDeleteResourceResponse.setHid(context.longValue("LogicalDeleteResourceResponse.Hid"));
		logicalDeleteResourceResponse.setCountry(context.stringValue("LogicalDeleteResourceResponse.Country"));
		logicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("LogicalDeleteResourceResponse.TaskIdentifier"));
		logicalDeleteResourceResponse.setTaskExtraData(context.stringValue("LogicalDeleteResourceResponse.TaskExtraData"));
		logicalDeleteResourceResponse.setGmtWakeup(context.stringValue("LogicalDeleteResourceResponse.GmtWakeup"));
		logicalDeleteResourceResponse.setSuccess(context.booleanValue("LogicalDeleteResourceResponse.Success"));
		logicalDeleteResourceResponse.setMessage(context.stringValue("LogicalDeleteResourceResponse.Message"));
	 
	 	return logicalDeleteResourceResponse;
	}
}