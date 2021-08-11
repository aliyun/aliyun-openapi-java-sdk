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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.CreateCallTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCallTaskResponseUnmarshaller {

	public static CreateCallTaskResponse unmarshall(CreateCallTaskResponse createCallTaskResponse, UnmarshallerContext _ctx) {
		
		createCallTaskResponse.setRequestId(_ctx.stringValue("CreateCallTaskResponse.RequestId"));
		createCallTaskResponse.setCode(_ctx.stringValue("CreateCallTaskResponse.Code"));
		createCallTaskResponse.setData(_ctx.longValue("CreateCallTaskResponse.Data"));
	 
	 	return createCallTaskResponse;
	}
}