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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.CreateOutboundTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOutboundTaskResponseUnmarshaller {

	public static CreateOutboundTaskResponse unmarshall(CreateOutboundTaskResponse createOutboundTaskResponse, UnmarshallerContext _ctx) {
		
		createOutboundTaskResponse.setRequestId(_ctx.stringValue("CreateOutboundTaskResponse.RequestId"));
		createOutboundTaskResponse.setSuccess(_ctx.booleanValue("CreateOutboundTaskResponse.Success"));
		createOutboundTaskResponse.setCode(_ctx.stringValue("CreateOutboundTaskResponse.Code"));
		createOutboundTaskResponse.setMessage(_ctx.stringValue("CreateOutboundTaskResponse.Message"));
		createOutboundTaskResponse.setData(_ctx.stringValue("CreateOutboundTaskResponse.Data"));
	 
	 	return createOutboundTaskResponse;
	}
}