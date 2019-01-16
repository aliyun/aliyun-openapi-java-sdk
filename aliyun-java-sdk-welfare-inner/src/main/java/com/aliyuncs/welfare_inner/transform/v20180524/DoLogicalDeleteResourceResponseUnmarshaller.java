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

package com.aliyuncs.welfare_inner.transform.v20180524;

import com.aliyuncs.welfare_inner.model.v20180524.DoLogicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoLogicalDeleteResourceResponseUnmarshaller {

	public static DoLogicalDeleteResourceResponse unmarshall(DoLogicalDeleteResourceResponse doLogicalDeleteResourceResponse, UnmarshallerContext context) {
		
		doLogicalDeleteResourceResponse.setInterrupt(context.booleanValue("DoLogicalDeleteResourceResponse.Interrupt"));
		doLogicalDeleteResourceResponse.setInvoker(context.stringValue("DoLogicalDeleteResourceResponse.Invoker"));
		doLogicalDeleteResourceResponse.setPk(context.stringValue("DoLogicalDeleteResourceResponse.Pk"));
		doLogicalDeleteResourceResponse.setBid(context.stringValue("DoLogicalDeleteResourceResponse.Bid"));
		doLogicalDeleteResourceResponse.setHid(context.longValue("DoLogicalDeleteResourceResponse.Hid"));
		doLogicalDeleteResourceResponse.setCountry(context.stringValue("DoLogicalDeleteResourceResponse.Country"));
		doLogicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("DoLogicalDeleteResourceResponse.TaskIdentifier"));
		doLogicalDeleteResourceResponse.setTaskExtraData(context.stringValue("DoLogicalDeleteResourceResponse.TaskExtraData"));
		doLogicalDeleteResourceResponse.setGmtWakeup(context.stringValue("DoLogicalDeleteResourceResponse.GmtWakeup"));
		doLogicalDeleteResourceResponse.setSuccess(context.booleanValue("DoLogicalDeleteResourceResponse.Success"));
		doLogicalDeleteResourceResponse.setMessage(context.stringValue("DoLogicalDeleteResourceResponse.Message"));
	 
	 	return doLogicalDeleteResourceResponse;
	}
}