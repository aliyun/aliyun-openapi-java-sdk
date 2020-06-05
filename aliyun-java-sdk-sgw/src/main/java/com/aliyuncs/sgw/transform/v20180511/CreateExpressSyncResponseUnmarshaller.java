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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.CreateExpressSyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExpressSyncResponseUnmarshaller {

	public static CreateExpressSyncResponse unmarshall(CreateExpressSyncResponse createExpressSyncResponse, UnmarshallerContext _ctx) {
		
		createExpressSyncResponse.setRequestId(_ctx.stringValue("CreateExpressSyncResponse.RequestId"));
		createExpressSyncResponse.setSuccess(_ctx.booleanValue("CreateExpressSyncResponse.Success"));
		createExpressSyncResponse.setCode(_ctx.stringValue("CreateExpressSyncResponse.Code"));
		createExpressSyncResponse.setMessage(_ctx.stringValue("CreateExpressSyncResponse.Message"));
		createExpressSyncResponse.setExpressSyncId(_ctx.stringValue("CreateExpressSyncResponse.ExpressSyncId"));
	 
	 	return createExpressSyncResponse;
	}
}