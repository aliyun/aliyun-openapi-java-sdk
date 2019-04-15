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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.GdprLogicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GdprLogicalDeleteResourceResponseUnmarshaller {

	public static GdprLogicalDeleteResourceResponse unmarshall(GdprLogicalDeleteResourceResponse gdprLogicalDeleteResourceResponse, UnmarshallerContext context) {
		
		gdprLogicalDeleteResourceResponse.setInterrupt(context.booleanValue("GdprLogicalDeleteResourceResponse.Interrupt"));
		gdprLogicalDeleteResourceResponse.setInvoker(context.stringValue("GdprLogicalDeleteResourceResponse.Invoker"));
		gdprLogicalDeleteResourceResponse.setPk(context.stringValue("GdprLogicalDeleteResourceResponse.Pk"));
		gdprLogicalDeleteResourceResponse.setBid(context.stringValue("GdprLogicalDeleteResourceResponse.Bid"));
		gdprLogicalDeleteResourceResponse.setHid(context.longValue("GdprLogicalDeleteResourceResponse.Hid"));
		gdprLogicalDeleteResourceResponse.setCountry(context.stringValue("GdprLogicalDeleteResourceResponse.Country"));
		gdprLogicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("GdprLogicalDeleteResourceResponse.TaskIdentifier"));
		gdprLogicalDeleteResourceResponse.setTaskExtraData(context.stringValue("GdprLogicalDeleteResourceResponse.TaskExtraData"));
		gdprLogicalDeleteResourceResponse.setGmtWakeup(context.stringValue("GdprLogicalDeleteResourceResponse.GmtWakeup"));
		gdprLogicalDeleteResourceResponse.setSuccess(context.booleanValue("GdprLogicalDeleteResourceResponse.Success"));
		gdprLogicalDeleteResourceResponse.setMessage(context.stringValue("GdprLogicalDeleteResourceResponse.Message"));
	 
	 	return gdprLogicalDeleteResourceResponse;
	}
}