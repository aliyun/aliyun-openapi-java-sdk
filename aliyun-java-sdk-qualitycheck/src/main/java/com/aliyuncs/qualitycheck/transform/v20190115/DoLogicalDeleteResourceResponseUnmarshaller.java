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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.DoLogicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoLogicalDeleteResourceResponseUnmarshaller {

	public static DoLogicalDeleteResourceResponse unmarshall(DoLogicalDeleteResourceResponse doLogicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		doLogicalDeleteResourceResponse.setInterrupt(_ctx.stringValue("DoLogicalDeleteResourceResponse.Interrupt"));
		doLogicalDeleteResourceResponse.setInvoker(_ctx.longValue("DoLogicalDeleteResourceResponse.Invoker"));
		doLogicalDeleteResourceResponse.setPk(_ctx.stringValue("DoLogicalDeleteResourceResponse.Pk"));
		doLogicalDeleteResourceResponse.setBid(_ctx.stringValue("DoLogicalDeleteResourceResponse.Bid"));
		doLogicalDeleteResourceResponse.setHid(_ctx.longValue("DoLogicalDeleteResourceResponse.Hid"));
		doLogicalDeleteResourceResponse.setCountry(_ctx.stringValue("DoLogicalDeleteResourceResponse.Country"));
		doLogicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("DoLogicalDeleteResourceResponse.TaskIdentifier"));
		doLogicalDeleteResourceResponse.setTaskIdentifier1(_ctx.stringValue("DoLogicalDeleteResourceResponse.TaskIdentifier"));
		doLogicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("DoLogicalDeleteResourceResponse.GmtWakeup"));
		doLogicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("DoLogicalDeleteResourceResponse.Success"));
		doLogicalDeleteResourceResponse.setMessage(_ctx.stringValue("DoLogicalDeleteResourceResponse.Message"));
	 
	 	return doLogicalDeleteResourceResponse;
	}
}