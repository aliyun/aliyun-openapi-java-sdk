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

package com.aliyuncs.bss.transform.v20140714;

import com.aliyuncs.bss.model.v20140714.OpenCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenCallbackResponseUnmarshaller {

	public static OpenCallbackResponse unmarshall(OpenCallbackResponse openCallbackResponse, UnmarshallerContext context) {
		
		openCallbackResponse.setRequestId(context.stringValue("OpenCallbackResponse.RequestId"));
		openCallbackResponse.setSuccess(context.booleanValue("OpenCallbackResponse.Success"));
		openCallbackResponse.setCode(context.stringValue("OpenCallbackResponse.Code"));
		openCallbackResponse.setMessage(context.stringValue("OpenCallbackResponse.Message"));
		openCallbackResponse.setData(context.stringValue("OpenCallbackResponse.Data"));
	 
	 	return openCallbackResponse;
	}
}