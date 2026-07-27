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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStandardTemplateResponseUnmarshaller {

	public static CreateStandardTemplateResponse unmarshall(CreateStandardTemplateResponse createStandardTemplateResponse, UnmarshallerContext _ctx) {
		
		createStandardTemplateResponse.setRequestId(_ctx.stringValue("CreateStandardTemplateResponse.RequestId"));
		createStandardTemplateResponse.setMessage(_ctx.stringValue("CreateStandardTemplateResponse.Message"));
		createStandardTemplateResponse.setHttpStatusCode(_ctx.integerValue("CreateStandardTemplateResponse.HttpStatusCode"));
		createStandardTemplateResponse.setData(_ctx.longValue("CreateStandardTemplateResponse.Data"));
		createStandardTemplateResponse.setCode(_ctx.stringValue("CreateStandardTemplateResponse.Code"));
		createStandardTemplateResponse.setSuccess(_ctx.booleanValue("CreateStandardTemplateResponse.Success"));
	 
	 	return createStandardTemplateResponse;
	}
}