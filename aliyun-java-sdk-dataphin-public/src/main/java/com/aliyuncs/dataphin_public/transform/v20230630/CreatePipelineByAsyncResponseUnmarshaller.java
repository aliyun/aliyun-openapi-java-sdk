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

import com.aliyuncs.dataphin_public.model.v20230630.CreatePipelineByAsyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePipelineByAsyncResponseUnmarshaller {

	public static CreatePipelineByAsyncResponse unmarshall(CreatePipelineByAsyncResponse createPipelineByAsyncResponse, UnmarshallerContext _ctx) {
		
		createPipelineByAsyncResponse.setRequestId(_ctx.stringValue("CreatePipelineByAsyncResponse.RequestId"));
		createPipelineByAsyncResponse.setMessage(_ctx.stringValue("CreatePipelineByAsyncResponse.Message"));
		createPipelineByAsyncResponse.setHttpStatusCode(_ctx.integerValue("CreatePipelineByAsyncResponse.HttpStatusCode"));
		createPipelineByAsyncResponse.setData(_ctx.longValue("CreatePipelineByAsyncResponse.Data"));
		createPipelineByAsyncResponse.setCode(_ctx.stringValue("CreatePipelineByAsyncResponse.Code"));
		createPipelineByAsyncResponse.setSuccess(_ctx.booleanValue("CreatePipelineByAsyncResponse.Success"));
	 
	 	return createPipelineByAsyncResponse;
	}
}