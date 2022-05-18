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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.AddCoreEntryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCoreEntryResponseUnmarshaller {

	public static AddCoreEntryResponse unmarshall(AddCoreEntryResponse addCoreEntryResponse, UnmarshallerContext _ctx) {
		
		addCoreEntryResponse.setRequestId(_ctx.stringValue("AddCoreEntryResponse.RequestId"));
		addCoreEntryResponse.setData(_ctx.integerValue("AddCoreEntryResponse.Data"));
		addCoreEntryResponse.setSuccess(_ctx.booleanValue("AddCoreEntryResponse.Success"));
		addCoreEntryResponse.setCode(_ctx.stringValue("AddCoreEntryResponse.Code"));
		addCoreEntryResponse.setMessage(_ctx.stringValue("AddCoreEntryResponse.Message"));
		addCoreEntryResponse.setHttpStatusCode(_ctx.integerValue("AddCoreEntryResponse.HttpStatusCode"));
	 
	 	return addCoreEntryResponse;
	}
}