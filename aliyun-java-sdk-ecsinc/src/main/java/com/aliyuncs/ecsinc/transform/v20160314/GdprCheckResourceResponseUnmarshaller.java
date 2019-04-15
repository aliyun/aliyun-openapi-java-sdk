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

import com.aliyuncs.ecsinc.model.v20160314.GdprCheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GdprCheckResourceResponseUnmarshaller {

	public static GdprCheckResourceResponse unmarshall(GdprCheckResourceResponse gdprCheckResourceResponse, UnmarshallerContext context) {
		
		gdprCheckResourceResponse.setInterrupt(context.booleanValue("GdprCheckResourceResponse.Interrupt"));
		gdprCheckResourceResponse.setInvoker(context.stringValue("GdprCheckResourceResponse.Invoker"));
		gdprCheckResourceResponse.setPk(context.stringValue("GdprCheckResourceResponse.Pk"));
		gdprCheckResourceResponse.setBid(context.stringValue("GdprCheckResourceResponse.Bid"));
		gdprCheckResourceResponse.setHid(context.longValue("GdprCheckResourceResponse.Hid"));
		gdprCheckResourceResponse.setCountry(context.stringValue("GdprCheckResourceResponse.Country"));
		gdprCheckResourceResponse.setTaskIdentifier(context.stringValue("GdprCheckResourceResponse.TaskIdentifier"));
		gdprCheckResourceResponse.setTaskExtraData(context.stringValue("GdprCheckResourceResponse.TaskExtraData"));
		gdprCheckResourceResponse.setGmtWakeup(context.stringValue("GdprCheckResourceResponse.GmtWakeup"));
		gdprCheckResourceResponse.setSuccess(context.booleanValue("GdprCheckResourceResponse.Success"));
		gdprCheckResourceResponse.setMessage(context.stringValue("GdprCheckResourceResponse.Message"));
		gdprCheckResourceResponse.setLevel(context.longValue("GdprCheckResourceResponse.Level"));
		gdprCheckResourceResponse.setUrl(context.stringValue("GdprCheckResourceResponse.Url"));
		gdprCheckResourceResponse.setPrompt(context.stringValue("GdprCheckResourceResponse.Prompt"));
	 
	 	return gdprCheckResourceResponse;
	}
}