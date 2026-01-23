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

import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardWordRootResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStandardWordRootResponseUnmarshaller {

	public static CreateStandardWordRootResponse unmarshall(CreateStandardWordRootResponse createStandardWordRootResponse, UnmarshallerContext _ctx) {
		
		createStandardWordRootResponse.setRequestId(_ctx.stringValue("CreateStandardWordRootResponse.RequestId"));
		createStandardWordRootResponse.setSuccess(_ctx.booleanValue("CreateStandardWordRootResponse.Success"));
		createStandardWordRootResponse.setHttpStatusCode(_ctx.integerValue("CreateStandardWordRootResponse.HttpStatusCode"));
		createStandardWordRootResponse.setCode(_ctx.stringValue("CreateStandardWordRootResponse.Code"));
		createStandardWordRootResponse.setMessage(_ctx.stringValue("CreateStandardWordRootResponse.Message"));
		createStandardWordRootResponse.setData(_ctx.stringValue("CreateStandardWordRootResponse.Data"));
	 
	 	return createStandardWordRootResponse;
	}
}