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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteStandardInValidMappingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteStandardInValidMappingResponseUnmarshaller {

	public static DeleteStandardInValidMappingResponse unmarshall(DeleteStandardInValidMappingResponse deleteStandardInValidMappingResponse, UnmarshallerContext _ctx) {
		
		deleteStandardInValidMappingResponse.setRequestId(_ctx.stringValue("DeleteStandardInValidMappingResponse.RequestId"));
		deleteStandardInValidMappingResponse.setSuccess(_ctx.booleanValue("DeleteStandardInValidMappingResponse.Success"));
		deleteStandardInValidMappingResponse.setHttpStatusCode(_ctx.integerValue("DeleteStandardInValidMappingResponse.HttpStatusCode"));
		deleteStandardInValidMappingResponse.setCode(_ctx.stringValue("DeleteStandardInValidMappingResponse.Code"));
		deleteStandardInValidMappingResponse.setMessage(_ctx.stringValue("DeleteStandardInValidMappingResponse.Message"));
	 
	 	return deleteStandardInValidMappingResponse;
	}
}