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

import com.aliyuncs.dataphin_public.model.v20230630.UpdatePipelineByAsyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePipelineByAsyncResponseUnmarshaller {

	public static UpdatePipelineByAsyncResponse unmarshall(UpdatePipelineByAsyncResponse updatePipelineByAsyncResponse, UnmarshallerContext _ctx) {
		
		updatePipelineByAsyncResponse.setRequestId(_ctx.stringValue("UpdatePipelineByAsyncResponse.RequestId"));
		updatePipelineByAsyncResponse.setMessage(_ctx.stringValue("UpdatePipelineByAsyncResponse.Message"));
		updatePipelineByAsyncResponse.setHttpStatusCode(_ctx.integerValue("UpdatePipelineByAsyncResponse.HttpStatusCode"));
		updatePipelineByAsyncResponse.setData(_ctx.longValue("UpdatePipelineByAsyncResponse.Data"));
		updatePipelineByAsyncResponse.setCode(_ctx.stringValue("UpdatePipelineByAsyncResponse.Code"));
		updatePipelineByAsyncResponse.setSuccess(_ctx.booleanValue("UpdatePipelineByAsyncResponse.Success"));
	 
	 	return updatePipelineByAsyncResponse;
	}
}