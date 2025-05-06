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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.CreateOptionTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOptionTemplateResponseUnmarshaller {

	public static CreateOptionTemplateResponse unmarshall(CreateOptionTemplateResponse createOptionTemplateResponse, UnmarshallerContext _ctx) {
		
		createOptionTemplateResponse.setRequestId(_ctx.stringValue("CreateOptionTemplateResponse.requestId"));
		createOptionTemplateResponse.setCode(_ctx.integerValue("CreateOptionTemplateResponse.Code"));
		createOptionTemplateResponse.setMsg(_ctx.stringValue("CreateOptionTemplateResponse.Msg"));
		createOptionTemplateResponse.setErrInfo(_ctx.stringValue("CreateOptionTemplateResponse.ErrInfo"));
		createOptionTemplateResponse.setSucc(_ctx.booleanValue("CreateOptionTemplateResponse.Succ"));
		createOptionTemplateResponse.setResult(_ctx.longValue("CreateOptionTemplateResponse.Result"));
		createOptionTemplateResponse.setErrorCode(_ctx.stringValue("CreateOptionTemplateResponse.ErrorCode"));
	 
	 	return createOptionTemplateResponse;
	}
}