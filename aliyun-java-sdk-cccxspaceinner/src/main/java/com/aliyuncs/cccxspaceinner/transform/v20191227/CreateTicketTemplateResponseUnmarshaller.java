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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.CreateTicketTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTicketTemplateResponseUnmarshaller {

	public static CreateTicketTemplateResponse unmarshall(CreateTicketTemplateResponse createTicketTemplateResponse, UnmarshallerContext _ctx) {
		
		createTicketTemplateResponse.setRequestId(_ctx.stringValue("CreateTicketTemplateResponse.RequestId"));
		createTicketTemplateResponse.setMessage(_ctx.stringValue("CreateTicketTemplateResponse.Message"));
		createTicketTemplateResponse.setData(_ctx.longValue("CreateTicketTemplateResponse.Data"));
		createTicketTemplateResponse.setCode(_ctx.stringValue("CreateTicketTemplateResponse.Code"));
		createTicketTemplateResponse.setSuccess(_ctx.booleanValue("CreateTicketTemplateResponse.Success"));
	 
	 	return createTicketTemplateResponse;
	}
}