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

package com.aliyuncs.rdc.transform.v20180821;

import com.aliyuncs.rdc.model.v20180821.CreateWorkitemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWorkitemResponseUnmarshaller {

	public static CreateWorkitemResponse unmarshall(CreateWorkitemResponse createWorkitemResponse, UnmarshallerContext _ctx) {
		
		createWorkitemResponse.setRequestId(_ctx.stringValue("CreateWorkitemResponse.RequestId"));
		createWorkitemResponse.setCode(_ctx.integerValue("CreateWorkitemResponse.Code"));
		createWorkitemResponse.setData(_ctx.integerValue("CreateWorkitemResponse.Data"));
		createWorkitemResponse.setSuccess(_ctx.booleanValue("CreateWorkitemResponse.Success"));
		createWorkitemResponse.setMessage(_ctx.stringValue("CreateWorkitemResponse.Message"));
	 
	 	return createWorkitemResponse;
	}
}