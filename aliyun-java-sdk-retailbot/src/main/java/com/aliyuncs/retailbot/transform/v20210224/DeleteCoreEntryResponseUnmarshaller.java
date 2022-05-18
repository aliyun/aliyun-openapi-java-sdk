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

import com.aliyuncs.retailbot.model.v20210224.DeleteCoreEntryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCoreEntryResponseUnmarshaller {

	public static DeleteCoreEntryResponse unmarshall(DeleteCoreEntryResponse deleteCoreEntryResponse, UnmarshallerContext _ctx) {
		
		deleteCoreEntryResponse.setRequestId(_ctx.stringValue("DeleteCoreEntryResponse.RequestId"));
		deleteCoreEntryResponse.setData(_ctx.integerValue("DeleteCoreEntryResponse.Data"));
		deleteCoreEntryResponse.setSuccess(_ctx.booleanValue("DeleteCoreEntryResponse.Success"));
		deleteCoreEntryResponse.setCode(_ctx.stringValue("DeleteCoreEntryResponse.Code"));
		deleteCoreEntryResponse.setMessage(_ctx.stringValue("DeleteCoreEntryResponse.Message"));
		deleteCoreEntryResponse.setHttpStatusCode(_ctx.integerValue("DeleteCoreEntryResponse.HttpStatusCode"));
	 
	 	return deleteCoreEntryResponse;
	}
}