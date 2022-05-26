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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.DoLogicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoLogicalDeleteResourceResponseUnmarshaller {

	public static DoLogicalDeleteResourceResponse unmarshall(DoLogicalDeleteResourceResponse doLogicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		doLogicalDeleteResourceResponse.setPk(_ctx.stringValue("DoLogicalDeleteResourceResponse.Pk"));
		doLogicalDeleteResourceResponse.setInvoker(_ctx.stringValue("DoLogicalDeleteResourceResponse.Invoker"));
		doLogicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("DoLogicalDeleteResourceResponse.Success"));
		doLogicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("DoLogicalDeleteResourceResponse.GmtWakeup"));
		doLogicalDeleteResourceResponse.setHid(_ctx.longValue("DoLogicalDeleteResourceResponse.Hid"));
		doLogicalDeleteResourceResponse.setMessage(_ctx.stringValue("DoLogicalDeleteResourceResponse.Message"));
		doLogicalDeleteResourceResponse.setCountry(_ctx.stringValue("DoLogicalDeleteResourceResponse.Country"));
		doLogicalDeleteResourceResponse.setInterrupt(_ctx.booleanValue("DoLogicalDeleteResourceResponse.Interrupt"));
		doLogicalDeleteResourceResponse.setTaskExtraData(_ctx.stringValue("DoLogicalDeleteResourceResponse.TaskExtraData"));
		doLogicalDeleteResourceResponse.setBid(_ctx.stringValue("DoLogicalDeleteResourceResponse.Bid"));
		doLogicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("DoLogicalDeleteResourceResponse.TaskIdentifier"));
	 
	 	return doLogicalDeleteResourceResponse;
	}
}