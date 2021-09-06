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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.CreateUnionTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUnionTaskResponseUnmarshaller {

	public static CreateUnionTaskResponse unmarshall(CreateUnionTaskResponse createUnionTaskResponse, UnmarshallerContext _ctx) {
		
		createUnionTaskResponse.setRequestId(_ctx.stringValue("CreateUnionTaskResponse.RequestId"));
		createUnionTaskResponse.setCode(_ctx.integerValue("CreateUnionTaskResponse.Code"));
		createUnionTaskResponse.setData(_ctx.longValue("CreateUnionTaskResponse.Data"));
		createUnionTaskResponse.setErrorMsg(_ctx.stringValue("CreateUnionTaskResponse.ErrorMsg"));
		createUnionTaskResponse.setSuccess(_ctx.booleanValue("CreateUnionTaskResponse.Success"));
	 
	 	return createUnionTaskResponse;
	}
}