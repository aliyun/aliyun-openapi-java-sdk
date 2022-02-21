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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UntagResourcesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UntagResourcesResponseUnmarshaller {

	public static UntagResourcesResponse unmarshall(UntagResourcesResponse untagResourcesResponse, UnmarshallerContext _ctx) {
		
		untagResourcesResponse.setRequestId(_ctx.stringValue("UntagResourcesResponse.RequestId"));
		untagResourcesResponse.setMessage(_ctx.stringValue("UntagResourcesResponse.Message"));
		untagResourcesResponse.setTraceId(_ctx.stringValue("UntagResourcesResponse.TraceId"));
		untagResourcesResponse.setData(_ctx.booleanValue("UntagResourcesResponse.Data"));
		untagResourcesResponse.setErrorCode(_ctx.stringValue("UntagResourcesResponse.ErrorCode"));
		untagResourcesResponse.setCode(_ctx.stringValue("UntagResourcesResponse.Code"));
		untagResourcesResponse.setSuccess(_ctx.booleanValue("UntagResourcesResponse.Success"));
	 
	 	return untagResourcesResponse;
	}
}