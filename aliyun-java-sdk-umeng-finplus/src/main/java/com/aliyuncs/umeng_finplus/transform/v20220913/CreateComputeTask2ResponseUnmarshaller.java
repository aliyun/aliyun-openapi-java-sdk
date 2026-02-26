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

import com.aliyuncs.umeng_finplus.model.v20220913.CreateComputeTask2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateComputeTask2ResponseUnmarshaller {

	public static CreateComputeTask2Response unmarshall(CreateComputeTask2Response createComputeTask2Response, UnmarshallerContext _ctx) {
		
		createComputeTask2Response.setRequestId(_ctx.stringValue("CreateComputeTask2Response.RequestId"));
		createComputeTask2Response.setMsg(_ctx.stringValue("CreateComputeTask2Response.Msg"));
		createComputeTask2Response.setCode(_ctx.stringValue("CreateComputeTask2Response.Code"));
		createComputeTask2Response.setSuccess(_ctx.booleanValue("CreateComputeTask2Response.Success"));
		createComputeTask2Response.setData(_ctx.longValue("CreateComputeTask2Response.Data"));
	 
	 	return createComputeTask2Response;
	}
}