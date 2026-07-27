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

import com.aliyuncs.dataphin_public.model.v20230630.DeleteKgRelationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteKgRelationResponseUnmarshaller {

	public static DeleteKgRelationResponse unmarshall(DeleteKgRelationResponse deleteKgRelationResponse, UnmarshallerContext _ctx) {
		
		deleteKgRelationResponse.setRequestId(_ctx.stringValue("DeleteKgRelationResponse.RequestId"));
		deleteKgRelationResponse.setMessage(_ctx.stringValue("DeleteKgRelationResponse.Message"));
		deleteKgRelationResponse.setHttpStatusCode(_ctx.integerValue("DeleteKgRelationResponse.HttpStatusCode"));
		deleteKgRelationResponse.setCode(_ctx.stringValue("DeleteKgRelationResponse.Code"));
		deleteKgRelationResponse.setSuccess(_ctx.booleanValue("DeleteKgRelationResponse.Success"));
	 
	 	return deleteKgRelationResponse;
	}
}