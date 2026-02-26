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

package com.aliyuncs.umeng_finplus.transform.v20220913;

import com.aliyuncs.umeng_finplus.model.v20220913.CreateComputeTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateComputeTaskResponseUnmarshaller {

	public static CreateComputeTaskResponse unmarshall(CreateComputeTaskResponse createComputeTaskResponse, UnmarshallerContext _ctx) {
		
		createComputeTaskResponse.setRequestId(_ctx.stringValue("CreateComputeTaskResponse.RequestId"));
		createComputeTaskResponse.setMsg(_ctx.stringValue("CreateComputeTaskResponse.Msg"));
		createComputeTaskResponse.setCode(_ctx.stringValue("CreateComputeTaskResponse.Code"));
		createComputeTaskResponse.setSuccess(_ctx.booleanValue("CreateComputeTaskResponse.Success"));
		createComputeTaskResponse.setData(_ctx.longValue("CreateComputeTaskResponse.Data"));
	 
	 	return createComputeTaskResponse;
	}
}