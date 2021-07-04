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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.UpdateTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTemplateResponseUnmarshaller {

	public static UpdateTemplateResponse unmarshall(UpdateTemplateResponse updateTemplateResponse, UnmarshallerContext _ctx) {
		
		updateTemplateResponse.setRequestId(_ctx.stringValue("UpdateTemplateResponse.RequestId"));
		updateTemplateResponse.setErrorDesc(_ctx.stringValue("UpdateTemplateResponse.ErrorDesc"));
		updateTemplateResponse.setTraceId(_ctx.stringValue("UpdateTemplateResponse.TraceId"));
		updateTemplateResponse.setData(_ctx.stringValue("UpdateTemplateResponse.Data"));
		updateTemplateResponse.setErrorCode(_ctx.stringValue("UpdateTemplateResponse.ErrorCode"));
		updateTemplateResponse.setSuccess(_ctx.booleanValue("UpdateTemplateResponse.Success"));
	 
	 	return updateTemplateResponse;
	}
}