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
package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.DoCheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoCheckResourceResponseUnmarshaller {

	public static DoCheckResourceResponse unmarshall(DoCheckResourceResponse doCheckResourceResponse, UnmarshallerContext context) {
		
		doCheckResourceResponse.setInterrupt(context.stringValue("DoCheckResourceResponse.Interrupt"));
		doCheckResourceResponse.setInvoker(context.longValue("DoCheckResourceResponse.Invoker"));
		doCheckResourceResponse.setPk(context.stringValue("DoCheckResourceResponse.Pk"));
		doCheckResourceResponse.setBid(context.stringValue("DoCheckResourceResponse.Bid"));
		doCheckResourceResponse.setHid(context.longValue("DoCheckResourceResponse.Hid"));
		doCheckResourceResponse.setCountry(context.stringValue("DoCheckResourceResponse.Country"));
		doCheckResourceResponse.setTaskIdentifier(context.stringValue("DoCheckResourceResponse.TaskIdentifier"));
		doCheckResourceResponse.setTaskIdentifier1(context.stringValue("DoCheckResourceResponse.TaskIdentifier"));
		doCheckResourceResponse.setGmtWakeup(context.stringValue("DoCheckResourceResponse.GmtWakeup"));
		doCheckResourceResponse.setSuccess(context.booleanValue("DoCheckResourceResponse.Success"));
		doCheckResourceResponse.setMessage(context.stringValue("DoCheckResourceResponse.Message"));
		doCheckResourceResponse.setLevel(context.longValue("DoCheckResourceResponse.Level"));
		doCheckResourceResponse.setUrl(context.stringValue("DoCheckResourceResponse.Url"));
		doCheckResourceResponse.setPrompt(context.stringValue("DoCheckResourceResponse.Prompt"));
	 
	 	return doCheckResourceResponse;
	}
}