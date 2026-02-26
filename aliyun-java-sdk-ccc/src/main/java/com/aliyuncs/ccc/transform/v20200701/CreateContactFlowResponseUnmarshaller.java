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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.CreateContactFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateContactFlowResponseUnmarshaller {

	public static CreateContactFlowResponse unmarshall(CreateContactFlowResponse createContactFlowResponse, UnmarshallerContext _ctx) {
		
		createContactFlowResponse.setRequestId(_ctx.stringValue("CreateContactFlowResponse.RequestId"));
		createContactFlowResponse.setHttpStatusCode(_ctx.integerValue("CreateContactFlowResponse.HttpStatusCode"));
		createContactFlowResponse.setCode(_ctx.stringValue("CreateContactFlowResponse.Code"));
		createContactFlowResponse.setMessage(_ctx.stringValue("CreateContactFlowResponse.Message"));
		createContactFlowResponse.setData(_ctx.stringValue("CreateContactFlowResponse.Data"));
	 
	 	return createContactFlowResponse;
	}
}