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

import com.aliyuncs.dataphin_public.model.v20230630.CreateStandardLookupTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStandardLookupTableResponseUnmarshaller {

	public static CreateStandardLookupTableResponse unmarshall(CreateStandardLookupTableResponse createStandardLookupTableResponse, UnmarshallerContext _ctx) {
		
		createStandardLookupTableResponse.setRequestId(_ctx.stringValue("CreateStandardLookupTableResponse.RequestId"));
		createStandardLookupTableResponse.setSuccess(_ctx.booleanValue("CreateStandardLookupTableResponse.Success"));
		createStandardLookupTableResponse.setHttpStatusCode(_ctx.integerValue("CreateStandardLookupTableResponse.HttpStatusCode"));
		createStandardLookupTableResponse.setCode(_ctx.stringValue("CreateStandardLookupTableResponse.Code"));
		createStandardLookupTableResponse.setMessage(_ctx.stringValue("CreateStandardLookupTableResponse.Message"));
		createStandardLookupTableResponse.setData(_ctx.longValue("CreateStandardLookupTableResponse.Data"));
	 
	 	return createStandardLookupTableResponse;
	}
}