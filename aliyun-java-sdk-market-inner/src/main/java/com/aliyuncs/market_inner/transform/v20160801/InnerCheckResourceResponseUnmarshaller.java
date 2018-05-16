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

import com.aliyuncs.market_inner.model.v20160801.InnerCheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerCheckResourceResponseUnmarshaller {

	public static InnerCheckResourceResponse unmarshall(InnerCheckResourceResponse innerCheckResourceResponse, UnmarshallerContext context) {
		
		innerCheckResourceResponse.setInterrupt(context.booleanValue("InnerCheckResourceResponse.Interrupt"));
		innerCheckResourceResponse.setInvoker(context.stringValue("InnerCheckResourceResponse.Invoker"));
		innerCheckResourceResponse.setPk(context.stringValue("InnerCheckResourceResponse.Pk"));
		innerCheckResourceResponse.setBid(context.stringValue("InnerCheckResourceResponse.Bid"));
		innerCheckResourceResponse.setHid(context.longValue("InnerCheckResourceResponse.Hid"));
		innerCheckResourceResponse.setCountry(context.stringValue("InnerCheckResourceResponse.Country"));
		innerCheckResourceResponse.setTaskIdentifier(context.stringValue("InnerCheckResourceResponse.TaskIdentifier"));
		innerCheckResourceResponse.setTaskExtraData(context.stringValue("InnerCheckResourceResponse.TaskExtraData"));
		innerCheckResourceResponse.setGmtWakeup(context.stringValue("InnerCheckResourceResponse.GmtWakeup"));
		innerCheckResourceResponse.setSuccess(context.booleanValue("InnerCheckResourceResponse.Success"));
		innerCheckResourceResponse.setMessage(context.stringValue("InnerCheckResourceResponse.Message"));
		innerCheckResourceResponse.setLevel(context.longValue("InnerCheckResourceResponse.Level"));
		innerCheckResourceResponse.setUrl(context.stringValue("InnerCheckResourceResponse.Url"));
		innerCheckResourceResponse.setPrompt(context.stringValue("InnerCheckResourceResponse.Prompt"));
	 
	 	return innerCheckResourceResponse;
	}
}