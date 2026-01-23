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

import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStandardSetResponseUnmarshaller {

	public static CreateStandardSetResponse unmarshall(CreateStandardSetResponse createStandardSetResponse, UnmarshallerContext _ctx) {
		
		createStandardSetResponse.setRequestId(_ctx.stringValue("CreateStandardSetResponse.RequestId"));
		createStandardSetResponse.setSuccess(_ctx.booleanValue("CreateStandardSetResponse.Success"));
		createStandardSetResponse.setHttpStatusCode(_ctx.integerValue("CreateStandardSetResponse.HttpStatusCode"));
		createStandardSetResponse.setCode(_ctx.stringValue("CreateStandardSetResponse.Code"));
		createStandardSetResponse.setMessage(_ctx.stringValue("CreateStandardSetResponse.Message"));
		createStandardSetResponse.setData(_ctx.longValue("CreateStandardSetResponse.Data"));
	 
	 	return createStandardSetResponse;
	}
}