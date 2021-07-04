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

import com.aliyuncs.retailadvqa_public.model.v20200515.DeleteTemplatesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTemplatesResponseUnmarshaller {

	public static DeleteTemplatesResponse unmarshall(DeleteTemplatesResponse deleteTemplatesResponse, UnmarshallerContext _ctx) {
		
		deleteTemplatesResponse.setRequestId(_ctx.stringValue("DeleteTemplatesResponse.RequestId"));
		deleteTemplatesResponse.setData(_ctx.longValue("DeleteTemplatesResponse.Data"));
		deleteTemplatesResponse.setErrorCode(_ctx.stringValue("DeleteTemplatesResponse.ErrorCode"));
		deleteTemplatesResponse.setErrorDesc(_ctx.stringValue("DeleteTemplatesResponse.ErrorDesc"));
		deleteTemplatesResponse.setSuccess(_ctx.booleanValue("DeleteTemplatesResponse.Success"));
		deleteTemplatesResponse.setTraceId(_ctx.stringValue("DeleteTemplatesResponse.TraceId"));
		deleteTemplatesResponse.setExStack(_ctx.stringValue("DeleteTemplatesResponse.ExStack"));
	 
	 	return deleteTemplatesResponse;
	}
}