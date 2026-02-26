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

import com.aliyuncs.openitag.model.v20220616.UpdateTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTemplateResponseUnmarshaller {

	public static UpdateTemplateResponse unmarshall(UpdateTemplateResponse updateTemplateResponse, UnmarshallerContext _ctx) {
		
		updateTemplateResponse.setRequestId(_ctx.stringValue("UpdateTemplateResponse.RequestId"));
		updateTemplateResponse.setCode(_ctx.integerValue("UpdateTemplateResponse.Code"));
		updateTemplateResponse.setMessage(_ctx.stringValue("UpdateTemplateResponse.Message"));
		updateTemplateResponse.setDetails(_ctx.stringValue("UpdateTemplateResponse.Details"));
		updateTemplateResponse.setSuccess(_ctx.booleanValue("UpdateTemplateResponse.Success"));
		updateTemplateResponse.setTemplateId(_ctx.stringValue("UpdateTemplateResponse.TemplateId"));
		updateTemplateResponse.setErrorCode(_ctx.stringValue("UpdateTemplateResponse.ErrorCode"));
	 
	 	return updateTemplateResponse;
	}
}