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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteStandardLookupTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteStandardLookupTableResponseUnmarshaller {

	public static DeleteStandardLookupTableResponse unmarshall(DeleteStandardLookupTableResponse deleteStandardLookupTableResponse, UnmarshallerContext _ctx) {
		
		deleteStandardLookupTableResponse.setRequestId(_ctx.stringValue("DeleteStandardLookupTableResponse.RequestId"));
		deleteStandardLookupTableResponse.setSuccess(_ctx.booleanValue("DeleteStandardLookupTableResponse.Success"));
		deleteStandardLookupTableResponse.setHttpStatusCode(_ctx.integerValue("DeleteStandardLookupTableResponse.HttpStatusCode"));
		deleteStandardLookupTableResponse.setCode(_ctx.stringValue("DeleteStandardLookupTableResponse.Code"));
		deleteStandardLookupTableResponse.setMessage(_ctx.stringValue("DeleteStandardLookupTableResponse.Message"));
	 
	 	return deleteStandardLookupTableResponse;
	}
}