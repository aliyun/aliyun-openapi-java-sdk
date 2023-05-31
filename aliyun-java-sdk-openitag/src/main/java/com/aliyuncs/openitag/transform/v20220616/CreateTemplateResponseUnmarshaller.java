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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.CreateTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTemplateResponseUnmarshaller {

	public static CreateTemplateResponse unmarshall(CreateTemplateResponse createTemplateResponse, UnmarshallerContext _ctx) {
		
		createTemplateResponse.setRequestId(_ctx.stringValue("CreateTemplateResponse.RequestId"));
		createTemplateResponse.setCode(_ctx.integerValue("CreateTemplateResponse.Code"));
		createTemplateResponse.setMessage(_ctx.stringValue("CreateTemplateResponse.Message"));
		createTemplateResponse.setDetails(_ctx.stringValue("CreateTemplateResponse.Details"));
		createTemplateResponse.setSuccess(_ctx.booleanValue("CreateTemplateResponse.Success"));
		createTemplateResponse.setTemplateId(_ctx.stringValue("CreateTemplateResponse.TemplateId"));
		createTemplateResponse.setErrorCode(_ctx.stringValue("CreateTemplateResponse.ErrorCode"));
	 
	 	return createTemplateResponse;
	}
}