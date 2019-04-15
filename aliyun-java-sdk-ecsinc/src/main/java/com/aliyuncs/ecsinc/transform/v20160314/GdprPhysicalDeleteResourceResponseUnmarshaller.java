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

import com.aliyuncs.ecsinc.model.v20160314.GdprPhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GdprPhysicalDeleteResourceResponseUnmarshaller {

	public static GdprPhysicalDeleteResourceResponse unmarshall(GdprPhysicalDeleteResourceResponse gdprPhysicalDeleteResourceResponse, UnmarshallerContext context) {
		
		gdprPhysicalDeleteResourceResponse.setInterrupt(context.booleanValue("GdprPhysicalDeleteResourceResponse.Interrupt"));
		gdprPhysicalDeleteResourceResponse.setInvoker(context.stringValue("GdprPhysicalDeleteResourceResponse.Invoker"));
		gdprPhysicalDeleteResourceResponse.setPk(context.stringValue("GdprPhysicalDeleteResourceResponse.Pk"));
		gdprPhysicalDeleteResourceResponse.setBid(context.stringValue("GdprPhysicalDeleteResourceResponse.Bid"));
		gdprPhysicalDeleteResourceResponse.setHid(context.longValue("GdprPhysicalDeleteResourceResponse.Hid"));
		gdprPhysicalDeleteResourceResponse.setCountry(context.stringValue("GdprPhysicalDeleteResourceResponse.Country"));
		gdprPhysicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("GdprPhysicalDeleteResourceResponse.TaskIdentifier"));
		gdprPhysicalDeleteResourceResponse.setTaskExtraData(context.stringValue("GdprPhysicalDeleteResourceResponse.TaskExtraData"));
		gdprPhysicalDeleteResourceResponse.setGmtWakeup(context.stringValue("GdprPhysicalDeleteResourceResponse.GmtWakeup"));
		gdprPhysicalDeleteResourceResponse.setSuccess(context.booleanValue("GdprPhysicalDeleteResourceResponse.Success"));
		gdprPhysicalDeleteResourceResponse.setMessage(context.stringValue("GdprPhysicalDeleteResourceResponse.Message"));
	 
	 	return gdprPhysicalDeleteResourceResponse;
	}
}