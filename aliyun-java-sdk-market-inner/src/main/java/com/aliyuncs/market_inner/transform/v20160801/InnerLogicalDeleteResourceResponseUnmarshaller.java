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

import com.aliyuncs.market_inner.model.v20160801.InnerLogicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerLogicalDeleteResourceResponseUnmarshaller {

	public static InnerLogicalDeleteResourceResponse unmarshall(InnerLogicalDeleteResourceResponse innerLogicalDeleteResourceResponse, UnmarshallerContext context) {
		
		innerLogicalDeleteResourceResponse.setInterrupt(context.booleanValue("InnerLogicalDeleteResourceResponse.Interrupt"));
		innerLogicalDeleteResourceResponse.setInvoker(context.stringValue("InnerLogicalDeleteResourceResponse.Invoker"));
		innerLogicalDeleteResourceResponse.setPk(context.stringValue("InnerLogicalDeleteResourceResponse.Pk"));
		innerLogicalDeleteResourceResponse.setBid(context.stringValue("InnerLogicalDeleteResourceResponse.Bid"));
		innerLogicalDeleteResourceResponse.setHid(context.longValue("InnerLogicalDeleteResourceResponse.Hid"));
		innerLogicalDeleteResourceResponse.setCountry(context.stringValue("InnerLogicalDeleteResourceResponse.Country"));
		innerLogicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("InnerLogicalDeleteResourceResponse.TaskIdentifier"));
		innerLogicalDeleteResourceResponse.setTaskExtraData(context.stringValue("InnerLogicalDeleteResourceResponse.TaskExtraData"));
		innerLogicalDeleteResourceResponse.setGmtWakeup(context.stringValue("InnerLogicalDeleteResourceResponse.GmtWakeup"));
		innerLogicalDeleteResourceResponse.setSuccess(context.booleanValue("InnerLogicalDeleteResourceResponse.Success"));
		innerLogicalDeleteResourceResponse.setMessage(context.stringValue("InnerLogicalDeleteResourceResponse.Message"));
	 
	 	return innerLogicalDeleteResourceResponse;
	}
}