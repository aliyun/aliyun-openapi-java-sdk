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

package com.aliyuncs.nlb.transform.v20220430;

import com.aliyuncs.nlb.model.v20220430.CreateListenerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateListenerResponseUnmarshaller {

	public static CreateListenerResponse unmarshall(CreateListenerResponse createListenerResponse, UnmarshallerContext _ctx) {
		
		createListenerResponse.setRequestId(_ctx.stringValue("CreateListenerResponse.RequestId"));
		createListenerResponse.setSuccess(_ctx.booleanValue("CreateListenerResponse.Success"));
		createListenerResponse.setCode(_ctx.stringValue("CreateListenerResponse.Code"));
		createListenerResponse.setMessage(_ctx.stringValue("CreateListenerResponse.Message"));
		createListenerResponse.setHttpStatusCode(_ctx.integerValue("CreateListenerResponse.HttpStatusCode"));
		createListenerResponse.setDynamicCode(_ctx.stringValue("CreateListenerResponse.DynamicCode"));
		createListenerResponse.setDynamicMessage(_ctx.stringValue("CreateListenerResponse.DynamicMessage"));
		createListenerResponse.setListenerId(_ctx.stringValue("CreateListenerResponse.ListenerId"));
		createListenerResponse.setJobId(_ctx.stringValue("CreateListenerResponse.JobId"));
	 
	 	return createListenerResponse;
	}
}