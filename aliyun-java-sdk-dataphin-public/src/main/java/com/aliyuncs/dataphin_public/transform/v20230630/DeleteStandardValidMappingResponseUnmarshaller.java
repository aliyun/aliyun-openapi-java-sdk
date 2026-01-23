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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteStandardValidMappingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteStandardValidMappingResponseUnmarshaller {

	public static DeleteStandardValidMappingResponse unmarshall(DeleteStandardValidMappingResponse deleteStandardValidMappingResponse, UnmarshallerContext _ctx) {
		
		deleteStandardValidMappingResponse.setRequestId(_ctx.stringValue("DeleteStandardValidMappingResponse.RequestId"));
		deleteStandardValidMappingResponse.setSuccess(_ctx.booleanValue("DeleteStandardValidMappingResponse.Success"));
		deleteStandardValidMappingResponse.setHttpStatusCode(_ctx.integerValue("DeleteStandardValidMappingResponse.HttpStatusCode"));
		deleteStandardValidMappingResponse.setCode(_ctx.stringValue("DeleteStandardValidMappingResponse.Code"));
		deleteStandardValidMappingResponse.setMessage(_ctx.stringValue("DeleteStandardValidMappingResponse.Message"));
	 
	 	return deleteStandardValidMappingResponse;
	}
}