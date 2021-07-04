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

import com.aliyuncs.retailadvqa_public.model.v20200515.AddTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTemplateResponseUnmarshaller {

	public static AddTemplateResponse unmarshall(AddTemplateResponse addTemplateResponse, UnmarshallerContext _ctx) {
		
		addTemplateResponse.setRequestId(_ctx.stringValue("AddTemplateResponse.RequestId"));
		addTemplateResponse.setData(_ctx.stringValue("AddTemplateResponse.Data"));
		addTemplateResponse.setErrorCode(_ctx.stringValue("AddTemplateResponse.ErrorCode"));
		addTemplateResponse.setErrorDesc(_ctx.stringValue("AddTemplateResponse.ErrorDesc"));
		addTemplateResponse.setSuccess(_ctx.booleanValue("AddTemplateResponse.Success"));
		addTemplateResponse.setTraceId(_ctx.stringValue("AddTemplateResponse.TraceId"));
		addTemplateResponse.setExStack(_ctx.stringValue("AddTemplateResponse.ExStack"));
	 
	 	return addTemplateResponse;
	}
}