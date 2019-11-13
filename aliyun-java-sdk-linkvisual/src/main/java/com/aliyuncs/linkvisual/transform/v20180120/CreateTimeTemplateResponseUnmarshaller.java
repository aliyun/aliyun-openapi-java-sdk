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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateTimeTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTimeTemplateResponseUnmarshaller {

	public static CreateTimeTemplateResponse unmarshall(CreateTimeTemplateResponse createTimeTemplateResponse, UnmarshallerContext _ctx) {
		
		createTimeTemplateResponse.setRequestId(_ctx.stringValue("CreateTimeTemplateResponse.RequestId"));
		createTimeTemplateResponse.setSuccess(_ctx.booleanValue("CreateTimeTemplateResponse.Success"));
		createTimeTemplateResponse.setErrorMessage(_ctx.stringValue("CreateTimeTemplateResponse.ErrorMessage"));
		createTimeTemplateResponse.setCode(_ctx.stringValue("CreateTimeTemplateResponse.Code"));
		createTimeTemplateResponse.setData(_ctx.stringValue("CreateTimeTemplateResponse.Data"));
	 
	 	return createTimeTemplateResponse;
	}
}