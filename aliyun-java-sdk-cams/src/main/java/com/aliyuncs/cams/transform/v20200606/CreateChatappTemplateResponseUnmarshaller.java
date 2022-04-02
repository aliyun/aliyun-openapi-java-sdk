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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.CreateChatappTemplateResponse;
import com.aliyuncs.cams.model.v20200606.CreateChatappTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateChatappTemplateResponseUnmarshaller {

	public static CreateChatappTemplateResponse unmarshall(CreateChatappTemplateResponse createChatappTemplateResponse, UnmarshallerContext _ctx) {
		
		createChatappTemplateResponse.setRequestId(_ctx.stringValue("CreateChatappTemplateResponse.RequestId"));
		createChatappTemplateResponse.setCode(_ctx.stringValue("CreateChatappTemplateResponse.Code"));
		createChatappTemplateResponse.setMessage(_ctx.stringValue("CreateChatappTemplateResponse.Message"));

		Data data = new Data();
		data.setTemplateCode(_ctx.stringValue("CreateChatappTemplateResponse.Data.TemplateCode"));
		data.setTemplateName(_ctx.stringValue("CreateChatappTemplateResponse.Data.TemplateName"));
		createChatappTemplateResponse.setData(data);
	 
	 	return createChatappTemplateResponse;
	}
}