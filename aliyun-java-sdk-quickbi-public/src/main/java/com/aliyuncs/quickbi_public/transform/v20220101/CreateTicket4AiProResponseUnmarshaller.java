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

package com.aliyuncs.quickbi_public.transform.v20220101;

import com.aliyuncs.quickbi_public.model.v20220101.CreateTicket4AiProResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTicket4AiProResponseUnmarshaller {

	public static CreateTicket4AiProResponse unmarshall(CreateTicket4AiProResponse createTicket4AiProResponse, UnmarshallerContext _ctx) {
		
		createTicket4AiProResponse.setRequestId(_ctx.stringValue("CreateTicket4AiProResponse.RequestId"));
		createTicket4AiProResponse.setSuccess(_ctx.booleanValue("CreateTicket4AiProResponse.Success"));
		createTicket4AiProResponse.setResult(_ctx.stringValue("CreateTicket4AiProResponse.Result"));
	 
	 	return createTicket4AiProResponse;
	}
}