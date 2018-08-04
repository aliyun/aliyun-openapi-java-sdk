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

import com.aliyuncs.mts.model.v20140618.CheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourceResponseUnmarshaller {

	public static CheckResourceResponse unmarshall(CheckResourceResponse checkResourceResponse, UnmarshallerContext context) {
		
		checkResourceResponse.setInterrupt(context.booleanValue("CheckResourceResponse.Interrupt"));
		checkResourceResponse.setInvoker(context.stringValue("CheckResourceResponse.Invoker"));
		checkResourceResponse.setPk(context.stringValue("CheckResourceResponse.Pk"));
		checkResourceResponse.setBid(context.stringValue("CheckResourceResponse.Bid"));
		checkResourceResponse.setHid(context.longValue("CheckResourceResponse.Hid"));
		checkResourceResponse.setCountry(context.stringValue("CheckResourceResponse.Country"));
		checkResourceResponse.setTaskIdentifier(context.stringValue("CheckResourceResponse.TaskIdentifier"));
		checkResourceResponse.setTaskExtraData(context.stringValue("CheckResourceResponse.TaskExtraData"));
		checkResourceResponse.setGmtWakeup(context.stringValue("CheckResourceResponse.GmtWakeup"));
		checkResourceResponse.setSuccess(context.booleanValue("CheckResourceResponse.Success"));
		checkResourceResponse.setMessage(context.stringValue("CheckResourceResponse.Message"));
		checkResourceResponse.setLevel(context.longValue("CheckResourceResponse.Level"));
		checkResourceResponse.setUrl(context.stringValue("CheckResourceResponse.Url"));
		checkResourceResponse.setPrompt(context.stringValue("CheckResourceResponse.Prompt"));
	 
	 	return checkResourceResponse;
	}
}