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

package com.aliyuncs.market_inner.transform.v20160801;

import com.aliyuncs.market_inner.model.v20160801.InnerPhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerPhysicalDeleteResourceResponseUnmarshaller {

	public static InnerPhysicalDeleteResourceResponse unmarshall(InnerPhysicalDeleteResourceResponse innerPhysicalDeleteResourceResponse, UnmarshallerContext context) {
		
		innerPhysicalDeleteResourceResponse.setInterrupt(context.booleanValue("InnerPhysicalDeleteResourceResponse.Interrupt"));
		innerPhysicalDeleteResourceResponse.setInvoker(context.stringValue("InnerPhysicalDeleteResourceResponse.Invoker"));
		innerPhysicalDeleteResourceResponse.setPk(context.stringValue("InnerPhysicalDeleteResourceResponse.Pk"));
		innerPhysicalDeleteResourceResponse.setBid(context.stringValue("InnerPhysicalDeleteResourceResponse.Bid"));
		innerPhysicalDeleteResourceResponse.setHid(context.longValue("InnerPhysicalDeleteResourceResponse.Hid"));
		innerPhysicalDeleteResourceResponse.setCountry(context.stringValue("InnerPhysicalDeleteResourceResponse.Country"));
		innerPhysicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("InnerPhysicalDeleteResourceResponse.TaskIdentifier"));
		innerPhysicalDeleteResourceResponse.setTaskExtraData(context.stringValue("InnerPhysicalDeleteResourceResponse.TaskExtraData"));
		innerPhysicalDeleteResourceResponse.setGmtWakeup(context.stringValue("InnerPhysicalDeleteResourceResponse.GmtWakeup"));
		innerPhysicalDeleteResourceResponse.setSuccess(context.booleanValue("InnerPhysicalDeleteResourceResponse.Success"));
		innerPhysicalDeleteResourceResponse.setMessage(context.stringValue("InnerPhysicalDeleteResourceResponse.Message"));
	 
	 	return innerPhysicalDeleteResourceResponse;
	}
}